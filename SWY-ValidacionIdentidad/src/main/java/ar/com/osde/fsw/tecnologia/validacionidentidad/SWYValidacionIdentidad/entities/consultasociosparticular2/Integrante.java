package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "integrante", propOrder = {
    "nroOrden",
    "apellido",
    "nombre",
    "relFam",
    "dRelFam",
    "fchAlta",
    "fchBaja",
    "tipoDocFam",
    "nroDocFam",
    "nroInterlocutor",
    "fchNac",
    "edad",
    "verCred",
    "fchVtoCred",
    "marca",
    "fchDesdePMI",
    "fchHastaPMI"
})
public class Integrante {

    protected int nroOrden;
    @XmlElement(required = true)
    protected String apellido;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String relFam;
    @XmlElement(required = true)
    protected String dRelFam;
    @XmlElement(required = true)
    protected String fchAlta;
    @XmlElement(required = true)
    protected String fchBaja;
    @XmlElement(required = true)
    protected String tipoDocFam;
    @XmlElement(required = true)
    protected String nroDocFam;
    @XmlElement(required = true)
    protected String nroInterlocutor;
    @XmlElement(required = true)
    protected String fchNac;
    protected int edad;
    protected int verCred;
    @XmlElement(required = true)
    protected String fchVtoCred;
    @XmlElement(required = true)
    protected String marca;
    @XmlElement(required = true)
    protected String fchDesdePMI;
    @XmlElement(required = true)
    protected String fchHastaPMI;

    /**
     * Gets the value of the nroOrden property.
     * 
     */
    public int getNroOrden() {
        return nroOrden;
    }

    /**
     * Sets the value of the nroOrden property.
     * 
     */
    public void setNroOrden(int value) {
        this.nroOrden = value;
    }

    /**
     * Gets the value of the apellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Sets the value of the apellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the relFam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelFam() {
        return relFam;
    }

    /**
     * Sets the value of the relFam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelFam(String value) {
        this.relFam = value;
    }

    /**
     * Gets the value of the dRelFam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRelFam() {
        return dRelFam;
    }

    /**
     * Sets the value of the dRelFam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRelFam(String value) {
        this.dRelFam = value;
    }

    /**
     * Gets the value of the fchAlta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchAlta() {
        return fchAlta;
    }

    /**
     * Sets the value of the fchAlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchAlta(String value) {
        this.fchAlta = value;
    }

    /**
     * Gets the value of the fchBaja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchBaja() {
        return fchBaja;
    }

    /**
     * Sets the value of the fchBaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchBaja(String value) {
        this.fchBaja = value;
    }

    /**
     * Gets the value of the tipoDocFam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocFam() {
        return tipoDocFam;
    }

    /**
     * Sets the value of the tipoDocFam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocFam(String value) {
        this.tipoDocFam = value;
    }

    /**
     * Gets the value of the nroDocFam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocFam() {
        return nroDocFam;
    }

    /**
     * Sets the value of the nroDocFam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocFam(String value) {
        this.nroDocFam = value;
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
     * Gets the value of the fchNac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchNac() {
        return fchNac;
    }

    /**
     * Sets the value of the fchNac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchNac(String value) {
        this.fchNac = value;
    }

    /**
     * Gets the value of the edad property.
     * 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Sets the value of the edad property.
     * 
     */
    public void setEdad(int value) {
        this.edad = value;
    }

    /**
     * Gets the value of the verCred property.
     * 
     */
    public int getVerCred() {
        return verCred;
    }

    /**
     * Sets the value of the verCred property.
     * 
     */
    public void setVerCred(int value) {
        this.verCred = value;
    }

    /**
     * Gets the value of the fchVtoCred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchVtoCred() {
        return fchVtoCred;
    }

    /**
     * Sets the value of the fchVtoCred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchVtoCred(String value) {
        this.fchVtoCred = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Gets the value of the fchDesdePMI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchDesdePMI() {
        return fchDesdePMI;
    }

    /**
     * Sets the value of the fchDesdePMI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchDesdePMI(String value) {
        this.fchDesdePMI = value;
    }

    /**
     * Gets the value of the fchHastaPMI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchHastaPMI() {
        return fchHastaPMI;
    }

    /**
     * Sets the value of the fchHastaPMI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchHastaPMI(String value) {
        this.fchHastaPMI = value;
    }

}
