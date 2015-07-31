package ar.com.osde.services.ejecutarpgrp7.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.custommonkey.xmlunit.XMLAssert;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.Exchange;
import org.switchyard.ExchangeHandler;
import org.switchyard.HandlerException;
import org.switchyard.Message;
import org.switchyard.component.camel.model.RouteScanner;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.test.BeforeDeploy;
import org.switchyard.test.InvocationFaultException;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;
import org.switchyard.test.mixins.PropertyMixIn;
import org.xml.sax.SAXException;

/**
 * Test de unidad para el servicio EjecutarPGRP7
 * 
 * @author eduardo lucas
 * 
 */
@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(
        config = SwitchYardTestCaseConfig.SWITCHYARD_XML ,
        scanners= {RouteScanner.class},
        mixins = {CDIMixIn.class, PropertyMixIn.class}
)
public class EjecutarPGRP7UnitTest {
	private static final Logger LOG = Logger.getLogger(EjecutarPGRP7UnitTest.class);
	private static final String JETTY_SWITCHYARD_DEFAULT_PORT = "18001"; 
	private PropertyMixIn propMixIn;
	private SwitchYardTestKit testKit;

	@ServiceOperation("EjecutarPGRP7.ejecutarPGRP7")
    private Invoker ejecutarPGRP7;
	
	@BeforeDeploy
    public void setProperties() {
		//Carga un puerto libre para levantar el servidor jetty embebido
		if( null != System.getProperty("jettyPortSwitchyard")){
			propMixIn.set("jettyPort", System.getProperty("jettyPortSwitchyard"));
		}else{
			propMixIn.set("jettyPort", JETTY_SWITCHYARD_DEFAULT_PORT);
		}
		//Configuro XMLUnit
		XMLUnit.setIgnoreWhitespace(true);
    	XMLUnit.setIgnoreAttributeOrder(true);
    	XMLUnit.setIgnoreComments(true);
    }
	
    @Test
    public void testEsquemaFamiliarCasoOk() throws IOException, SAXException {
    	//Creo los mocks
    	testKit.replaceService("EjecutarPGRP7", new ExchangeHandler() {
			@Override
			public void handleMessage(Exchange exchange) throws HandlerException {
				String request  = exchange.getMessage().getContent(String.class);
				LOG.info("getEsquemaFamiliar provider:" + request);
				try {
					//Verifico que el request que entra al mock sea el esperado
					XMLAssert.assertXMLEqual(EjecutarPGRP7UnitTest.loadFile("unitTest/providerMockExpectedRequest/ejecutarPGRP7ProviderExpectedRequest.xml"),
							request);
					//Genero la respuesta mockeada
					String mockResponse = EjecutarPGRP7UnitTest.loadFile("unitTest/providerMockResponse/ejecutarPGRP7ProviderResponse.xml");
					LOG.info("mockResponse:" + mockResponse);
					//Envio la respuesta mockeada
					exchange.send(exchange.createMessage().setContent(mockResponse));
				} catch (AssertionError a) {
					LOG.error("El request al provider no valida con el esperado",a);
					throw new HandlerException(a);
				}
				catch (Exception e) {
					LOG.error("Sucedió un error al obtener el archivo",e);
					throw new HandlerException(e);
				}
			}

			@Override
			public void handleFault(Exchange exchange) {
				throw new RuntimeException("Sucedio error inesperado");
			}
		});
    	//Ejecuto el servicio
    	Message response = ejecutarPGRP7.sendInOut(EjecutarPGRP7UnitTest.loadFile("unitTest/serviceRequest/ejecutarPGRP7ServiceRequest.xml"));
    	//Verifico los resultados
    	XMLAssert.assertXMLEqual(EjecutarPGRP7UnitTest.loadFile("unitTest/serviceExpectedResponse/ejecutarPGRP7ServiceExpectedResponse.xml"),
    			response.getContent(String.class));
    }
    
    @Test
    public void testEsquemaFamiliarCasoError() throws IOException {
    	//Creo los mocks
    	testKit.replaceService("EjecutarPGRP7", new ExchangeHandler() {
			
			@Override
			public void handleMessage(Exchange exchange) throws HandlerException {
				throw new RuntimeException("Error en el provider!");
			}
			
			@Override
			public void handleFault(Exchange exchange) {
				throw new RuntimeException("Sucedio error inesperado");
			}
		});
    	try{
	    	//Ejecuto el servicio
	    	ejecutarPGRP7.sendInOut(EjecutarPGRP7UnitTest.loadFile("unitTest/serviceRequest/ejecutarPGRP7ServiceRequest.xml"));
    	} catch (InvocationFaultException e) {
    		//Verifico que el servicio haya lanzado una excepción
			assertTrue(e.getFaultMessage().toString().contains("Error en el provider!"));
		}
    }
    
    public static String loadFile(String fileRelativePath) throws IOException{
    	Path filePath = Paths.get(".","src/test/resources/" + fileRelativePath);
		LOG.info("currentDir:" + filePath.toAbsolutePath());
    	return new String(Files.readAllBytes(filePath));
    }
}
