
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Crew"/>
 *     &lt;enumeration value="Passenger"/>
 *     &lt;enumeration value="PositioningCrew"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paxType")
@XmlEnum
public enum PaxType {

    @XmlEnumValue("Crew")
    CREW("Crew"),
    @XmlEnumValue("Passenger")
    PASSENGER("Passenger"),
    @XmlEnumValue("PositioningCrew")
    POSITIONING_CREW("PositioningCrew");
    private final String value;

    PaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaxType fromValue(String v) {
        for (PaxType c: PaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
