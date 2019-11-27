
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaEventStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VisaEventStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Issued"/>
 *     &lt;enumeration value="Granted"/>
 *     &lt;enumeration value="Extended"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="UndoCancel"/>
 *     &lt;enumeration value="Expired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisaEventStatusType")
@XmlEnum
public enum VisaEventStatusType {


    /**
     * Visa Granted
     * 
     */
    @XmlEnumValue("Issued")
    ISSUED("Issued"),

    /**
     * Visa Granted - Temporary and will be deprecated
     * 
     */
    @XmlEnumValue("Granted")
    GRANTED("Granted"),

    /**
     * Visa Extended
     * 
     */
    @XmlEnumValue("Extended")
    EXTENDED("Extended"),

    /**
     * Visa Cancelled
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * Undo Cancel
     * 
     */
    @XmlEnumValue("UndoCancel")
    UNDO_CANCEL("UndoCancel"),

    /**
     * Expired
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    VisaEventStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VisaEventStatusType fromValue(String v) {
        for (VisaEventStatusType c: VisaEventStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
