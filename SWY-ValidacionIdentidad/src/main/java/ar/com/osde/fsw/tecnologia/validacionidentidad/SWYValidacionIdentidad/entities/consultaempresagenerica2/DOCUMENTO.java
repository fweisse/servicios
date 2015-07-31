package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOCUMENTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TIPDOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NRODOC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENTO", propOrder = {
    "tipdoc",
    "nrodoc"
})
public class DOCUMENTO {

    @XmlElement(name = "TIPDOC", required = true)
    protected String tipdoc;
    @XmlElement(name = "NRODOC", required = true)
    protected BigDecimal nrodoc;

    /**
     * Gets the value of the tipdoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPDOC() {
        return tipdoc;
    }

    /**
     * Sets the value of the tipdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPDOC(String value) {
        this.tipdoc = value;
    }

    /**
     * Gets the value of the nrodoc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRODOC() {
        return nrodoc;
    }

    /**
     * Sets the value of the nrodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRODOC(BigDecimal value) {
        this.nrodoc = value;
    }

}