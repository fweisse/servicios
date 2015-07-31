package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosFiscales", propOrder = {
    "existePadronARBA",
    "esAgenteDePercepcion",
    "region",
    "descripcionRegion",
    "condado",
    "descripcionCondado",
    "existenExenciones"
})
public class DatosFiscales {

    @XmlElement(required = true)
    protected String existePadronARBA;
    @XmlElement(required = true)
    protected String esAgenteDePercepcion;
    @XmlElement(required = true)
    protected String region;
    @XmlElement(required = true)
    protected String descripcionRegion;
    @XmlElement(required = true)
    protected String condado;
    @XmlElement(required = true)
    protected String descripcionCondado;
    @XmlElement(required = true)
    protected String existenExenciones;

    /**
     * Gets the value of the existePadronARBA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistePadronARBA() {
        return existePadronARBA;
    }

    /**
     * Sets the value of the existePadronARBA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistePadronARBA(String value) {
        this.existePadronARBA = value;
    }

    /**
     * Gets the value of the esAgenteDePercepcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsAgenteDePercepcion() {
        return esAgenteDePercepcion;
    }

    /**
     * Sets the value of the esAgenteDePercepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsAgenteDePercepcion(String value) {
        this.esAgenteDePercepcion = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the descripcionRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRegion() {
        return descripcionRegion;
    }

    /**
     * Sets the value of the descripcionRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRegion(String value) {
        this.descripcionRegion = value;
    }

    /**
     * Gets the value of the condado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondado() {
        return condado;
    }

    /**
     * Sets the value of the condado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondado(String value) {
        this.condado = value;
    }

    /**
     * Gets the value of the descripcionCondado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCondado() {
        return descripcionCondado;
    }

    /**
     * Sets the value of the descripcionCondado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCondado(String value) {
        this.descripcionCondado = value;
    }

    /**
     * Gets the value of the existenExenciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistenExenciones() {
        return existenExenciones;
    }

    /**
     * Sets the value of the existenExenciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistenExenciones(String value) {
        this.existenExenciones = value;
    }

}
