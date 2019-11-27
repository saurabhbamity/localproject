
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EborderStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EborderStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Allow"/>
 *     &lt;enumeration value="Deny"/>
 *     &lt;enumeration value="NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EborderStatusType")
@XmlEnum
public enum EborderStatusType {


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
     * Not Applicable
     * 
     */
    NA("NA");
    private final String value;

    EborderStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EborderStatusType fromValue(String v) {
        for (EborderStatusType c: EborderStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
