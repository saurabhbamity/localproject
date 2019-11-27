
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskAssessmentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskAssessmentStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTSTARTED"/>
 *     &lt;enumeration value="INPROGRESS"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RiskAssessmentStatusType")
@XmlEnum
public enum RiskAssessmentStatusType {


    /**
     * NOTSTARTED
     * 
     */
    NOTSTARTED,

    /**
     * INPROGRESS
     * 
     */
    INPROGRESS,

    /**
     * FAILED
     * 
     */
    FAILED,

    /**
     * COMPLETED
     * 
     */
    COMPLETED;

    public String value() {
        return name();
    }

    public static RiskAssessmentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
