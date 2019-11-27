
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferralStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferralStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Unqualified"/>
 *     &lt;enumeration value="Closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferralStatusType")
@XmlEnum
public enum ReferralStatusType {


    /**
     * Open
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * New
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * Unqualified
     * 
     */
    @XmlEnumValue("Unqualified")
    UNQUALIFIED("Unqualified"),

    /**
     * Closed
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed");
    private final String value;

    ReferralStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferralStatusType fromValue(String v) {
        for (ReferralStatusType c: ReferralStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
