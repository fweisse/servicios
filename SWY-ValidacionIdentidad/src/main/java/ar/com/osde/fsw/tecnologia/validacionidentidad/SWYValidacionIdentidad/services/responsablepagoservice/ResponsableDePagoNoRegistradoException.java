
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.services.responsablepagoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsableDePagoNoRegistradoException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsableDePagoNoRegistradoException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultActor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsableDePagoNoRegistradoException", propOrder = {
    "faultString",
    "faultActor",
    "faultCode"
})
public class ResponsableDePagoNoRegistradoException {

    @XmlElement(required = true, nillable = true)
    protected String faultString;
    @XmlElement(required = true, nillable = true)
    protected String faultActor;
    @XmlElement(required = true, nillable = true)
    protected String faultCode;

    /**
     * Gets the value of the faultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultString() {
        return faultString;
    }

    /**
     * Sets the value of the faultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultString(String value) {
        this.faultString = value;
    }

    /**
     * Gets the value of the faultActor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultActor() {
        return faultActor;
    }

    /**
     * Sets the value of the faultActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultActor(String value) {
        this.faultActor = value;
    }

    /**
     * Gets the value of the faultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

}
