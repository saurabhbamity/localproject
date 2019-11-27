
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualificationStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualificationStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actioned"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="RuledIn"/>
 *     &lt;enumeration value="RuledOutHit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QualificationStatusType")
@XmlEnum
public enum QualificationStatusType {


    /**
     * Actioned
     * 
     */
    @XmlEnumValue("Actioned")
    ACTIONED("Actioned"),

    /**
     * Unknown
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Ruled In
     * 
     */
    @XmlEnumValue("RuledIn")
    RULED_IN("RuledIn"),

    /**
     * Ruled Out
     * 
     */
    @XmlEnumValue("RuledOutHit")
    RULED_OUT_HIT("RuledOutHit");
    private final String value;

    QualificationStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualificationStatusType fromValue(String v) {
        for (QualificationStatusType c: QualificationStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
