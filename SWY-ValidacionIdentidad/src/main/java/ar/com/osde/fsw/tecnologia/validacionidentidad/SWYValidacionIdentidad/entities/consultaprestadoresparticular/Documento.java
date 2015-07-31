package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaprestadoresparticular;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for documento complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="documento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documento", propOrder = { "tipo", "numero" })
public class Documento {

	@XmlElement(required = true)
	protected String tipo;
	@XmlElement(required = true)
	protected BigDecimal numero;

	/**
	 * Gets the value of the tipo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Sets the value of the tipo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTipo(String value) {
		this.tipo = value;
	}

	/**
	 * Gets the value of the numero property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getNumero() {
		return numero;
	}

	/**
	 * Sets the value of the numero property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setNumero(BigDecimal value) {
		this.numero = value;
	}

}
