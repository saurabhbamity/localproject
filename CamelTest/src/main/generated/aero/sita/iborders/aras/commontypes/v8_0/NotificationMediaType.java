
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationMediaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="EMAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationMediaType")
@XmlEnum
public enum NotificationMediaType {


    /**
     * SMS
     * 
     */
    SMS,

    /**
     * EMAIL
     * 
     */
    EMAIL;

    public String value() {
        return name();
    }

    public static NotificationMediaType fromValue(String v) {
        return valueOf(v);
    }

}
