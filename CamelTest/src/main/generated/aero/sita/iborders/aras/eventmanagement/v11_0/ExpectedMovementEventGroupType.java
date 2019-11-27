
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.ExpectedMovementEventType;


/**
 * Contains list of Events Details and Visa Events
 * 
 * <p>Java class for ExpectedMovementEventGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedMovementEventGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDetail" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}EventDetailType" minOccurs="0"/>
 *         &lt;element name="ExpectedMovementEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ExpectedMovementEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedMovementEventGroupType", propOrder = {
    "eventDetail",
    "expectedMovementEvent"
})
public class ExpectedMovementEventGroupType {

    @XmlElement(name = "EventDetail")
    protected EventDetailType eventDetail;
    @XmlElement(name = "ExpectedMovementEvent")
    protected ExpectedMovementEventType expectedMovementEvent;

    /**
     * Gets the value of the eventDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EventDetailType }
     *     
     */
    public EventDetailType getEventDetail() {
        return eventDetail;
    }

    /**
     * Sets the value of the eventDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDetailType }
     *     
     */
    public void setEventDetail(EventDetailType value) {
        this.eventDetail = value;
    }

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

}