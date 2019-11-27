
package aero.sita.iborders.external.identity.identitytypes.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.external.common.commondomaintypes.v2.IdentityCommonType;
import aero.sita.iborders.external.common.commontypes.v1.AddressesType;
import aero.sita.iborders.external.common.commontypes.v1.ContactInfoType;
import aero.sita.iborders.external.common.commontypes.v1.GenderType;


/**
 * Contains details of a person's Identity.
 * 
 * <p>Java class for IdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}IdentityCommonType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IdentityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}TitleType" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}GenderType" minOccurs="0"/>
 *         &lt;element name="CountryofResidence" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="ImageURI" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}ImageIdType" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}AddressesType" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}ContactInfoType" minOccurs="0"/>
 *         &lt;element name="TravelDocument" type="{http://sita.aero/iborders/external/identity/IdentityTypes/V2}TravelDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "identityId",
    "title",
    "gender",
    "countryofResidence",
    "imageURI",
    "addresses",
    "contactInfo",
    "travelDocument",
    "createdDate"
})
public class IdentityType
    extends IdentityCommonType
{

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "IdentityId")
    protected Long identityId;
    @XmlElement(name = "Title")
    protected String title;
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

}
