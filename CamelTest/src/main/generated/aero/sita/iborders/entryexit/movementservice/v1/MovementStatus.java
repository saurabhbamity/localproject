
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movementStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="movementStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Allowed"/>
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="Refer"/>
 *     &lt;enumeration value="Cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "movementStatus")
@XmlEnum
public enum MovementStatus {

    @XmlEnumValue("Allowed")
    ALLOWED("Allowed"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("Refer")
    REFER("Refer"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    MovementStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MovementStatus fromValue(String v) {
        for (MovementStatus c: MovementStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
