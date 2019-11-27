
package aero.sita.iborders.entryexit.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for directionIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="directionIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARRIVAL"/>
 *     &lt;enumeration value="DEPARTURE"/>
 *     &lt;enumeration value="BOTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "directionIndicator")
@XmlEnum
public enum DirectionIndicator {

    ARRIVAL,
    DEPARTURE,
    BOTH;

    public String value() {
        return name();
    }

    public static DirectionIndicator fromValue(String v) {
        return valueOf(v);
    }

}
