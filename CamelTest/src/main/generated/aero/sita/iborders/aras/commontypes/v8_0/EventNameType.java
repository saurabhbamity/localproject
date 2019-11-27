
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ExpectedMovementEvent"/>
 *     &lt;enumeration value="MovementEvent"/>
 *     &lt;enumeration value="VisaApplicationEvent"/>
 *     &lt;enumeration value="VisaEvent"/>
 *     &lt;enumeration value="HotelEvent"/>
 *     &lt;enumeration value="TelephoneEvent"/>
 *     &lt;enumeration value="VehicleEvent"/>
 *     &lt;enumeration value="PropertyRentalEvent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventNameType")
@XmlEnum
public enum EventNameType {


    /**
     * Expected Movement Event - APP and APIS
     *                     
     * 
     */
    @XmlEnumValue("ExpectedMovementEvent")
    EXPECTED_MOVEMENT_EVENT("ExpectedMovementEvent"),

    /**
     * Movement exit
     * 
     */
    @XmlEnumValue("MovementEvent")
    MOVEMENT_EVENT("MovementEvent"),

    /**
     * Visa Application Event
     *                     
     * 
     */
    @XmlEnumValue("VisaApplicationEvent")
    VISA_APPLICATION_EVENT("VisaApplicationEvent"),

    /**
     * Visa Event
     *                     
     * 
     */
    @XmlEnumValue("VisaEvent")
    VISA_EVENT("VisaEvent"),

    /**
     * Hotel Event
     * 
     */
    @XmlEnumValue("HotelEvent")
    HOTEL_EVENT("HotelEvent"),

    /**
     * Telephone Event
     * 
     */
    @XmlEnumValue("TelephoneEvent")
    TELEPHONE_EVENT("TelephoneEvent"),

    /**
     * Vehicle Event
     * 
     */
    @XmlEnumValue("VehicleEvent")
    VEHICLE_EVENT("VehicleEvent"),

    /**
     * Property Rental Event 
     * 
     */
    @XmlEnumValue("PropertyRentalEvent")
    PROPERTY_RENTAL_EVENT("PropertyRentalEvent");
    private final String value;

    EventNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventNameType fromValue(String v) {
        for (EventNameType c: EventNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
