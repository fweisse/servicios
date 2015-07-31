package ar.com.osde.services.ejecutarpgrp7.test;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.matching;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToXml;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.camel.model.RouteScanner;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.BeforeDeploy;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.mixins.PropertyMixIn;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

/**
 * Test de intregración para el servicio EjecutarPGRP7, utilizando HTTPMixIn
 * para realizar la invocación HTTP al servicio que expone el Switchyard embebido que
 * arranca en un servidor Jetty. También se levanta un servidor Jetty en otro
 * puerto diferente, para deployar los mocks de los web services providers que
 * utiliza el servicio bajo prueba
 * 
 * @author jesus aranda
 * 
 */
@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(
		config = SwitchYardTestCaseConfig.SWITCHYARD_XML,
        scanners= {RouteScanner.class},
        mixins = {CDIMixIn.class, PropertyMixIn.class, HTTPMixIn.class}
       )
public class EjecutarPGRP7HTTPIntegrationTest {
	
	private static final Logger LOG = Logger.getLogger(EjecutarPGRP7HTTPIntegrationTest.class); 
	private static final String JETTY_SWITCHYARD_DEFAULT_PORT = "18001";
	private static final String JETTY_MOCKS_WS_DEFAULT_PORT = "8089";
	private String jettyPortSwitchyard;
	private String jettyPortMockWS;
	private PropertyMixIn propMixIn;
	private HTTPMixIn httpMixIn;
	@Rule
	public WireMockRule wireMockRule; // No-args constructor defaults to port 8080
		
	@BeforeDeploy
    public void setProperties() {
		//Carga un puerto libre para levantar el servidor jetty embebido que inicia Switchyard
		if( null != System.getProperty("org.switchyard.component.http.standalone.port")){
			jettyPortSwitchyard = System.getProperty("org.switchyard.component.http.standalone.port");
		}else{
			System.setProperty("org.switchyard.component.http.standalone.port", JETTY_SWITCHYARD_DEFAULT_PORT);
			jettyPortSwitchyard = JETTY_SWITCHYARD_DEFAULT_PORT;
		}
		//Carga un puerto libre para levantar el servidor jetty para publicar los mocks Web Services
		if( null != System.getProperty("jettyPortMockWS")){
			jettyPortMockWS = System.getProperty("jettyPortMockWS");
		}else{
			jettyPortMockWS = JETTY_MOCKS_WS_DEFAULT_PORT;
		}
		//Creo la factory de mocks con el puerto obtenido
		wireMockRule = new WireMockRule(Integer.valueOf(jettyPortMockWS));
		LOG.info("jettyPortMockWS: " + jettyPortMockWS);
        // Actualizo la url de la referencia para que use el mock
    	propMixIn.set("EjecutarPGRP7.ProviderEjecutarPGRP7.locationURI","http://localhost:" + jettyPortMockWS + "/mockEjecutarPGRP7HTTP");
    }
	
    @Test
    public void testEjecutarPGRP7HTTPCasoOk() throws IOException {
    	//Creo los mocks del web service
	   stubFor(post(urlEqualTo("/mockEjecutarPGRP7HTTP"))
	           .willReturn(aResponse()
	                .withStatus(200)
	                .withHeader("Content-Type", "text/plain;charset=UTF-8")
	                .withBody(EjecutarPGRP7HTTPIntegrationTest.loadFile("integrationTest/providerMockResponse/ejecutarPGRP7HTTPProviderMockResponse.xml"))));
    	//Creo los headers para la invocacion
    	Map<String,String> headers = new HashMap<String,String>();
		headers.put("Content-Type", "text/xml");
		headers.put("Connection", "Keep-Alive");
		httpMixIn.setRequestHeaders(headers);
		//Ejecuto el servicio y verifico el resultado xml
		int httpResponseCode = this.postResourceAndTestXML("http://localhost:" + jettyPortSwitchyard + "/EjecutarPGRP7/EjecutarPGRP7", 
				"/integrationTest/serviceRequest/ejecutarPGRP7HTTPServiceRequest.xml", 
				"/integrationTest/serviceExpectedResponse/ejecutarPGRP7HTTPServiceExpectedResponse.xml");
		//verifico el codigo http de respuesta
		Assert.assertEquals(200,httpResponseCode);
		//Verifico que al mock lo hayan llamado con el request esperado
		verify(postRequestedFor(urlMatching("/mockEjecutarPGRP7HTTP"))
	            .withRequestBody(equalToXml(
	            		EjecutarPGRP7HTTPIntegrationTest.loadFile("integrationTest/providerMockExpectedRequest/ejecutarPGRP7HTTPProviderMockExpectedRequest.xml")))
	            .withHeader("Content-Type", matching("text/xml"))
	            .withHeader("Connection", matching("Keep-Alive"))
	            .withHeader("Authorization", matching("Basic cGlhcHBsdXNlcjpvc2RlMTBzYXA=")));
    }
     
