
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicioInhabilitado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicioInhabilitado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validacionIdentidad" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="seleccionado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="destinatariosDeInhabilitaciones" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="integranteValidacionIdentidad" type="{http://osde.com.ar/services/atencion/validacionidentidad}integranteValidacionIdentidad" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "servicioInhabilitado", propOrder = {
    "serviceName",
    "serviceId",
    "validacionIdentidad",
    "seleccionado",
    "destinatariosDeInhabilitaciones"
})
public class ServicioInhabilitado {

    protected String serviceName;
    protected String serviceId;
    protected boolean validacionIdentidad;
    protected boolean seleccionado;
    protected ServicioInhabilitado.DestinatariosDeInhabilitaciones destinatariosDeInhabilitaciones;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the validacionIdentidad property.
     * 
     */
    public boolean isValidacionIdentidad() {
        return validacionIdentidad;
    }

    /**
     * Sets the value of the validacionIdentidad property.
     * 
     */
    public void setValidacionIdentidad(boolean value) {
        this.validacionIdentidad = value;
    }

    /**
     * Gets the value of the seleccionado property.
     * 
     */
    public boolean isSeleccionado() {
        return seleccionado;
    }

    /**
     * Sets the value of the seleccionado property.
     * 
     */
    public void setSeleccionado(boolean value) {
        this.seleccionado = value;
    }

    /**
     * Gets the value of the destinatariosDeInhabilitaciones property.
     * 
     * @return
     *     possible object is
     *     {@link ServicioInhabilitado.DestinatariosDeInhabilitaciones }
     *     
     */
    public ServicioInhabilitado.DestinatariosDeInhabilitaciones getDestinatariosDeInhabilitaciones() {
        return destinatariosDeInhabilitaciones;
    }

    /**
     * Sets the value of the destinatariosDeInhabilitaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioInhabilitado.DestinatariosDeInhabilitaciones }
     *     
     */
    public void setDestinatariosDeInhabilitaciones(ServicioInhabilitado.DestinatariosDeInhabilitaciones value) {
        this.destinatariosDeInhabilitaciones = value;
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
     *         &lt;element name="integranteValidacionIdentidad" type="{http://osde.com.ar/services/atencion/validacionidentidad}integranteValidacionIdentidad" maxOccurs="unbounded" minOccurs="0"/>
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
        "integranteValidacionIdentidad"
    })
    public static class DestinatariosDeInhabilitaciones {

        protected List<IntegranteValidacionIdentidad> integranteValidacionIdentidad;

        /**
         * Gets the value of the integranteValidacionIdentidad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the integranteValidacionIdentidad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntegranteValidacionIdentidad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntegranteValidacionIdentidad }
         * 
         * 
         */
        public List<IntegranteValidacionIdentidad> getIntegranteValidacionIdentidad() {
            if (integranteValidacionIdentidad == null) {
                integranteValidacionIdentidad = new ArrayList<IntegranteValidacionIdentidad>();
            }
            return this.integranteValidacionIdentidad;
        }

    }

}
