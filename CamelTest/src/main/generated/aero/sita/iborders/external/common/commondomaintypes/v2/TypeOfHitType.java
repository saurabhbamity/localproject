
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfHitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfHitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="PRO"/>
 *     &lt;enumeration value="ADVPRO"/>
 *     &lt;enumeration value="WL"/>
 *     &lt;enumeration value="WHL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeOfHitType")
@XmlEnum
public enum TypeOfHitType {


    /**
     * Ap Rules
     * 
     */
    APP,

    /**
     * Profiler
     * 
     */
    PRO,

    /**
     * Advanced profiler
     * 
     */
    ADVPRO,

    /**
     * Watch List
     * 
     */
    WL,

    /**
     * White List
     * 
     */
    WHL;

    public String value() {
        return name();
    }

    public static TypeOfHitType fromValue(String v) {
        return valueOf(v);
    }

}
