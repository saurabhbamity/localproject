
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Vehicle Event Source and Provider Information.
 *             
 * 
 * <p>Java class for VehicleEventSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleEventSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncountryEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}InCountryEventSourceType"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VehicleEventStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleEventSourceType", propOrder = {
    "incountryEventSource",
    "eventStatus"
})
public class VehicleEventSourceType {

    @XmlElement(name = "IncountryEventSource", required = true)
    protected InCountryEventSourceType incountryEventSource;
    @XmlElement(name = "EventStatus", required = true)
    protected VehicleEventStatusType eventStatus;

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
     *     {@link VehicleEventStatusType }
     *     
     */
    public VehicleEventStatusType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEventStatusType }
     *     
     */
    public void setEventStatus(VehicleEventStatusType value) {
        this.eventStatus = value;
    }

}
