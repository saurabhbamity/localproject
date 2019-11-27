
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Watchlist"/>
 *     &lt;enumeration value="Profiler"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HitType")
@XmlEnum
public enum HitType {


    /**
     * Watchlist Hit
     * 
     */
    @XmlEnumValue("Watchlist")
    WATCHLIST("Watchlist"),

    /**
     * Profiler Hit
     * 
     */
    @XmlEnumValue("Profiler")
    PROFILER("Profiler"),

    /**
     * Any other external System
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    HitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HitType fromValue(String v) {
        for (HitType c: HitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
