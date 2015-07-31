package ar.com.osde.services.cotizadorplanes.routebuilder;

import org.apache.camel.builder.RouteBuilder;

/**
 * {@link RouteBuilder} que implementa el ruteo del servicio
 * 
 * @author facundo rodriguez
 *
 */
public class CotizadorPlanesRouteBuilder extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
	
		from("switchyard://CotizadorPlanes")
			.to("log:test?showAll=true")
			//Content Based Router según la operación invocada
			.choice()
				.when(simple("${property.org.switchyard.operationName} == 'getPlanes'"))
					.to("switchyard://GetPlanes")
				.when(simple("${property.org.switchyard.operationName} == 'getEsquemaFamiliar'"))
					.to("switchyard://GetEsquemaFamiliar");
	}

}
