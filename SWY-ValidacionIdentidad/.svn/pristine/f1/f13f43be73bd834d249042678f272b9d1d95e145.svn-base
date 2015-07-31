package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ValidacionDeIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ValidacionIdentidad;


public class VIUTil {

	

	public static DOMSource crearXML(ValidacionDeIdentidad vi){
		
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		DOMSource xml = new DOMSource();
		
		try {


		docBuilder = docFactory.newDocumentBuilder();		
		
		Document doc = docBuilder.newDocument();
		
		Element rootElement = doc.createElement("validacionDeIdentidad");
		doc.appendChild(rootElement);
		
		Element servicioE = doc.createElement("servicio");
		servicioE.appendChild(doc.createTextNode(vi.getServicio()));
		rootElement.appendChild(servicioE);		

		Element sujetoContactoE = doc.createElement("sujetoContacto");
		sujetoContactoE.appendChild(doc.createTextNode(vi.getSujetoContacto()));		
		rootElement.appendChild(sujetoContactoE);		
		
		Element sujetoActividadE = doc.createElement("sujetoActividad");
		sujetoActividadE.appendChild(doc.createTextNode(vi.getSujetoActividad()));		
		rootElement.appendChild(sujetoActividadE);
		
		Element nroInterlocutorSujetoContactoE = doc.createElement("nroInterlocutorSujetoContacto");
		nroInterlocutorSujetoContactoE.appendChild(doc.createTextNode(vi.getNroInterlocutorSujetoContacto()));//"1500076598"		
		rootElement.appendChild(nroInterlocutorSujetoContactoE);
		
		Element nroInterlocutorSujetoActividadE = doc.createElement("nroInterlocutorSujetoActividad");
		nroInterlocutorSujetoActividadE.appendChild(doc.createTextNode(vi.getNroInterlocutorSujetoActividad()));//"1500076598"		
		rootElement.appendChild(nroInterlocutorSujetoActividadE);
		
		
		Element sujetoValidacionIdentidadContactoE = doc.createElement("sujetoValidacionIdentidadContacto");
		rootElement.appendChild(sujetoValidacionIdentidadContactoE);
		
		//interlocutorsetSujetoValidacionIdentidadActividad
		Element interlocutorE = doc.createElement("interlocutor");
		sujetoValidacionIdentidadContactoE.appendChild(interlocutorE);
		doc.importNode(getInterlocutor(interlocutorE, doc, vi), true);
		
		
		//CONTRATO
		Element contratoE = doc.createElement("contrato");
		sujetoValidacionIdentidadContactoE.appendChild(contratoE);
		doc.importNode(getContrato(contratoE, doc), true);
			    
	    
	    //listContratos
	    Element listContratosE = doc.createElement("listContratos");
		sujetoValidacionIdentidadContactoE.appendChild(listContratosE);
		listContratosE.appendChild(doc.createTextNode(""));
		
	    //documentos --- es una LISTA
	    Element documentosE = doc.createElement("documentos");
		sujetoValidacionIdentidadContactoE.appendChild(documentosE);
		
		//documentoValidacionIdentidad
		Element documentoValidacionIdentidadE = doc.createElement("documentoValidacionIdentidad");
		documentosE.appendChild(documentoValidacionIdentidadE);
		
		//tipo
		Element tipoE = doc.createElement("tipo");
		documentoValidacionIdentidadE.appendChild(tipoE);
		tipoE.appendChild(doc.createTextNode(""));
		
		//numero
		Element numeroE = doc.createElement("numero");
		documentoValidacionIdentidadE.appendChild(numeroE);
		numeroE.appendChild(doc.createTextNode(""));
		
		
		//integrantesGrupoFamiliar -- es una LISTA
		Element integrantesGrupoFamiliarE = doc.createElement("integrantesGrupoFamiliar");
		sujetoValidacionIdentidadContactoE.appendChild(integrantesGrupoFamiliarE);
		
		//integranteValidacionIdentidad
		Element integranteValidacionIdentidadE = doc.createElement("integranteValidacionIdentidad");
		integrantesGrupoFamiliarE.appendChild(integranteValidacionIdentidadE);
		doc.importNode(getIntegranteValidacionIdentidad(integranteValidacionIdentidadE, documentosE, documentoValidacionIdentidadE, doc), true);
		
				
		//obraSocial
		Element obraSocialE = doc.createElement("obraSocial");
		sujetoValidacionIdentidadContactoE.appendChild(obraSocialE);
		obraSocialE.appendChild(doc.createTextNode(""));
		
		//poseeSubsidioPorDesempleo
		Element poseeSubsidioPorDesempleoE = doc.createElement("poseeSubsidioPorDesempleo");
		sujetoValidacionIdentidadContactoE.appendChild(poseeSubsidioPorDesempleoE);
		poseeSubsidioPorDesempleoE.appendChild(doc.createTextNode(""));//false
		
		//anteriorModoContratacionHastaPlan
		Element anteriorModoContratacionHastaPlanE = doc.createElement("anteriorModoContratacionHastaPlan");
		sujetoValidacionIdentidadContactoE.appendChild(anteriorModoContratacionHastaPlanE);
		anteriorModoContratacionHastaPlanE.appendChild(doc.createTextNode(""));//false
		
		//bajaLogica
		Element bajaLogicaE = doc.createElement("bajaLogica");
		sujetoValidacionIdentidadContactoE.appendChild(bajaLogicaE);
		bajaLogicaE.appendChild(doc.createTextNode(""));//false
		
		//domicilio
		Element domicilioE = doc.createElement("domicilio");
		sujetoValidacionIdentidadContactoE.appendChild(domicilioE);
		domicilioE.appendChild(doc.createTextNode(""));
		
		//sujetoComplementacion
		Element sujetoComplementacionE = doc.createElement("sujetoComplementacion");
		sujetoValidacionIdentidadContactoE.appendChild(sujetoComplementacionE);
		sujetoComplementacionE.appendChild(doc.createTextNode(""));//false
		
		//marcaPreexistencia
		Element marcaPreexistenciaE = doc.createElement("marcaPreexistencia");
		sujetoValidacionIdentidadContactoE.appendChild(marcaPreexistenciaE);
		marcaPreexistenciaE.appendChild(doc.createTextNode(""));//false
		
		//porDescenso
		Element porDescensoE = doc.createElement("porDescenso");
		sujetoValidacionIdentidadContactoE.appendChild(porDescensoE);
		porDescensoE.appendChild(doc.createTextNode(""));//false
		
		//porDescensoMenorA30Dias
		Element porDescensoMenorA30DiasE = doc.createElement("porDescensoMenorA30Dias");
		sujetoValidacionIdentidadContactoE.appendChild(porDescensoMenorA30DiasE);
		porDescensoMenorA30DiasE.appendChild(doc.createTextNode(""));//false
		
		//vigenciaMenorA90Dias
		Element vigenciaMenorA90DiasE = doc.createElement("vigenciaMenorA90Dias");
		sujetoValidacionIdentidadContactoE.appendChild(vigenciaMenorA90DiasE);
		vigenciaMenorA90DiasE.appendChild(doc.createTextNode(""));//false
		
		//altaAutomatica
		Element altaAutomaticaE = doc.createElement("altaAutomatica");
		sujetoValidacionIdentidadContactoE.appendChild(altaAutomaticaE);
		altaAutomaticaE.appendChild(doc.createTextNode(""));//false
		
		//consumio
		Element consumioE = doc.createElement("consumio");
		sujetoValidacionIdentidadContactoE.appendChild(consumioE);
		consumioE.appendChild(doc.createTextNode(""));//false
		
		//poseeSumatoriaDeAporte
		Element poseeSumatoriaDeAporteE = doc.createElement("poseeSumatoriaDeAporte");
		sujetoValidacionIdentidadContactoE.appendChild(poseeSumatoriaDeAporteE);
		poseeSumatoriaDeAporteE.appendChild(doc.createTextNode(""));//false
		
/////////////////////////////////////////////////////////////////////////////////////
		
		//sujetoValidacionIdentidadActividad		
		Element sujetoValidacionIdentidadActividadE = doc.createElement("sujetoValidacionIdentidadActividad");
		rootElement.appendChild(sujetoValidacionIdentidadActividadE);
		
		interlocutorE = doc.createElement("interlocutor");
		sujetoValidacionIdentidadActividadE.appendChild(interlocutorE);	
		doc.importNode(getInterlocutor(interlocutorE, doc, vi), true);
		
		//CONTRATO
		contratoE = doc.createElement("contrato");
		sujetoValidacionIdentidadActividadE.appendChild(contratoE);
		doc.importNode(getContrato(contratoE, doc), true);
		
		 //listContratos
	    listContratosE = doc.createElement("listContratos");
	    sujetoValidacionIdentidadActividadE.appendChild(listContratosE);
		listContratosE.appendChild(doc.createTextNode(""));
		
	    //documentos --- es una LISTA
	    documentosE = doc.createElement("documentos");
	    sujetoValidacionIdentidadActividadE.appendChild(documentosE);
		
		//documentoValidacionIdentidad
		documentoValidacionIdentidadE = doc.createElement("documentoValidacionIdentidad");
		documentosE.appendChild(documentoValidacionIdentidadE);
		
		//tipo
		tipoE = doc.createElement("tipo");
		documentoValidacionIdentidadE.appendChild(tipoE);
		tipoE.appendChild(doc.createTextNode(""));//CUIL
		
		//numero
		numeroE = doc.createElement("numero");
		documentoValidacionIdentidadE.appendChild(numeroE);
		numeroE.appendChild(doc.createTextNode(""));//20082390147
		
		
		//integrantesGrupoFamiliar -- es una LISTA
		integrantesGrupoFamiliarE = doc.createElement("integrantesGrupoFamiliar");
		sujetoValidacionIdentidadActividadE.appendChild(integrantesGrupoFamiliarE);
		
		//integranteValidacionIdentidad
		integranteValidacionIdentidadE = doc.createElement("integranteValidacionIdentidad");
		integrantesGrupoFamiliarE.appendChild(integranteValidacionIdentidadE);
		doc.importNode(getIntegranteValidacionIdentidad(integranteValidacionIdentidadE, documentosE, documentoValidacionIdentidadE, doc), true);
		
				
		//obraSocial
		obraSocialE = doc.createElement("obraSocial");
		sujetoValidacionIdentidadActividadE.appendChild(obraSocialE);
		obraSocialE.appendChild(doc.createTextNode(""));
		
		//poseeSubsidioPorDesempleo
		poseeSubsidioPorDesempleoE = doc.createElement("poseeSubsidioPorDesempleo");
		sujetoValidacionIdentidadActividadE.appendChild(poseeSubsidioPorDesempleoE);
		poseeSubsidioPorDesempleoE.appendChild(doc.createTextNode(""));//false
		
		//anteriorModoContratacionHastaPlan
		anteriorModoContratacionHastaPlanE = doc.createElement("anteriorModoContratacionHastaPlan");
		sujetoValidacionIdentidadActividadE.appendChild(anteriorModoContratacionHastaPlanE);
		anteriorModoContratacionHastaPlanE.appendChild(doc.createTextNode(""));//false
		
		//bajaLogica
		bajaLogicaE = doc.createElement("bajaLogica");
		sujetoValidacionIdentidadActividadE.appendChild(bajaLogicaE);
		bajaLogicaE.appendChild(doc.createTextNode(""));//false
		
		//domicilio
		domicilioE = doc.createElement("domicilio");
		sujetoValidacionIdentidadContactoE.appendChild(domicilioE);
		domicilioE.appendChild(doc.createTextNode(""));
		
		//sujetoComplementacion
		sujetoComplementacionE = doc.createElement("sujetoComplementacion");
		sujetoValidacionIdentidadActividadE.appendChild(sujetoComplementacionE);
		sujetoComplementacionE.appendChild(doc.createTextNode(""));//false
		
		//marcaPreexistencia
		marcaPreexistenciaE = doc.createElement("marcaPreexistencia");
		sujetoValidacionIdentidadActividadE.appendChild(marcaPreexistenciaE);
		marcaPreexistenciaE.appendChild(doc.createTextNode(""));//false
		
		//porDescenso
		porDescensoE = doc.createElement("porDescenso");
		sujetoValidacionIdentidadActividadE.appendChild(porDescensoE);
		porDescensoE.appendChild(doc.createTextNode(""));//false
		
		//porDescensoMenorA30Dias
		porDescensoMenorA30DiasE = doc.createElement("porDescensoMenorA30Dias");
		sujetoValidacionIdentidadActividadE.appendChild(porDescensoMenorA30DiasE);
		porDescensoMenorA30DiasE.appendChild(doc.createTextNode(""));//false
		
		//vigenciaMenorA90Dias
		vigenciaMenorA90DiasE = doc.createElement("vigenciaMenorA90Dias");
		sujetoValidacionIdentidadActividadE.appendChild(vigenciaMenorA90DiasE);
		vigenciaMenorA90DiasE.appendChild(doc.createTextNode(""));//false
		
		//altaAutomatica
		altaAutomaticaE = doc.createElement("altaAutomatica");
		sujetoValidacionIdentidadActividadE.appendChild(altaAutomaticaE);
		altaAutomaticaE.appendChild(doc.createTextNode("")); //false
		
		//consumio
		consumioE = doc.createElement("consumio");
		sujetoValidacionIdentidadContactoE.appendChild(consumioE);
		consumioE.appendChild(doc.createTextNode(""));//false
		
		//poseeSumatoriaDeAporte
		poseeSumatoriaDeAporteE = doc.createElement("poseeSumatoriaDeAporte");
		sujetoValidacionIdentidadActividadE.appendChild(poseeSumatoriaDeAporteE);
		poseeSumatoriaDeAporteE.appendChild(doc.createTextNode(""));//false

/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Element tipoSujetoActividadE = doc.createElement("tipoSujetoActividad");
		rootElement.appendChild(tipoSujetoActividadE);
		
		Element descriptionE = doc.createElement("description");
		tipoSujetoActividadE.appendChild(descriptionE);
		descriptionE.appendChild(doc.createTextNode((vi.getTipoSujetoActividad()).getDescription()));
		
		Element tipoSujetoContactoE = doc.createElement("tipoSujetoContacto");
		rootElement.appendChild(tipoSujetoContactoE);
		
		descriptionE = doc.createElement("description");
		tipoSujetoContactoE.appendChild(descriptionE);
		descriptionE.appendChild(doc.createTextNode((vi.getTipoSujetoContacto()).getDescription()));
		
		Element sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividadE = doc.createElement("sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividad");
		rootElement.appendChild(sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividadE);
		sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividadE.appendChild(doc.createTextNode(""));//false
		
		//sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad
		Element sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividadE = doc.createElement("sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad");
		rootElement.appendChild(sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividadE);
		sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividadE.appendChild(doc.createTextNode(""));//false
		
		
		Element utilizarLinkABiblosE = doc.createElement("utilizarLinkABiblos");
		rootElement.appendChild(utilizarLinkABiblosE);
		utilizarLinkABiblosE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarSpeechParaServicioE = doc.createElement("mostrarSpeechParaServicio");
		rootElement.appendChild(mostrarSpeechParaServicioE);
		mostrarSpeechParaServicioE.appendChild(doc.createTextNode(""));//false
		
		Element sujetoContactoIgualSujetoActividadE = doc.createElement("sujetoContactoIgualSujetoActividad");
		rootElement.appendChild(sujetoContactoIgualSujetoActividadE);
		sujetoContactoIgualSujetoActividadE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarVariableComplementacionE = doc.createElement("mostrarVariableComplementacion");
		rootElement.appendChild(mostrarVariableComplementacionE);
		mostrarVariableComplementacionE.appendChild(doc.createTextNode(""));//false
			
		Element mostrarFilialServicioE = doc.createElement("mostrarFilialServicio");
		rootElement.appendChild(mostrarFilialServicioE);
		mostrarFilialServicioE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarObraSocialComplementacionE = doc.createElement("mostrarObraSocialComplementacion");
		rootElement.appendChild(mostrarObraSocialComplementacionE);
		mostrarObraSocialComplementacionE.appendChild(doc.createTextNode(""));//false

		Element keyParaTituloRestringidoE = doc.createElement("keyParaTituloRestringido");
		rootElement.appendChild(keyParaTituloRestringidoE);
		keyParaTituloRestringidoE.appendChild(doc.createTextNode(""));//default
				
		Element keySpeechCuestionarioE = doc.createElement("keySpeechCuestionario");
		rootElement.appendChild(keySpeechCuestionarioE);
		keySpeechCuestionarioE.appendChild(doc.createTextNode(""));//default
		
		Element esCapE = doc.createElement("esCap");
		rootElement.appendChild(esCapE);
		esCapE.appendChild(doc.createTextNode(""));
		
		Element speechInformativoE = doc.createElement("speechInformativo");
		rootElement.appendChild(speechInformativoE);
		speechInformativoE.appendChild(doc.createTextNode(""));//false
		
		
		Element mostrarPrimeroE = doc.createElement("mostrarPrimero");
		rootElement.appendChild(mostrarPrimeroE);
		mostrarPrimeroE.appendChild(doc.createTextNode(""));//true
		
		Element mostrarObservacionesYBotonRestringidoE = doc.createElement("mostrarObservacionesYBotonRestringido");
		rootElement.appendChild(mostrarObservacionesYBotonRestringidoE);
		mostrarObservacionesYBotonRestringidoE.appendChild(doc.createTextNode("true"));
		
		Element saltearPantallaCAPE = doc.createElement("saltearPantallaCAP");
		rootElement.appendChild(saltearPantallaCAPE);
		saltearPantallaCAPE.appendChild(doc.createTextNode(""));//true
		
		Element servicioSinCuestionarioE = doc.createElement("servicioSinCuestionario");
		rootElement.appendChild(servicioSinCuestionarioE);
		servicioSinCuestionarioE.appendChild(doc.createTextNode(""));//true
		
		Element mostrarBotonUsoInternoE = doc.createElement("mostrarBotonUsoInterno");
		rootElement.appendChild(mostrarBotonUsoInternoE);
		mostrarBotonUsoInternoE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarBotonGestionE = doc.createElement("mostrarBotonGestion");
		rootElement.appendChild(mostrarBotonGestionE);
		mostrarBotonGestionE.appendChild(doc.createTextNode(""));//true
		
		Element intercambiarSCySAE = doc.createElement("intercambiarSCySA");
		rootElement.appendChild(intercambiarSCySAE);
		intercambiarSCySAE.appendChild(doc.createTextNode(""));//false
		
		Element guardarEnSesionValidacionExitosaE = doc.createElement("guardarEnSesionValidacionExitosa");
		rootElement.appendChild(guardarEnSesionValidacionExitosaE);
		guardarEnSesionValidacionExitosaE.appendChild(doc.createTextNode(""));//true
		
		Element usaCuestionarioAlternativoE = doc.createElement("usaCuestionarioAlternativo");
		rootElement.appendChild(usaCuestionarioAlternativoE);
		usaCuestionarioAlternativoE.appendChild(doc.createTextNode(""));//true
		
		Element empresaGrupoDirectoPuroE = doc.createElement("empresaGrupoDirectoPuro");
		rootElement.appendChild(empresaGrupoDirectoPuroE);
		empresaGrupoDirectoPuroE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarBotonGestionEnBajaE = doc.createElement("mostrarBotonGestionEnBaja");
		rootElement.appendChild(mostrarBotonGestionEnBajaE);
		mostrarBotonGestionEnBajaE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarAclaracionSobreCredencialE = doc.createElement("mostrarAclaracionSobreCredencial");
		rootElement.appendChild(mostrarAclaracionSobreCredencialE);
		mostrarAclaracionSobreCredencialE.appendChild(doc.createTextNode(""));//false
		
		Element accesoPermitidoE = doc.createElement("accesoPermitido");
		rootElement.appendChild(accesoPermitidoE);
		accesoPermitidoE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarBotonGestionPresencialE = doc.createElement("mostrarBotonGestionPresencial");
		rootElement.appendChild(mostrarBotonGestionPresencialE);
		mostrarBotonGestionPresencialE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarInputsRestringidoCAPE = doc.createElement("mostrarInputsRestringidoCAP");
		rootElement.appendChild(mostrarInputsRestringidoCAPE);
		mostrarInputsRestringidoCAPE.appendChild(doc.createTextNode(""));//false
		
		Element mostrarInputsRestringidoCATE = doc.createElement("mostrarInputsRestringidoCAT");
		rootElement.appendChild(mostrarInputsRestringidoCATE);
		mostrarInputsRestringidoCATE.appendChild(doc.createTextNode(""));//false
				
		Element mostrarGestorAsignadoE = doc.createElement("mostrarGestorAsignado");
		rootElement.appendChild(mostrarGestorAsignadoE);
		mostrarGestorAsignadoE.appendChild(doc.createTextNode(""));//false
		
		Element cambiarFormaDeContactoASalienteE = doc.createElement("cambiarFormaDeContactoASaliente");
		rootElement.appendChild(cambiarFormaDeContactoASalienteE);
		cambiarFormaDeContactoASalienteE.appendChild(doc.createTextNode(""));//false
		
		Element fromDatanetE = doc.createElement("fromDatanet");
		rootElement.appendChild(fromDatanetE);
		fromDatanetE.appendChild(doc.createTextNode(""));//false
		
		Element datanetTitleE = doc.createElement("datanetTitle");
		rootElement.appendChild(datanetTitleE);
		datanetTitleE.appendChild(doc.createTextNode(""));//default
		
		xml = new DOMSource(doc);
		
//para ver el contenido del doc		
//		TransformerFactory tf = TransformerFactory.newInstance();
//        Transformer transformer = tf.newTransformer();
//        
//		java.io.StringWriter sw = new java.io.StringWriter();
//        StreamResult sr = new StreamResult(sw);
//        transformer.transform(xml, sr);
        //System.out.println(sw.toString());     
        
        
		
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
//		} catch (TransformerConfigurationException e) {
//			e.printStackTrace();
//		} catch (TransformerException e) {
//			e.printStackTrace();
		} 
 
		
		return xml;
		
	}
	
private static Element getInterlocutor(Element interlocutorE, Document doc, ValidacionDeIdentidad vi){ //, InterlocutorValidacionIdentidad interlocutor
	

		Element nombreE = doc.createElement("nombre");
		interlocutorE.appendChild(nombreE);
		nombreE.appendChild(doc.createTextNode(""));
		
		Element apellidoE = doc.createElement("apellido");
		interlocutorE.appendChild(apellidoE);
		apellidoE.appendChild(doc.createTextNode(""));
		
		Element nroInterlocutorE = doc.createElement("nroInterlocutor");
		interlocutorE.appendChild(nroInterlocutorE);
		nroInterlocutorE.appendChild(doc.createTextNode(""));
			
		Element nroContratoInterlocutorE = doc.createElement("nroContrato");
		interlocutorE.appendChild(nroContratoInterlocutorE);
		nroContratoInterlocutorE.appendChild(doc.createTextNode(""));
		
		Element nroOrdenE = doc.createElement("nroOrden");
		interlocutorE.appendChild(nroOrdenE);
		nroOrdenE.appendChild(doc.createTextNode(""));
		
		Element sexoE = doc.createElement("sexo");
		interlocutorE.appendChild(sexoE);
		sexoE.appendChild(doc.createTextNode(""));
		
		Element fechaNacimientoE = doc.createElement("fechaNacimiento");
		interlocutorE.appendChild(fechaNacimientoE);
		fechaNacimientoE.appendChild(doc.createTextNode(""));
		
		Element edadE = doc.createElement("edad");
		interlocutorE.appendChild(edadE);
		edadE.appendChild(doc.createTextNode(""));
		
		Element multiproductoE = doc.createElement("multiproducto");
		interlocutorE.appendChild(multiproductoE);
		multiproductoE.appendChild(doc.createTextNode(""));		
		
		Element marcaDiscapacitadoE = doc.createElement("marcaDiscapacitado");
		interlocutorE.appendChild(marcaDiscapacitadoE);
		marcaDiscapacitadoE.appendChild(doc.createTextNode(""));
		
		Element ambitoVisibilidadE = doc.createElement("ambitoVisibilidad");
		interlocutorE.appendChild(ambitoVisibilidadE);
		ambitoVisibilidadE.appendChild(doc.createTextNode(""));
		
		Element discPermanenteE = doc.createElement("discPermanente");
		interlocutorE.appendChild(discPermanenteE);
		discPermanenteE.appendChild(doc.createTextNode(""));
		
		Element marcaDiscapacidadFacturacionE = doc.createElement("marcaDiscapacidadFacturacion");
		interlocutorE.appendChild(marcaDiscapacidadFacturacionE);
		marcaDiscapacidadFacturacionE.appendChild(doc.createTextNode(""));
		
		
		return interlocutorE;	
		
	}

private static Element getContrato(Element contratoE, Document doc){ //, Contrato contrato
	
	Element nroContratoE = doc.createElement("nroContrato");
    contratoE.appendChild(nroContratoE);
	nroContratoE.appendChild(doc.createTextNode(""));
	
	Element nroOrdenContratoE = doc.createElement("nroOrden");
    contratoE.appendChild(nroOrdenContratoE);
    nroOrdenContratoE.appendChild(doc.createTextNode(""));
	
	Element fechaAltaE = doc.createElement("fechaAlta");
    contratoE.appendChild(fechaAltaE);
    fechaAltaE.appendChild(doc.createTextNode(""));
	
	Element fechaBajaE = doc.createElement("fechaBaja");
    contratoE.appendChild(fechaBajaE);
	fechaBajaE.appendChild(doc.createTextNode(""));
	
	//responsablePago
	Element responsablePagoE = doc.createElement("responsablePago");
    contratoE.appendChild(responsablePagoE);
	
    Element razonSocialE = doc.createElement("razonSocial");
    responsablePagoE.appendChild(razonSocialE);
    razonSocialE.appendChild(doc.createTextNode(""));
    
    Element nroInterlocutorResponsableE = doc.createElement("nroInterlocutor");
    responsablePagoE.appendChild(nroInterlocutorResponsableE);
    nroInterlocutorResponsableE.appendChild(doc.createTextNode(""));
    
    Element modoContratacionE = doc.createElement("modoContratacion");
    responsablePagoE.appendChild(modoContratacionE);
    modoContratacionE.appendChild(doc.createTextNode(""));

    Element nroContratoResponsableE = doc.createElement("nroContrato");
    responsablePagoE.appendChild(nroContratoResponsableE);
    nroContratoResponsableE.appendChild(doc.createTextNode(""));
    
    Element codigoObraSocialE = doc.createElement("codigoObraSocial");
    responsablePagoE.appendChild(codigoObraSocialE);
    codigoObraSocialE.appendChild(doc.createTextNode(""));
    
    Element descripcionObraSocialE = doc.createElement("descripcionObraSocial");
    responsablePagoE.appendChild(descripcionObraSocialE);
    descripcionObraSocialE.appendChild(doc.createTextNode(""));
    
    //filialDeServicio
    Element filialServicioIdE = doc.createElement("filialServicioId");
    contratoE.appendChild(filialServicioIdE);
    filialServicioIdE.appendChild(doc.createTextNode(""));
    
    //filialServicio
    Element filialServicioE = doc.createElement("filialServicio");
    contratoE.appendChild(filialServicioE);
    filialServicioE.appendChild(doc.createTextNode(""));
    
    //filialGestionId
    Element filialGestionIdE = doc.createElement("filialGestionId");
    contratoE.appendChild(filialGestionIdE);
    filialGestionIdE.appendChild(doc.createTextNode(""));
    
    //filialGestion
    Element filialGestionE = doc.createElement("filialGestion");
    contratoE.appendChild(filialGestionE);
    filialGestionE.appendChild(doc.createTextNode(""));
    
    //motivoBaja
    Element motivoBajaE = doc.createElement("motivoBaja");
    contratoE.appendChild(motivoBajaE);
    motivoBajaE.appendChild(doc.createTextNode(""));
    
    //mesesRec
    Element mesesRecE = doc.createElement("mesesRec");
    contratoE.appendChild(mesesRecE);
    mesesRecE.appendChild(doc.createTextNode(""));
    
    //plan
    Element planE = doc.createElement("plan");
    contratoE.appendChild(planE);
    planE.appendChild(doc.createTextNode(""));
    
    //flagPrestador
    Element flagPrestadorE = doc.createElement("flagPrestador");
    contratoE.appendChild(flagPrestadorE);
    flagPrestadorE.appendChild(doc.createTextNode(""));
    
    //mail
    Element mailE = doc.createElement("mail");
    contratoE.appendChild(mailE);
    mailE.appendChild(doc.createTextNode(""));
    
    //flagAutRyA
    Element flagAutRyAE = doc.createElement("flagAutRyA");
    contratoE.appendChild(flagAutRyAE);
    flagAutRyAE.appendChild(doc.createTextNode(""));
    
    //flagAutPos
    Element flagAutPosE = doc.createElement("flagAutPos");
    contratoE.appendChild(flagAutPosE);
    flagAutPosE.appendChild(doc.createTextNode(""));
    
    
    //flagManRyA	    
    Element flagManRyAE= doc.createElement("flagManRyA");
    contratoE.appendChild(flagManRyAE);
    flagManRyAE.appendChild(doc.createTextNode(""));
    
    //fechaFlagRyA
    Element fechaFlagRyAE = doc.createElement("fechaFlagRyA");
    contratoE.appendChild(fechaFlagRyAE);
    fechaFlagRyAE.appendChild(doc.createTextNode(""));
    
    //flagManPos
    Element flagManPosE = doc.createElement("flagManPos");
    contratoE.appendChild(flagManPosE);
    flagManPosE.appendChild(doc.createTextNode(""));
    
    //fechaManPos
    Element fechaManPosE = doc.createElement("fechaManPosE");
    contratoE.appendChild(fechaManPosE);
    fechaManPosE.appendChild(doc.createTextNode(""));
    
    //deuda
    Element deudaE = doc.createElement("deuda");
    contratoE.appendChild(deudaE);
    deudaE.appendChild(doc.createTextNode(""));
    
    //gestor
    Element gestorE = doc.createElement("gestor");
    contratoE.appendChild(gestorE);
    gestorE.appendChild(doc.createTextNode(""));
    
    //icPromotor
    Element icPromotorE = doc.createElement("icPromotor");
    contratoE.appendChild(icPromotorE);
    icPromotorE.appendChild(doc.createTextNode(""));
    
    //aynPromotor
    Element aynPromotorE= doc.createElement("aynPromotor");
    contratoE.appendChild(aynPromotorE);
    aynPromotorE.appendChild(doc.createTextNode(""));
    
    //marcaGestorPermanente
    Element marcaGestorPermanenteE = doc.createElement("marcaGestorPermanente");
    contratoE.appendChild(marcaGestorPermanenteE);
    marcaGestorPermanenteE.appendChild(doc.createTextNode(""));
    
    //marcaGestorAsignado
    Element marcaGestorAsignadoE = doc.createElement("marcaGestorAsignado");
    contratoE.appendChild(marcaGestorAsignadoE);
    marcaGestorAsignadoE.appendChild(doc.createTextNode(""));
    
    //fechaVigenciaPlan
    Element fechaVigenciaPlanE = doc.createElement("fechaVigenciaPlan");
    contratoE.appendChild(fechaVigenciaPlanE);
    fechaVigenciaPlanE.appendChild(doc.createTextNode(""));
    
    return contratoE;

}


public static Element getIntegranteValidacionIdentidad(Element integranteValidacionIdentidadE, Element documentosE, Element documentoValidacionIdentidadE, Document doc){
	
			//nroOrden
			Element nroOrdenIntegranteE = doc.createElement("nroOrden");
			integranteValidacionIdentidadE.appendChild(nroOrdenIntegranteE);
			nroOrdenIntegranteE.appendChild(doc.createTextNode(""));
			
			//apellido		
			Element apellidoIntegranteE = doc.createElement("apellido");
			integranteValidacionIdentidadE.appendChild(apellidoIntegranteE);
			apellidoIntegranteE.appendChild(doc.createTextNode(""));

			//nombre		
			Element nombreIntegranteE = doc.createElement("nombre");
			integranteValidacionIdentidadE.appendChild(nombreIntegranteE);
			nombreIntegranteE.appendChild(doc.createTextNode(""));
					
			//relacionFamiliarId
			Element relacionFamiliarIdE = doc.createElement("relacionFamiliarId");
			integranteValidacionIdentidadE.appendChild(relacionFamiliarIdE);
			relacionFamiliarIdE.appendChild(doc.createTextNode(""));
					
			//relacionFamiliar
			Element relacionFamiliarE = doc.createElement("relacionFamiliar");
			integranteValidacionIdentidadE.appendChild(relacionFamiliarE);
			relacionFamiliarE.appendChild(doc.createTextNode(""));
			
			//fechaAlta
			Element fechaAltaIdentidadE = doc.createElement("fechaAlta");
			integranteValidacionIdentidadE.appendChild(fechaAltaIdentidadE);
	        fechaAltaIdentidadE.appendChild(doc.createTextNode(""));
					
			//fechaBja
			Element fechaBjaIdentidadE = doc.createElement("fechaBaja");
			integranteValidacionIdentidadE.appendChild(fechaBjaIdentidadE);
			fechaBjaIdentidadE.appendChild(doc.createTextNode(""));
					
			//tipoDocumento
			Element tipoDocumentoE = doc.createElement("tipoDocumento");
			integranteValidacionIdentidadE.appendChild(tipoDocumentoE);
			tipoDocumentoE.appendChild(doc.createTextNode(""));

			//nroDocumento
			Element nroDocumentoE = doc.createElement("nroDocumento");
			integranteValidacionIdentidadE.appendChild(nroDocumentoE);
			nroDocumentoE.appendChild(doc.createTextNode(""));
					
			//nroInterlocutor
			Element nroInterlocutorIdentidadE = doc.createElement("nroInterlocutor");
			integranteValidacionIdentidadE.appendChild(nroInterlocutorIdentidadE);
			nroInterlocutorIdentidadE.appendChild(doc.createTextNode(""));
					
			//fechaNacimiento
			Element fechaNacimientoIdentidadE = doc.createElement("fechaNacimiento");
			integranteValidacionIdentidadE.appendChild(fechaNacimientoIdentidadE);
			fechaNacimientoIdentidadE.appendChild(doc.createTextNode(""));
					
			//edad
			Element edadIdentidadE = doc.createElement("edad");
			integranteValidacionIdentidadE.appendChild(edadIdentidadE);
			edadIdentidadE.appendChild(doc.createTextNode(""));
					
			//fechaVencimientoCredencial
			Element fechaVencimientoCredencialE = doc.createElement("fechaVencimientoCredencial");
			integranteValidacionIdentidadE.appendChild(fechaVencimientoCredencialE);
			fechaVencimientoCredencialE.appendChild(doc.createTextNode(""));
					
			//verCredencial
			Element verCredencialE = doc.createElement("verCredencial");
			integranteValidacionIdentidadE.appendChild(verCredencialE);
			verCredencialE.appendChild(doc.createTextNode(""));				
					
			
			//documentos --- es una LISTA
		    documentosE = doc.createElement("listDocumentos");
		    integranteValidacionIdentidadE.appendChild(documentosE);
			
			//documentoValidacionIdentidad
			documentoValidacionIdentidadE = doc.createElement("documentoValidacionIdentidad");
			documentosE.appendChild(documentoValidacionIdentidadE);
			
			//tipo
			Element tipoE = doc.createElement("tipo");
			documentoValidacionIdentidadE.appendChild(tipoE);
			tipoE.appendChild(doc.createTextNode(""));
			
			//numero
			Element numeroE = doc.createElement("numero");
			documentoValidacionIdentidadE.appendChild(numeroE);
			numeroE.appendChild(doc.createTextNode(""));
			
			//marcaDescuento
			Element marcaDescuentoE = doc.createElement("marcaDescuento");
			integranteValidacionIdentidadE.appendChild(marcaDescuentoE);
			marcaDescuentoE.appendChild(doc.createTextNode(""));					
			
			//fechaHastaMarcaDescuento
			Element fechaHastaMarcaDescuentoE = doc.createElement("fechaHastaMarcaDescuento");
			integranteValidacionIdentidadE.appendChild(marcaDescuentoE);
			fechaHastaMarcaDescuentoE.appendChild(doc.createTextNode(""));				

			//seleccionado
			Element seleccionadoE = doc.createElement("seleccionado");
			integranteValidacionIdentidadE.appendChild(seleccionadoE);
			seleccionadoE.appendChild(doc.createTextNode(""));				
			
			//serviciosInhabilitados
			Element serviciosInhabilitadosE = doc.createElement("serviciosInhabilitados");
			integranteValidacionIdentidadE.appendChild(serviciosInhabilitadosE);
			serviciosInhabilitadosE.appendChild(doc.createTextNode(""));
			
			//bajaFuturo
			Element bajaFuturoE = doc.createElement("bajaFuturo");
			integranteValidacionIdentidadE.appendChild(bajaFuturoE);
			bajaFuturoE.appendChild(doc.createTextNode(""));
			
		return integranteValidacionIdentidadE; 

}

}
