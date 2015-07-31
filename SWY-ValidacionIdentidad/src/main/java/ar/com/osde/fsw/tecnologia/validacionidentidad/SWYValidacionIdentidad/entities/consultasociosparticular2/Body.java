package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for body complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="body">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosSocio" type="{}datosSocio"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "body", propOrder = {
    "datosSocio"
})
public class Body {

    @XmlElement(required = true)
    protected DatosSocio datosSocio;

    /**
     * Gets the value of the datosSocio property.
     * 
     * @return
     *     possible object is
     *     {@link DatosSocio }
     *     
     */
    public DatosSocio getDatosSocio() {
        return datosSocio;
    }

    /**
     * Sets the value of the datosSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSocio }
     *     
     */
    public void setDatosSocio(DatosSocio value) {
        this.datosSocio = value;
    }

}

