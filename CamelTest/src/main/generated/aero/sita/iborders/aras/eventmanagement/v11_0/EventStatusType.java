
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.HotelEventStatusType;
import aero.sita.iborders.aras.commontypes.v8_0.MovementEventStatusType;
import aero.sita.iborders.aras.commontypes.v8_0.MovementStatusType;
import aero.sita.iborders.aras.commontypes.v8_0.PropertyRentalEventStatusType;
import aero.sita.iborders.aras.commontypes.v8_0.TelephoneEventStatusType;
import aero.sita.iborders.aras.commontypes.v8_0.VehicleEventStatusType;
import aero.sita.iborders.aras.commontypes.v8_0.VisaApplicationEventStatusType;
import aero.sita.iborders.aras.commontypes.v8_0.VisaStatusType;


/**
 * Contain each Event Status
 * 			
 * 
 * <p>Java class for EventStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="VisaApplicationEventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaApplicationEventStatusType"/>
 *           &lt;element name="VisaStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaStatusType"/>
 *           &lt;element name="MovementStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementEventStatusType"/>
 *           &lt;element name="ExpecetdMovementStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementStatusType"/>
 *           &lt;element name="TelephoneEventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneEventStatusType"/>
 *           &lt;element name="VehicleEventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VehicleEventStatusType"/>
 *           &lt;element name="PropertyRentalEventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PropertyRentalEventStatusType"/>
 *           &lt;element name="HotelEventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HotelEventStatusType"/>
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
@XmlType(name = "EventStatusType", propOrder = {
    "visaApplicationEventStatus",
    "visaStatus",
    "movementStatus",
    "expecetdMovementStatus",
    "telephoneEventStatus",
    "vehicleEventStatus",
    "propertyRentalEventStatus",
    "hotelEventStatus"
})
public class EventStatusType {

    @XmlElement(name = "VisaApplicationEventStatus")
    protected VisaApplicationEventStatusType visaApplicationEventStatus;
    @XmlElement(name = "VisaStatus")
    protected VisaStatusType visaStatus;
    @XmlElement(name = "MovementStatus")
    protected MovementEventStatusType movementStatus;
    @XmlElement(name = "ExpecetdMovementStatus")
    protected MovementStatusType expecetdMovementStatus;
    @XmlElement(name = "TelephoneEventStatus")
    protected TelephoneEventStatusType telephoneEventStatus;
    @XmlElement(name = "VehicleEventStatus")
    protected VehicleEventStatusType vehicleEventStatus;
    @XmlElement(name = "PropertyRentalEventStatus")
    protected PropertyRentalEventStatusType propertyRentalEventStatus;
    @XmlElement(name = "HotelEventStatus")
    protected HotelEventStatusType hotelEventStatus;

    /**
     * Gets the value of the visaApplicationEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VisaApplicationEventStatusType }
     *     
     */
    public VisaApplicationEventStatusType getVisaApplicationEventStatus() {
        return visaApplicationEventStatus;
    }

    /**
     * Sets the value of the visaApplicationEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaApplicationEventStatusType }
     *     
     */
    public void setVisaApplicationEventStatus(VisaApplicationEventStatusType value) {
        this.visaApplicationEventStatus = value;
    }

    /**
     * Gets the value of the visaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VisaStatusType }
     *     
     */
    public VisaStatusType getVisaStatus() {
        return visaStatus;
    }

    /**
     * Sets the value of the visaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaStatusType }
     *     
     */
    public void setVisaStatus(VisaStatusType value) {
        this.visaStatus = value;
    }

    /**
     * Gets the value of the movementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementEventStatusType }
     *     
     */
    public MovementEventStatusType getMovementStatus() {
        return movementStatus;
    }

    /**
     * Sets the value of the movementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementEventStatusType }
     *     
     */
    public void setMovementStatus(MovementEventStatusType value) {
        this.movementStatus = value;
    }

    /**
     * Gets the value of the expecetdMovementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementStatusType }
     *     
     */
    public MovementStatusType getExpecetdMovementStatus() {
        return expecetdMovementStatus;
    }

    /**
     * Sets the value of the expecetdMovementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementStatusType }
     *     
     */
    public void setExpecetdMovementStatus(MovementStatusType value) {
        this.expecetdMovementStatus = value;
    }

    /**
     * Gets the value of the telephoneEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneEventStatusType }
     *     
     */
    public TelephoneEventStatusType getTelephoneEventStatus() {
        return telephoneEventStatus;
    }

    /**
     * Sets the value of the telephoneEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneEventStatusType }
     *     
     */
    public void setTelephoneEventStatus(TelephoneEventStatusType value) {
        this.telephoneEventStatus = value;
    }

    /**
     * Gets the value of the vehicleEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEventStatusType }
     *     
     */
    public VehicleEventStatusType getVehicleEventStatus() {
        return vehicleEventStatus;
    }

    /**
     * Sets the value of the vehicleEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEventStatusType }
     *     
     */
    public void setVehicleEventStatus(VehicleEventStatusType value) {
        this.vehicleEventStatus = value;
    }

    /**
     * Gets the value of the propertyRentalEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyRentalEventStatusType }
     *     
     */
    public PropertyRentalEventStatusType getPropertyRentalEventStatus() {
        return propertyRentalEventStatus;
    }

    /**
     * Sets the value of the propertyRentalEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyRentalEventStatusType }
     *     
     */
    public void setPropertyRentalEventStatus(PropertyRentalEventStatusType value) {
        this.propertyRentalEventStatus = value;
    }

    /**
     * Gets the value of the hotelEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HotelEventStatusType }
     *     
     */
    public HotelEventStatusType getHotelEventStatus() {
        return hotelEventStatus;
    }

    /**
     * Sets the value of the hotelEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelEventStatusType }
     *     
     */
    public void setHotelEventStatus(HotelEventStatusType value) {
        this.hotelEventStatus = value;
    }

}
