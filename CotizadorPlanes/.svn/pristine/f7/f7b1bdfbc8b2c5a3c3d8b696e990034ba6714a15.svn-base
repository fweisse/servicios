package ar.com.osde.services.cotizadorplanes.routebuilder;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class GetEsquemaFamiliar extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		
		from("switchyard://GetEsquemaFamiliar")
			.log(LoggingLevel.DEBUG,"Ejecuto getEsquemaFamiliar")
			.to("xslt:xslt/getEsquemaFamiliarSoapToXML.xslt")
			.to("switchyard://TipoGrupoFamiliar")
			.to("xslt:xslt/getEsquemaFamiliarXMLToSoap.xslt");
	}

}
