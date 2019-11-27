
package aero.sita.iborders.entryexit.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workstationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="workstationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="EBORDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "workstationType")
@XmlEnum
public enum WorkstationType {

    NORMAL,
    EBORDER;

    public String value() {
        return name();
    }

    public static WorkstationType fromValue(String v) {
        return valueOf(v);
    }

}
