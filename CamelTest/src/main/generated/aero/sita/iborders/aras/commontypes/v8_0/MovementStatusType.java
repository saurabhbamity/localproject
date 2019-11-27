
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MovementStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MovementStatusType")
@XmlEnum
public enum MovementStatusType {


    /**
     * Cancelled
     * 
     */
    C,

    /**
     * Expected
     * 
     */
    E,

    /**
     * Denied
     * 
     */
    D,

    /**
     * Booking
     * 
     */
    B;

    public String value() {
        return name();
    }

    public static MovementStatusType fromValue(String v) {
        return valueOf(v);
    }

}
