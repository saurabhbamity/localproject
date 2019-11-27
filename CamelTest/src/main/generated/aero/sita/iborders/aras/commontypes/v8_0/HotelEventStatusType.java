
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelEventStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HotelEventStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Booked"/>
 *     &lt;enumeration value="CheckedIn"/>
 *     &lt;enumeration value="CheckedOut"/>
 *     &lt;enumeration value="RoomChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HotelEventStatusType")
@XmlEnum
public enum HotelEventStatusType {


    /**
     * Booked
     * 
     */
    @XmlEnumValue("Booked")
    BOOKED("Booked"),

    /**
     * CheckedIn
     * 
     */
    @XmlEnumValue("CheckedIn")
    CHECKED_IN("CheckedIn"),

    /**
     * CheckedOut
     * 
     */
    @XmlEnumValue("CheckedOut")
    CHECKED_OUT("CheckedOut"),

    /**
     * RoomChange
     * 
     */
    @XmlEnumValue("RoomChange")
    ROOM_CHANGE("RoomChange");
    private final String value;

    HotelEventStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelEventStatusType fromValue(String v) {
        for (HotelEventStatusType c: HotelEventStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
