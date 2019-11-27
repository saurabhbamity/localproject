
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorStatusType")
@XmlEnum
public enum OperatorStatusType {


    /**
     * Active
     * 
     */
    A,

    /**
     * Inactive
     * 
     */
    I,

    /**
     * Provisional
     * 
     */
    P;

    public String value() {
        return name();
    }

    public static OperatorStatusType fromValue(String v) {
        return valueOf(v);
    }

}
