
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemHitStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemHitStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Pass"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Allow"/>
 *     &lt;enumeration value="Deny"/>
 *     &lt;enumeration value="Capture"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="You Decide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemHitStatusType")
@XmlEnum
public enum SystemHitStatusType {


    /**
     * Pass
     * 
     */
    @XmlEnumValue("Pass")
    PASS("Pass"),

    /**
     * Pending
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * Allow
     * 
     */
    @XmlEnumValue("Allow")
    ALLOW("Allow"),

    /**
     * Deny
     * 
     */
    @XmlEnumValue("Deny")
    DENY("Deny"),

    /**
     * capture
     * 
     */
    @XmlEnumValue("Capture")
    CAPTURE("Capture"),

    /**
     * not applicable
     * 
     */
    NA("NA"),

    /**
     * Unknown status
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * You Decide
     * 
     */
    @XmlEnumValue("You Decide")
    YOU_DECIDE("You Decide");
    private final String value;

    SystemHitStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemHitStatusType fromValue(String v) {
        for (SystemHitStatusType c: SystemHitStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
