
package aero.sita.iborders.external.event.movementeventtypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementEventStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MovementEventStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Potential"/>
 *     &lt;enumeration value="Allowed"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Denied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MovementEventStatusType")
@XmlEnum
public enum MovementEventStatusType {


    /**
     * Potential
     * 
     */
    @XmlEnumValue("Potential")
    POTENTIAL("Potential"),

    /**
     * Allowed
     * 
     */
    @XmlEnumValue("Allowed")
    ALLOWED("Allowed"),

    /**
     * Cancelled
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * Denied
     * 
     */
    @XmlEnumValue("Denied")
    DENIED("Denied");
    private final String value;

    MovementEventStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MovementEventStatusType fromValue(String v) {
        for (MovementEventStatusType c: MovementEventStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
