
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Out"/>
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationStatusType")
@XmlEnum
public enum LocationStatusType {


    /**
     * Outbound Travel
     * 
     */
    @XmlEnumValue("Out")
    OUT("Out"),

    /**
     * Inbound Travel
     * 
     */
    @XmlEnumValue("In")
    IN("In"),

    /**
     * Not Found
     * 
     */
    NF("NF"),

    /**
     * Unknown
     * 
     */
    NA("NA");
    private final String value;

    LocationStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationStatusType fromValue(String v) {
        for (LocationStatusType c: LocationStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
