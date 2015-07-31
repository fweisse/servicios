
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sujeto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sujeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nroInterlocutor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPrestador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subjectType" type="{http://validacionidentidad.entities.osde.ar}tipoDeSujeto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sujeto", namespace = "http://validacionidentidad.entities.osde.ar", propOrder = {
    "nroInterlocutor",
    "nroContrato",
    "nroOrden",
    "codigoPrestador",
    "numeroDocumento",
    "subjectType"
})
@XmlSeeAlso({
    SujetoContacto.class,
    SujetoActividad.class
})
public class Sujeto {

    @XmlElement(namespace = "http://validacionidentidad.entities.osde.ar")
    protected String nroInterlocutor;
    @XmlElement(namespace = "http://validacionidentidad.entities.osde.ar")
    protected String nroContrato;
    @XmlElement(namespace = "http://validacionidentidad.entities.osde.ar")
    protected String nroOrden;
    @XmlElement(namespace = "http://validacionidentidad.entities.osde.ar")
    protected String codigoPrestador;
    @XmlElement(namespace = "http://validacionidentidad.entities.osde.ar")
    protected String numeroDocumento;
    @XmlElement(namespace = "http://validacionidentidad.entities.osde.ar")
    protected TipoDeSujeto subjectType;

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
     * Gets the value of the nroOrden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroOrden() {
        return nroOrden;
    }

    /**
     * Sets the value of the nroOrden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroOrden(String value) {
        this.nroOrden = value;
    }

    /**
     * Gets the value of the codigoPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPrestador() {
        return codigoPrestador;
    }

    /**
     * Sets the value of the codigoPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPrestador(String value) {
        this.codigoPrestador = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the subjectType property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDeSujeto }
     *     
     */
    public TipoDeSujeto getSubjectType() {
        return subjectType;
    }

    /**
     * Sets the value of the subjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDeSujeto }
     *     
     */
    public void setSubjectType(TipoDeSujeto value) {
        this.subjectType = value;
    }

}
