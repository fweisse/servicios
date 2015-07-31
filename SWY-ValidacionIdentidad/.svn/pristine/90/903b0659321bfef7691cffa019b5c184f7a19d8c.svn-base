
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class IntegranteValidacionIdentidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement
	private String nroOrden;
	@XmlElement
	private String apellido;
	@XmlElement
	private String nombre;
	@XmlElement
	private String relacionFamiliarId;
	@XmlElement
	private String relacionFamiliar;
	@XmlElement
	private String fechaAlta;
	@XmlElement
	private String fechaBaja;
	@XmlElement
	private String tipoDocumento;
	@XmlElement
	private String nroDocumento;
	@XmlElement
	private String nroInterlocutor;
	@XmlElement
	private String fechaNacimiento;
	@XmlElement
	private String edad;
	@XmlElement
	private String fechaVencimientoCredencial;
	@XmlElement
	private String verCredencial;
	@XmlElement(name = "documentoValidacionIdentidad")
	@XmlElementWrapper(name = "listDocumentos")
	private List<DocumentoValidacionIdentidad> listDocumentos;
	@XmlElement
	private String marcaDescuento;
	@XmlElement
	private String fechaHastaMarcaDescuento;
	@XmlElement
	private boolean seleccionado;
	@XmlElement(name = "servicioInhabilitado")
	@XmlElementWrapper(name = "serviciosInhabilitados")
	private List<ServicioInhabilitado> serviciosInhabilitados;
	@XmlElement
	private boolean bajaFuturo = false;

	public boolean isDadoDeBaja() {
		return ((this.getFechaBaja() != null) && (!this.getFechaBaja().equals("")) && (!this
				.isBajaFuturo()));
	}

	public boolean isBajaFuturo() {
		try {
			if (null != this.getFechaBaja()) {
				if (!this.getFechaBaja().equals("")) {
					DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

					Date formattedFechaBaja = sdf.parse(this.getFechaBaja());
					Date today = Calendar.getInstance().getTime();

					return today.before(formattedFechaBaja);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return bajaFuturo;
	}

	public void setBajaFuturo(boolean bajaFuturo) {
		this.bajaFuturo = bajaFuturo;
	}

	public String getNroInterlocutor() {
		return nroInterlocutor;
	}

	public void setNroInterlocutor(String aNroInterlocutor) {
		this.nroInterlocutor = aNroInterlocutor;
	}

	public String getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(String unNroOrden) {
		this.nroOrden = unNroOrden;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String unApellido) {
		this.apellido = unApellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}

	public String getFechaAlta() {
		return fechaAlta;
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

	public String getRelacionFamiliar() {
		return relacionFamiliar;
	}

	public void setRelacionFamiliar(String relacionfliar) {
		this.relacionFamiliar = relacionfliar;
	}

	public String getRelacionFamiliarId() {
		return relacionFamiliarId;
	}

	public void setRelacionFamiliarId(String relacionFliarId) {
		this.relacionFamiliarId = relacionFliarId;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String aFechaNacimiento) {
		this.fechaNacimiento = aFechaNacimiento;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String aEdad) {
		this.edad = aEdad;
	}

	public String getFechaVencimientoCredencial() {
		return fechaVencimientoCredencial;
	}

	public void setFechaVencimientoCredencial(String aFechaVencimientoCredencial) {
		this.fechaVencimientoCredencial = aFechaVencimientoCredencial;
	}

	public String getVerCredencial() {
		return verCredencial;
	}

	public void setVerCredencial(String aVerCredencial) {
		this.verCredencial = aVerCredencial;
	}

	public List<DocumentoValidacionIdentidad> getListDocumentos() {
		return listDocumentos;
	}

	public void setListDocumentos(List<DocumentoValidacionIdentidad> aListDocumentos) {
		this.listDocumentos = aListDocumentos;
	}

	public String getMarcaDescuento() {
		return marcaDescuento;
	}

	public void setMarcaDescuento(String aMarcaDescuento) {
		this.marcaDescuento = aMarcaDescuento;
	}

	public String getFechaHastaMarcaDescuento() {
		return fechaHastaMarcaDescuento;
	}

	public void setFechaHastaMarcaDescuento(String fechaHasta) {
		this.fechaHastaMarcaDescuento = fechaHasta;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String toString() {
		return this.getApellido() + ", " + this.getNombre() + " - " + this.getRelacionFamiliar();
	}

	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}

	public List<ServicioInhabilitado> getServiciosInhabilitados() {
		return serviciosInhabilitados;
	}

	public void setServiciosInhabilitados(List<ServicioInhabilitado> serviciosInhabilitados) {
		this.serviciosInhabilitados = serviciosInhabilitados;
	}
}
