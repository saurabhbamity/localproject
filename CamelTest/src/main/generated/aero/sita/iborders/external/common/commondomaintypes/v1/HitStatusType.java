
package aero.sita.iborders.external.common.commondomaintypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HitStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HitStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hit"/>
 *     &lt;enumeration value="NoHit"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HitStatusType")
@XmlEnum
public enum HitStatusType {


    /**
     * Hit
     * 
     */
    @XmlEnumValue("Hit")
    HIT("Hit"),

    /**
     * No Hit
     * 
     */
    @XmlEnumValue("NoHit")
    NO_HIT("NoHit"),

    /**
     * No Response from source system
     * 
     */
    NA("NA"),

    /**
     * No Response from source system
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    HitStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HitStatusType fromValue(String v) {
        for (HitStatusType c: HitStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
