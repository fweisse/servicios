
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public enum TipoDeSujeto {
	SOCIO("SOCIO"), EMPRESA("EMPRESA"), NOSOCIO("NO SOCIO OSDE"), PRESTADOR("PRESTADOR OSDE");

	private String descripcion;

	public String getName() {
		return this.name();
	}

	private TipoDeSujeto(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
