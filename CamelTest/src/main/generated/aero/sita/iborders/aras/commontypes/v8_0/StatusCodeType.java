
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusCodeType")
@XmlEnum
public enum StatusCodeType {


    /**
     * Board
     * 
     */
    B,

    /**
     * Do Not Board
     * 
     */
    D,

    /**
     * Cancelled
     * 
     */
    C,

    /**
     * No Record to Cancel
     * 
     */
    N,

    /**
     * Error
     * 
     */
    E;

    public String value() {
        return name();
    }

    public static StatusCodeType fromValue(String v) {
        return valueOf(v);
    }

}
