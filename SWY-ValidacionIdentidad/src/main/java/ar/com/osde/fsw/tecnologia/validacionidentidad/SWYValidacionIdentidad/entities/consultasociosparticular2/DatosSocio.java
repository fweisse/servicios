package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.consultasociosparticular2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosSocio", propOrder = {
	    "datosInterlocutor",
	    "telefonos",
	    "datosContrato",
	    "grFam",
	    "datosFiscales"
})
	public class DatosSocio {

	    @XmlElement(required = true)
	    protected DatosInterlocutor datosInterlocutor;
	    @XmlElement(required = true)
	    protected Telefonos telefonos;
	    @XmlElement(required = true)
	    protected DatosContrato datosContrato;
	    @XmlElement(required = true)
	    protected GrFam grFam;
	    @XmlElement(required = true)
	    protected DatosFiscales datosFiscales;

	    /**
	     * Gets the value of the datosInterlocutor property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link DatosInterlocutor }
	     *     
	     */
	    public DatosInterlocutor getDatosInterlocutor() {
	        return datosInterlocutor;
	    }

	    /**
	     * Sets the value of the datosInterlocutor property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link DatosInterlocutor }
	     *     
	     */
	    public void setDatosInterlocutor(DatosInterlocutor value) {
	        this.datosInterlocutor = value;
	    }

	    /**
	     * Gets the value of the telefonos property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link Telefonos }
	     *     
	     */
	    public Telefonos getTelefonos() {
	        return telefonos;
	    }

	    /**
	     * Sets the value of the telefonos property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link Telefonos }
	     *     
	     */
	    public void setTelefonos(Telefonos value) {
	        this.telefonos = value;
	    }

	    /**
	     * Gets the value of the datosContrato property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link DatosContrato }
	     *     
	     */
	    public DatosContrato getDatosContrato() {
	        return datosContrato;
	    }

	    /**
	     * Sets the value of the datosContrato property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link DatosContrato }
	     *     
	     */
	    public void setDatosContrato(DatosContrato value) {
	        this.datosContrato = value;
	    }

	    /**
	     * Gets the value of the grFam property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link GrFam }
	     *     
	     */
	    public GrFam getGrFam() {
	        return grFam;
	    }

	    /**
	     * Sets the value of the grFam property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link GrFam }
	     *     
	     */
	    public void setGrFam(GrFam value) {
	        this.grFam = value;
	    }

	    /**
	     * Gets the value of the datosFiscales property.
	     * 
	     * @return
	     *     possible object is
	     *     {@link DatosFiscales }
	     *     
	     */
	    public DatosFiscales getDatosFiscales() {
	        return datosFiscales;
	    }

	    /**
	     * Sets the value of the datosFiscales property.
	     * 
	     * @param value
	     *     allowed object is
	     *     {@link DatosFiscales }
	     *     
	     */
	    public void setDatosFiscales(DatosFiscales value) {
	        this.datosFiscales = value;
	    }

	}