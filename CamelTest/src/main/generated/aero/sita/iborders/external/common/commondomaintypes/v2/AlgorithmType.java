
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlgorithmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlgorithmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Levenshtein"/>
 *     &lt;enumeration value="IIR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlgorithmType")
@XmlEnum
public enum AlgorithmType {


    /**
     * Levenshtein Matching Algorithm.
     * 
     */
    @XmlEnumValue("Levenshtein")
    LEVENSHTEIN("Levenshtein"),

    /**
     * IIR Matching Algorithm.
     * 
     */
    IIR("IIR");
    private final String value;

    AlgorithmType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlgorithmType fromValue(String v) {
        for (AlgorithmType c: AlgorithmType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
