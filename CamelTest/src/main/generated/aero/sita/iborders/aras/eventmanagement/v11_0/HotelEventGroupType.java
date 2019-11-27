
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.HotelEventType;


/**
 * Contains list of Events Details and Hotel Events
 * 
 * <p>Java class for HotelEventGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelEventGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDetail" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}EventDetailType" minOccurs="0"/>
 *         &lt;element name="HotelEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HotelEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelEventGroupType", propOrder = {
    "eventDetail",
    "hotelEvent"
})
public class HotelEventGroupType {

    @XmlElement(name = "EventDetail")
    protected EventDetailType eventDetail;
    @XmlElement(name = "HotelEvent")
    protected HotelEventType hotelEvent;

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
     * Gets the value of the hotelEvent property.
     * 
     * @return
     *     possible object is
     *     {@link HotelEventType }
     *     
     */
    public HotelEventType getHotelEvent() {
        return hotelEvent;
    }

    /**
     * Sets the value of the hotelEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelEventType }
     *     
     */
    public void setHotelEvent(HotelEventType value) {
        this.hotelEvent = value;
    }

}
