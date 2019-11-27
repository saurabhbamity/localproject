
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains details of a person's Identity.
 *             
 * 
 * <p>Java class for IdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}IdentityCommonType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NationalId" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *         &lt;element name="IdentityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MainApplicantPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MainApplicantIdentityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ScoringType" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}GenderType" minOccurs="0"/>
 *         &lt;element name="CountryofResidence" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="ImageURI" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ImageIdType" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}AddressesType" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ContactInfoType" minOccurs="0"/>
 *         &lt;element name="TravelDocument" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TravelDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserInfo" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}UserInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityType", propOrder = {
    "personId",
    "nationalId",
    "identityId",
    "mainApplicantPersonId",
    "mainApplicantIdentityId",
    "title",
    "score",
    "gender",
    "countryofResidence",
    "imageURI",
    "addresses",
    "contactInfo",
    "travelDocument",
    "createdDate",
    "userInfo"
})
public class IdentityType
    extends IdentityCommonType
{

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "NationalId")
    protected CodeType nationalId;
    @XmlElement(name = "IdentityId")
    protected Long identityId;
    @XmlElement(name = "MainApplicantPersonId")
    protected Long mainApplicantPersonId;
    @XmlElement(name = "MainApplicantIdentityId")
    protected Long mainApplicantIdentityId;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Score")
    protected ScoringType score;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "CountryofResidence")
    protected String countryofResidence;
    @XmlElement(name = "ImageURI")
    protected String imageURI;
    @XmlElement(name = "Addresses")
    protected AddressesType addresses;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "TravelDocument")
    protected List<TravelDocumentType> travelDocument;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "UserInfo")
    protected UserInfoType userInfo;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setNationalId(CodeType value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the identityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentityId() {
        return identityId;
    }

    /**
     * Sets the value of the identityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentityId(Long value) {
        this.identityId = value;
    }

    /**
     * Gets the value of the mainApplicantPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainApplicantPersonId() {
        return mainApplicantPersonId;
    }

    /**
     * Sets the value of the mainApplicantPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainApplicantPersonId(Long value) {
        this.mainApplicantPersonId = value;
    }

    /**
     * Gets the value of the mainApplicantIdentityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainApplicantIdentityId() {
        return mainApplicantIdentityId;
    }

    /**
     * Sets the value of the mainApplicantIdentityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainApplicantIdentityId(Long value) {
        this.mainApplicantIdentityId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link ScoringType }
     *     
     */
    public ScoringType getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoringType }
     *     
     */
    public void setScore(ScoringType value) {
        this.score = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the countryofResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryofResidence() {
        return countryofResidence;
    }

    /**
     * Sets the value of the countryofResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryofResidence(String value) {
        this.countryofResidence = value;
    }

    /**
     * Gets the value of the imageURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURI() {
        return imageURI;
    }

    /**
     * Sets the value of the imageURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURI(String value) {
        this.imageURI = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link AddressesType }
     *     
     */
    public AddressesType getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressesType }
     *     
     */
    public void setAddresses(AddressesType value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the travelDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocumentType }
     * 
     * 
     */
    public List<TravelDocumentType> getTravelDocument() {
        if (travelDocument == null) {
            travelDocument = new ArrayList<TravelDocumentType>();
        }
        return this.travelDocument;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType }
     *     
     */
    public UserInfoType getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType }
     *     
     */
    public void setUserInfo(UserInfoType value) {
        this.userInfo = value;
    }

}
