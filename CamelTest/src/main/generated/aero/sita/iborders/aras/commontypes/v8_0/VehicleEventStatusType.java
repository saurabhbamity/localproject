
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleEventStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleEventStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Booked"/>
 *     &lt;enumeration value="Pickup"/>
 *     &lt;enumeration value="Dropoff"/>
 *     &lt;enumeration value="Extend"/>
 *     &lt;enumeration value="Renewal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleEventStatusType")
@XmlEnum
public enum VehicleEventStatusType {


    /**
     * Booked
     * 
     */
    @XmlEnumValue("Booked")
    BOOKED("Booked"),

    /**
     * Pickup
     * 
     */
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),

    /**
     * Dropoff
     * 
     */
    @XmlEnumValue("Dropoff")
    DROPOFF("Dropoff"),

    /**
     * Extend
     * 
     */
    @XmlEnumValue("Extend")
    EXTEND("Extend"),

    /**
     * Renewal
     * 
     */
    @XmlEnumValue("Renewal")
    RENEWAL("Renewal");
    private final String value;

    VehicleEventStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleEventStatusType fromValue(String v) {
        for (VehicleEventStatusType c: VehicleEventStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
