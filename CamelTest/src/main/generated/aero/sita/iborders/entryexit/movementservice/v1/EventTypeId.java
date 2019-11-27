
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventTypeId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eventTypeId">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CancelMovement"/>
 *     &lt;enumeration value="SkipBiometrics"/>
 *     &lt;enumeration value="ManualReferral"/>
 *     &lt;enumeration value="RL1Allow"/>
 *     &lt;enumeration value="RL1Deny"/>
 *     &lt;enumeration value="SupervisorDeny"/>
 *     &lt;enumeration value="SupervisorAllow"/>
 *     &lt;enumeration value="AutomaticReferral"/>
 *     &lt;enumeration value="RL2Allow"/>
 *     &lt;enumeration value="RL2Deny"/>
 *     &lt;enumeration value="Overstay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eventTypeId")
@XmlEnum
public enum EventTypeId {

    @XmlEnumValue("CancelMovement")
    CANCEL_MOVEMENT("CancelMovement"),
    @XmlEnumValue("SkipBiometrics")
    SKIP_BIOMETRICS("SkipBiometrics"),
    @XmlEnumValue("ManualReferral")
    MANUAL_REFERRAL("ManualReferral"),
    @XmlEnumValue("RL1Allow")
    RL_1_ALLOW("RL1Allow"),
    @XmlEnumValue("RL1Deny")
    RL_1_DENY("RL1Deny"),
    @XmlEnumValue("SupervisorDeny")
    SUPERVISOR_DENY("SupervisorDeny"),
    @XmlEnumValue("SupervisorAllow")
    SUPERVISOR_ALLOW("SupervisorAllow"),
    @XmlEnumValue("AutomaticReferral")
    AUTOMATIC_REFERRAL("AutomaticReferral"),
    @XmlEnumValue("RL2Allow")
    RL_2_ALLOW("RL2Allow"),
    @XmlEnumValue("RL2Deny")
    RL_2_DENY("RL2Deny"),
    @XmlEnumValue("Overstay")
    OVERSTAY("Overstay");
    private final String value;

    EventTypeId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventTypeId fromValue(String v) {
        for (EventTypeId c: EventTypeId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
