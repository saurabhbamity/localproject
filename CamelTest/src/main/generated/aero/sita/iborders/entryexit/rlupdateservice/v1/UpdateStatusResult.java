
package aero.sita.iborders.entryexit.rlupdateservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStatusResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updateStatusResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="FailedAlreadyUpdated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updateStatusResult")
@XmlEnum
public enum UpdateStatusResult {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("FailedAlreadyUpdated")
    FAILED_ALREADY_UPDATED("FailedAlreadyUpdated");
    private final String value;

    UpdateStatusResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateStatusResult fromValue(String v) {
        for (UpdateStatusResult c: UpdateStatusResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
