package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.response;

import java.util.List;

import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.ccg.services.wsservices.NoSocioOsdeBinarioDTO;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica1.Empresa;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaprestadoresparticular.Documento;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular1.Contrato;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular1.Contratos;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2.DatosSocio;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.IntegranteValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.InterlocutorValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.ServiceName;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.Sujeto;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad.SujetoValidacionIdentidad;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.services.responsablepagoservice.ResponsableDePagoConPlanServicio;

public class OrchestratedObject {

	private Sujeto sujetoContacto;
	private Sujeto sujetoActividad;
	private SujetoValidacionIdentidad sujetoValidacionIdentidadContacto;
	private SujetoValidacionIdentidad sujetoValidacionIdentidadActividad;
	private InterlocutorValidacionIdentidad interlocutorValidacionIdentidad;	
	private Contrato contrato;
	private Documento documento;
	private IntegranteValidacionIdentidad integranteValidacionIdentidad;
	private ServiceName serviceName;
	private DatosSocio datosSocioSA;
	private DatosSocio datosSocioSC;
	private boolean isMultiSujeto;
	private Contratos contratosSA;
	private Contratos contratosSC;
	private List<Empresa> empresaGenericaSA;
	private List<Empresa> empresaGenericaSC;
	private List<ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Empresa> empresaGenerica2;
	private List<ResponsableDePagoConPlanServicio> responsableDePagoSA;
	private List<ResponsableDePagoConPlanServicio> responsableDePagoSC;
	private List<NoSocioOsdeBinarioDTO> noSocioOsdeBinarioSA;
	private List<NoSocioOsdeBinarioDTO> noSocioOsdeBinarioSC;
	
	
	public ServiceName getServiceName() {
		return serviceName;
	}
	public void setServiceName(ServiceName serviceName) {
		this.serviceName = serviceName;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public IntegranteValidacionIdentidad getIntegranteValidacionIdentidad() {
		return integranteValidacionIdentidad;
	}
	public void setIntegranteValidacionIdentidad(
			IntegranteValidacionIdentidad integranteValidacionIdentidad) {
		this.integranteValidacionIdentidad = integranteValidacionIdentidad;
	}
	public Sujeto getSujetoContacto() {
		return sujetoContacto;
	}
	public void setSujetoContacto(Sujeto sujetoContacto) {
		this.sujetoContacto = sujetoContacto;
	}
	public Sujeto getSujetoActividad() {
		return sujetoActividad;
	}
	public void setSujetoActividad(Sujeto sujetoActividad) {
		this.sujetoActividad = sujetoActividad;
	}
	public SujetoValidacionIdentidad getSujetoValidacionIdentidadContacto() {
		return sujetoValidacionIdentidadContacto;
	}
	public void setSujetoValidacionIdentidadContacto(
			SujetoValidacionIdentidad sujetoValidacionIdentidadContacto) {
		this.sujetoValidacionIdentidadContacto = sujetoValidacionIdentidadContacto;
	}
	public SujetoValidacionIdentidad getSujetoValidacionIdentidadActividad() {
		return sujetoValidacionIdentidadActividad;
	}
	public void setSujetoValidacionIdentidadActividad(
			SujetoValidacionIdentidad sujetoValidacionIdentidadActividad) {
		this.sujetoValidacionIdentidadActividad = sujetoValidacionIdentidadActividad;
	}
	public InterlocutorValidacionIdentidad getInterlocutorValidacionIdentidad() {
		return interlocutorValidacionIdentidad;
	}
	public void setInterlocutorValidacionIdentidad(
			InterlocutorValidacionIdentidad interlocutorValidacionIdentidad) {
		this.interlocutorValidacionIdentidad = interlocutorValidacionIdentidad;
	}
	public DatosSocio getDatosSocioSA() {
		return datosSocioSA;
	}
	public void setDatosSocioSA(DatosSocio datosSocioSA) {
		this.datosSocioSA = datosSocioSA;
	}
	public DatosSocio getDatosSocioSC() {
		return datosSocioSC;
	}
	public void setDatosSocioSC(DatosSocio datosSocioSC) {
		this.datosSocioSC = datosSocioSC;
	}
	public boolean isMultiSujeto() {
		return isMultiSujeto;
	}
	public void setMultiSujeto(boolean isMultiSujeto) {
		this.isMultiSujeto = isMultiSujeto;
	}
	public Contratos getContratosSA() {
		return contratosSA;
	}
	public void setContratosSA(Contratos contratosSA) {
		this.contratosSA = contratosSA;
	}
	public Contratos getContratosSC() {
		return contratosSC;
	}
	public void setContratosSC(Contratos contratosSC) {
		this.contratosSC = contratosSC;
	}
	public List<Empresa> getEmpresaGenericaSA() {
		return empresaGenericaSA;
	}
	public void setEmpresaGenericaSA(List<Empresa> empresaGenericaSA) {
		this.empresaGenericaSA = empresaGenericaSA;
	}
	public List<Empresa> getEmpresaGenericaSC() {
		return empresaGenericaSC;
	}
	public void setEmpresaGenericaSC(List<Empresa> empresaGenericaSC) {
		this.empresaGenericaSC = empresaGenericaSC;
	}
	public List<ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Empresa> getEmpresaGenerica2() {
		return empresaGenerica2;
	}
	public void setEmpresaGenerica2(
			List<ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2.Empresa> empresaGenerica2) {
		this.empresaGenerica2 = empresaGenerica2;
	}
	public List<ResponsableDePagoConPlanServicio> getResponsableDePagoSA() {
		return responsableDePagoSA;
	}
	public void setResponsableDePagoSA(
			List<ResponsableDePagoConPlanServicio> responsableDePagoSA) {
		this.responsableDePagoSA = responsableDePagoSA;
	}
	public List<ResponsableDePagoConPlanServicio> getResponsableDePagoSC() {
		return responsableDePagoSC;
	}
	public void setResponsableDePagoSC(
			List<ResponsableDePagoConPlanServicio> responsableDePagoSC) {
		this.responsableDePagoSC = responsableDePagoSC;
	}
	public List<NoSocioOsdeBinarioDTO> getNoSocioOsdeBinarioSA() {
		return noSocioOsdeBinarioSA;
	}
	public void setNoSocioOsdeBinarioSA(
			List<NoSocioOsdeBinarioDTO> noSocioOsdeBinarioSA) {
		this.noSocioOsdeBinarioSA = noSocioOsdeBinarioSA;
	}
	public List<NoSocioOsdeBinarioDTO> getNoSocioOsdeBinarioSC() {
		return noSocioOsdeBinarioSC;
	}
	public void setNoSocioOsdeBinarioSC(
			List<NoSocioOsdeBinarioDTO> noSocioOsdeBinarioSC) {
		this.noSocioOsdeBinarioSC = noSocioOsdeBinarioSC;
	}
	
		
}
