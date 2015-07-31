
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convenioComplementacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convenioComplementacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoSocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variablesDeNegocio" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="variableDeNegocio" type="{http://osde.com.ar/services/atencion/validacionidentidad}variableNegocio" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convenioComplementacion", propOrder = {
    "codigo",
    "descripcion",
    "nombre",
    "tipoSocio",
    "unidadFacturacion",
    "variablesDeNegocio"
})
public class ConvenioComplementacion {

    protected String codigo;
    protected String descripcion;
    protected String nombre;
    protected String tipoSocio;
    protected String unidadFacturacion;
    protected ConvenioComplementacion.VariablesDeNegocio variablesDeNegocio;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

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
     * Gets the value of the tipoSocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSocio() {
        return tipoSocio;
    }

    /**
     * Sets the value of the tipoSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSocio(String value) {
        this.tipoSocio = value;
    }

    /**
     * Gets the value of the unidadFacturacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadFacturacion() {
        return unidadFacturacion;
    }

    /**
     * Sets the value of the unidadFacturacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadFacturacion(String value) {
        this.unidadFacturacion = value;
    }

    /**
     * Gets the value of the variablesDeNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link ConvenioComplementacion.VariablesDeNegocio }
     *     
     */
    public ConvenioComplementacion.VariablesDeNegocio getVariablesDeNegocio() {
        return variablesDeNegocio;
    }

    /**
     * Sets the value of the variablesDeNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvenioComplementacion.VariablesDeNegocio }
     *     
     */
    public void setVariablesDeNegocio(ConvenioComplementacion.VariablesDeNegocio value) {
        this.variablesDeNegocio = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="variableDeNegocio" type="{http://osde.com.ar/services/atencion/validacionidentidad}variableNegocio" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "variableDeNegocio"
    })
    public static class VariablesDeNegocio {

        protected List<VariableNegocio> variableDeNegocio;

        /**
         * Gets the value of the variableDeNegocio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variableDeNegocio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVariableDeNegocio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VariableNegocio }
         * 
         * 
         */
        public List<VariableNegocio> getVariableDeNegocio() {
            if (variableDeNegocio == null) {
                variableDeNegocio = new ArrayList<VariableNegocio>();
            }
            return this.variableDeNegocio;
        }

    }

}
