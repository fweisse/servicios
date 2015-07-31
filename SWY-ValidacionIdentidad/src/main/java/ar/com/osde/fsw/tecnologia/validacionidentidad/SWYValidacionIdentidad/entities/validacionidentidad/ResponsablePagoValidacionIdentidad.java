
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responsablePagoValidacionIdentidad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responsablePagoValidacionIdentidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroInterlocutor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modoContratacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoObraSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionObraSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responsablePagoValidacionIdentidad", propOrder = {
    "razonSocial",
    "nroInterlocutor",
    "modoContratacion",
    "nroContrato",
    "codigoObraSocial",
    "descripcionObraSocial"
})
public class ResponsablePagoValidacionIdentidad {

    protected String razonSocial;
    protected String nroInterlocutor;
    protected String modoContratacion;
    protected String nroContrato;
    protected String codigoObraSocial;
    protected String descripcionObraSocial;

    /**
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the nroInterlocutor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroInterlocutor() {
        return nroInterlocutor;
    }

    /**
     * Sets the value of the nroInterlocutor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroInterlocutor(String value) {
        this.nroInterlocutor = value;
    }

    /**
     * Gets the value of the modoContratacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModoContratacion() {
        return modoContratacion;
    }

    /**
     * Sets the value of the modoContratacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModoContratacion(String value) {
        this.modoContratacion = value;
    }

    /**
     * Gets the value of the nroContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroContrato() {
        return nroContrato;
    }

    /**
     * Sets the value of the nroContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroContrato(String value) {
        this.nroContrato = value;
    }

    /**
     * Gets the value of the codigoObraSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoObraSocial() {
        return codigoObraSocial;
    }

    /**
     * Sets the value of the codigoObraSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoObraSocial(String value) {
        this.codigoObraSocial = value;
    }

    /**
     * Gets the value of the descripcionObraSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionObraSocial() {
        return descripcionObraSocial;
    }

    /**
     * Sets the value of the descripcionObraSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionObraSocial(String value) {
        this.descripcionObraSocial = value;
    }

}
