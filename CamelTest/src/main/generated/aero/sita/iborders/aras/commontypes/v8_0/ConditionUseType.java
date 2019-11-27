
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionUseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionUseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Include"/>
 *     &lt;enumeration value="Ignore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionUseType")
@XmlEnum
public enum ConditionUseType {


    /**
     * Include
     * 
     */
    @XmlEnumValue("Include")
    INCLUDE("Include"),

    /**
     * Ignore
     * 
     */
    @XmlEnumValue("Ignore")
    IGNORE("Ignore");
    private final String value;

    ConditionUseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionUseType fromValue(String v) {
        for (ConditionUseType c: ConditionUseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
