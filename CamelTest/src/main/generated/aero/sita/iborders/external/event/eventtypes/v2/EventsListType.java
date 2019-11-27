
package aero.sita.iborders.external.event.eventtypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.event.expectedmovementeventtypes.v2.ExpectedMovementEventType;
import aero.sita.iborders.external.event.movementeventtypes.v2.MovementEventType;
import aero.sita.iborders.external.event.riskassessmenteventtypes.v2.RiskAssessmentEventType;


/**
 * A single event of a particular type.
 * 
 * <p>Java class for EventsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ExpectedMovementEvent" type="{http://sita.aero/iborders/external/event/ExpectedMovementEventTypes/V2}ExpectedMovementEventType"/>
 *           &lt;element name="MovementEvent" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}MovementEventType"/>
 *           &lt;element name="RiskAssessmentEvent" type="{http://sita.aero/iborders/external/event/RiskAssessmentEventTypes/V2}RiskAssessmentEventType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsListType", propOrder = {
    "expectedMovementEvent",
    "movementEvent",
    "riskAssessmentEvent"
})
public class EventsListType {

    @XmlElement(name = "ExpectedMovementEvent")
    protected ExpectedMovementEventType expectedMovementEvent;
    @XmlElement(name = "MovementEvent")
    protected MovementEventType movementEvent;
    @XmlElement(name = "RiskAssessmentEvent")
    protected RiskAssessmentEventType riskAssessmentEvent;

    /**
     * Gets the value of the expectedMovementEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedMovementEventType }
     *     
     */
    public ExpectedMovementEventType getExpectedMovementEvent() {
        return expectedMovementEvent;
    }

    /**
     * Sets the value of the expectedMovementEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedMovementEventType }
     *     
     */
    public void setExpectedMovementEvent(ExpectedMovementEventType value) {
        this.expectedMovementEvent = value;
    }

    /**
     * Gets the value of the movementEvent property.
     * 
     * @return
     *     possible object is
     *     {@link MovementEventType }
     *     
     */
    public MovementEventType getMovementEvent() {
        return movementEvent;
    }

    /**
     * Sets the value of the movementEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementEventType }
     *     
     */
    public void setMovementEvent(MovementEventType value) {
        this.movementEvent = value;
    }

    /**
     * Gets the value of the riskAssessmentEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessmentEventType }
     *     
     */
    public RiskAssessmentEventType getRiskAssessmentEvent() {
        return riskAssessmentEvent;
    }

    /**
     * Sets the value of the riskAssessmentEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessmentEventType }
     *     
     */
    public void setRiskAssessmentEvent(RiskAssessmentEventType value) {
        this.riskAssessmentEvent = value;
    }

}
