package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.services.responsablepagoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.plan.Plan;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.socio.responsabledepago.ResponsableDePago;


/**
 * <p>Java class for responsableDePagoConPlanServicio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responsableDePagoConPlanServicio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planServicio" type="{http://plan.entities.osde.com.ar}plan" minOccurs="0"/>
 *         &lt;element name="responsableDePago" type="{http://responsableDePago.socio.entities.osde.com.ar}responsableDePago" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responsableDePagoConPlanServicio", propOrder = {
    "planServicio",
    "responsableDePago"
})
public class ResponsableDePagoConPlanServicio {

    protected Plan planServicio;
    protected ResponsableDePago responsableDePago;

    /**
     * Gets the value of the planServicio property.
     * 
     * @return
     *     possible object is
     *     {@link Plan }
     *     
     */
    public Plan getPlanServicio() {
        return planServicio;
    }

    /**
     * Sets the value of the planServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plan }
     *     
     */
    public void setPlanServicio(Plan value) {
        this.planServicio = value;
    }

    /**
     * Gets the value of the responsableDePago property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsableDePago }
     *     
     */
    public ResponsableDePago getResponsableDePago() {
        return responsableDePago;
    }

    /**
     * Sets the value of the responsableDePago property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsableDePago }
     *     
     */
    public void setResponsableDePago(ResponsableDePago value) {
        this.responsableDePago = value;
    }

}
