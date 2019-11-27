
package aero.sita.iborders.external.common.commontypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemIndicatorType")
@XmlEnum
public enum SystemIndicatorType {


    /**
     * Yes
     * 
     */
    Y,

    /**
     * No
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static SystemIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
