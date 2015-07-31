
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for caractCertDiscapacidadValidacionIdentidad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caractCertDiscapacidadValidacionIdentidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaVigenciaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVigenciaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marcaAvalaAcompanante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marcaCertificadoPresentado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ambitoVisibilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discPermanente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreApellidoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relacionFamiliarContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caractCertDiscapacidadValidacionIdentidad", propOrder = {
    "fechaVigenciaDesde",
    "fechaVigenciaHasta",
    "marcaAvalaAcompanante",
    "marcaCertificadoPresentado",
    "ambitoVisibilidad",
    "discPermanente",
    "nombreApellidoContacto",
    "telefonoContacto",
    "relacionFamiliarContacto",
    "observacion",
    "fechaBaja"
})
public class CaractCertDiscapacidadValidacionIdentidad {

    protected String fechaVigenciaDesde;
    protected String fechaVigenciaHasta;
    protected String marcaAvalaAcompanante;
    protected String marcaCertificadoPresentado;
    protected String ambitoVisibilidad;
    protected String discPermanente;
    protected String nombreApellidoContacto;
    protected String telefonoContacto;
    protected String relacionFamiliarContacto;
    protected String observacion;
    protected String fechaBaja;

    /**
     * Gets the value of the fechaVigenciaDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVigenciaDesde() {
        return fechaVigenciaDesde;
    }

    /**
     * Sets the value of the fechaVigenciaDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVigenciaDesde(String value) {
        this.fechaVigenciaDesde = value;
    }

    /**
     * Gets the value of the fechaVigenciaHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVigenciaHasta() {
        return fechaVigenciaHasta;
    }

    /**
     * Sets the value of the fechaVigenciaHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVigenciaHasta(String value) {
        this.fechaVigenciaHasta = value;
    }

    /**
     * Gets the value of the marcaAvalaAcompanante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaAvalaAcompanante() {
        return marcaAvalaAcompanante;
    }

    /**
     * Sets the value of the marcaAvalaAcompanante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaAvalaAcompanante(String value) {
        this.marcaAvalaAcompanante = value;
    }

    /**
     * Gets the value of the marcaCertificadoPresentado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaCertificadoPresentado() {
        return marcaCertificadoPresentado;
    }

    /**
     * Sets the value of the marcaCertificadoPresentado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaCertificadoPresentado(String value) {
        this.marcaCertificadoPresentado = value;
    }

    /**
     * Gets the value of the ambitoVisibilidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbitoVisibilidad() {
        return ambitoVisibilidad;
    }

    /**
     * Sets the value of the ambitoVisibilidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbitoVisibilidad(String value) {
        this.ambitoVisibilidad = value;
    }

    /**
     * Gets the value of the discPermanente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscPermanente() {
        return discPermanente;
    }

    /**
     * Sets the value of the discPermanente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscPermanente(String value) {
        this.discPermanente = value;
    }

    /**
     * Gets the value of the nombreApellidoContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreApellidoContacto() {
        return nombreApellidoContacto;
    }

    /**
     * Sets the value of the nombreApellidoContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreApellidoContacto(String value) {
        this.nombreApellidoContacto = value;
    }

    /**
     * Gets the value of the telefonoContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    /**
     * Sets the value of the telefonoContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoContacto(String value) {
        this.telefonoContacto = value;
    }

    /**
     * Gets the value of the relacionFamiliarContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelacionFamiliarContacto() {
        return relacionFamiliarContacto;
    }

    /**
     * Sets the value of the relacionFamiliarContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelacionFamiliarContacto(String value) {
        this.relacionFamiliarContacto = value;
    }

    /**
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Gets the value of the fechaBaja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Sets the value of the fechaBaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaBaja(String value) {
        this.fechaBaja = value;
    }

}
