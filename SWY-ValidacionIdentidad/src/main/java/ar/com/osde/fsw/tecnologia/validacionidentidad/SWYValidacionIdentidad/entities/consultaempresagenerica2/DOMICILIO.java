package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultaempresagenerica2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DOMICILIO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DOMICILIO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CALLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NRO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PISO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DPTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOCALIDAD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODPOSTAL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CODPROVINCIA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PROVINCIA" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DOMICILIO", propOrder = {
    "calle",
    "nro",
    "piso",
    "dpto",
    "localidad",
    "codpostal",
    "codprovincia",
    "provincia"
})
public class DOMICILIO {

    @XmlElement(name = "CALLE", required = true)
    protected String calle;
    @XmlElement(name = "NRO")
    protected int nro;
    @XmlElement(name = "PISO", required = true)
    protected String piso;
    @XmlElement(name = "DPTO", required = true)
    protected String dpto;
    @XmlElement(name = "LOCALIDAD", required = true)
    protected String localidad;
    @XmlElement(name = "CODPOSTAL")
    protected int codpostal;
    @XmlElement(name = "CODPROVINCIA")
    protected int codprovincia;
    @XmlElement(name = "PROVINCIA", required = true)
    protected String provincia;

    /**
     * Gets the value of the calle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLE() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLE(String value) {
        this.calle = value;
    }

    /**
     * Gets the value of the nro property.
     * 
     */
    public int getNRO() {
        return nro;
    }

    /**
     * Sets the value of the nro property.
     * 
     */
    public void setNRO(int value) {
        this.nro = value;
    }

    /**
     * Gets the value of the piso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPISO() {
        return piso;
    }

    /**
     * Sets the value of the piso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPISO(String value) {
        this.piso = value;
    }

    /**
     * Gets the value of the dpto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPTO() {
        return dpto;
    }

    /**
     * Sets the value of the dpto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPTO(String value) {
        this.dpto = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIDAD() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIDAD(String value) {
        this.localidad = value;
    }

    /**
     * Gets the value of the codpostal property.
     * 
     */
    public int getCODPOSTAL() {
        return codpostal;
    }

    /**
     * Sets the value of the codpostal property.
     * 
     */
    public void setCODPOSTAL(int value) {
        this.codpostal = value;
    }

    /**
     * Gets the value of the codprovincia property.
     * 
     */
    public int getCODPROVINCIA() {
        return codprovincia;
    }

    /**
     * Sets the value of the codprovincia property.
     * 
     */
    public void setCODPROVINCIA(int value) {
        this.codprovincia = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

}
