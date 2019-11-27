
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains list of all Events
 * 
 * <p>Java class for EventGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDetail" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}EventDetailType" minOccurs="0"/>
 *         &lt;element name="Event" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}EventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventGroupType", propOrder = {
    "eventDetail",
    "event"
})
public class EventGroupType {

    @XmlElement(name = "EventDetail")
    protected EventDetailType eventDetail;
    @XmlElement(name = "Event")
    protected EventType event;

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
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEvent(EventType value) {
        this.event = value;
    }

}
