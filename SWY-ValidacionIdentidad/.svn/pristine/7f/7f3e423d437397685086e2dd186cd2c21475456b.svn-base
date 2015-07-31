package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.util;

import java.util.ArrayList;
import java.util.List;

import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.ccg.services.wsservices.DocumentoDTO;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.ccg.services.wsservices.NoSocioOsdeBinarioDTO;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2.DatosContrato;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2.DatosInterlocutor;
//import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2.Envelope.Body.DatosSocio.DatosContrato.RespPago;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2.RespPago;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ContratoValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.DocumentoValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.InterlocutorValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ObraSocial;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ResponsablePagoValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.Sujeto;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.SujetoValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.TipoDeSujeto;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.response.OrchestratedObject;

public class MapperSujetoUtil {

	
public static SujetoValidacionIdentidad cargarSujetoValidacionIdentidadActividad(OrchestratedObject oo){
		
		SujetoValidacionIdentidad sujeto = new SujetoValidacionIdentidad();
			
		//System.out.println("SubjectType "+oo.getSujetoActividad().getSubjectType());
		
		if (oo.getSujetoActividad().getSubjectType().equals(TipoDeSujeto.SOCIO)) {
			
			sujeto.setInterlocutor(cargarInterlocutorValidacionIdentidad(oo.getDatosSocioSA().getDatosInterlocutor(), oo.getSujetoActividad()));
			sujeto.setContrato(cargarContratoValidacionIdentidad(oo.getDatosSocioSA().getDatosContrato(), oo.getSujetoActividad()));
			//sos ujeto.setListContratos(cargarListaContratoValidacionIdentidad(oo.getDatosSocioSA().getDatosContrato()));
		//	sujeto.setDocumentos(cargarDocumentosDeSocio(oo.getDatosSocioSA().getDocumentos().getDocumento()));
		//	sujeto.setIntegrantesGrupoFamiliar(cargarIntegrantesGrupoFamiliar(oo.getDatosSocioSA().getGrFam()));
			sujeto.setObraSocial(cargarObraSocial());
		}
		
		if (oo.getSujetoActividad().getSubjectType().equals(TipoDeSujeto.EMPRESA)) {
			//sujeto = cargarSujetoTipoEmpresa(oo.getEmpresaParticularSA(), sujeto);
		}
		
		if (oo.getSujetoActividad().getSubjectType().equals(TipoDeSujeto.PRESTADOR)) {
			//sujeto = cargarSujetoTipoPrestador(oo.getDatosPrestadorSA(), sujeto);
		}
		
		if (oo.getSujetoActividad().getSubjectType().equals(TipoDeSujeto.NOSOCIO)) {
			// TODO Tomamos el primero ??
			if(oo.getNoSocioOsdeBinarioSA().size() > 0){
				sujeto = cargarSujetoTipoNoSocio(oo.getNoSocioOsdeBinarioSA().get(0), sujeto);
			}
		}
		
		return sujeto;
	}

/**
 * Carga un SujetoValidacionIdentidad para el SC a partir de datos recibidos de OrchestratedObject
 * @param orchestedObject
 * @return
 */
public static SujetoValidacionIdentidad cargarSujetoValidacionIdentidadContacto(OrchestratedObject oo){

	SujetoValidacionIdentidad sujeto = new SujetoValidacionIdentidad();
	
	if (oo.getSujetoContacto().getSubjectType().equals(TipoDeSujeto.SOCIO)) {
		sujeto.setInterlocutor(cargarInterlocutorValidacionIdentidad(oo.getDatosSocioSC().getDatosInterlocutor(), oo.getSujetoContacto()));
		sujeto.setContrato(cargarContratoValidacionIdentidad(oo.getDatosSocioSC().getDatosContrato(), oo.getSujetoContacto()));
		sujeto.setListContratos(cargarListaContratoValidacionIdentidad(oo.getDatosSocioSC().getDatosContrato()));
		//sujeto.setDocumentos(cargarDocumentosDeSocio(oo.getDatosSocioSC().getDocumentos().getDocumento()));
		//sujeto.setIntegrantesGrupoFamiliar(cargarIntegrantesGrupoFamiliar(oo.getDatosSocioSC().getGrFam()));
		sujeto.setObraSocial(cargarObraSocial());
	}
	
	if (oo.getSujetoContacto().getSubjectType().equals(TipoDeSujeto.EMPRESA)) {
		//sujeto = cargarSujetoTipoEmpresa(oo.getEmpresaParticularSC(), sujeto);
	}
	
	if (oo.getSujetoContacto().getSubjectType().equals(TipoDeSujeto.PRESTADOR)) {
		//sujeto = cargarSujetoTipoPrestador(oo.getDatosPrestadorSC(), sujeto);
	}
	
	if ((oo.getSujetoContacto().getSubjectType().equals(TipoDeSujeto.NOSOCIO)&&(oo.getNoSocioOsdeBinarioSC().size() > 0))) {
		// TODO Tomamos el primero ??
		sujeto = cargarSujetoTipoNoSocio(oo.getNoSocioOsdeBinarioSC().get(0), sujeto);				
	}
	return sujeto;
}
	private static InterlocutorValidacionIdentidad cargarInterlocutorValidacionIdentidad(DatosInterlocutor di, Sujeto sujeto){
		
		InterlocutorValidacionIdentidad interlocutorValidacionIdentidad = new InterlocutorValidacionIdentidad();
		
		interlocutorValidacionIdentidad.setAmbitoVisibilidad(di.getAmbitoVisibilidad());
		interlocutorValidacionIdentidad.setApellido(di.getApellido());
		interlocutorValidacionIdentidad.setDiscPermanente(di.getPermanente());
		interlocutorValidacionIdentidad.setEdad(String.valueOf(di.getEdad()));
		interlocutorValidacionIdentidad.setFechaNacimiento(di.getFchNac().toString());
		interlocutorValidacionIdentidad.setMarcaDiscapacidadFacturacion(di.getMarcaDiscapacidadFacturacion());
		interlocutorValidacionIdentidad.setMarcaDiscapacitado(di.getMarcaDiscapacitado());
		interlocutorValidacionIdentidad.setMultiproducto(di.getMultiproducto());
		interlocutorValidacionIdentidad.setNombre(di.getNombre());
		interlocutorValidacionIdentidad.setNroInterlocutor(String.valueOf(di.getNroInterlocutor()));
		interlocutorValidacionIdentidad.setSexo(di.getSexo());
		interlocutorValidacionIdentidad.setNroContrato(sujeto.getNroContrato());
		interlocutorValidacionIdentidad.setNroOrden(sujeto.getNroOrden());
		// TODO Vimos con Migue que consulta a ConsultaSocioPorDiscapacidad
		interlocutorValidacionIdentidad.setDiscapacidad(null);
		interlocutorValidacionIdentidad.setDocumento(null);
		interlocutorValidacionIdentidad.setDomicilio(null);
	
		return interlocutorValidacionIdentidad;
	}
	
