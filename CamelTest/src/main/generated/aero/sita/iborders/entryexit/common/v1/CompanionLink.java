
package aero.sita.iborders.entryexit.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for companionLink.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="companionLink">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CompanionGccNational"/>
 *     &lt;enumeration value="CompanionGccResident"/>
 *     &lt;enumeration value="CompanionG1National"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "companionLink")
@XmlEnum
public enum CompanionLink {

    @XmlEnumValue("CompanionGccNational")
    COMPANION_GCC_NATIONAL("CompanionGccNational"),
    @XmlEnumValue("CompanionGccResident")
    COMPANION_GCC_RESIDENT("CompanionGccResident"),
    @XmlEnumValue("CompanionG1National")
    COMPANION_G_1_NATIONAL("CompanionG1National");
    private final String value;

    CompanionLink(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanionLink fromValue(String v) {
        for (CompanionLink c: CompanionLink.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
