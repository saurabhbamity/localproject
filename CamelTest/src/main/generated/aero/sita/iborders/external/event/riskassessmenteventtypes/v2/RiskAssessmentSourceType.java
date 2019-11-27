
package aero.sita.iborders.external.event.riskassessmenteventtypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskAssessmentSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskAssessmentSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="eGate"/>
 *     &lt;enumeration value="EntryExit"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RiskAssessmentSourceType")
@XmlEnum
public enum RiskAssessmentSourceType {


    /**
     * eGate
     * 
     */
    @XmlEnumValue("eGate")
    E_GATE("eGate"),

    /**
     * Entry Exit system
     * 
     */
    @XmlEnumValue("EntryExit")
    ENTRY_EXIT("EntryExit"),

    /**
     * Other system
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RiskAssessmentSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskAssessmentSourceType fromValue(String v) {
        for (RiskAssessmentSourceType c: RiskAssessmentSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
