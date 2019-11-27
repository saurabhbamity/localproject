
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Expected Movement Event Source and Status
 *                 Information.
 *             
 * 
 * <p>Java class for ExpectedMovementEventSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedMovementEventSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpectedMovementEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ExpectedMovementSourceType"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedMovementEventSourceType", propOrder = {
    "expectedMovementEventSource",
    "eventStatus"
})
public class ExpectedMovementEventSourceType {

    @XmlElement(name = "ExpectedMovementEventSource", required = true)
    protected ExpectedMovementSourceType expectedMovementEventSource;
    @XmlElement(name = "EventStatus", required = true)
    protected MovementStatusType eventStatus;

    /**
     * Gets the value of the expectedMovementEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedMovementSourceType }
     *     
     */
    public ExpectedMovementSourceType getExpectedMovementEventSource() {
        return expectedMovementEventSource;
    }

    /**
     * Sets the value of the expectedMovementEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedMovementSourceType }
     *     
     */
    public void setExpectedMovementEventSource(ExpectedMovementSourceType value) {
        this.expectedMovementEventSource = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementStatusType }
     *     
     */
    public MovementStatusType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementStatusType }
     *     
     */
    public void setEventStatus(MovementStatusType value) {
        this.eventStatus = value;
    }

}
