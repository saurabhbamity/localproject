
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedMovementSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpectedMovementSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="APIS"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpectedMovementSourceType")
@XmlEnum
public enum ExpectedMovementSourceType {


    /**
     * APP Expected Movement
     * 
     */
    APP("APP"),

    /**
     * APIS Expected Movement
     * 
     */
    APIS("APIS"),

    /**
     * Other type of Expected Movement
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ExpectedMovementSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpectedMovementSourceType fromValue(String v) {
        for (ExpectedMovementSourceType c: ExpectedMovementSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
