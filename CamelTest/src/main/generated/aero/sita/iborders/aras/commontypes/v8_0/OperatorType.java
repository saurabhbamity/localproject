
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Air"/>
 *     &lt;enumeration value="GeneralAviation"/>
 *     &lt;enumeration value="Ship"/>
 *     &lt;enumeration value="CruiseVessel"/>
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="Coach"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorType")
@XmlEnum
public enum OperatorType {


    /**
     * Air.
     * 
     */
    @XmlEnumValue("Air")
    AIR("Air"),

    /**
     * General Aviation.
     * 
     */
    @XmlEnumValue("GeneralAviation")
    GENERAL_AVIATION("GeneralAviation"),

    /**
     * Ship.
     * 
     */
    @XmlEnumValue("Ship")
    SHIP("Ship"),

    /**
     * Companies that transport people by sea.
     *                     
     * 
     */
    @XmlEnumValue("CruiseVessel")
    CRUISE_VESSEL("CruiseVessel"),

    /**
     * Bus.
     * 
     */
    @XmlEnumValue("Bus")
    BUS("Bus"),

    /**
     * Coach.
     * 
     */
    @XmlEnumValue("Coach")
    COACH("Coach");
    private final String value;

    OperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorType fromValue(String v) {
        for (OperatorType c: OperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
