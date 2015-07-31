
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.socio.responsabledepago.filters;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responsableDePagoHistorialFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responsableDePagoHistorialFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interlocutorComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responsableDePagoHistorialFilter", propOrder = {
    "interlocutorComercial",
    "nroContrato"
})
public class ResponsableDePagoHistorialFilter {

    protected String interlocutorComercial;
    protected String nroContrato;

    /**
     * Gets the value of the interlocutorComercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterlocutorComercial() {
        return interlocutorComercial;
    }

    /**
     * Sets the value of the interlocutorComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterlocutorComercial(String value) {
        this.interlocutorComercial = value;
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

}
