
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Event Sources. One of the Source will be selected
 *                 for searching
 *             
 * 
 * <p>Java class for EventSourceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventSourceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ExpectedMovementEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ExpectedMovementEventSourceType"/>
 *           &lt;element name="VisaEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaEventSourceType"/>
 *           &lt;element name="VisaApplicationEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaApplicationEventSourceType"/>
 *           &lt;element name="HotelEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HotelEventSourceType"/>
 *           &lt;element name="MovementEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementEventSourceType"/>
 *           &lt;element name="TelephoneEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneEventSourceType"/>
 *           &lt;element name="VehicleEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VehicleEventSourceType"/>
 *           &lt;element name="PropertyRentalEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PropertyRentalEventSourceType"/>
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
@XmlType(name = "EventSourceListType", propOrder = {
    "expectedMovementEventSource",
    "visaEventSource",
    "visaApplicationEventSource",
    "hotelEventSource",
    "movementEventSource",
    "telephoneEventSource",
    "vehicleEventSource",
    "propertyRentalEventSource"
})
public class EventSourceListType {

    @XmlElement(name = "ExpectedMovementEventSource")
    protected ExpectedMovementEventSourceType expectedMovementEventSource;
    @XmlElement(name = "VisaEventSource")
    protected VisaEventSourceType visaEventSource;
    @XmlElement(name = "VisaApplicationEventSource")
    protected VisaApplicationEventSourceType visaApplicationEventSource;
    @XmlElement(name = "HotelEventSource")
    protected HotelEventSourceType hotelEventSource;
    @XmlElement(name = "MovementEventSource")
    protected MovementEventSourceType movementEventSource;
    @XmlElement(name = "TelephoneEventSource")
    protected TelephoneEventSourceType telephoneEventSource;
    @XmlElement(name = "VehicleEventSource")
    protected VehicleEventSourceType vehicleEventSource;
    @XmlElement(name = "PropertyRentalEventSource")
    protected PropertyRentalEventSourceType propertyRentalEventSource;

    /**
     * Gets the value of the expectedMovementEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedMovementEventSourceType }
     *     
     */
    public ExpectedMovementEventSourceType getExpectedMovementEventSource() {
        return expectedMovementEventSource;
    }

    /**
     * Sets the value of the expectedMovementEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedMovementEventSourceType }
     *     
     */
    public void setExpectedMovementEventSource(ExpectedMovementEventSourceType value) {
        this.expectedMovementEventSource = value;
    }

    /**
     * Gets the value of the visaEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link VisaEventSourceType }
     *     
     */
    public VisaEventSourceType getVisaEventSource() {
        return visaEventSource;
    }

    /**
     * Sets the value of the visaEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaEventSourceType }
     *     
     */
    public void setVisaEventSource(VisaEventSourceType value) {
        this.visaEventSource = value;
    }

    /**
     * Gets the value of the visaApplicationEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link VisaApplicationEventSourceType }
     *     
     */
    public VisaApplicationEventSourceType getVisaApplicationEventSource() {
        return visaApplicationEventSource;
    }

    /**
     * Sets the value of the visaApplicationEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaApplicationEventSourceType }
     *     
     */
    public void setVisaApplicationEventSource(VisaApplicationEventSourceType value) {
        this.visaApplicationEventSource = value;
    }

    /**
     * Gets the value of the hotelEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link HotelEventSourceType }
     *     
     */
    public HotelEventSourceType getHotelEventSource() {
        return hotelEventSource;
    }

    /**
     * Sets the value of the hotelEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelEventSourceType }
     *     
     */
    public void setHotelEventSource(HotelEventSourceType value) {
        this.hotelEventSource = value;
    }

    /**
     * Gets the value of the movementEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link MovementEventSourceType }
     *     
     */
    public MovementEventSourceType getMovementEventSource() {
        return movementEventSource;
    }

    /**
     * Sets the value of the movementEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementEventSourceType }
     *     
     */
    public void setMovementEventSource(MovementEventSourceType value) {
        this.movementEventSource = value;
    }

    /**
     * Gets the value of the telephoneEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneEventSourceType }
     *     
     */
    public TelephoneEventSourceType getTelephoneEventSource() {
        return telephoneEventSource;
    }

    /**
     * Sets the value of the telephoneEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneEventSourceType }
     *     
     */
    public void setTelephoneEventSource(TelephoneEventSourceType value) {
        this.telephoneEventSource = value;
    }

    /**
     * Gets the value of the vehicleEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEventSourceType }
     *     
     */
    public VehicleEventSourceType getVehicleEventSource() {
        return vehicleEventSource;
    }

    /**
     * Sets the value of the vehicleEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEventSourceType }
     *     
     */
    public void setVehicleEventSource(VehicleEventSourceType value) {
        this.vehicleEventSource = value;
    }

    /**
     * Gets the value of the propertyRentalEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyRentalEventSourceType }
     *     
     */
    public PropertyRentalEventSourceType getPropertyRentalEventSource() {
        return propertyRentalEventSource;
    }

    /**
     * Sets the value of the propertyRentalEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyRentalEventSourceType }
     *     
     */
    public void setPropertyRentalEventSource(PropertyRentalEventSourceType value) {
        this.propertyRentalEventSource = value;
    }

}
