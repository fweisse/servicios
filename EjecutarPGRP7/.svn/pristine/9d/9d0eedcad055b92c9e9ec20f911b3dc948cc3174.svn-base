/**
 * 
 */
package ar.com.osde.services.ejecutarpgrp7.routebuilder;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

/**
 * @author jesus
 *
 */
public class EjecutarPGRP7HTTPBindingRouteBuilder extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://EjecutarPGRP7HTTPBinding")
		.log(LoggingLevel.INFO,"Ejecuto invocacionHttp")
		.to("xslt:xslt/ejecutarPGRP7XMLToSoap.xslt")
		.to("switchyard://EjecutarPGRP7Camel")
		.to("xslt:xslt/ejecutarPGRP7SoapToXML.xslt");
	}

}
