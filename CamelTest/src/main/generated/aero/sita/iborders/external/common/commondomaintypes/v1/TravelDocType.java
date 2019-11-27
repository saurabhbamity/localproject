
package aero.sita.iborders.external.common.commondomaintypes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelDocType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelDocType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="V"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelDocType")
@XmlEnum
public enum TravelDocType {


    /**
     * Passport
     * 
     */
    P,

    /**
     * Other 
     * 
     */
    O,

    /**
     * AlienReg
     * 
     */
    A,

    /**
     * FacilDoc
     * 
     */
    F,

    /**
     * MilitID
     * 
     */
    M,

    /**
     * TravDoc
     * 
     */
    T,

    /**
     * PermRes
     * 
     */
    C,

    /**
     * Unknown
     * 
     */
    U,

    /**
     * ID Card
     * 
     */
    I,

    /**
     * Seaman's Book
     * 
     */
    S,

    /**
     * Visa
     * 
     */
    V;

    public String value() {
        return name();
    }

    public static TravelDocType fromValue(String v) {
        return valueOf(v);
    }

}
