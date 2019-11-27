
package aero.sita.iborders.aras.person.v7_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Certain"/>
 *     &lt;enumeration value="Uncertain"/>
 *     &lt;enumeration value="New"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchType")
@XmlEnum
public enum MatchType {


    /**
     * Certain Match
     * 
     */
    @XmlEnumValue("Certain")
    CERTAIN("Certain"),

    /**
     * Uncertain match
     * 
     */
    @XmlEnumValue("Uncertain")
    UNCERTAIN("Uncertain"),

    /**
     * New Person
     * 
     */
    @XmlEnumValue("New")
    NEW("New");
    private final String value;

    MatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchType fromValue(String v) {
        for (MatchType c: MatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
