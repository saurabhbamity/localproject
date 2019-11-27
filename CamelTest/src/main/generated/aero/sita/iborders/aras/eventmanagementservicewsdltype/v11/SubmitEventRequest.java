
package aero.sita.iborders.aras.eventmanagementservicewsdltype.v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.EventsListType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventsListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "event"
})
@XmlRootElement(name = "SubmitEventRequest")
public class SubmitEventRequest {

    @XmlElement(name = "Event", required = true)
    protected EventsListType event;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link EventsListType }
     *     
     */
    public EventsListType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsListType }
     *     
     */
    public void setEvent(EventsListType value) {
        this.event = value;
    }

}
