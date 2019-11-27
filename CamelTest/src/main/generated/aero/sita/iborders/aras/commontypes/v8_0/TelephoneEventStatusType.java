
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneEventStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneEventStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Purchased"/>
 *     &lt;enumeration value="Activated"/>
 *     &lt;enumeration value="Deactivated"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneEventStatusType")
@XmlEnum
public enum TelephoneEventStatusType {


    /**
     * Purchased
     * 
     */
    @XmlEnumValue("Purchased")
    PURCHASED("Purchased"),

    /**
     * Activated
     * 
     */
    @XmlEnumValue("Activated")
    ACTIVATED("Activated"),

    /**
     * Deactivated
     * 
     */
    @XmlEnumValue("Deactivated")
    DEACTIVATED("Deactivated"),

    /**
     * Closed
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    TelephoneEventStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneEventStatusType fromValue(String v) {
        for (TelephoneEventStatusType c: TelephoneEventStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
