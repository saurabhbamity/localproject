
package aero.sita.iborders.entryexit.rlupdateservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.SystemHitType;


/**
 *  Updated RL response sent via VIS
 * 
 * <p>Java class for UpdateStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStatusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementId" type="{http://sita.aero/iborders/entryExit/Common/V1}guid"/>
 *         &lt;element name="RLRiskAssessmentUpdate" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}SystemHitType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStatusRequestType", propOrder = {
    "movementId",
    "rlRiskAssessmentUpdate"
})
public class UpdateStatusRequestType {

    @XmlElement(name = "MovementId", required = true)
    protected String movementId;
    @XmlElement(name = "RLRiskAssessmentUpdate", required = true)
    protected SystemHitType rlRiskAssessmentUpdate;

    /**
     * Gets the value of the movementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementId() {
        return movementId;
    }

    /**
     * Sets the value of the movementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementId(String value) {
        this.movementId = value;
    }

    /**
     * Gets the value of the rlRiskAssessmentUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link SystemHitType }
     *     
     */
    public SystemHitType getRLRiskAssessmentUpdate() {
        return rlRiskAssessmentUpdate;
    }

    /**
     * Sets the value of the rlRiskAssessmentUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemHitType }
     *     
     */
    public void setRLRiskAssessmentUpdate(SystemHitType value) {
        this.rlRiskAssessmentUpdate = value;
    }

}
