
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TelephoneEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneEventSourceType"/>
 *         &lt;element name="NumberIssued" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneNumberType" minOccurs="0"/>
 *         &lt;element name="NumberIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NumberReleased" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneNumberType" minOccurs="0"/>
 *         &lt;element name="NumberReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DeActivationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TelephoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationofIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MethodofRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TelephoneEventType", propOrder = {
    "eventSource",
    "numberIssued",
    "numberIssueDate",
    "numberReleased",
    "numberReleaseDate",
    "simSerialNumber",
    "activationDate",
    "deActivationDate",
    "telephoneType",
    "locationofIssue",
    "releaseDate",
    "methodofRelease",
    "cardType",
    "contactNumber1",
    "contactNumber2",
    "email",
    "organisationName",
    "jobTitle",
    "organisationNumber"
})
public class TelephoneEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected TelephoneEventSourceType eventSource;
    @XmlElement(name = "NumberIssued")
    protected TelephoneNumberType numberIssued;
    @XmlElement(name = "NumberIssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar numberIssueDate;
    @XmlElement(name = "NumberReleased")
    protected TelephoneNumberType numberReleased;
    @XmlElement(name = "NumberReleaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar numberReleaseDate;
    @XmlElement(name = "SimSerialNumber")
    protected String simSerialNumber;
    @XmlElement(name = "ActivationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(name = "DeActivationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deActivationDate;
    @XmlElement(name = "TelephoneType")
    protected String telephoneType;
    @XmlElement(name = "LocationofIssue")
    protected String locationofIssue;
    @XmlElement(name = "ReleaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDate;
    @XmlElement(name = "MethodofRelease")
    protected String methodofRelease;
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
     *     {@link TelephoneEventSourceType }
     *     
     */
    public TelephoneEventSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneEventSourceType }
     *     
     */
    public void setEventSource(TelephoneEventSourceType value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the numberIssued property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberType }
     *     
     */
    public TelephoneNumberType getNumberIssued() {
        return numberIssued;
    }

    /**
     * Sets the value of the numberIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberType }
     *     
     */
    public void setNumberIssued(TelephoneNumberType value) {
        this.numberIssued = value;
    }

    /**
     * Gets the value of the numberIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNumberIssueDate() {
        return numberIssueDate;
    }

    /**
     * Sets the value of the numberIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNumberIssueDate(XMLGregorianCalendar value) {
        this.numberIssueDate = value;
    }

    /**
     * Gets the value of the numberReleased property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberType }
     *     
     */
    public TelephoneNumberType getNumberReleased() {
        return numberReleased;
    }

    /**
     * Sets the value of the numberReleased property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberType }
     *     
     */
    public void setNumberReleased(TelephoneNumberType value) {
        this.numberReleased = value;
    }

    /**
     * Gets the value of the numberReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNumberReleaseDate() {
        return numberReleaseDate;
    }

    /**
     * Sets the value of the numberReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNumberReleaseDate(XMLGregorianCalendar value) {
        this.numberReleaseDate = value;
    }

    /**
     * Gets the value of the simSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimSerialNumber() {
        return simSerialNumber;
    }

    /**
     * Sets the value of the simSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimSerialNumber(String value) {
        this.simSerialNumber = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the deActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeActivationDate() {
        return deActivationDate;
    }

    /**
     * Sets the value of the deActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeActivationDate(XMLGregorianCalendar value) {
        this.deActivationDate = value;
    }

    /**
     * Gets the value of the telephoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneType() {
        return telephoneType;
    }

    /**
     * Sets the value of the telephoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneType(String value) {
        this.telephoneType = value;
    }

    /**
     * Gets the value of the locationofIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationofIssue() {
        return locationofIssue;
    }

    /**
     * Sets the value of the locationofIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationofIssue(String value) {
        this.locationofIssue = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the methodofRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodofRelease() {
        return methodofRelease;
    }

    /**
     * Sets the value of the methodofRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodofRelease(String value) {
        this.methodofRelease = value;
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
