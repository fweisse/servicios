package ar.com.osde.services.ejecutarpgrp7.routebuilder;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

import java.lang.management.ManagementFactory;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.management.ManagementService;

import org.apache.camel.component.cache.CacheConstants;
import org.apache.log4j.Logger;

public class EjecutarPGRP7RouteBuilder extends RouteBuilder {
	
	private Logger LOG = Logger.getLogger(EjecutarPGRP7RouteBuilder.class);

	public EjecutarPGRP7RouteBuilder() {
		ManagementService.registerMBeans(CacheManager.getInstance(),
				ManagementFactory.getPlatformMBeanServer(), true, true, true,
				true);
		LOG.info("cache mbean definido!");
	}
	
	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 * @throws Exception 
	 */
	public void configure() throws Exception {
		//Defino las rutas
		from("switchyard://EjecutarPGRP7")
				.convertBodyTo(String.class)
				.log("Received message for 'RoutesBuilder' : ${body}")
				.log("isHTTPMessage: " + xpath("boolean(/envelope)"))
				.choice()
					.when(xpath("boolean(/envelope)"))
						.to("switchyard://EjecutarPGRP7HTTPBinding")
					.otherwise()
						.to("direct:invocacionSoap")
		.end();
		
		from("direct:invocacionSoap")
			.log(LoggingLevel.INFO,"Ejecuto invocacionSoap")
			.to("switchyard://EjecutarPGRP7Camel")
		.end();
		

	}


}