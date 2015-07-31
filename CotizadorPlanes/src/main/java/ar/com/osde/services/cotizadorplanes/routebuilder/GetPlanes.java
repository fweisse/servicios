package ar.com.osde.services.cotizadorplanes.routebuilder;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class GetPlanes extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		
		from("switchyard://GetPlanes")
			.log(LoggingLevel.DEBUG,"Ejecuto getPlanes")
			.to("xslt:xslt/getPlanesSoapToXML.xslt")
			.to("switchyard://PlanesComercialesSocio")
			.to("xslt:xslt/getPlanesXMLToSoap.xslt");
	}

}
