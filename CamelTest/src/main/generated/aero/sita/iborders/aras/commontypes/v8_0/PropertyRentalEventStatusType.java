
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyRentalEventStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyRentalEventStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StartRental"/>
 *     &lt;enumeration value="EndRental"/>
 *     &lt;enumeration value="RenewRental"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyRentalEventStatusType")
@XmlEnum
public enum PropertyRentalEventStatusType {


    /**
     * StartRental
     * 
     */
    @XmlEnumValue("StartRental")
    START_RENTAL("StartRental"),

    /**
     * EndRental
     * 
     */
    @XmlEnumValue("EndRental")
    END_RENTAL("EndRental"),

    /**
     * RenewRental
     * 
     */
    @XmlEnumValue("RenewRental")
    RENEW_RENTAL("RenewRental");
    private final String value;

    PropertyRentalEventStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyRentalEventStatusType fromValue(String v) {
        for (PropertyRentalEventStatusType c: PropertyRentalEventStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
