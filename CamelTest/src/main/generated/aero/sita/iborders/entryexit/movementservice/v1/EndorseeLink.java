
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endorseeLink.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="endorseeLink">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EndorseeSpouse"/>
 *     &lt;enumeration value="EndorseeChild"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "endorseeLink")
@XmlEnum
public enum EndorseeLink {

    @XmlEnumValue("EndorseeSpouse")
    ENDORSEE_SPOUSE("EndorseeSpouse"),
    @XmlEnumValue("EndorseeChild")
    ENDORSEE_CHILD("EndorseeChild");
    private final String value;

    EndorseeLink(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndorseeLink fromValue(String v) {
        for (EndorseeLink c: EndorseeLink.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
