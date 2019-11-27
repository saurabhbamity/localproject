
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GetResults"/>
 *     &lt;enumeration value="GetCount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PageActionType")
@XmlEnum
public enum PageActionType {


    /**
     * Action signifies that the current search operation is aimed to get results.
     *                     
     * 
     */
    @XmlEnumValue("GetResults")
    GET_RESULTS("GetResults"),

    /**
     * Action signifies that the current search operation is aimed to get result count.
     * 
     */
    @XmlEnumValue("GetCount")
    GET_COUNT("GetCount");
    private final String value;

    PageActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageActionType fromValue(String v) {
        for (PageActionType c: PageActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
