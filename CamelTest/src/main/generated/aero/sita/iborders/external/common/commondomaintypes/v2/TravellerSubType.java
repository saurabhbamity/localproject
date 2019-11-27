
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravellerSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravellerSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravellerSubType")
@XmlEnum
public enum TravellerSubType {


    /**
     * Unknown.
     * 
     */
    U,

    /**
     * Passenger.
     * 
     */
    P,

    /**
     * Crew.
     * 
     */
    C,

    /**
     * Positioning Crew.
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static TravellerSubType fromValue(String v) {
        return valueOf(v);
    }

}
