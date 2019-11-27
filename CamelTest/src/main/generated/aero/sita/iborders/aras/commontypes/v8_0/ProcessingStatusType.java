
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Started"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Success"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessingStatusType")
@XmlEnum
public enum ProcessingStatusType {


    /**
     * Booked
     * 
     */
    @XmlEnumValue("Started")
    STARTED("Started"),

    /**
     * Pickup
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * Dropoff
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success");
    private final String value;

    ProcessingStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessingStatusType fromValue(String v) {
        for (ProcessingStatusType c: ProcessingStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
