
package aero.sita.iborders.external.eventservicewsdltypes.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.external.common.commondomaintypes.v2.TravelDocType;
import aero.sita.iborders.external.common.commontypes.v1.GenderType;


/**
 * Search criteria to use for identity.
 *             
 * 
 * <p>Java class for SearchIdentityCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchIdentityCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FamilyName" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}FamilyNameType" minOccurs="0"/>
 *         &lt;element name="GivenNames" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}GivenNamesType" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}GenderType" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TravelDocType" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TravelDocNumberType" minOccurs="0"/>
 *         &lt;element name="DocumentIssueCountry" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchIdentityCriteriaType", propOrder = {
    "identityId",
    "familyName",
    "givenNames",
    "gender",
    "documentType",
    "documentNumber",
    "documentIssueCountry",
    "birthDate",
    "nationality"
})
public class SearchIdentityCriteriaType {

    @XmlElement(name = "IdentityId")
    protected Long identityId;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "GivenNames")
    protected String givenNames;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "DocumentType")
    protected TravelDocType documentType;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "DocumentIssueCountry")
    protected String documentIssueCountry;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Nationality")
    protected String nationality;

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
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the givenNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNames() {
        return givenNames;
    }

    /**
     * Sets the value of the givenNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNames(String value) {
        this.givenNames = value;
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
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocType }
     *     
     */
    public TravelDocType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocType }
     *     
     */
    public void setDocumentType(TravelDocType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssueCountry() {
        return documentIssueCountry;
    }

    /**
     * Sets the value of the documentIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssueCountry(String value) {
        this.documentIssueCountry = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

}
