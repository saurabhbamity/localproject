
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hotel Event Source and Provider Information.
 *             
 * 
 * <p>Java class for HotelEventSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelEventSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncountryEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}InCountryEventSourceType"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HotelEventStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelEventSourceType", propOrder = {
    "incountryEventSource",
    "eventStatus"
})
public class HotelEventSourceType {

    @XmlElement(name = "IncountryEventSource", required = true)
    protected InCountryEventSourceType incountryEventSource;
    @XmlElement(name = "EventStatus", required = true)
    protected HotelEventStatusType eventStatus;

    /**
     * Gets the value of the incountryEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link InCountryEventSourceType }
     *     
     */
    public InCountryEventSourceType getIncountryEventSource() {
        return incountryEventSource;
    }

    /**
     * Sets the value of the incountryEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InCountryEventSourceType }
     *     
     */
    public void setIncountryEventSource(InCountryEventSourceType value) {
        this.incountryEventSource = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HotelEventStatusType }
     *     
     */
    public HotelEventStatusType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelEventStatusType }
     *     
     */
    public void setEventStatus(HotelEventStatusType value) {
        this.eventStatus = value;
    }

}
