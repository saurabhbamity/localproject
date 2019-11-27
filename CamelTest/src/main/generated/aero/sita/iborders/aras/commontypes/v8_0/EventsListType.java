
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Event Types
 * 
 * <p>Java class for EventsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ExpectedMovementEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ExpectedMovementEventType"/>
 *           &lt;element name="VisaEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaEventType"/>
 *           &lt;element name="VisaApplicationEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaApplicationEventType"/>
 *           &lt;element name="HotelEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HotelEventType"/>
 *           &lt;element name="MovementEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementEventType"/>
 *           &lt;element name="TelephoneEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneEventType"/>
 *           &lt;element name="VehicleEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VehicleEventType"/>
 *           &lt;element name="PropertyRentalEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PropertyRentalEventType"/>
 *           &lt;element name="RiskAssessmentEvent" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}RiskAssessmentEventType"/>
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
@XmlType(name = "EventsListType", propOrder = {
    "expectedMovementEvent",
    "visaEvent",
    "visaApplicationEvent",
    "hotelEvent",
    "movementEvent",
    "telephoneEvent",
    "vehicleEvent",
    "propertyRentalEvent",
    "riskAssessmentEvent"
})
public class EventsListType {

    @XmlElement(name = "ExpectedMovementEvent")
    protected ExpectedMovementEventType expectedMovementEvent;
    @XmlElement(name = "VisaEvent")
    protected VisaEventType visaEvent;
    @XmlElement(name = "VisaApplicationEvent")
    protected VisaApplicationEventType visaApplicationEvent;
    @XmlElement(name = "HotelEvent")
    protected HotelEventType hotelEvent;
    @XmlElement(name = "MovementEvent")
    protected MovementEventType movementEvent;
    @XmlElement(name = "TelephoneEvent")
    protected TelephoneEventType telephoneEvent;
    @XmlElement(name = "VehicleEvent")
    protected VehicleEventType vehicleEvent;
    @XmlElement(name = "PropertyRentalEvent")
    protected PropertyRentalEventType propertyRentalEvent;
    @XmlElement(name = "RiskAssessmentEvent")
    protected RiskAssessmentEventType riskAssessmentEvent;

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

    /**
     * Gets the value of the riskAssessmentEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessmentEventType }
     *     
     */
    public RiskAssessmentEventType getRiskAssessmentEvent() {
        return riskAssessmentEvent;
    }

    /**
     * Sets the value of the riskAssessmentEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessmentEventType }
     *     
     */
    public void setRiskAssessmentEvent(RiskAssessmentEventType value) {
        this.riskAssessmentEvent = value;
    }

}
