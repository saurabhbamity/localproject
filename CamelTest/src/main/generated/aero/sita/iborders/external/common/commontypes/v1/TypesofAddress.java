
package aero.sita.iborders.external.common.commontypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypesofAddress.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypesofAddress">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Permanent"/>
 *     &lt;enumeration value="Work"/>
 *     &lt;enumeration value="Agents"/>
 *     &lt;enumeration value="Billing"/>
 *     &lt;enumeration value="Delivery"/>
 *     &lt;enumeration value="Credit Card"/>
 *     &lt;enumeration value="Residence"/>
 *     &lt;enumeration value="Destination"/>
 *     &lt;enumeration value="Origin"/>
 *     &lt;enumeration value="Emergency"/>
 *     &lt;enumeration value="Birth"/>
 *     &lt;enumeration value="Home"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypesofAddress")
@XmlEnum
public enum TypesofAddress {

    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Permanent")
    PERMANENT("Permanent"),
    @XmlEnumValue("Work")
    WORK("Work"),
    @XmlEnumValue("Agents")
    AGENTS("Agents"),
    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),
    @XmlEnumValue("Credit Card")
    CREDIT_CARD("Credit Card"),
    @XmlEnumValue("Residence")
    RESIDENCE("Residence"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("Origin")
    ORIGIN("Origin"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),
    @XmlEnumValue("Birth")
    BIRTH("Birth"),
    @XmlEnumValue("Home")
    HOME("Home");
    private final String value;

    TypesofAddress(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypesofAddress fromValue(String v) {
        for (TypesofAddress c: TypesofAddress.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
