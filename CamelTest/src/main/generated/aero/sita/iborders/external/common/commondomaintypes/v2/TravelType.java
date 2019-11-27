
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelType")
@XmlEnum
public enum TravelType {


    /**
     * Normal.
     * 
     */
    N,

    /**
     * Transit.
     * 
     */
    T,

    /**
     * Transfer.
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static TravelType fromValue(String v) {
        return valueOf(v);
    }

}
