
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ValidacionDeIdentidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement
	private String servicio;
	@XmlElement
	private String relacionSujetoContactoSujetoActividad;
	@XmlElement
	private String tipoValidacion;
	@XmlElement
	private String sujetoContacto;
	@XmlElement
	private String sujetoActividad;
	@XmlElement
	private String asesor;
	@XmlElement
	private String motivo;
	@XmlElement
	private String nroInterlocutorSujetoContacto;
	@XmlElement
	private String nroInterlocutorSujetoActividad;
	@XmlElement
	private Date fecha;
	@XmlElement
	private SujetoValidacionIdentidad sujetoValidacionIdentidadContacto;
	@XmlElement
	private SujetoValidacionIdentidad sujetoValidacionIdentidadActividad;
	@XmlElement
	private String usuarioIntranet;
	@XmlElement
	private String observaciones;
	@XmlElement
	private String servicioID;
	@XmlElement
	private TipoSujeto tipoSujetoActividad;
	@XmlElement
	private TipoSujeto tipoSujetoContacto;
	@XmlElement
	private Empresa empresa;
	@XmlElement
	private String numeroGestionWEB;
	@XmlElement
	private String numeroTramiteGSC;
	@XmlElement
	private String numeroTramiteFax;
	@XmlElement
	private String numeroSobre;
	@XmlElement
	private String ucid;
	@XmlElement
	private String dnis;
	@XmlElement
	private String ani;
	@XmlElement
	private boolean sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividad = false;
	@XmlElement
	private boolean sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad = false;
	@XmlElement
	private String nombreResponsableEmpresa;
	@XmlElement
	private String apellidoResponsableEmpresa;
	@XmlElement
	private String documentoResponsableEmpresa;
	@XmlElement
	private Long idFormaDeContacto;
	@XmlElement
	private String nroContactoRecepcion;
	@XmlElement
	private String rolEnGrupoFamiliar;
	@XmlElement
	private String rolEnGrupoFamiliarSujetoActividad;
	@XmlElement
	private String nombreServicioKeyParaSpeech;
	@XmlElement
	private boolean utilizarLinkABiblos = false;
	@XmlElement
	private boolean mostrarSpeechParaServicio = false;
	@XmlElement
	private String speechAclaracionServicio;
	@XmlElement
	private String nombreServicioForSpeech;
	@XmlElement
	private boolean sujetoContactoIgualSujetoActividad = false;
	@XmlElement
	private boolean mostrarVariableComplementacion = false;
	@XmlElement
	private boolean mostrarFilialServicio = false;
	@XmlElement
	private boolean mostrarObraSocialComplementacion = false;
	@XmlElement
	private String keyVariableComplementacion;
	@XmlElement
	private String keyParaTituloRestringido = "default";
	@XmlElement
	private String keySpeechCuestionario = "default";
	@XmlElement
	private boolean esCap = false;
	@XmlElement
	private boolean speechInformativo = false;
	@XmlElement
	private String nombreTablaDecision;
	@XmlElement
	private boolean mostrarPrimero = true;
	@XmlElement
	private boolean mostrarObservacionesYBotonRestringido = true;
	@XmlElement
	private boolean saltearPantallaCAP = false;
	@XmlElement
	private String nombreCuestionario;
	@XmlElement
	private boolean servicioSinCuestionario = false;
	@XmlElement
	private boolean mostrarBotonUsoInterno = false;
	@XmlElement
	private boolean mostrarBotonGestion = true;
	@XmlElement
	private boolean intercambiarSCySA = false;
	@XmlElement
	private boolean guardarEnSesionValidacionExitosa = true;
	@XmlElement
	private boolean usaCuestionarioAlternativo = false;
	@XmlElement
	private boolean empresaGrupoDirectoPuro = false;
	@XmlElement
	private boolean mostrarBotonGestionEnBaja = false;
	@XmlElement
	private String cuestionarioUtilizado;
	@XmlElement
	private boolean mostrarAclaracionSobreCredencial = false;
	@XmlElement
	private String aclaracionCuestionario;
	@XmlElement
	private boolean accesoPermitido = false;
	@XmlElement
	private boolean mostrarBotonGestionPresencial = false;
	@XmlElement
	private boolean mostrarInputsRestringidoCAP = false;
	@XmlElement
	private boolean mostrarInputsRestringidoCAT = false;
	@XmlElement
	private boolean mostrarGestorAsignado = false;
	@XmlElement
	private boolean cambiarFormaDeContactoASaliente = false;
	@XmlElement
	private boolean fromDatanet = false;
	@XmlElement
	private String datanetTitle = "default";

	/**
	 * Metodo Robado de WordUtils, ya que en el paquete de s no puedo incluir
	 * librerias externas
	 * 
	 * @param str
	 * @param delimiters
	 * @return
	 */
	public static String capitalize(String str, char[] delimiters) {
		int delimLen = (delimiters == null ? -1 : delimiters.length);
		if (str == null || str.length() == 0 || delimLen == 0) {
			return str;
		}
		int strLen = str.length();
		StringBuffer buffer = new StringBuffer(strLen);
		boolean capitalizeNext = true;
		for (int i = 0; i < strLen; i++) {
			char ch = str.charAt(i);

			if (isDelimiter(ch, delimiters)) {
				buffer.append(ch);
				capitalizeNext = true;
			} else if (capitalizeNext) {
				buffer.append(Character.toTitleCase(ch));
				capitalizeNext = false;
			} else {
				buffer.append(ch);
			}
		}
		return buffer.toString();
	}

	/**
	 * Is the character a delimiter.
	 * 
	 * @param ch
	 *            the character to check
	 * @param delimiters
	 *            the delimiters
	 * @return true if it is a delimiter
	 */
	/**
	 * Metodo Robado de WordUtils, ya que en el paquete de s no puedo incluir
	 * librerias externas
	 * 
	 * @param ch
	 * @param delimiters
	 * @return
	 */
	private static boolean isDelimiter(char ch, char[] delimiters) {
		if (delimiters == null) {
			return Character.isWhitespace(ch);
		}
		for (int i = 0, isize = delimiters.length; i < isize; i++) {
			if (ch == delimiters[i]) {
				return true;
			}
		}
		return false;
	}

	public void setNombreYTipoSujetoContacto() {
		this.setSujetoContacto(this.getSujetoValidacionIdentidadContacto().obtenerNombreCompletoDelSujeto());
	}

	public void setNombreSujetoActividad() {
		this.setSujetoActividad(this.getSujetoValidacionIdentidadActividad().obtenerNombreCompletoDelSujeto());
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getRelacionSujetoContactoSujetoActividad() {
		return relacionSujetoContactoSujetoActividad;
	}

	public void setRelacionSujetoContactoSujetoActividad(
			String relacionSujetoContactoSujetoActividad) {
		this.relacionSujetoContactoSujetoActividad = relacionSujetoContactoSujetoActividad;
	}

	public String getSujetoContacto() {
		return sujetoContacto;
	}

	public void setSujetoContacto(String sujetoContacto) {
		this.sujetoContacto = sujetoContacto;
	}

	public String getSujetoActividad() {
		return sujetoActividad;
	}

	public void setSujetoActividad(String sujetoActividad) {
		this.sujetoActividad = sujetoActividad;
	}

	public String getAsesor() {
		return asesor;
	}

	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

	public String getTipoValidacion() {
		return tipoValidacion;
	}

	public void setTipoValidacion(String tipoValidacion) {
		this.tipoValidacion = tipoValidacion;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getNroInterlocutorSujetoContacto() {
		return nroInterlocutorSujetoContacto;
	}

	public void setNroInterlocutorSujetoContacto(String nroInterlocutorSujetoContacto) {
		this.nroInterlocutorSujetoContacto = nroInterlocutorSujetoContacto;
	}

	public String getNroInterlocutorSujetoActividad() {
		return nroInterlocutorSujetoActividad;
	}

	public void setNroInterlocutorSujetoActividad(String nroInterlocutorSujetoActividad) {
		this.nroInterlocutorSujetoActividad = nroInterlocutorSujetoActividad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFormatedFechaHora() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMMM yyyy HH:mm");
		return simpleDateFormat.format(this.getFecha());
	}

	public SujetoValidacionIdentidad getSujetoValidacionIdentidadContacto() {
		return sujetoValidacionIdentidadContacto;
	}

	public void setSujetoValidacionIdentidadContacto(SujetoValidacionIdentidad sujetoValidacionIdentidadContacto) {
		this.sujetoValidacionIdentidadContacto = sujetoValidacionIdentidadContacto;
	}

	public SujetoValidacionIdentidad getSujetoValidacionIdentidadActividad() {
		return sujetoValidacionIdentidadActividad;
	}

	public void setSujetoValidacionIdentidadActividad(SujetoValidacionIdentidad sujetoValidacionIdentidadActividad) {
		this.sujetoValidacionIdentidadActividad = sujetoValidacionIdentidadActividad;
	}

	public String getUsuarioIntranet() {
		return usuarioIntranet;
	}

	public void setUsuarioIntranet(String usuarioIntranet) {
		this.usuarioIntranet = usuarioIntranet;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getServicioID() {
		return servicioID;
	}

	public void setServicioID(String servicioID) {
		this.servicioID = servicioID;
	}

	public TipoSujeto getTipoSujetoActividad() {
		return tipoSujetoActividad;
	}

	public void setTipoSujetoActividad(TipoSujeto tipoSujetoActividad) {
		this.tipoSujetoActividad = tipoSujetoActividad;
	}

	public TipoSujeto getTipoSujetoContacto() {
		return tipoSujetoContacto;
	}

	public void setTipoSujetoContacto(TipoSujeto tipoSujetoContacto) {
		this.tipoSujetoContacto = tipoSujetoContacto;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNumeroGestionWEB() {
		return numeroGestionWEB;
	}

	public void setNumeroGestionWEB(String numeroGestionWEB) {
		this.numeroGestionWEB = numeroGestionWEB;
	}

	public String getNumeroTramiteGSC() {
		return numeroTramiteGSC;
	}

	public void setNumeroTramiteGSC(String numeroTramiteGSC) {
		this.numeroTramiteGSC = numeroTramiteGSC;
	}

	public String getUcid() {
		return ucid;
	}

	public void setUcid(String ucid) {
		this.ucid = ucid;
	}

	public String getDnis() {
		return dnis;
	}

	public void setDnis(String dnis) {
		this.dnis = dnis;
	}

	public String getAni() {
		return ani;
	}

	public void setAni(String ani) {
		this.ani = ani;
	}

	public boolean isSujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividad() {
		return sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividad;
	}

	public void setSujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividad(
			boolean sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividad) {
		this.sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividad = sujetoDeContactoDentroDeGrupoFamiliarDeSujetoDeActividad;
	}

	public String getNombreResponsableEmpresa() {
		return nombreResponsableEmpresa;
	}

	public void setNombreResponsableEmpresa(String nombreResponsableEmpresa) {
		this.nombreResponsableEmpresa = nombreResponsableEmpresa;
	}

	public String getApellidoResponsableEmpresa() {
		return apellidoResponsableEmpresa;
	}

	public void setApellidoResponsableEmpresa(String apellidoResponsableEmpresa) {
		this.apellidoResponsableEmpresa = apellidoResponsableEmpresa;
	}

	public Long getIdFormaDeContacto() {
		return idFormaDeContacto;
	}

	public void setIdFormaDeContacto(Long idFormaDeContacto) {
		this.idFormaDeContacto = idFormaDeContacto;
	}

	public String getNroContactoRecepcion() {
		return nroContactoRecepcion;
	}

	public void setNroContactoRecepcion(String nroContactoRecepcion) {
		this.nroContactoRecepcion = nroContactoRecepcion;
	}

	public String getRolEnGrupoFamiliar() {
		return rolEnGrupoFamiliar;
	}

	public void setRolEnGrupoFamiliar(String rolEnGrupoFamiliar) {
		this.rolEnGrupoFamiliar = rolEnGrupoFamiliar;
	}

	public String getNombreServicioKeyParaSpeech() {
		return nombreServicioKeyParaSpeech;
	}

	public void setNombreServicioKeyParaSpeech(String nombreServicioKeyParaSpeech) {
		this.nombreServicioKeyParaSpeech = nombreServicioKeyParaSpeech;
	}

	public boolean isUtilizarLinkABiblos() {
		return utilizarLinkABiblos;
	}

	public void setUtilizarLinkABiblos(boolean utilizarLinkABiblos) {
		this.utilizarLinkABiblos = utilizarLinkABiblos;
	}

	public String getDocumentoResponsableEmpresa() {
		return documentoResponsableEmpresa;
	}

	public void setDocumentoResponsableEmpresa(String documentoResponsableEmpresa) {
		this.documentoResponsableEmpresa = documentoResponsableEmpresa;
	}

	public String getNombreServicioForSpeech() {
		return nombreServicioForSpeech;
	}

	public void setNombreServicioForSpeech(String nombreServicioForSpeech) {
		this.nombreServicioForSpeech = nombreServicioForSpeech;
	}

	public String getNombreCompletoResponsableEmpresa() {
		if (null != this.getNombreResponsableEmpresa()
				&& !this.getNombreResponsableEmpresa().equalsIgnoreCase("")
				&& null != this.getApellidoResponsableEmpresa()
				&& !this.getApellidoResponsableEmpresa().equalsIgnoreCase("")) {

			return this.getApellidoResponsableEmpresa() + ", " + this.getNombreResponsableEmpresa();
		} else {
			return "---";
		}
	}

	public String getNombreCompletoYDNIResponsableEmpresa() {
		StringBuffer nombreYDocumento = new StringBuffer(this.getNombreCompletoResponsableEmpresa());
		if (!nombreYDocumento.toString().equals("---")) {
			nombreYDocumento.append("; DNI: ");
			nombreYDocumento.append(this.getDocumentoResponsableEmpresa());
			nombreYDocumento.append(" (IC Empresa: ");
			nombreYDocumento.append(this.getNroInterlocutorSujetoActividad());
			nombreYDocumento.append(")");
		} else {
			nombreYDocumento = new StringBuffer("");
		}

		return nombreYDocumento.toString();
	}

	public String getSujetoContactoToCamelCase() {
		return capitalize(sujetoContacto.toLowerCase(), null);
	}

	public boolean isSujetoContactoIgualSujetoActividad() {
		return sujetoContactoIgualSujetoActividad;
	}

	public void setSujetoContactoIgualSujetoActividad(boolean sujetoContactoIgualSujetoActividad) {
		this.sujetoContactoIgualSujetoActividad = sujetoContactoIgualSujetoActividad;
	}

	public boolean isMostrarSpeechParaServicio() {
		return mostrarSpeechParaServicio;
	}

	public void setMostrarSpeechParaServicio(boolean mostrarSpeechParaServicio) {
		this.mostrarSpeechParaServicio = mostrarSpeechParaServicio;
	}

	public boolean isMostrarVariableComplementacion() {
		return mostrarVariableComplementacion;
	}

	public void setMostrarVariableComplementacion(boolean mostrarVariableComplementacion) {
		this.mostrarVariableComplementacion = mostrarVariableComplementacion;
	}

	public String getKeySpeechCuestionario() {
		return keySpeechCuestionario;
	}

	public void setKeySpeechCuestionario(String keySpeechCuestionario) {
		this.keySpeechCuestionario = keySpeechCuestionario;
	}

	public boolean isSujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad() {
		return sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad;
	}

	public void setSujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad(
			boolean sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad) {
		this.sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad = sujetoDeContactoEstuvoDentroDeGrupoFamiliarDeSujetoDeActividad;
	}

	public String getKeyParaTituloRestringido() {
		return keyParaTituloRestringido;
	}

	public void setKeyParaTituloRestringido(String keyParaTituloRestringido) {
		this.keyParaTituloRestringido = keyParaTituloRestringido;
	}

	public String getKeyVariableComplementacion() {
		return keyVariableComplementacion;
	}

	public void setKeyVariableComplementacion(String keyVariableComplementacion) {
		this.keyVariableComplementacion = keyVariableComplementacion;
	}

	public boolean isMostrarFilialServicio() {
		return mostrarFilialServicio;
	}

	public void setMostrarFilialServicio(boolean mostrarFilialServicio) {
		this.mostrarFilialServicio = mostrarFilialServicio;
	}

	public String getRolEnGrupoFamiliarSujetoActividad() {
		return rolEnGrupoFamiliarSujetoActividad;
	}

	public void setRolEnGrupoFamiliarSujetoActividad(String rolEnGrupoFamiliarSujetoActividad) {
		this.rolEnGrupoFamiliarSujetoActividad = rolEnGrupoFamiliarSujetoActividad;
	}

	public boolean isMostrarObraSocialComplementacion() {
		return mostrarObraSocialComplementacion;
	}

	public void setMostrarObraSocialComplementacion(boolean mostrarObraSocialComplementacion) {
		this.mostrarObraSocialComplementacion = mostrarObraSocialComplementacion;
	}

	public boolean isEsCap() {
		return esCap;
	}

	public void setEsCap(boolean esCap) {
		this.esCap = esCap;
	}

	public boolean isSpeechInformativo() {
		return speechInformativo;
	}

	public void setSpeechInformativo(boolean speechInformativo) {
		this.speechInformativo = speechInformativo;
	}

	public String getNombreTablaDecision() {
		return nombreTablaDecision;
	}

	public void setNombreTablaDecision(String nombreTablaDecision) {
		this.nombreTablaDecision = nombreTablaDecision;
	}

	public String getSpeechAclaracionServicio() {
		return speechAclaracionServicio;
	}

	public void setSpeechAclaracionServicio(String speechAclaracionServicio) {
		this.speechAclaracionServicio = speechAclaracionServicio;
	}

	public boolean isPoseeAclaracionServicio() {
		return this.getSpeechAclaracionServicio() != null;
	}

	public boolean isMostrarPrimero() {
		return mostrarPrimero;
	}

	public void setMostrarPrimero(boolean mostrarPrimero) {
		this.mostrarPrimero = mostrarPrimero;
	}

	public boolean isMostrarObservacionesYBotonRestringido() {
		return mostrarObservacionesYBotonRestringido;
	}

	public void setMostrarObservacionesYBotonRestringido(
			boolean mostrarObservacionesYBotonRestringido) {
		this.mostrarObservacionesYBotonRestringido = mostrarObservacionesYBotonRestringido;
	}

	public boolean isSaltearPantallaCAP() {
		return saltearPantallaCAP;
	}

	public void setSaltearPantallaCAP(boolean saltearPantallaCAP) {
		this.saltearPantallaCAP = saltearPantallaCAP;
	}

	public String getNombreCuestionario() {
		return nombreCuestionario;
	}

	public void setNombreCuestionario(String nombreCuestionario) {
		this.nombreCuestionario = nombreCuestionario;
	}

	public boolean isServicioSinCuestionario() {
		return servicioSinCuestionario;
	}

	public void setServicioSinCuestionario(boolean servicioSinCuestionario) {
		this.servicioSinCuestionario = servicioSinCuestionario;
	}

	public boolean isMostrarBotonUsoInterno() {
		return mostrarBotonUsoInterno;
	}

	public void setMostrarBotonUsoInterno(boolean mostrarBotonUsoInterno) {
		this.mostrarBotonUsoInterno = mostrarBotonUsoInterno;
	}

	public boolean isMostrarBotonGestion() {
		return mostrarBotonGestion;
	}

	public void setMostrarBotonGestion(boolean mostrarBotonGestion) {
		this.mostrarBotonGestion = mostrarBotonGestion;
	}

	public boolean isIntercambiarSCySA() {
		return intercambiarSCySA;
	}

	public void setIntercambiarSCySA(boolean intercambiarSCySA) {
		this.intercambiarSCySA = intercambiarSCySA;
	}

	public boolean isGuardarEnSesionValidacionExitosa() {
		return guardarEnSesionValidacionExitosa;
	}

	public void setGuardarEnSesionValidacionExitosa(boolean guardarEnSesionValidacionExitosa) {
		this.guardarEnSesionValidacionExitosa = guardarEnSesionValidacionExitosa;
	}

	public boolean isUsaCuestionarioAlternativo() {
		return usaCuestionarioAlternativo;
	}

	public void setUsaCuestionarioAlternativo(boolean usaCuestionarioAlternativo) {
		this.usaCuestionarioAlternativo = usaCuestionarioAlternativo;
	}

	public boolean isEmpresaGrupoDirectoPuro() {
		return empresaGrupoDirectoPuro;
	}

	public void setEmpresaGrupoDirectoPuro(boolean empresaGrupoDirectoPuro) {
		this.empresaGrupoDirectoPuro = empresaGrupoDirectoPuro;
	}

	public boolean isMostrarBotonGestionEnBaja() {
		return mostrarBotonGestionEnBaja;
	}

	public void setMostrarBotonGestionEnBaja(boolean mostrarBotonGestionEnBaja) {
		this.mostrarBotonGestionEnBaja = mostrarBotonGestionEnBaja;
	}

	public String getNumeroTramiteFax() {
		return numeroTramiteFax;
	}

	public void setNumeroTramiteFax(String numeroTramiteFax) {
		this.numeroTramiteFax = numeroTramiteFax;
	}

	public String getCuestionarioUtilizado() {
		return cuestionarioUtilizado;
	}

	public void setCuestionarioUtilizado(String cuestionarioUtilizado) {
		this.cuestionarioUtilizado = cuestionarioUtilizado;
	}

	public boolean isMostrarAclaracionSobreCredencial() {
		return mostrarAclaracionSobreCredencial;
	}

	public void setMostrarAclaracionSobreCredencial(boolean mostrarAclaracionSobreCredencial) {
		this.mostrarAclaracionSobreCredencial = mostrarAclaracionSobreCredencial;
	}

	public String getAclaracionCuestionario() {
		return aclaracionCuestionario;
	}

	public void setAclaracionCuestionario(String aclaracionCuestionario) {
		this.aclaracionCuestionario = aclaracionCuestionario;
	}

	public boolean isTieneAclaracionCuestionario() {
		return this.getAclaracionCuestionario() != null;
	}

	public boolean isAccesoPermitido() {
		return accesoPermitido;
	}

	public void setAccesoPermitido(boolean accesoPermitido) {
		this.accesoPermitido = accesoPermitido;
	}

	public boolean isMostrarBotonGestionPresencial() {
		return mostrarBotonGestionPresencial;
	}

	public void setMostrarBotonGestionPresencial(boolean mostrarBotonGestionPresencial) {
		this.mostrarBotonGestionPresencial = mostrarBotonGestionPresencial;
	}

	public boolean isMostrarInputsRestringidoCAP() {
		return mostrarInputsRestringidoCAP;
	}

	public void setMostrarInputsRestringidoCAP(boolean mostrarInputsRestringidoCAP) {
		this.mostrarInputsRestringidoCAP = mostrarInputsRestringidoCAP;
	}

	public boolean isMostrarInputsRestringidoCAT() {
		return mostrarInputsRestringidoCAT;
	}

	public void setMostrarInputsRestringidoCAT(boolean mostrarInputsRestringidoCAT) {
		this.mostrarInputsRestringidoCAT = mostrarInputsRestringidoCAT;
	}

	public boolean isMostrarGestorAsignado() {
		return mostrarGestorAsignado;
	}

	public void setMostrarGestorAsignado(boolean mostrarGestorAsignado) {
		this.mostrarGestorAsignado = mostrarGestorAsignado;
	}

	public String getNumeroSobre() {
		return numeroSobre;
	}

	public void setNumeroSobre(String numeroSobre) {
		this.numeroSobre = numeroSobre;
	}

	public boolean isCambiarFormaDeContactoASaliente() {
		return cambiarFormaDeContactoASaliente;
	}

	public void setCambiarFormaDeContactoASaliente(boolean cambiarFormaDeContactoASaliente) {
		this.cambiarFormaDeContactoASaliente = cambiarFormaDeContactoASaliente;
	}

	public boolean isFromDatanet() {
		return fromDatanet;
	}

	public void setFromDatanet(boolean fromDatanet) {
		this.fromDatanet = fromDatanet;
	}

	public String getDatanetTitle() {
		return datanetTitle;
	}

	public void setDatanetTitle(String datanetTitle) {
		this.datanetTitle = datanetTitle;
	}
}
