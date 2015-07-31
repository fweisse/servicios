
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ContratoValidacionIdentidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement
	private String nroContrato = null;
	@XmlElement
	private String nroOrden = null;
	@XmlElement
	private String tipoSocio = null;
	@XmlElement
	private String fechaAlta = null;
	@XmlElement
	private String fechaBaja = null;
	@XmlElement
	private ResponsablePagoValidacionIdentidad responsablePago = null;
	@XmlElement
	private String filialServicioId = null;
	@XmlElement
	private String filialServicio = null;
	@XmlElement
	private String filialGestionId = null;
	@XmlElement
	private String filialGestion = null;
	@XmlElement
	private String motivoBaja = null;
	@XmlElement
	private String mesesRec = null;
	@XmlElement
	private String plan = null;
	@XmlElement
	private String flagPrestador = null;
	@XmlElement
	private String mail = null;
	@XmlElement
	private String flagAutRyA = null;
	@XmlElement
	private String flagAutPos = null;
	@XmlElement
	private String flagManRyA = null;
	@XmlElement
	private String fechaFlagRyA = null;
	@XmlElement
	private String flagManPos = null;
	@XmlElement
	private String fechaManPos = null;
	@XmlElement
	private String deuda = null;
	@XmlElement
	private String gestor = null;
	@XmlElement
	private String versionCredencial = null;
	@XmlElement
	private String vencimientoCredencial = null;
	@XmlElement
	private String rotuloIVA;
	@XmlElement
	private String icPromotor = null;
	@XmlElement
	private String aynPromotor = null;
	@XmlElement
	private String sector;
	@XmlElement
	private String sectorDsc;
	@XmlElement
	private String marcaGestorPermanente;
	@XmlElement
	private String marcaGestorAsignado;
	@XmlElement
	private String fechaVigenciaPlan;
	@XmlElement
	private String socioDirectoObraSocialComplementacion = null;
	@XmlElement
	private String tipoSocioCompleto;

	public String getFechaAlta() {
		return fechaAlta;
	}

	public Date getFechaAltaDate() {
		return null;
	}

	public Date getFechaBajaDate() {
		return null;
	}

	public boolean isVigente() {
		return true;
	}

	public String getFechaAltaBC() {
		return fechaAlta;
	}

	public String getFechaBajaBC() {
		return fechaBaja;
	}

	public void setFechaAlta(String unaFechaAlta) {
		this.fechaAlta = unaFechaAlta;
	}

	public String getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(String unaFechaBaja) {
		this.fechaBaja = unaFechaBaja;
	}

	public String getNroContrato() {
		return nroContrato;
	}

	public void setNroContrato(String unNroContrato) {
		this.nroContrato = unNroContrato;
	}

	public String getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(String unNroOrden) {
		this.nroOrden = unNroOrden;
	}

	public ResponsablePagoValidacionIdentidad getResponsablePago() {
		if (responsablePago == null) {
			responsablePago = new ResponsablePagoValidacionIdentidad();
		}
		return responsablePago;
	}

	public void setResponsablePago(ResponsablePagoValidacionIdentidad unResponsablePago) {
		this.responsablePago = unResponsablePago;
	}

	public String getTipoSocio() {
		return this.tipoSocio;
	}

	public void setTipoSocio(String unTipoSocio) {
		this.tipoSocio = unTipoSocio;
	}

	public String getDeuda() {
		return deuda;
	}

	public void setDeuda(String unaDeuda) {
		this.deuda = unaDeuda;
	}

	public String getFechaFlagRyA() {
		return fechaFlagRyA;
	}

	public void setFechaFlagRyA(String unaFechaFlagRyA) {
		this.fechaFlagRyA = unaFechaFlagRyA;
	}

	public String getFilialServicio() {
		return filialServicio;
	}

	public void setFilialServicio(String unaFilialServicio) {
		this.filialServicio = unaFilialServicio;
	}

	public String getFilialServicioId() {
		return filialServicioId;
	}

	public void setFilialServicioId(String unFilialServicioId) {
		this.filialServicioId = unFilialServicioId;
	}

	public String getFilialGestion() {
		return filialGestion;
	}

	public void setFilialGestion(String afilialGestion) {
		this.filialGestion = afilialGestion;
	}

	public String getFilialGestionId() {
		return filialGestionId;
	}

	public void setFilialGestionId(String afilialGestionId) {
		this.filialGestionId = afilialGestionId;
	}

	public String getFlagAutPos() {
		return flagAutPos;
	}

	public void setFlagAutPos(String unFlagAutPos) {
		this.flagAutPos = unFlagAutPos;
	}

	public String getFlagAutRyA() {
		return flagAutRyA;
	}

	public void setFlagAutRyA(String unFlagAutRyA) {
		this.flagAutRyA = unFlagAutRyA;
	}

	public String getFlagManPos() {
		return (flagManPos == null ? "" : flagManPos);
	}

	public void setFlagManPos(String unFlagManPos) {
		this.flagManPos = unFlagManPos;
	}

	public String getFlagManRyA() {
		String valRet = "";
		if (flagManRyA != null) {
			valRet = flagManRyA;
		}
		return valRet;
	}

	public void setFlagManRyA(String unFlagManRyA) {
		this.flagManRyA = unFlagManRyA;
	}

	public String getFlagPrestador() {
		String valRet = "";
		if (flagPrestador != null) {
			valRet = flagPrestador;
		}
		return valRet;
	}

	public void setFlagPrestador(String unFlagPrestador) {
		this.flagPrestador = unFlagPrestador;
	}

	public String getGestor() {
		return gestor;
	}

	public void setGestor(String unGestor) {
		this.gestor = unGestor;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String unMail) {
		this.mail = unMail;
	}

	public String getMesesRec() {
		return mesesRec;
	}

	public void setMesesRec(String unMesesRec) {
		this.mesesRec = unMesesRec;
	}

	public String getMotivoBaja() {
		return motivoBaja;
	}

	public void setMotivoBaja(String unMotivoBaja) {
		this.motivoBaja = unMotivoBaja;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String unPlan) {
		this.plan = unPlan;
	}

	public String getPlanSAP() {
		String valRet;
		if (this.plan != null && this.plan.length() > 1) {
			valRet = this.plan.substring(0, 1) + this.plan.substring(2, this.plan.length());
		} else {
			valRet = this.plan;
		}
		return valRet;
	}

	public void setPlanSAP(String unPlan) {
		if (unPlan != null && unPlan.length() > 1) {
			this.plan = unPlan.substring(0, 1) + " " + unPlan.substring(1, unPlan.length());
		} else {
			this.plan = unPlan;
		}
	}

	public String getFechaManPos() {
		return fechaManPos;
	}

	public void setFechaManPos(String unaFechaManPos) {
		this.fechaManPos = unaFechaManPos;
	}

	public String getVersionCredencial() {
		return versionCredencial;
	}

	public void setVersionCredencial(String aVersionCredencial) {
		this.versionCredencial = aVersionCredencial;
	}

	public String getVencimientoCredencial() {
		return vencimientoCredencial;
	}

	public void setVencimientoCredencial(String aVencimientoCredencial) {
		this.vencimientoCredencial = aVencimientoCredencial;
	}

	public String getRotuloIVA() {
		return rotuloIVA;
	}

	public void setRotuloIVA(String aRotuloIVA) {
		this.rotuloIVA = aRotuloIVA;
	}

	public String getAynPromotor() {
		return aynPromotor;
	}

	public void setAynPromotor(String ynPromotor) {
		aynPromotor = ynPromotor;
	}

	public String getIcPromotor() {
		return icPromotor;
	}

	public void setIcPromotor(String anIcPromotor) {
		this.icPromotor = anIcPromotor;
	}

	public String getMarcaGestorAsignado() {
		return marcaGestorAsignado;
	}

	public void setMarcaGestorAsignado(String marcaGestorAsignado) {
		this.marcaGestorAsignado = marcaGestorAsignado;
	}

	public String getMarcaGestorPermanente() {
		return marcaGestorPermanente;
	}

	public void setMarcaGestorPermanente(String marcaGestorPermanente) {
		this.marcaGestorPermanente = marcaGestorPermanente;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSectorDsc() {
		return sectorDsc;
	}

	public void setSectorDsc(String sectorDsc) {
		this.sectorDsc = sectorDsc;
	}

	public String getFechaVigenciaPlan() {
		return fechaVigenciaPlan;
	}

	public void setFechaVigenciaPlan(String fechaVigenciaPlan) {
		this.fechaVigenciaPlan = fechaVigenciaPlan;
	}

	public String getSocioDirectoObraSocialComplementacion() {
		return socioDirectoObraSocialComplementacion;
	}

	public void setSocioDirectoObraSocialComplementacion(
			String socioDirectoObraSocialComplementacion) {
		this.socioDirectoObraSocialComplementacion = socioDirectoObraSocialComplementacion;
	}

	public String getTipoSocioCompleto() {
		return tipoSocioCompleto;
	}

	public void setTipoSocioCompleto(String tipoSocioCompleto) {
		this.tipoSocioCompleto = tipoSocioCompleto;
	}
}
