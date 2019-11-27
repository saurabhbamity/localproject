
package aero.sita.iborders.external.event.expectedmovementeventtypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedMovementSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpectedMovementSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="APIS"/>
 *     &lt;enumeration value="PNR"/>
 *     &lt;enumeration value="DCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpectedMovementSourceType")
@XmlEnum
public enum ExpectedMovementSourceType {


    /**
     * Sourced from APP data.
     * 
     */
    APP,

    /**
     * Sourced from APIS data.
     * 
     */
    APIS,

    /**
     * Sourced from Booking/Passenger Name Record(PNR) data.
     * 
     */
    PNR,

    /**
     * Sourced from Departure control(DCS) data..
     * 
     */
    DCS;

    public String value() {
        return name();
    }

    public static ExpectedMovementSourceType fromValue(String v) {
        return valueOf(v);
    }

}
