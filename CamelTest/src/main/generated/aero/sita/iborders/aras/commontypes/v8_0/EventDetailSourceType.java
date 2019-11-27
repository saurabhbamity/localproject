
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventDetailSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventDetailSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="APIS"/>
 *     &lt;enumeration value="DCS"/>
 *     &lt;enumeration value="PNR"/>
 *     &lt;enumeration value="AM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventDetailSourceType")
@XmlEnum
public enum EventDetailSourceType {


    /**
     * APP Expected Movement
     * 
     */
    APP,

    /**
     * APIS Expected Movement
     * 
     */
    APIS,

    /**
     * DCS Expected Movement
     * 
     */
    DCS,

    /**
     * PNR Expected Movement
     * 
     */
    PNR,

    /**
     * Actual Movement
     * 
     */
    AM;

    public String value() {
        return name();
    }

    public static EventDetailSourceType fromValue(String v) {
        return valueOf(v);
    }

}
