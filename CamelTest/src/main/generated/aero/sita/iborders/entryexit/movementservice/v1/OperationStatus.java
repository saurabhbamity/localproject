
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACK"/>
 *     &lt;enumeration value="ACK_REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operationStatus")
@XmlEnum
public enum OperationStatus {

    ACK,
    ACK_REJECTED;

    public String value() {
        return name();
    }

    public static OperationStatus fromValue(String v) {
        return valueOf(v);
    }

}
