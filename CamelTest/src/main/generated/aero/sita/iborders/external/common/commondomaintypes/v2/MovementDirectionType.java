
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MovementDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMIN"/>
 *     &lt;enumeration value="IMOUT"/>
 *     &lt;enumeration value="DLIN"/>
 *     &lt;enumeration value="DLOUT"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MovementDirectionType")
@XmlEnum
public enum MovementDirectionType {


    /**
     * Immigration In
     * 
     */
    IMIN,

    /**
     * Immigration Out
     * 
     */
    IMOUT,

    /**
     * Departure Lounge In
     * 
     */
    DLIN,

    /**
     * Departure Lounge Out
     * 
     */
    DLOUT,

    /**
     * Internal Flight (Domestic)
     * 
     */
    I;

    public String value() {
        return name();
    }

    public static MovementDirectionType fromValue(String v) {
        return valueOf(v);
    }

}
