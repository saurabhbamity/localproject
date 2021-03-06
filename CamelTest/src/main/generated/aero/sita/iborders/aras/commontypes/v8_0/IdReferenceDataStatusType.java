
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdReferenceDataStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdReferenceDataStatusType">
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
@XmlType(name = "IdReferenceDataStatusType")
@XmlEnum
public enum IdReferenceDataStatusType {


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

    IdReferenceDataStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdReferenceDataStatusType fromValue(String v) {
        for (IdReferenceDataStatusType c: IdReferenceDataStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
