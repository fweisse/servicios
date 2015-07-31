
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.services.responsablepagoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.socio.responsabledepago.filters.ResponsableDePagoFilter;


/**
 * <p>Java class for searchResponsableDePagoConPlanServicio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchResponsableDePagoConPlanServicio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://filters.responsableDePago.socio.entities.osde.com.ar}responsableDePagoFilter" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResponsableDePagoConPlanServicio", propOrder = {
    "filter"
})
public class SearchResponsableDePagoConPlanServicio {

    @XmlElement(namespace = "http://osde.com.ar/services/responsablepagoservice")
    protected ResponsableDePagoFilter filter;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsableDePagoFilter }
     *     
     */
    public ResponsableDePagoFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsableDePagoFilter }
     *     
     */
    public void setFilter(ResponsableDePagoFilter value) {
        this.filter = value;
    }

}
