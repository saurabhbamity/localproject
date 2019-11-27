
package aero.sita.iborders.external.event.riskassessmenteventtypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.event.eventcommontypes.v2.EventDataType;


/**
 * <p>Java class for RiskAssessmentEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskAssessmentEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/external/event/RiskAssessmentEventTypes/V2}RiskAssessmentSourceType"/>
 *         &lt;element name="AssessmentReason" type="{http://sita.aero/iborders/external/event/RiskAssessmentEventTypes/V2}AssessmentReasonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskAssessmentEventType", propOrder = {
    "eventSource",
    "assessmentReason"
})
public class RiskAssessmentEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected RiskAssessmentSourceType eventSource;
    @XmlElement(name = "AssessmentReason")
    protected String assessmentReason;

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessmentSourceType }
     *     
     */
    public RiskAssessmentSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessmentSourceType }
     *     
     */
    public void setEventSource(RiskAssessmentSourceType value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the assessmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentReason() {
        return assessmentReason;
    }

    /**
     * Sets the value of the assessmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentReason(String value) {
        this.assessmentReason = value;
    }

}
