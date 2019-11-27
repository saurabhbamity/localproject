
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraveldocType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TraveldocType">
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
@XmlType(name = "TraveldocType")
@XmlEnum
public enum TraveldocType {


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

    public static TraveldocType fromValue(String v) {
        return valueOf(v);
    }

}
