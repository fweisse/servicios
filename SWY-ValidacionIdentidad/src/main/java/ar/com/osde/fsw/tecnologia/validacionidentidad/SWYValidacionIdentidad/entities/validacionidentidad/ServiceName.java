
package ar.com.osde.fsw.tecnologia.validacionidentidad.SWYValidacionIdentidad.entities.validacionidentidad;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CORRESPONDENCIA"/>
 *     &lt;enumeration value="REFINANCIACION"/>
 *     &lt;enumeration value="BAJA_SOCIO"/>
 *     &lt;enumeration value="CAMBIO_PLAN"/>
 *     &lt;enumeration value="ALTA_DEBITO_AUTOMATICO"/>
 *     &lt;enumeration value="BAJA_DEBITO_AUTOMATICO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceName", namespace = "http://validacionidentidad.entities.osde.ar")
@XmlEnum
public enum ServiceName {

    CORRESPONDENCIA,
    REFINANCIACION,
    BAJA_SOCIO,
    CAMBIO_PLAN,
    ALTA_DEBITO_AUTOMATICO,
    BAJA_DEBITO_AUTOMATICO;

    public String value() {
        return name();
    }

    public static ServiceName fromValue(String v) {
        return valueOf(v);
    }

}
