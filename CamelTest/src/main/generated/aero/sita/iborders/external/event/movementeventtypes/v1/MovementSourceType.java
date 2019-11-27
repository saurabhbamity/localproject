
package aero.sita.iborders.external.event.movementeventtypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MovementSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="eGate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MovementSourceType")
@XmlEnum
public enum MovementSourceType {


    /**
     * Entry Exit
     * 
     */
    EE("EE"),

    /**
     * eGate
     * 
     */
    @XmlEnumValue("eGate")
    E_GATE("eGate");
    private final String value;

    MovementSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MovementSourceType fromValue(String v) {
        for (MovementSourceType c: MovementSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
