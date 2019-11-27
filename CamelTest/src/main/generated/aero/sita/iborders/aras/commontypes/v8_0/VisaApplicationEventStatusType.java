
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaApplicationEventStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VisaApplicationEventStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Granted"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="InterimApproved"/>
 *     &lt;enumeration value="InterimRejected"/>
 *     &lt;enumeration value="MoreInformationResponse"/>
 *     &lt;enumeration value="FinalApproved"/>
 *     &lt;enumeration value="FinalRejected"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Applied"/>
 *     &lt;enumeration value="Submitted"/>
 *     &lt;enumeration value="RejectedImmigration"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisaApplicationEventStatusType")
@XmlEnum
public enum VisaApplicationEventStatusType {


    /**
     * Granted
     * 
     */
    @XmlEnumValue("Granted")
    GRANTED("Granted"),

    /**
     * Rejected
     * 
     */
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),

    /**
     * Officer Interim Approved
     * 
     */
    @XmlEnumValue("InterimApproved")
    INTERIM_APPROVED("InterimApproved"),

    /**
     * Officer Interim Rejected
     * 
     */
    @XmlEnumValue("InterimRejected")
    INTERIM_REJECTED("InterimRejected"),

    /**
     * Requested for more information
     * 
     */
    @XmlEnumValue("MoreInformationResponse")
    MORE_INFORMATION_RESPONSE("MoreInformationResponse"),

    /**
     * Officer Final Approved
     * 
     */
    @XmlEnumValue("FinalApproved")
    FINAL_APPROVED("FinalApproved"),

    /**
     * Officer Final Approved
     * 
     */
    @XmlEnumValue("FinalRejected")
    FINAL_REJECTED("FinalRejected"),

    /**
     * Pending - Deprecated
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * Applied - Deprecated
     * 
     */
    @XmlEnumValue("Applied")
    APPLIED("Applied"),

    /**
     * Submitted
     * 
     */
    @XmlEnumValue("Submitted")
    SUBMITTED("Submitted"),

    /**
     * Rejected Immigration
     * 
     */
    @XmlEnumValue("RejectedImmigration")
    REJECTED_IMMIGRATION("RejectedImmigration");
    private final String value;

    VisaApplicationEventStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VisaApplicationEventStatusType fromValue(String v) {
        for (VisaApplicationEventStatusType c: VisaApplicationEventStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
