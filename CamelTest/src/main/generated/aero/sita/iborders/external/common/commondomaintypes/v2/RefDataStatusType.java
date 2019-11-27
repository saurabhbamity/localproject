
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefDataStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefDataStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="NotFound"/>
 *     &lt;enumeration value="FoundInvalid"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefDataStatusType")
@XmlEnum
public enum RefDataStatusType {


    /**
     * Data found and valid
     * 
     */
    @XmlEnumValue("Valid")
    VALID("Valid"),

    /**
     * Data found and expired
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * Data not found
     * 
     */
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),

    /**
     * Data found and is invalid
     * 
     */
    @XmlEnumValue("FoundInvalid")
    FOUND_INVALID("FoundInvalid"),

    /**
     * Data status is unknown
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RefDataStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefDataStatusType fromValue(String v) {
        for (RefDataStatusType c: RefDataStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
