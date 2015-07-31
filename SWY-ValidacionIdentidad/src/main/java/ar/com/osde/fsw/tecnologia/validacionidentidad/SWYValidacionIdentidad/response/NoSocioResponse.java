package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.response;

import java.util.List;

import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaprestadoresparticular.Documento;

public class NoSocioResponse {

	String apellido;
	String email1;
	String fechaAlta; //cambiar a Date
	Integer idNoSocio;
	String nombre;
	String nombreCompleto;
	String telefonoLaboral;
	String telefonoParticular;
	List<Documento> listDocumentos;
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Integer getIdNoSocio() {
		return idNoSocio;
	}
	public void setIdNoSocio(Integer idNoSocio) {
		this.idNoSocio = idNoSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getTelefonoLaboral() {
		return telefonoLaboral;
	}
	public void setTelefonoLaboral(String telefonoLaboral) {
		this.telefonoLaboral = telefonoLaboral;
	}
	public String getTelefonoParticular() {
		return telefonoParticular;
	}
	public void setTelefonoParticular(String telefonoParticular) {
		this.telefonoParticular = telefonoParticular;
	}
	public List<Documento> getListDocumentos() {
		return listDocumentos;
	}
	public void setListDocumentos(List<Documento> listDocumentos) {
		this.listDocumentos = listDocumentos;
	}
	
	
	
    
}
