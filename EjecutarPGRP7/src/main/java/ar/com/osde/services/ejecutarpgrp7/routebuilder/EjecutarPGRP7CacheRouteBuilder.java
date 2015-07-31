package ar.com.osde.services.ejecutarpgrp7.routebuilder;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cache.CacheConstants;

public class EjecutarPGRP7CacheRouteBuilder extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://EjecutarPGRP7Camel")
		.setProperty("cache.key",xpath("//IPGRUP"))
		.log("cache key: " + simple("${property.cache.key}"))
		//cargo los headers para el acceso a la cache
		.setHeader(CacheConstants.CACHE_OPERATION,constant(CacheConstants.CACHE_OPERATION_GET))
		.setHeader(CacheConstants.CACHE_KEY, simple("${property.cache.key}"))
		.to("cache://ejecutarPGRP7Cache")
		.log("cache ejecutarPGRP7")
		//verifico si la cache tiene el dato
		.choice()
			.when(header(CacheConstants.CACHE_ELEMENT_WAS_FOUND).isNull())
				//la cache no tiene el dato, accedo al provider y cargo el dato en la cache
				.to("switchyard://EjecutarPGRP7Provider")
				.convertBodyTo(String.class)
				.setHeader(CacheConstants.CACHE_OPERATION,constant(CacheConstants.CACHE_OPERATION_ADD))
				.setHeader(CacheConstants.CACHE_KEY, simple("${property.cache.key}"))
				.to("cache://ejecutarPGRP7Cache");
	}

}
