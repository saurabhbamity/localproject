
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JourneyLegStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JourneyLegStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JourneyLegStatusType")
@XmlEnum
public enum JourneyLegStatusType {


    /**
     * Planned
     * 
     */
    P,

    /**
     * Cancelled
     * 
     */
    E,

    /**
     * Departed
     * 
     */
    D,

    /**
     * Arrived
     * 
     */
    L,

    /**
     * Unknown
     * 
     */
    U,

    /**
     * Terminated
     * 
     */
    T,

    /**
     * Cleared
     * 
     */
    C,

    /**
     * Check-In-open
     * 
     */
    O,

    /**
     * Check-In-closed
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static JourneyLegStatusType fromValue(String v) {
        return valueOf(v);
    }

}
