
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PropertyRentalEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyRentalEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PropertyRentalEventSourceType"/>
 *         &lt;element name="PropertyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}AddressType"/>
 *         &lt;element name="ScheduledArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ContactNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EmailType" minOccurs="0"/>
 *         &lt;element name="OrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganisationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LandlordData" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LandlordDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyRentalEventType", propOrder = {
    "eventSource",
    "propertyIdentifier",
    "address",
    "scheduledArrivalDate",
    "scheduledDepartureDate",
    "actualArrivalDate",
    "actualDepartureDate",
    "contactNumber1",
    "contactNumber2",
    "email",
    "organisationName",
    "jobTitle",
    "organisationNumber",
    "landlordData"
})
public class PropertyRentalEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected PropertyRentalEventSourceType eventSource;
    @XmlElement(name = "PropertyIdentifier")
    protected String propertyIdentifier;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
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
    @XmlElement(name = "LandlordData")
    protected LandlordDataType landlordData;

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyRentalEventSourceType }
     *     
     */
    public PropertyRentalEventSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyRentalEventSourceType }
     *     
     */
    public void setEventSource(PropertyRentalEventSourceType value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the propertyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyIdentifier() {
        return propertyIdentifier;
    }

    /**
     * Sets the value of the propertyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyIdentifier(String value) {
        this.propertyIdentifier = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
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

    /**
     * Gets the value of the landlordData property.
     * 
     * @return
     *     possible object is
     *     {@link LandlordDataType }
     *     
     */
    public LandlordDataType getLandlordData() {
        return landlordData;
    }

    /**
     * Sets the value of the landlordData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandlordDataType }
     *     
     */
    public void setLandlordData(LandlordDataType value) {
        this.landlordData = value;
    }

}
