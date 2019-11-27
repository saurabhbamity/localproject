
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassportReferenceDataStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassportReferenceDataStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="NotFound"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassportReferenceDataStatusType")
@XmlEnum
public enum PassportReferenceDataStatusType {


    /**
     * Found and valid
     * 
     */
    @XmlEnumValue("Valid")
    VALID("Valid"),

    /**
     * Not found
     * 
     */
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),

    /**
     * Found and expired
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * Found and invalid
     *                     
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * Status is unknown
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

    PassportReferenceDataStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassportReferenceDataStatusType fromValue(String v) {
        for (PassportReferenceDataStatusType c: PassportReferenceDataStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
