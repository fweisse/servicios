
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.common.unidadesfacturacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.plan.Plan;


/**
 * <p>Java class for modalidadContratacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modalidadContratacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mejoraPlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nroModalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planContratacion" type="{http://plan.entities.osde.com.ar}plan" minOccurs="0"/>
 *         &lt;element name="pool" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tipoMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modalidadContratacion", propOrder = {
    "descripcion",
    "mejoraPlan",
    "nroModalidad",
    "planContratacion",
    "pool",
    "tipoMod",
    "valor"
})
public class ModalidadContratacion {

    protected String descripcion;
    protected boolean mejoraPlan;
    protected String nroModalidad;
    protected Plan planContratacion;
    protected boolean pool;
    protected String tipoMod;
    protected Float valor;

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the mejoraPlan property.
     * 
     */
    public boolean isMejoraPlan() {
        return mejoraPlan;
    }

    /**
     * Sets the value of the mejoraPlan property.
     * 
     */
    public void setMejoraPlan(boolean value) {
        this.mejoraPlan = value;
    }

    /**
     * Gets the value of the nroModalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroModalidad() {
        return nroModalidad;
    }

    /**
     * Sets the value of the nroModalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroModalidad(String value) {
        this.nroModalidad = value;
    }

    /**
     * Gets the value of the planContratacion property.
     * 
     * @return
     *     possible object is
     *     {@link Plan }
     *     
     */
    public Plan getPlanContratacion() {
        return planContratacion;
    }

    /**
     * Sets the value of the planContratacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plan }
     *     
     */
    public void setPlanContratacion(Plan value) {
        this.planContratacion = value;
    }

    /**
     * Gets the value of the pool property.
     * 
     */
    public boolean isPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     */
    public void setPool(boolean value) {
        this.pool = value;
    }

    /**
     * Gets the value of the tipoMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMod() {
        return tipoMod;
    }

    /**
     * Sets the value of the tipoMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMod(String value) {
        this.tipoMod = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValor(Float value) {
        this.valor = value;
    }

}
