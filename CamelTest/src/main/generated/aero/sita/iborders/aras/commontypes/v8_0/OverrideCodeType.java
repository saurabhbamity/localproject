
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverrideCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverrideCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OverrideCodeType")
@XmlEnum
public enum OverrideCodeType {


    /**
     * Government.
     * 
     */
    G,

    /**
     * Agent.
     * 
     */
    A,

    /**
     * No Override.
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static OverrideCodeType fromValue(String v) {
        return valueOf(v);
    }

}
