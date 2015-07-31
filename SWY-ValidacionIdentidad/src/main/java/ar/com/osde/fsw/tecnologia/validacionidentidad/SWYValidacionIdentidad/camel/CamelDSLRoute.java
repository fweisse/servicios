package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.camel;

import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.Namespaces;
import org.apache.camel.builder.xml.XPathBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Empresas;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.Sujeto;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ValidacionDeIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ValidacionFilter;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.response.NoSocioResponse;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.response.OrchestratedObject;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.util.VIUTil;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.util.ValidacionDeIdentidadUtil;

public class CamelDSLRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method. The from endpoint is
	 * required to be a SwitchYard service.
	 */
	public void configure() {

		Namespaces val1 = new Namespaces("val1","http://validacionidentidad.entities.osde.ar");
		XPathBuilder xPathBuilder = XPathBuilder.xpath("/*");
		Processor firstMapperProcessor = new FirstMapperProcessor();

		from("switchyard://ValidacionIdentidad")
				//.split(xPathBuilder).parallelProcessing() //si se descomenta no sale el xml final
				
				//.log("Received message for 'ValidacionIdentidad' : ${body}")
				.setProperty("request", body())//para poderlo procesar despues...			
				
				.setProperty("vi.request", val1.xpath("//val1:validacionFilter"))
				//.log("vi.request : ${property[vi.request]}")

				.process(new Processor() {

					@Override
					public void process(Exchange exchange) throws Exception {

						Unmarshaller unmarshaller = JAXBContext.newInstance(ValidacionFilter.class).createUnmarshaller();

						NodeList nodes = exchange.getProperty("vi.request",	NodeList.class);

						ValidacionFilter filter = (ValidacionFilter) unmarshaller.unmarshal(nodes.item(0));
						
						List<Sujeto> sujetos = ValidacionDeIdentidadUtil.getSubjets(filter);
						
						exchange.setProperty("vi.filter", filter);
						exchange.setProperty("vi.simpleSubject", sujetos.size() == 1);						
						exchange.setProperty("vi.numeroInterlocutor", filter.getSujetoActividad().getNroInterlocutor());
						exchange.setProperty("vi.numeroDocumentoSA", filter.getSujetoActividad().getNumeroDocumento());
						exchange.setProperty("vi.numeroDocumentoSC", filter.getSujetoContacto().getNumeroDocumento());
						
					}
				})

				.choice()
				.when(val1.xpath("//val1:validacionFilter/val1:serviceName='CORRESPONDENCIA'"))
				.to("xslt:META-INF/xslt/toConsultaEmpresaGenerica2.xslt")
				//.log("desp transformacion toConsultaEmpresaGenerica2 ${body}")
				.to("switchyard://ConEmpresasGenerica2")
				.setProperty("response.conempresasgenerica2", body())				
				
				.process(new Processor() {
					
					@Override
					public void process(Exchange exchange) throws Exception {
					
						StringReader sr = (StringReader)exchange.getProperty("response.conempresasgenerica2");
						NodeList nodes = null; 
						
						DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
						DocumentBuilder db = dbf.newDocumentBuilder();
						InputSource is = new InputSource();
						is.setCharacterStream(sr);
						Document doc = db.parse(is); 
						nodes = doc.getElementsByTagName("empresas");
						
						Unmarshaller unmarshaller = JAXBContext.newInstance(Empresas.class).createUnmarshaller();
						Empresas empresas= null;
						
						empresas = (Empresas) unmarshaller.unmarshal(nodes.item(0));
						
						exchange.setProperty("empresas", empresas);									
							
					}
				})
				.end()
				
				.setBody(simple("${property[request]}")) //pierde el body una vez procesado
				.choice()
				.when(val1.xpath("//val1:sujetoActividad/val1:subjectType='NOSOCIO'"))
				//.log("no es CORRESPONDENCIA, es NOSOCIO")
				.to("xslt:META-INF/xslt/toNoSocio.xslt")
				//.log("desp transformacion toNoSocio ${body}")
				.to("switchyard://NoSocioWebService?operationName=buscarNoSocio")
				
				.setProperty("response.nosocio", body())			
		
				.end()
				
//				.choice()
//				.when(simple("${property.CamelSplitIndex}== '0'"))
//				.setProperty("vi.subjectRole", constant("SC"))
//				.when(simple("${property.CamelSplitIndex}== '1'"))
//				.setProperty("vi.subjectRole", constant("SA"))			
//				.end()
				
				.process(firstMapperProcessor)
				
				
				.process(new Processor() {					
					@Override
					public void process(Exchange exchange) throws Exception {						
						
						OrchestratedObject oo = (OrchestratedObject)exchange.getProperty("orchestedObject");
						
						ValidacionDeIdentidad vdi = ValidacionDeIdentidadUtil.map(oo);						
						DOMSource source = VIUTil.crearXML(vdi);					
						
						exchange.getOut().setBody(source);	
						
					}
						
				})								
			    .to("xslt:META-INF/xslt/toVIResponse.xslt")		

		;
	}

}