	private static ContratoValidacionIdentidad cargarContratoValidacionIdentidad(DatosContrato dc, Sujeto sujeto){
		
		ContratoValidacionIdentidad contratoValidacionIdentidad = new ContratoValidacionIdentidad();
		contratoValidacionIdentidad.setAynPromotor(dc.getAyNPromotor());
		contratoValidacionIdentidad.setDeuda(String.valueOf(dc.getDeuda()));
		contratoValidacionIdentidad.setFechaAlta(dc.getFchAlta().toString());
		contratoValidacionIdentidad.setFechaBaja(dc.getFchBaja());
		contratoValidacionIdentidad.setFechaFlagRyA(dc.getFlagManRyA());
		contratoValidacionIdentidad.setFechaManPos(dc.getFlagManPos());
		contratoValidacionIdentidad.setFechaVigenciaPlan(dc.getFchVtoCred().toString());
		contratoValidacionIdentidad.setFilialGestion(dc.getFilialGestion());
		contratoValidacionIdentidad.setFilialServicio(dc.getFilialServicio());
		contratoValidacionIdentidad.setFlagAutPos(dc.getFlagAutPos());
		contratoValidacionIdentidad.setFlagAutRyA(dc.getFlagAutRyA());
		contratoValidacionIdentidad.setFlagManPos(dc.getFlagManPos());
		contratoValidacionIdentidad.setFlagManRyA(dc.getFlagManRyA());
		contratoValidacionIdentidad.setFlagPrestador(dc.getFlagPrestador());
		contratoValidacionIdentidad.setGestor(dc.getGestor());
		contratoValidacionIdentidad.setIcPromotor(String.valueOf(dc.getICPromotor()));
		contratoValidacionIdentidad.setMail(dc.getMail());
		contratoValidacionIdentidad.setMarcaGestorAsignado(dc.getMarcaGestorAsignado());
		contratoValidacionIdentidad.setMarcaGestorPermanente(dc.getMarcaGestionPermanente());
		contratoValidacionIdentidad.setMesesRec(dc.getMesesRec());
		contratoValidacionIdentidad.setMotivoBaja(dc.getMotBaja());
		contratoValidacionIdentidad.setNroContrato(sujeto.getNroContrato());
		contratoValidacionIdentidad.setNroOrden(sujeto.getNroOrden());
		contratoValidacionIdentidad.setPlan(dc.getPlan());
		contratoValidacionIdentidad.setResponsablePago(cargarResponsablePagoValidacionIdentidad(dc.getRespPago()));
		// TODO
		contratoValidacionIdentidad.setFilialGestionId("");
		contratoValidacionIdentidad.setFilialServicioId("");
		contratoValidacionIdentidad.setPlanSAP("");

		return contratoValidacionIdentidad;
	}
	
