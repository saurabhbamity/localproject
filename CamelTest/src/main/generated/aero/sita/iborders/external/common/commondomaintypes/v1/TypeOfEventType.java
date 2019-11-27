
package aero.sita.iborders.external.common.commondomaintypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ExpectedMovementEvent"/>
 *     &lt;enumeration value="MovementEvent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeOfEventType")
@XmlEnum
public enum TypeOfEventType {


    /**
     * Expected Movement Event - APP and APIS
     *                     
     * 
     */
    @XmlEnumValue("ExpectedMovementEvent")
    EXPECTED_MOVEMENT_EVENT("ExpectedMovementEvent"),

    /**
     * Movement exit
     * 
     */
    @XmlEnumValue("MovementEvent")
    MOVEMENT_EVENT("MovementEvent");
    private final String value;

    TypeOfEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfEventType fromValue(String v) {
        for (TypeOfEventType c: TypeOfEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
