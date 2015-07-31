package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.servicios;


import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.xml.namespace.QName;

import org.apache.camel.InOut;
import org.apache.camel.StringSource;
import org.apache.camel.Exchange;
//import javax.jbi.component.ComponentContext;

import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ResponsablePagoValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ServiceException;

public class InvokeService {
	
	
	
	private static void responsableDePagoServicio(String mensaje, Exchange exchange){
		
		
		mensaje = " ";
		QName servicio = new QName("http://osde.com.ar/services/serviciosPI", "consultaSociosParticular1CCGRouter");
		//NormalizedMessage xmlRespuesta = this.invocarServicio(contratosService, mensaje );
		
		
	//	ServiceMixClient client = new ServiceMixClientFacade(this.context);
//		NormalizedMessage outMessage = null;
//
//		try {
//			exchange.
//			InOut localExchange = createInOutExchange();
//			localExchange.getInMessage().setContent(new StringSource(mensaje));
//			localExchange.setService(servicio);
//			
//
//			if (!client.sendSync(localExchange, 10000))
//				throw new ServiceException("Se produjo un error de timeout en la ejecucion de servicio");
//
//			outMessage = localExchange.getOutMessage();
//
//		} catch (MessagingException e) {
//			logger.error("invocarServicio>>>>>> " + e);
//			throw new ServiceException(e);
//		}
		//return outMessage;
	}

}
