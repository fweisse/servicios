
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.services.responsablepagoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchResponsableDePagoConPlanServicioHistoricoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchResponsableDePagoConPlanServicioHistoricoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponsableDePagoConPlanServicio" type="{http://osde.com.ar/services/responsablepagoservice}searchResult" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResponsableDePagoConPlanServicioHistoricoResponse", propOrder = {
    "responsableDePagoConPlanServicio"
})
public class SearchResponsableDePagoConPlanServicioHistoricoResponse {

    @XmlElement(name = "ResponsableDePagoConPlanServicio", namespace = "http://osde.com.ar/services/responsablepagoservice")
    protected SearchResult responsableDePagoConPlanServicio;

    /**
     * Gets the value of the responsableDePagoConPlanServicio property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getResponsableDePagoConPlanServicio() {
        return responsableDePagoConPlanServicio;
    }

    /**
     * Sets the value of the responsableDePagoConPlanServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setResponsableDePagoConPlanServicio(SearchResult value) {
        this.responsableDePagoConPlanServicio = value;
    }

}
