
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehicleEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VehicleEventSourceType"/>
 *         &lt;element name="BookingReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleMake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehicleColour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearoOfManufacture" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DistanceTravelled" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DistanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledPickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledDropOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualPickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualRenewalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDropOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LocationtoPickup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationtoDropoff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EmailType" minOccurs="0"/>
 *         &lt;element name="OrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganisationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleEventType", propOrder = {
    "eventSource",
    "bookingReference",
    "plateNumber",
    "plateCode",
    "plateType",
    "vehicleType",
    "vehicleMake",
    "vehicleModel",
    "vehicleColour",
    "yearoOfManufacture",
    "distanceTravelled",
    "distanceUnit",
    "scheduledPickupDate",
    "scheduledDropOffDate",
    "actualPickupDate",
    "actualRenewalDate",
    "actualDropOffDate",
    "locationtoPickup",
    "locationtoDropoff",
    "cardType",
    "contactNumber1",
    "contactNumber2",
    "email",
    "organisationName",
    "jobTitle",
    "organisationNumber"
})
public class VehicleEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected VehicleEventSourceType eventSource;
    @XmlElement(name = "BookingReference")
    protected String bookingReference;
    @XmlElement(name = "PlateNumber")
    protected String plateNumber;
    @XmlElement(name = "PlateCode")
    protected String plateCode;
    @XmlElement(name = "PlateType")
    protected String plateType;
    @XmlElement(name = "VehicleType")
    protected String vehicleType;
    @XmlElement(name = "VehicleMake")
    protected String vehicleMake;
    @XmlElement(name = "VehicleModel")
    protected String vehicleModel;
    @XmlElement(name = "VehicleColour")
    protected String vehicleColour;
    @XmlElement(name = "YearoOfManufacture")
    protected Integer yearoOfManufacture;
    @XmlElement(name = "DistanceTravelled")
    protected Double distanceTravelled;
    @XmlElement(name = "DistanceUnit")
    protected String distanceUnit;
    @XmlElement(name = "ScheduledPickupDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledPickupDate;
    @XmlElement(name = "ScheduledDropOffDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDropOffDate;
    @XmlElement(name = "ActualPickupDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualPickupDate;
    @XmlElement(name = "ActualRenewalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualRenewalDate;
    @XmlElement(name = "ActualDropOffDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDropOffDate;
    @XmlElement(name = "LocationtoPickup")
    protected String locationtoPickup;
    @XmlElement(name = "LocationtoDropoff")
    protected String locationtoDropoff;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "ContactNumber1")
    protected String contactNumber1;
    @XmlElement(name = "ContactNumber2")
    protected String contactNumber2;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "OrganisationName")
    protected String organisationName;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "OrganisationNumber")
    protected String organisationNumber;

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEventSourceType }
     *     
     */
    public VehicleEventSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEventSourceType }
     *     
     */
    public void setEventSource(VehicleEventSourceType value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the bookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReference(String value) {
        this.bookingReference = value;
    }

    /**
     * Gets the value of the plateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Sets the value of the plateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateNumber(String value) {
        this.plateNumber = value;
    }

    /**
     * Gets the value of the plateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateCode() {
        return plateCode;
    }

    /**
     * Sets the value of the plateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateCode(String value) {
        this.plateCode = value;
    }

    /**
     * Gets the value of the plateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateType() {
        return plateType;
    }

    /**
     * Sets the value of the plateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateType(String value) {
        this.plateType = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleMake() {
        return vehicleMake;
    }

    /**
     * Sets the value of the vehicleMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleMake(String value) {
        this.vehicleMake = value;
    }

    /**
     * Gets the value of the vehicleModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Sets the value of the vehicleModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    /**
     * Gets the value of the vehicleColour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleColour() {
        return vehicleColour;
    }

    /**
     * Sets the value of the vehicleColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleColour(String value) {
        this.vehicleColour = value;
    }

    /**
     * Gets the value of the yearoOfManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearoOfManufacture() {
        return yearoOfManufacture;
    }

    /**
     * Sets the value of the yearoOfManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearoOfManufacture(Integer value) {
        this.yearoOfManufacture = value;
    }

    /**
     * Gets the value of the distanceTravelled property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceTravelled() {
        return distanceTravelled;
    }

    /**
     * Sets the value of the distanceTravelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceTravelled(Double value) {
        this.distanceTravelled = value;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
    }

    /**
     * Gets the value of the scheduledPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledPickupDate() {
        return scheduledPickupDate;
    }

    /**
     * Sets the value of the scheduledPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledPickupDate(XMLGregorianCalendar value) {
        this.scheduledPickupDate = value;
    }

    /**
     * Gets the value of the scheduledDropOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDropOffDate() {
        return scheduledDropOffDate;
    }

    /**
     * Sets the value of the scheduledDropOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDropOffDate(XMLGregorianCalendar value) {
        this.scheduledDropOffDate = value;
    }

    /**
     * Gets the value of the actualPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualPickupDate() {
        return actualPickupDate;
    }

    /**
     * Sets the value of the actualPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualPickupDate(XMLGregorianCalendar value) {
        this.actualPickupDate = value;
    }

    /**
     * Gets the value of the actualRenewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualRenewalDate() {
        return actualRenewalDate;
    }

    /**
     * Sets the value of the actualRenewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualRenewalDate(XMLGregorianCalendar value) {
        this.actualRenewalDate = value;
    }

    /**
     * Gets the value of the actualDropOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDropOffDate() {
        return actualDropOffDate;
    }

    /**
     * Sets the value of the actualDropOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDropOffDate(XMLGregorianCalendar value) {
        this.actualDropOffDate = value;
    }

    /**
     * Gets the value of the locationtoPickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationtoPickup() {
        return locationtoPickup;
    }

    /**
     * Sets the value of the locationtoPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationtoPickup(String value) {
        this.locationtoPickup = value;
    }

    /**
     * Gets the value of the locationtoDropoff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationtoDropoff() {
        return locationtoDropoff;
    }

    /**
     * Sets the value of the locationtoDropoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationtoDropoff(String value) {
        this.locationtoDropoff = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the contactNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber1() {
        return contactNumber1;
    }

    /**
     * Sets the value of the contactNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber1(String value) {
        this.contactNumber1 = value;
    }

    /**
     * Gets the value of the contactNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber2() {
        return contactNumber2;
    }

    /**
     * Sets the value of the contactNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber2(String value) {
        this.contactNumber2 = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationName(String value) {
        this.organisationName = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the organisationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationNumber() {
        return organisationNumber;
    }

    /**
     * Sets the value of the organisationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationNumber(String value) {
        this.organisationNumber = value;
    }

}
