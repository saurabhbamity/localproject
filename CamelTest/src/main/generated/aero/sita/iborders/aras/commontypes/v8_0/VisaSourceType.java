
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VisaSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Visa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisaSourceType")
@XmlEnum
public enum VisaSourceType {


    /**
     * Visa and Visa Application Source
     *                     
     * 
     */
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    VisaSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VisaSourceType fromValue(String v) {
        for (VisaSourceType c: VisaSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