	private static ResponsablePagoValidacionIdentidad cargarResponsablePagoValidacionIdentidad(RespPago rp){
		
		ResponsablePagoValidacionIdentidad responsablePagoValidacionIdentidad = new ResponsablePagoValidacionIdentidad();
		responsablePagoValidacionIdentidad.setCodigoObraSocial(rp.getObraSocial());
		responsablePagoValidacionIdentidad.setDescripcionObraSocial(rp.getObraSocial());
		responsablePagoValidacionIdentidad.setModoContratacion(rp.getModContratacion());
		responsablePagoValidacionIdentidad.setNroContrato(rp.getNroContrato());
		responsablePagoValidacionIdentidad.setNroInterlocutor(rp.getNroInterlocutor());
		responsablePagoValidacionIdentidad.setRazonSocial(rp.getRazonSocial());
		
		return responsablePagoValidacionIdentidad;
	}
	//DatosSocio.DatosContrato
	private static List<ContratoValidacionIdentidad> cargarListaContratoValidacionIdentidad(DatosContrato dt){
		
		List<ContratoValidacionIdentidad> listaContratos = new ArrayList<ContratoValidacionIdentidad>();		
		// for llamando y cargando de cargarContratoValidacionIdentidad ??
		return listaContratos;
	}
	private static ObraSocial cargarObraSocial(){
		ObraSocial obraSocial = new ObraSocial();
		// TODO
		return obraSocial;
	}
	/**
	 * Carga un SujetoValidacionIdentidad a partir de datos recibidos de NoSocioOsdeBinarioDTO
	 * @param ns
	 * @param sujeto
	 * @return
	 */
	private static SujetoValidacionIdentidad cargarSujetoTipoNoSocio(NoSocioOsdeBinarioDTO ns, SujetoValidacionIdentidad sujeto) {
	
		if(ns != null){
			//sujeto.setFechaAltaNoSocio(ns.getFechaAlta().toGregorianCalendar().getTime());
			sujeto.setIdNoSocio(ns.getIdNoSocio());
			sujeto.setIc(ns.getIc());
			sujeto.setEmail1(ns.getEmail1());
			sujeto.setTelefonoParticular(ns.getTelefonoParticular());
			sujeto.setTelefonoLaboral(ns.getTelefonoLaboral());
			sujeto.setDocumentos(cargarDocumentosNoSocio(ns.getListDocumentos()));
			
			// TODO
			sujeto.setBajaLogica(false);
			sujeto.setFechaBajaLogica(null);			
			sujeto.setEmail2("");
			sujeto.setSistemaOrigen("");
			sujeto.setTelefonoAlternativo("");
			
		}
		return sujeto;
	}
	/**
	 * Devuelve una lista de DocumentoValidacionIdentidad a partir de otra de DocumentoDTO
	 * @param documentosDTO
	 * @return
	 */
	private static List<DocumentoValidacionIdentidad> cargarDocumentosNoSocio(List<DocumentoDTO> documentosDTO){
		
		List<DocumentoValidacionIdentidad> listaDocs = new ArrayList<DocumentoValidacionIdentidad>();
		if(documentosDTO != null){
			for (DocumentoDTO documentoDTO : documentosDTO) {
				DocumentoValidacionIdentidad documentoVI = new DocumentoValidacionIdentidad();
				documentoVI.setNumero(documentoDTO.getNumero());
				documentoVI.setTipo(documentoDTO.getTipo());
				listaDocs.add(documentoVI);			
			}
		}
		return listaDocs;
	}

}
