
package aero.sita.iborders.aras.commontypes.v8_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HotelEventSourceType"/>
 *         &lt;element name="BookingReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualRoomchangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumberofRooms" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberofOccupants" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
@XmlType(name = "HotelEventType", propOrder = {
    "eventSource",
    "bookingReference",
    "roomNumber",
    "scheduledArrivalDate",
    "scheduledDepartureDate",
    "actualArrivalDate",
    "actualDepartureDate",
    "actualRoomchangeDate",
    "numberofRooms",
    "numberofOccupants",
    "cardType",
    "contactNumber1",
    "contactNumber2",
    "email",
    "organisationName",
    "jobTitle",
    "organisationNumber"
})
public class HotelEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected HotelEventSourceType eventSource;
    @XmlElement(name = "BookingReference")
    protected String bookingReference;
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;
    @XmlElement(name = "ScheduledArrivalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrivalDate;
    @XmlElement(name = "ScheduledDepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepartureDate;
    @XmlElement(name = "ActualArrivalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualArrivalDate;
    @XmlElement(name = "ActualDepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDepartureDate;
    @XmlElement(name = "ActualRoomchangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualRoomchangeDate;
    @XmlElement(name = "NumberofRooms")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberofRooms;
    @XmlElement(name = "NumberofOccupants")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberofOccupants;
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
     *     {@link HotelEventSourceType }
     *     
     */
    public HotelEventSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelEventSourceType }
     *     
     */
    public void setEventSource(HotelEventSourceType value) {
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
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the scheduledArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrivalDate() {
        return scheduledArrivalDate;
    }

    /**
     * Sets the value of the scheduledArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrivalDate(XMLGregorianCalendar value) {
        this.scheduledArrivalDate = value;
    }

    /**
     * Gets the value of the scheduledDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepartureDate() {
        return scheduledDepartureDate;
    }

    /**
     * Sets the value of the scheduledDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepartureDate(XMLGregorianCalendar value) {
        this.scheduledDepartureDate = value;
    }

    /**
     * Gets the value of the actualArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualArrivalDate() {
        return actualArrivalDate;
    }

    /**
     * Sets the value of the actualArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualArrivalDate(XMLGregorianCalendar value) {
        this.actualArrivalDate = value;
    }

    /**
     * Gets the value of the actualDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDepartureDate() {
        return actualDepartureDate;
    }

    /**
     * Sets the value of the actualDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDepartureDate(XMLGregorianCalendar value) {
        this.actualDepartureDate = value;
    }

    /**
     * Gets the value of the actualRoomchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualRoomchangeDate() {
        return actualRoomchangeDate;
    }

    /**
     * Sets the value of the actualRoomchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualRoomchangeDate(XMLGregorianCalendar value) {
        this.actualRoomchangeDate = value;
    }

    /**
     * Gets the value of the numberofRooms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofRooms() {
        return numberofRooms;
    }

    /**
     * Sets the value of the numberofRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofRooms(BigInteger value) {
        this.numberofRooms = value;
    }

    /**
     * Gets the value of the numberofOccupants property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofOccupants() {
        return numberofOccupants;
    }

    /**
     * Sets the value of the numberofOccupants property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofOccupants(BigInteger value) {
        this.numberofOccupants = value;
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
