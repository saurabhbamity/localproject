
package aero.sita.iborders.external.common.commontypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnType")
@XmlEnum
public enum ReturnType {


    /**
     * Success
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * Error
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * Warning
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    ReturnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnType fromValue(String v) {
        for (ReturnType c: ReturnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
