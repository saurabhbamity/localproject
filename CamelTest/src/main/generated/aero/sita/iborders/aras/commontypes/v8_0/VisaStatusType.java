
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VisaStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ValidVisit"/>
 *     &lt;enumeration value="InvalidVisit"/>
 *     &lt;enumeration value="ValidRes"/>
 *     &lt;enumeration value="InvalidRes"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisaStatusType")
@XmlEnum
public enum VisaStatusType {


    /**
     * Valid Visit
     * 
     */
    @XmlEnumValue("ValidVisit")
    VALID_VISIT("ValidVisit"),

    /**
     * Invalid Visit
     * 
     */
    @XmlEnumValue("InvalidVisit")
    INVALID_VISIT("InvalidVisit"),

    /**
     * Valid Resident
     * 
     */
    @XmlEnumValue("ValidRes")
    VALID_RES("ValidRes"),

    /**
     * Invalid Resident
     * 
     */
    @XmlEnumValue("InvalidRes")
    INVALID_RES("InvalidRes"),

    /**
     * Expired
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * Not Found
     * 
     */
    NF("NF"),

    /**
     * Unknown
     * 
     */
    NA("NA"),

    /**
     * Unknown status
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VisaStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VisaStatusType fromValue(String v) {
        for (VisaStatusType c: VisaStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
