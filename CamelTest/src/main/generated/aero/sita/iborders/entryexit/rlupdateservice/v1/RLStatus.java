
package aero.sita.iborders.entryexit.rlupdateservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RLStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RLStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DENY"/>
 *     &lt;enumeration value="ALLOW"/>
 *     &lt;enumeration value="CAPTURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RLStatus")
@XmlEnum
public enum RLStatus {

    DENY,
    ALLOW,
    CAPTURE;

    public String value() {
        return name();
    }

    public static RLStatus fromValue(String v) {
        return valueOf(v);
    }

}