    @Test
    public void testEjecutarPGRP7HTTPCasoError() throws IOException {
    	
    	//Creo los mocks del web service
	   stubFor(post(urlEqualTo("/mockEjecutarPGRP7HTTP"))
	           .willReturn(aResponse()
	                .withStatus(500)
	                .withHeader("Content-type", "text/xml; charset=utf-8")
	                .withBody(EjecutarPGRP7HTTPIntegrationTest.loadFile("integrationTest/providerMockResponse/errorHTTPProviderMockResponse.xml"))));
    	//Creo los headers para la invocacion
    	Map<String,String> headers = new HashMap<String,String>();
		headers.put("Content-Type", "text/xml");
		headers.put("Connection", "Keep-Alive");
		httpMixIn.setRequestHeaders(headers);
		//Ejecuto el servicio y verifico el resultado a nivel String
		int httpResponseCode = this.postResourceAndTestString("http://localhost:" + jettyPortSwitchyard + "/EjecutarPGRP7/EjecutarPGRP7", 
				"/integrationTest/serviceRequest/ejecutarPGRP7HTTPServiceRequest.xml", 
				"org.switchyard.HandlerException: SWITCHYARD033902: camel exchange failed without an exception: java.io.StringReader");
		//verifico el codigo http de respuesta
		Assert.assertEquals(500,httpResponseCode);
		//Verifico que al mock lo hayan llamado con el request esperado
		verify(postRequestedFor(urlMatching("/mockEjecutarPGRP7HTTP"))
	            .withRequestBody(equalToXml(
	            		EjecutarPGRP7HTTPIntegrationTest.loadFile("integrationTest/providerMockExpectedRequest/ejecutarPGRP7HTTPProviderMockExpectedRequest.xml")))
	            .withHeader("Content-Type", matching("text/xml"))
	            .withHeader("Connection", matching("Keep-Alive"))
	            .withHeader("Authorization", matching("Basic cGlhcHBsdXNlcjpvc2RlMTBzYXA=")));
    }
    
    public static String loadFile(String fileRelativePath) throws IOException{
    	Path filePath = Paths.get(".","src/test/resources/" + fileRelativePath);
		LOG.info("currentDir:" + filePath.toAbsolutePath());
    	return new String(Files.readAllBytes(filePath));
    }
    
    /**
	 * Metodo que invoca al WS expouesto en endpointURL, y compara el resultado
	 * en base al archivo xml pasado en expectedResponseResource usando XMLUnit.
	 * De la invocación devuelve el codigo http de la respuesta que permite
	 * también ser verificado
	 * 
	 * @param endpointURL
	 * @param requestResource
	 * @param expectedResponseResource
	 * @return
	 */
    public int postResourceAndTestXML(String endpointURL, String requestResource, String expectedResponseResource){
    	HttpResponse httpResponse = httpMixIn.postResourceAndGetMethod(endpointURL, requestResource);
        int status = httpResponse.getStatusLine().getStatusCode();
        String response;
		try {
			response = EntityUtils.toString(httpResponse.getEntity());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		httpMixIn.getTestKit().compareXMLToResource(response, expectedResponseResource);
    	return status;
    }
    
    /**
  	 * Metodo que invoca al WS expouesto en endpointURL, y compara el resultado
  	 * en base al String en expectedResponse usando comparación entre Strings.
  	 * De la invocación devuelve el codigo http de la respuesta que permite
  	 * también ser verificado
  	 * 
  	 * @param endpointURL
  	 * @param requestResource
  	 * @param expectedResponseResource
  	 * @return
  	 */
      public int postResourceAndTestString(String endpointURL, String requestResource, String expectedResponse){
      	HttpResponse httpResponse = httpMixIn.postResourceAndGetMethod(endpointURL, requestResource);
          int status = httpResponse.getStatusLine().getStatusCode();
          String response;
  		try {
  			response = EntityUtils.toString(httpResponse.getEntity());
  		} catch (Exception e) {
  			throw new RuntimeException(e);
  		}
  		Assert.assertTrue(response.contains(expectedResponse));
      	return status;
      }

}
