package ar.com.osde.fsw.ConsultaEmpresaGenerica1CCG;

import org.apache.camel.builder.RouteBuilder;

public class ConsultaEmpresaGenerica1CCGRouterBuilder extends RouteBuilder{

	public void configure() throws Exception {
		//Defino el ruteo desde el service a la reference
				from("switchyard://ConsultaEmpresaGenerica1CCG")
				.to("switchyard://ConsultaEmpresaGenerica1CCGProvider");
		
	}

}
