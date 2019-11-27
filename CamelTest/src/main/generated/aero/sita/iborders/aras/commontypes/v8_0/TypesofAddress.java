
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypesofAddress.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypesofAddress">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Permanent"/>
 *     &lt;enumeration value="Work"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypesofAddress")
@XmlEnum
public enum TypesofAddress {

    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Permanent")
    PERMANENT("Permanent"),
    @XmlEnumValue("Work")
    WORK("Work");
    private final String value;

    TypesofAddress(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypesofAddress fromValue(String v) {
        for (TypesofAddress c: TypesofAddress.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
