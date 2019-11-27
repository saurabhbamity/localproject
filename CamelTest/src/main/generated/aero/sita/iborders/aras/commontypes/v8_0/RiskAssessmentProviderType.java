
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskAssessmentProviderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskAssessmentProviderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WatchList"/>
 *     &lt;enumeration value="GreenList"/>
 *     &lt;enumeration value="Profiler"/>
 *     &lt;enumeration value="ExternalProfiler"/>
 *     &lt;enumeration value="External"/>
 *     &lt;enumeration value="Interpol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RiskAssessmentProviderType")
@XmlEnum
public enum RiskAssessmentProviderType {


    /**
     * Risk assessment provided by internal watch list
     * 
     */
    @XmlEnumValue("WatchList")
    WATCH_LIST("WatchList"),

    /**
     * Risk assessment provided by green list
     * 
     */
    @XmlEnumValue("GreenList")
    GREEN_LIST("GreenList"),

    /**
     * Risk assessment provided by internal profiler
     * 
     */
    @XmlEnumValue("Profiler")
    PROFILER("Profiler"),

    /**
     * Risk assessment provided by external profiler
     * 
     */
    @XmlEnumValue("ExternalProfiler")
    EXTERNAL_PROFILER("ExternalProfiler"),

    /**
     * Risk assessment provided by an external provider
     * 
     */
    @XmlEnumValue("External")
    EXTERNAL("External"),

    /**
     * Risk assessment provided by interpol
     * 
     */
    @XmlEnumValue("Interpol")
    INTERPOL("Interpol");
    private final String value;

    RiskAssessmentProviderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskAssessmentProviderType fromValue(String v) {
        for (RiskAssessmentProviderType c: RiskAssessmentProviderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
