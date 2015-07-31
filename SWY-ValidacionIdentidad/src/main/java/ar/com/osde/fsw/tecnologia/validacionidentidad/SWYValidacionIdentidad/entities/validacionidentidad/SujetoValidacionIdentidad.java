
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SujetoValidacionIdentidad implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final int EDAD_MERNOR_DE_EDAD = 18;

	@XmlElement
	private InterlocutorValidacionIdentidad interlocutor;
	@XmlElement
	private ContratoValidacionIdentidad contrato;
	@XmlElement(name = "contratoValidacionIdentidad")
	@XmlElementWrapper(name = "listContratos")
	private List<ContratoValidacionIdentidad> listContratos;
	@XmlElement(name = "documentoValidacionIdentidad")
	@XmlElementWrapper(name = "documentos")
	private List<DocumentoValidacionIdentidad> documentos;
	@XmlElement(name = "integranteValidacionIdentidad")
	@XmlElementWrapper(name = "integrantesGrupoFamiliar")
	private List<IntegranteValidacionIdentidad> integrantesGrupoFamiliar;
	@XmlElement
	private ObraSocial obraSocial;
	@XmlElement
	private String nroInterlocutorEmpresa;
	@XmlElement
	private String nombreCompleto; // Para Empresa y Prestador
	@XmlElement
	private String fechaAltaEmpresa;
	@XmlElement
	private String fechaBaja; // Para Empresa y Prestador
	@XmlElement
	private String razonSocial2;
	@XmlElement
	private String unidadFacturacion;
	@XmlElement
	private String tipoEmpresa;
	@XmlElement
	private String motivoBajaCodigo;
	@XmlElement
	private String motivoBajaDsc;
	@XmlElement
	private String filialGestion;
	@XmlElement
	private String icGestor;
	@XmlElement
	private String nombreGestor;
	@XmlElement
	private String sector;
	@XmlElement
	private String sectorGestion;
	@XmlElement
	private String estadoUf;
	@XmlElement
	private String estadoUfDsc;
	@XmlElement
	private String condicionIva;
	@XmlElement
	private String condicionIvaDsc;
	@XmlElement
	private String cantidadTitulares;
	@XmlElement
	private String cantidadIc;
	@XmlElement
	private String filialGestionDsc;
	@XmlElement
	private String marcaGestorPermanente;
	@XmlElement
	private String marcaGestorAsignado;
	@XmlElement
	private String categoriaConper;
	@XmlElement
	private String categoriaConperDsc;
	@XmlElement
	private ConvenioComplementacion convenioComplementacion;
	@XmlElement
	private boolean poseeSubsidioPorDesempleo;
	@XmlElement
	private boolean anteriorModoContratacionHastaPlan;
	@XmlElement
	private boolean anteriorModoContratacionSoloApo;
	@XmlElement
	private Date fechaAltaNoSocio;
	@XmlElement
	private Long idNoSocio;
	@XmlElement
	private String ic;
	@XmlElement
	private boolean bajaLogica;
	@XmlElement
	private Date fechaBajaLogica;
	@XmlElement
	private String email1;
	@XmlElement
	private String email2;
	@XmlElement
	private String sistemaOrigen;
	@XmlElement
	private String telefonoParticular;
	@XmlElement
	private String telefonoLaboral;
	@XmlElement
	private String telefonoAlternativo;
	@XmlElement
	private String flagSocio;
	@XmlElement
	private String filial;
	@XmlElement
	private String codigo;
	@XmlElement
	private String fechaAltaPrestador;
	@XmlElement
	private String domicilio;
	@XmlElement
	private Integer edad;
	@XmlElement
	private boolean sujetoComplementacion = false;
	@XmlElement
	private boolean marcaPreexistencia = false;
	@XmlElement
	private boolean porDescenso = false;
	@XmlElement
	private boolean porDescensoMenorA30Dias = false;
	@XmlElement
	private boolean vigenciaMenorA90Dias = false;
	@XmlElement
	private boolean altaAutomatica = false;
	@XmlElement
	private boolean consumio = false;
	@XmlElement
	private String tipoSujetoValidacionIdentidad;
	@XmlElement
	private boolean poseeSumatoriaDeAporte = false;

	public boolean isTieneConcubinoEnGrupoFamiliar() {
		boolean tieneConcuvina = false;
		List<IntegranteValidacionIdentidad> integrantes = this.getIntegrantesGrupoFamiliar();

		if ((integrantes != null) && (!integrantes.isEmpty())) {
			for (IntegranteValidacionIdentidad integrante : integrantes) {
				if ((integrante.getRelacionFamiliar().equalsIgnoreCase("CONCUBINA/O"))
						&& (!integrante.isDadoDeBaja())) {
					tieneConcuvina = true;
					break;
				}
			}
		}
		return tieneConcuvina;
	}

	public boolean isTieneConyugueEnGrupoFamiliar() {
		boolean tieneConyugue = false;
		List<IntegranteValidacionIdentidad> integrantes = this.getIntegrantesGrupoFamiliar();

		if ((integrantes != null) && (!integrantes.isEmpty())) {
			for (IntegranteValidacionIdentidad integrante : integrantes) {
				if ((integrante.getRelacionFamiliar().equalsIgnoreCase("CÓNYUGE"))
						&& (!integrante.isDadoDeBaja())) {
					tieneConyugue = true;
					break;
				}
			}
		}
		return tieneConyugue;
	}

	public String obtenerNombreCompletoDelSujeto() {
		String nombreCompletoSujeto = "";
		if ((this.getInterlocutor().getNombre() != null)
				&& (this.getInterlocutor().getApellido() != null)) {
			nombreCompletoSujeto = this.getInterlocutor().getApellido() + ", "
					+ this.getInterlocutor().getNombre();
		} else if (this.getNombreCompleto() != null) {
			nombreCompletoSujeto = this.getNombreCompleto();
		}
		return nombreCompletoSujeto;
	}

	public boolean isBajaFuturoMenorA10Dias() {
		try {
			if (this.isBajaFuturo()) {
				if (null != this.getContrato().getFechaBaja()) {
					if (!this.getContrato().getFechaBaja().equals("")) {
						DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

						Date formattedFechaBaja = sdf.parse(this.getContrato().getFechaBaja());
						Calendar calendar = Calendar.getInstance();
						calendar.add(Calendar.DAY_OF_MONTH, 10);
						Date dentroDe10Dias = calendar.getTime();

						return formattedFechaBaja.before(dentroDe10Dias);
					}
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean isSocio015Metro() {
		if ((this.getContrato().getPlan() != null)
				&& (this.getContrato().getFilialServicioId() != null)) {
			return (this.getContrato().getPlan().equals("1 015") && this.getContrato()
					.getFilialServicioId().equals("60"));
		} else {
			return false;
		}
	}

	public ContratoValidacionIdentidad getContrato() {
		if (contrato == null) {
			contrato = new ContratoValidacionIdentidad();
		}
		return contrato;
	}

	public void setContrato(ContratoValidacionIdentidad unContrato) {
		this.contrato = unContrato;
	}

	public InterlocutorValidacionIdentidad getInterlocutor() {
		if (interlocutor == null) {
			interlocutor = new InterlocutorValidacionIdentidad();
		}
		return interlocutor;
	}

	public void setInterlocutor(InterlocutorValidacionIdentidad unInterlocutor) {
		this.interlocutor = unInterlocutor;
	}

	/**
	 * @return Retorna una descripcion del sujeto (Por ejemplo Nombre/Apellido o
	 *         Razon Social).
	 * @see ar.com.osde.ccg.integration.beans.Sujeto#getDescripcion()
	 */
	public String getDescripcion() {
		return getInterlocutor().getApellido() + " " + getInterlocutor().getNombre();
	}

	/**
	 * @return Retorna la lista de contratos vigentes.
	 */

	public List<ContratoValidacionIdentidad> getContratosVigente() {
		List<ContratoValidacionIdentidad> contratosVigentes = new ArrayList<ContratoValidacionIdentidad>();
		Iterator<ContratoValidacionIdentidad> it = getListContratos().iterator();
		ContratoValidacionIdentidad unContrato;
		while (it.hasNext()) {
			unContrato = (ContratoValidacionIdentidad) it.next();
			if (unContrato.isVigente()) {
				contratosVigentes.add(unContrato);
			}
		}
		return contratosVigentes;
	}

	/**
	 * Retorna true si el contrato de la persona es monotributo y posee un plan
	 * Binario
	 * 
	 * @return
	 */
	public boolean isPlanBinario() {
		return this.getContrato().getPlan().startsWith("2 ");
	}

	public void setApellido(String anApellido) {
		if (this.interlocutor != null) {
			this.interlocutor.setApellido(anApellido);
		}
	}

	/**
	 * @param aFechaNacimiento
	 * @see ar.com.osde.ccg.integration.beans.sujetos.AbstractSujeto
	 * 
	 */
	public void setFechaNacimientoDate(Date aFechaNacimiento) {
		if (this.getInterlocutor() != null && aFechaNacimiento != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			this.getInterlocutor().setFechaNacimiento(dateFormat.format(aFechaNacimiento));
		}
	}

	public void setNombre(String aNombre) {
		if (this.interlocutor != null) {
			this.interlocutor.setNombre(aNombre);
		}
	}

	public void setNroInterlocutor(String aNroInterlocutor) {
		if (this.interlocutor != null) {
			this.interlocutor.setNroInterlocutor(aNroInterlocutor);
		}
	}

	public void setSexo(String aSexo) {
		if (this.interlocutor != null) {
			this.interlocutor.setSexo(aSexo);
		}
	}

	public List<ContratoValidacionIdentidad> getListContratos() {
		return listContratos;
	}

	public final Collection<DocumentoValidacionIdentidad> getDocumentos() {
		return documentos;
	}

	public final void setDocumentos(List<DocumentoValidacionIdentidad> documentos) {
		this.documentos = documentos;
	}

	public void setListContratos(List<ContratoValidacionIdentidad> aListContratos) {
		this.listContratos = aListContratos;
	}

	public List<IntegranteValidacionIdentidad> getIntegrantesGrupoFamiliar() {
		return integrantesGrupoFamiliar;
	}

	public void setIntegrantesGrupoFamiliar(
			List<IntegranteValidacionIdentidad> integrantesGrupoFamiliar) {
		this.integrantesGrupoFamiliar = integrantesGrupoFamiliar;
	}

	public String getTipoSujeto() {
		String relacionGrupoFliar = "";
		if (this.getIntegrantesGrupoFamiliar() != null) {
			for (IntegranteValidacionIdentidad integranteValidacionIdentidadDto : this
					.getIntegrantesGrupoFamiliar()) {
				if ((integranteValidacionIdentidadDto.getNroInterlocutor().equals(this
						.getInterlocutor().getNroInterlocutor()))
						&& (integranteValidacionIdentidadDto.getNombre().equals(this
								.getInterlocutor().getNombre()))
						&& (integranteValidacionIdentidadDto.getApellido().equals(this
								.getInterlocutor().getApellido()))) {

					relacionGrupoFliar = integranteValidacionIdentidadDto.getRelacionFamiliar();
				}
			}
		}
		return relacionGrupoFliar;
	}

	/**
	 * Retorna true si el sujeto es menor a 18 a�os
	 * 
	 * @return
	 */

	public boolean isMenorDeEdad() {
		boolean esMenor = false;
		if (this.getEdad() != null) {
			esMenor = this.getEdad() < EDAD_MERNOR_DE_EDAD;
		}
		return esMenor;
	}

	public boolean isSubsidioPorDesempleado() {
		return (this.getContrato().getPlan().equals("2 025") && this.isBajaFuturo() && this
				.isPoseeSubsidioPorDesempleo());
	}

	public boolean isAltaAutomaticaMenor90DiasSinConsumo() {
		return this.isAltaAutomatica() && this.isVigenciaMenorA90Dias() && !this.isConsumio();
	}

	public String getRazonSocial2() {
		return razonSocial2;
	}

	public void setRazonSocial2(String razonSocial2) {
		this.razonSocial2 = razonSocial2;
	}

	public String getUnidadFacturacion() {
		return unidadFacturacion;
	}

	public void setUnidadFacturacion(String unidadFacturacion) {
		this.unidadFacturacion = unidadFacturacion;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public String getMotivoBajaCodigo() {
		return motivoBajaCodigo;
	}

	public void setMotivoBajaCodigo(String motivoBajaCodigo) {
		this.motivoBajaCodigo = motivoBajaCodigo;
	}

	public String getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getMotivoBajaDsc() {
		return motivoBajaDsc;
	}

	public void setMotivoBajaDsc(String motivoBajaDsc) {
		this.motivoBajaDsc = motivoBajaDsc;
	}

	public String getFilialGestion() {
		return filialGestion;
	}

	public void setFilialGestion(String filialGestion) {
		this.filialGestion = filialGestion;
	}

	public String getIcGestor() {
		return icGestor;
	}

	public void setIcGestor(String icGestor) {
		this.icGestor = icGestor;
	}

	public String getNombreGestor() {
		return nombreGestor;
	}

	public void setNombreGestor(String nombreGestor) {
		this.nombreGestor = nombreGestor;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSectorGestion() {
		return sectorGestion;
	}

	public void setSectorGestion(String sectorGestion) {
		this.sectorGestion = sectorGestion;
	}

	public String getEstadoUfDsc() {
		return estadoUfDsc;
	}

	public void setEstadoUfDsc(String estadoUfDsc) {
		this.estadoUfDsc = estadoUfDsc;
	}

	public String getEstadoUf() {
		return estadoUf;
	}

	public void setEstadoUf(String estadoUf) {
		this.estadoUf = estadoUf;
	}

	public String getCondicionIva() {
		return condicionIva;
	}

	public void setCondicionIva(String condicionIva) {
		this.condicionIva = condicionIva;
	}

	public String getCondicionIvaDsc() {
		return condicionIvaDsc;
	}

	public void setCondicionIvaDsc(String condicionIvaDsc) {
		this.condicionIvaDsc = condicionIvaDsc;
	}

	public String getCantidadTitulares() {
		return cantidadTitulares;
	}

	public void setCantidadTitulares(String cantidadTitulares) {
		this.cantidadTitulares = cantidadTitulares;
	}

	public String getCantidadIc() {
		return cantidadIc;
	}

	public void setCantidadIc(String cantidadIc) {
		this.cantidadIc = cantidadIc;
	}

	public String getFilialGestionDsc() {
		return filialGestionDsc;
	}

	public void setFilialGestionDsc(String filialGestionDsc) {
		this.filialGestionDsc = filialGestionDsc;
	}

	public String getMarcaGestorPermanente() {
		return marcaGestorPermanente;
	}

	public void setMarcaGestorPermanente(String marcaGestorPermanente) {
		this.marcaGestorPermanente = marcaGestorPermanente;
	}

	public String getMarcaGestorAsignado() {
		return marcaGestorAsignado;
	}

	public void setMarcaGestorAsignado(String marcaGestorAsignado) {
		this.marcaGestorAsignado = marcaGestorAsignado;
	}

	public String getCategoriaConper() {
		return categoriaConper;
	}

	public void setCategoriaConper(String categoriaConper) {
		this.categoriaConper = categoriaConper;
	}

	public String getCategoriaConperDsc() {
		return categoriaConperDsc;
	}

	public void setCategoriaConperDsc(String categoriaConperDsc) {
		this.categoriaConperDsc = categoriaConperDsc;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Date getFechaAltaNoSocio() {
		return fechaAltaNoSocio;
	}

	public void setFechaAltaNoSocio(Date fechaAltaNoSocio) {
		this.fechaAltaNoSocio = fechaAltaNoSocio;
	}

	public Long getIdNoSocio() {
		return idNoSocio;
	}

	public void setIdNoSocio(Long idNoSocio) {
		this.idNoSocio = idNoSocio;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public boolean isBajaLogica() {
		return bajaLogica;
	}

	public void setBajaLogica(boolean bajaLogica) {
		this.bajaLogica = bajaLogica;
	}

	public Date getFechaBajaLogica() {
		return fechaBajaLogica;
	}

	public void setFechaBajaLogica(Date fechaBajaLogica) {
		this.fechaBajaLogica = fechaBajaLogica;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getSistemaOrigen() {
		return sistemaOrigen;
	}

	public void setSistemaOrigen(String sistemaOrigen) {
		this.sistemaOrigen = sistemaOrigen;
	}

	public String getTelefonoParticular() {
		return telefonoParticular;
	}

	public void setTelefonoParticular(String telefonoParticular) {
		this.telefonoParticular = telefonoParticular;
	}

	public String getTelefonoLaboral() {
		return telefonoLaboral;
	}

	public void setTelefonoLaboral(String telefonoLaboral) {
		this.telefonoLaboral = telefonoLaboral;
	}

	public String getTelefonoAlternativo() {
		return telefonoAlternativo;
	}

	public void setTelefonoAlternativo(String telefonoAlternativo) {
		this.telefonoAlternativo = telefonoAlternativo;
	}

	public String getFechaAltaEmpresa() {
		return fechaAltaEmpresa;
	}

	public void setFechaAltaEmpresa(String fechaAltaEmpresa) {
		this.fechaAltaEmpresa = fechaAltaEmpresa;
	}

	public String getFlagSocio() {
		return flagSocio;
	}

	public void setFlagSocio(String flagSocio) {
		this.flagSocio = flagSocio;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFechaAltaPrestador() {
		return fechaAltaPrestador;
	}

	public void setFechaAltaPrestador(String fechaAltaPrestador) {
		this.fechaAltaPrestador = fechaAltaPrestador;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNroInterlocutorEmpresa() {
		return nroInterlocutorEmpresa;
	}

	public void setNroInterlocutorEmpresa(String nroInterlocutorEmpresa) {
		this.nroInterlocutorEmpresa = nroInterlocutorEmpresa;
	}

	public ObraSocial getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	public boolean isBajaFuturo() {
		try {
			if (null != this.getContrato().getFechaBaja()) {
				if (!this.getContrato().getFechaBaja().equals("")) {
					DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

					Date formattedFechaBaja = sdf.parse(this.getContrato().getFechaBaja());
					Date today = Calendar.getInstance().getTime();

					return today.before(formattedFechaBaja);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean isAltaFutura() {
		try {
			if (null != this.getContrato().getFechaAlta()) {
				if (!this.getContrato().getFechaAlta().equals("")) {
					DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

					Date formattedFechaAlta = sdf.parse(this.getContrato().getFechaAlta());
					Date today = Calendar.getInstance().getTime();

					return today.before(formattedFechaAlta);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return false;
	}

	public ConvenioComplementacion getConvenioComplementacion() {
		return convenioComplementacion;
	}

	public void setConvenioComplementacion(ConvenioComplementacion convenioComplementacion) {
		this.convenioComplementacion = convenioComplementacion;
	}

	public boolean isDadoDeBaja() {
		return (this.getContrato().getFechaBaja() != null)
				&& (!this.getContrato().getFechaBaja().equals("")) && (!this.isBajaFuturo());
	}

	public String getCodigoObraSocial() {
		return this.getContrato().getResponsablePago().getCodigoObraSocial();
	}

	public boolean isSujetoComplementacion() {
		return sujetoComplementacion;
	}

	public void setSujetoComplementacion(boolean sujetoComplementacion) {
		this.sujetoComplementacion = sujetoComplementacion;
	}

	public boolean isMarcaPreexistencia() {
		return marcaPreexistencia;
	}

	public void setMarcaPreexistencia(boolean marcaPreexistencia) {
		this.marcaPreexistencia = marcaPreexistencia;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public boolean isPorDescenso() {
		return porDescenso;
	}

	public void setPorDescenso(boolean porDescenso) {
		this.porDescenso = porDescenso;
	}

	public boolean isVigenciaMenorA90Dias() {
		return vigenciaMenorA90Dias;
	}

	public void setVigenciaMenorA90Dias(boolean vigenciaMenorA90Dias) {
		this.vigenciaMenorA90Dias = vigenciaMenorA90Dias;
	}

	public boolean isAltaAutomatica() {
		return altaAutomatica;
	}

	public void setAltaAutomatica(boolean altaAutomatica) {
		this.altaAutomatica = altaAutomatica;
	}

	public boolean isConsumio() {
		return consumio;
	}

	public void setConsumio(boolean consumio) {
		this.consumio = consumio;
	}

	public boolean isPoseeSubsidioPorDesempleo() {
		return poseeSubsidioPorDesempleo;
	}

	public void setPoseeSubsidioPorDesempleo(boolean poseeSubsidioPorDesempleo) {
		this.poseeSubsidioPorDesempleo = poseeSubsidioPorDesempleo;
	}

	public boolean isPorDescensoMenorA30Dias() {
		return porDescensoMenorA30Dias;
	}

	public void setPorDescensoMenorA30Dias(boolean porDescensoMenorA30Dias) {
		this.porDescensoMenorA30Dias = porDescensoMenorA30Dias;
	}

	public boolean isAnteriorModoContratacionHastaPlan() {
		return anteriorModoContratacionHastaPlan;
	}

	public void setAnteriorModoContratacionHastaPlan(boolean anteriorModoContratacionHastaPlan) {
		this.anteriorModoContratacionHastaPlan = anteriorModoContratacionHastaPlan;
	}

	public boolean isAnteriorModoContratacionSoloApo() {
		return anteriorModoContratacionSoloApo;
	}

	public void setAnteriorModoContratacionSoloApo(boolean anteriorModoContratacionSoloApo) {
		this.anteriorModoContratacionSoloApo = anteriorModoContratacionSoloApo;
	}

	public String getTipoSujetoValidacionIdentidad() {
		return tipoSujetoValidacionIdentidad;
	}

	public void setTipoSujetoValidacionIdentidad(String tipoSujetoValidacionIdentidad) {
		this.tipoSujetoValidacionIdentidad = tipoSujetoValidacionIdentidad;
	}

	public boolean isPoseeSumatoriaDeAporte() {
		return poseeSumatoriaDeAporte;
	}

	public void setPoseeSumatoriaDeAporte(boolean poseeSumatoriaDeAporte) {
		this.poseeSumatoriaDeAporte = poseeSumatoriaDeAporte;
	}
}