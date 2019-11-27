
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.ExpectedMovementEventType;
import aero.sita.iborders.aras.commontypes.v8_0.HotelEventType;
import aero.sita.iborders.aras.commontypes.v8_0.MovementEventType;
import aero.sita.iborders.aras.commontypes.v8_0.PropertyRentalEventType;
import aero.sita.iborders.aras.commontypes.v8_0.TelephoneEventType;
import aero.sita.iborders.aras.commontypes.v8_0.VehicleEventType;
import aero.sita.iborders.aras.commontypes.v8_0.VisaApplicationEventType;
import aero.sita.iborders.aras.commontypes.v8_0.VisaEventType;


/**
 * Contains list of all Events
 * 
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpectedMovementEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ExpectedMovementEventType" minOccurs="0"/>
 *         &lt;element name="VisaEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaEventType" minOccurs="0"/>
 *         &lt;element name="VisaApplicationEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaApplicationEventType" minOccurs="0"/>
 *         &lt;element name="MovementEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementEventType" minOccurs="0"/>
 *         &lt;element name="HotelEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HotelEventType" minOccurs="0"/>
 *         &lt;element name="TelephoneEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneEventType" minOccurs="0"/>
 *         &lt;element name="VehicleEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VehicleEventType" minOccurs="0"/>
 *         &lt;element name="PropertyRentalEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PropertyRentalEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "expectedMovementEvent",
    "visaEvent",
    "visaApplicationEvent",
    "movementEvent",
    "hotelEvent",
    "telephoneEvent",
    "vehicleEvent",
    "propertyRentalEvent"
})
public class EventType {

    @XmlElement(name = "ExpectedMovementEvent")
    protected ExpectedMovementEventType expectedMovementEvent;
    @XmlElement(name = "VisaEvent")
    protected VisaEventType visaEvent;
    @XmlElement(name = "VisaApplicationEvent")
    protected VisaApplicationEventType visaApplicationEvent;
    @XmlElement(name = "MovementEvent")
    protected MovementEventType movementEvent;
    @XmlElement(name = "HotelEvent")
    protected HotelEventType hotelEvent;
    @XmlElement(name = "TelephoneEvent")
    protected TelephoneEventType telephoneEvent;
    @XmlElement(name = "VehicleEvent")
    protected VehicleEventType vehicleEvent;
    @XmlElement(name = "PropertyRentalEvent")
    protected PropertyRentalEventType propertyRentalEvent;

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
     * Gets the value of the visaEvent property.
     * 
     * @return
     *     possible object is
     *     {@link VisaEventType }
     *     
     */
    public VisaEventType getVisaEvent() {
        return visaEvent;
    }

    /**
     * Sets the value of the visaEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaEventType }
     *     
     */
    public void setVisaEvent(VisaEventType value) {
        this.visaEvent = value;
    }

    /**
     * Gets the value of the visaApplicationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link VisaApplicationEventType }
     *     
     */
    public VisaApplicationEventType getVisaApplicationEvent() {
        return visaApplicationEvent;
    }

    /**
     * Sets the value of the visaApplicationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaApplicationEventType }
     *     
     */
    public void setVisaApplicationEvent(VisaApplicationEventType value) {
        this.visaApplicationEvent = value;
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

    /**
     * Gets the value of the vehicleEvent property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEventType }
     *     
     */
    public VehicleEventType getVehicleEvent() {
        return vehicleEvent;
    }

    /**
     * Sets the value of the vehicleEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEventType }
     *     
     */
    public void setVehicleEvent(VehicleEventType value) {
        this.vehicleEvent = value;
    }

    /**
     * Gets the value of the propertyRentalEvent property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyRentalEventType }
     *     
     */
    public PropertyRentalEventType getPropertyRentalEvent() {
        return propertyRentalEvent;
    }

    /**
     * Sets the value of the propertyRentalEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyRentalEventType }
     *     
     */
    public void setPropertyRentalEvent(PropertyRentalEventType value) {
        this.propertyRentalEvent = value;
    }

}
