
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ordinary"/>
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="Official"/>
 *     &lt;enumeration value="Diplomatic"/>
 *     &lt;enumeration value="Royal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassportType")
@XmlEnum
public enum PassportType {


    /**
     * Ordinary
     * 
     */
    @XmlEnumValue("Ordinary")
    ORDINARY("Ordinary"),

    /**
     * Special
     * 
     */
    @XmlEnumValue("Special")
    SPECIAL("Special"),

    /**
     * Official
     * 
     */
    @XmlEnumValue("Official")
    OFFICIAL("Official"),

    /**
     * Diplomatic
     * 
     */
    @XmlEnumValue("Diplomatic")
    DIPLOMATIC("Diplomatic"),

    /**
     * Royal
     * 
     */
    @XmlEnumValue("Royal")
    ROYAL("Royal");
    private final String value;

    PassportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassportType fromValue(String v) {
        for (PassportType c: PassportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
