
package aero.sita.iborders.external.identity.identitytypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelDocumentSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelDocumentSubType">
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
@XmlType(name = "TravelDocumentSubType")
@XmlEnum
public enum TravelDocumentSubType {


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

    TravelDocumentSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelDocumentSubType fromValue(String v) {
        for (TravelDocumentSubType c: TravelDocumentSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
