package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.camel;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.ccg.services.wsservices.NoSocioOsdeBinarioDTO;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Empresas;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ValidacionFilter;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.response.OrchestratedObject;

public class FirstMapperProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		
		OrchestratedObject oo = new OrchestratedObject();
		boolean isMultiSujeto = !exchange.getProperty("vi.simpleSubject", Boolean.class);
		NodeList nodes = null;
		Unmarshaller unmarshaller;
		

		ValidacionFilter validacionFilter = exchange.getProperty("vi.filter", ValidacionFilter.class);
		oo.setServiceName(validacionFilter.getServiceName());
		oo.setSujetoContacto(validacionFilter.getSujetoContacto());
		oo.setSujetoActividad(validacionFilter.getSujetoActividad());
		oo.setMultiSujeto(isMultiSujeto);	
		
		
		//TODO: reorganizar
		// Resultado de ConsultaEmpresaGenerica2
		unmarshaller = JAXBContext.newInstance(ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Envelope.class).createUnmarshaller();
		
		ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Envelope envelopeceg2 = null;
		//vi.empresaGenerica2.SC
		Empresas empresas = (Empresas)exchange.getProperty("empresas");
		if (empresas != null) {
		//	envelopeceg2 = (ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Envelope) unmarshaller
		//			.unmarshal(nodes.item(0));
			//if (envelopeceg2 != null && ((envelopeceg2.getFault().getFaultcode() == 0)||(envelopeceg2.getFault().getFaultcode() != 819))) {
				oo.setEmpresaGenerica2(empresas.getEmpresa());
			//}
		}
		if (isMultiSujeto) {//vi.empresaGenerica2.SA
			//nodes = exchange.getProperty("empresas", NodeList.class);
		empresas = (Empresas)exchange.getProperty("empresas");
			if (empresas != null) {
				//envelopeceg2 = (ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Envelope) unmarshaller
				//		.unmarshal(nodes.item(0));
				//if (envelopeceg2 != null && ((envelopeceg2.getFault().getFaultcode() == 0)||(envelopeceg2.getFault().getFaultcode() != 819))) {
					oo.setEmpresaGenerica2(empresas.getEmpresa());
			//	}
			}
		} else {
			oo.setEmpresaGenerica2(oo.getEmpresaGenerica2());
		}
		
		
		// Resultado de la consulta para No Socios
		//unmarshaller = JAXBContext.newInstance(NoSocioOsdeBinarioDTOWrapper.class).createUnmarshaller();
		StringReader sr = (StringReader)exchange.getProperty("response.nosocio");
		NoSocioOsdeBinarioDTO noSocio = new NoSocioOsdeBinarioDTO();
		List<NoSocioOsdeBinarioDTO> listNoSocio =  new ArrayList<NoSocioOsdeBinarioDTO>();
		
		NodeList nodeAux = null;
		
		if (sr != null) {
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			InputSource is = new InputSource();						
			is.setCharacterStream(sr); 
			Document doc = db.parse(is);
			
			nodeAux = doc.getElementsByTagName("apellido");
			noSocio.setApellido((nodeAux.item(0)!=null)?nodeAux.item(0).getTextContent():"");
			
			nodeAux = doc.getElementsByTagName("email1");
			noSocio.setEmail1((nodeAux.item(0)!=null)?nodeAux.item(0).getTextContent():"");			
			
//			nodeAux = doc.getElementsByTagName("fechaAlta");
//			noSocio.setFechaAlta((nodeAux.item(0)!=null)?nodeAux.item(0).getTextContent():"");	
		
			nodeAux = doc.getElementsByTagName("idNoSocio");
			noSocio.setIdNoSocio(Long.parseLong((nodeAux.item(0)!=null)?nodeAux.item(0).getTextContent():""));
			
			nodeAux = doc.getElementsByTagName("nombre");
			noSocio.setNombre((nodeAux.item(0)!=null)?nodeAux.item(0).getTextContent():"");
			
			nodeAux = doc.getElementsByTagName("nombreCompleto");
			noSocio.setNombreCompleto((nodeAux.item(0)!=null)?nodeAux.item(0).getTextContent():"");
			
			nodeAux = doc.getElementsByTagName("telefonoLaboral");
			noSocio.setTelefonoLaboral((nodeAux.item(0)!=null)?nodeAux.item(0).getTextContent():"");
			
			nodeAux = doc.getElementsByTagName("telefonoParticular");
			noSocio.setTelefonoParticular((nodeAux.item(0)!=null)?nodeAux.item(0).getTextContent():"");	
			
			listNoSocio.add(noSocio); // aun no es una lista, la simulamos.
			
			if (noSocio != null) {
				oo.setNoSocioOsdeBinarioSC(listNoSocio);
			}
		}
		if (isMultiSujeto) {			
			oo.setNoSocioOsdeBinarioSA(listNoSocio);
			
		} else {
		oo.setNoSocioOsdeBinarioSA(oo.getNoSocioOsdeBinarioSC());
		}
		
	
		exchange.setProperty("orchestedObject", oo);
		
	}

}
