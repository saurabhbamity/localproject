
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Duplicate"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Ready"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetStatusType")
@XmlEnum
public enum TargetStatusType {


    /**
     * Active.
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Deleted Target - Soft delete only.
     * 
     */
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),

    /**
     * Duplicate.
     * 
     */
    @XmlEnumValue("Duplicate")
    DUPLICATE("Duplicate"),

    /**
     * Error.
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * Ready.
     * 
     */
    @XmlEnumValue("Ready")
    READY("Ready");
    private final String value;

    TargetStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TargetStatusType fromValue(String v) {
        for (TargetStatusType c: TargetStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
