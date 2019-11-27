
package aero.sita.iborders.external.common.commondomaintypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaNoOfEntriesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VisaNoOfEntriesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisaNoOfEntriesType")
@XmlEnum
public enum VisaNoOfEntriesType {


    /**
     * Single
     * 
     */
    S,

    /**
     * Multiple
     * 
     */
    M;

    public String value() {
        return name();
    }

    public static VisaNoOfEntriesType fromValue(String v) {
        return valueOf(v);
    }

}
