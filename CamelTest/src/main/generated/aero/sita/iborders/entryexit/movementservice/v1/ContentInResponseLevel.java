
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contentInResponseLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contentInResponseLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="LINKS"/>
 *     &lt;enumeration value="RISK"/>
 *     &lt;enumeration value="PERMITS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contentInResponseLevel")
@XmlEnum
public enum ContentInResponseLevel {

    ALL,
    MIN,
    LINKS,
    RISK,
    PERMITS;

    public String value() {
        return name();
    }

    public static ContentInResponseLevel fromValue(String v) {
        return valueOf(v);
    }

}
