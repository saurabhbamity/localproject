
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUAL_TO"/>
 *     &lt;enumeration value="NOT_EQUAL_TO"/>
 *     &lt;enumeration value="LESSER_THAN"/>
 *     &lt;enumeration value="LESSER_THAN_EQUAL_TO"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="GREATER_THAN_EQUAL_TO"/>
 *     &lt;enumeration value="BETWEEN"/>
 *     &lt;enumeration value="CONTAINS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComparatorType")
@XmlEnum
public enum ComparatorType {


    /**
     * Equal
     * 
     */
    EQUAL_TO,

    /**
     * NotEqual
     * 
     */
    NOT_EQUAL_TO,

    /**
     * Lessthan
     * 
     */
    LESSER_THAN,

    /**
     * Lessthan Equal
     * 
     */
    LESSER_THAN_EQUAL_TO,

    /**
     * Greaterthan
     * 
     */
    GREATER_THAN,

    /**
     * Greaterthan Equal
     * 
     */
    GREATER_THAN_EQUAL_TO,

    /**
     * Between
     * 
     */
    BETWEEN,

    /**
     * Contains
     * 
     */
    CONTAINS;

    public String value() {
        return name();
    }

    public static ComparatorType fromValue(String v) {
        return valueOf(v);
    }

}
