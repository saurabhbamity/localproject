
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.TelephoneEventType;


/**
 * Contains list of Events Details and Telephone Events
 * 
 * <p>Java class for TelephoneEventGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneEventGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDetail" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}EventDetailType" minOccurs="0"/>
 *         &lt;element name="TelephoneEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneEventGroupType", propOrder = {
    "eventDetail",
    "telephoneEvent"
})
public class TelephoneEventGroupType {

    @XmlElement(name = "EventDetail")
    protected EventDetailType eventDetail;
    @XmlElement(name = "TelephoneEvent")
    protected TelephoneEventType telephoneEvent;

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
     * Gets the value of the telephoneEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneEventType }
     *     
     */
    public TelephoneEventType getTelephoneEvent() {
        return telephoneEvent;
    }

    /**
     * Sets the value of the telephoneEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneEventType }
     *     
     */
    public void setTelephoneEvent(TelephoneEventType value) {
        this.telephoneEvent = value;
    }

}
