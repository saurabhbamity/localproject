
package aero.sita.iborders.aras.commontypes.v8_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Visa Data.
 * 
 * <p>Java class for VisaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaSponsorDetailsGroup"/>
 *         &lt;group ref="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaExternalEntityDetailsGroup"/>
 *         &lt;element name="PrintDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="UsebyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StayExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="GrantedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceofGrant" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="PlaceofIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrantDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VisaUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreviousVisaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentVisaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedDepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LengthofStay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;group ref="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaDependentUponDetailsGroup"/>
 *         &lt;element name="FinalExitIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GCCResidency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuotaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuotaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MothersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationSubmittedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ApplicationLastUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActioningOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActioningLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaPortalUserAccount" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaPortalUserAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaDataType", propOrder = {
    "sponsorNationalId",
    "sponsorOrganisationNumber",
    "sponsorName",
    "localisedSponsorName",
    "sponsorGroup",
    "sponsorEmailId",
    "sponsorTelephoneNumber",
    "sponsorAddress",
    "externalEntityOrganisationNumber",
    "externalEntityName",
    "localisedExternalEntityName",
    "externalEntityType",
    "externalEntityEmailId",
    "externalEntityTelephoneNumber",
    "externalEntityAddress",
    "printDate",
    "usebyDate",
    "expiryDate",
    "stayExpiryDate",
    "grantedBy",
    "placeofGrant",
    "placeofIssue",
    "grantDate",
    "cancelDate",
    "visaUsedIndicator",
    "previousVisaNumber",
    "currentVisaNumber",
    "occupation",
    "expectedDepartureDate",
    "lengthofStay",
    "dependentVisaNumber",
    "dependentFullname",
    "dependentRelationship",
    "dependentNationalId",
    "dependentDocumentNumber",
    "dependentDocumentCountryOfIssue",
    "dependentNationality",
    "finalExitIndicator",
    "maritalStatus",
    "gccResidency",
    "quotaType",
    "quotaNumber",
    "mothersName",
    "applicationNumber",
    "applicationSubmittedDate",
    "applicationLastUpdatedDate",
    "actioningOfficer",
    "actioningLocation",
    "visaPortalUserAccount"
})
@XmlSeeAlso({
    VisaApplicationDataType.class,
    VisaReferenceDataType.class
})
public class VisaDataType {

    @XmlElement(name = "SponsorNationalId")
    protected String sponsorNationalId;
    @XmlElement(name = "SponsorOrganisationNumber")
    protected String sponsorOrganisationNumber;
    @XmlElement(name = "SponsorName")
    protected String sponsorName;
    @XmlElement(name = "LocalisedSponsorName")
    protected String localisedSponsorName;
    @XmlElement(name = "SponsorGroup")
    protected String sponsorGroup;
    @XmlElement(name = "SponsorEmailId")
    protected String sponsorEmailId;
    @XmlElement(name = "SponsorTelephoneNumber")
    protected String sponsorTelephoneNumber;
    @XmlElement(name = "SponsorAddress")
    protected String sponsorAddress;
    @XmlElement(name = "ExternalEntityOrganisationNumber")
    protected String externalEntityOrganisationNumber;
    @XmlElement(name = "ExternalEntityName")
    protected String externalEntityName;
    @XmlElement(name = "LocalisedExternalEntityName")
    protected String localisedExternalEntityName;
    @XmlElement(name = "ExternalEntityType")
    protected String externalEntityType;
    @XmlElement(name = "ExternalEntityEmailId")
    protected String externalEntityEmailId;
    @XmlElement(name = "ExternalEntityTelephoneNumber")
    protected String externalEntityTelephoneNumber;
    @XmlElement(name = "ExternalEntityAddress")
    protected String externalEntityAddress;
    @XmlElement(name = "PrintDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar printDate;
    @XmlElement(name = "UsebyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar usebyDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "StayExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stayExpiryDate;
    @XmlElement(name = "GrantedBy")
    protected String grantedBy;
    @XmlElement(name = "PlaceofGrant")
    protected String placeofGrant;
    @XmlElement(name = "PlaceofIssue")
    protected String placeofIssue;
    @XmlElement(name = "GrantDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar grantDate;
    @XmlElement(name = "CancelDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancelDate;
    @XmlElement(name = "VisaUsedIndicator")
    protected Boolean visaUsedIndicator;
    @XmlElement(name = "PreviousVisaNumber")
    protected String previousVisaNumber;
    @XmlElement(name = "CurrentVisaNumber")
    protected String currentVisaNumber;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "ExpectedDepartureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedDepartureDate;
    @XmlElement(name = "LengthofStay")
    protected BigInteger lengthofStay;
    @XmlElement(name = "DependentVisaNumber")
    protected String dependentVisaNumber;
    @XmlElement(name = "DependentFullname")
    protected String dependentFullname;
    @XmlElement(name = "DependentRelationship")
    protected String dependentRelationship;
    @XmlElement(name = "DependentNationalId")
    protected String dependentNationalId;
    @XmlElement(name = "DependentDocumentNumber")
    protected String dependentDocumentNumber;
    @XmlElement(name = "DependentDocumentCountryOfIssue")
    protected String dependentDocumentCountryOfIssue;
    @XmlElement(name = "DependentNationality")
    protected String dependentNationality;
    @XmlElement(name = "FinalExitIndicator")
    protected Boolean finalExitIndicator;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "GCCResidency")
    protected String gccResidency;
    @XmlElement(name = "QuotaType")
    protected String quotaType;
    @XmlElement(name = "QuotaNumber")
    protected String quotaNumber;
    @XmlElement(name = "MothersName")
    protected String mothersName;
    @XmlElement(name = "ApplicationNumber")
    protected String applicationNumber;
    @XmlElement(name = "ApplicationSubmittedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationSubmittedDate;
    @XmlElement(name = "ApplicationLastUpdatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationLastUpdatedDate;
    @XmlElement(name = "ActioningOfficer")
    protected String actioningOfficer;
    @XmlElement(name = "ActioningLocation")
    protected String actioningLocation;
    @XmlElement(name = "VisaPortalUserAccount")
    protected VisaPortalUserAccountType visaPortalUserAccount;

    /**
     * Gets the value of the sponsorNationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorNationalId() {
        return sponsorNationalId;
    }

    /**
     * Sets the value of the sponsorNationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorNationalId(String value) {
        this.sponsorNationalId = value;
    }

    /**
     * Gets the value of the sponsorOrganisationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorOrganisationNumber() {
        return sponsorOrganisationNumber;
    }

    /**
     * Sets the value of the sponsorOrganisationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorOrganisationNumber(String value) {
        this.sponsorOrganisationNumber = value;
    }

    /**
     * Gets the value of the sponsorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorName() {
        return sponsorName;
    }

    /**
     * Sets the value of the sponsorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorName(String value) {
        this.sponsorName = value;
    }

    /**
     * Gets the value of the localisedSponsorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisedSponsorName() {
        return localisedSponsorName;
    }

    /**
     * Sets the value of the localisedSponsorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisedSponsorName(String value) {
        this.localisedSponsorName = value;
    }

    /**
     * Gets the value of the sponsorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorGroup() {
        return sponsorGroup;
    }

    /**
     * Sets the value of the sponsorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorGroup(String value) {
        this.sponsorGroup = value;
    }

    /**
     * Gets the value of the sponsorEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorEmailId() {
        return sponsorEmailId;
    }

    /**
     * Sets the value of the sponsorEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorEmailId(String value) {
        this.sponsorEmailId = value;
    }

    /**
     * Gets the value of the sponsorTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorTelephoneNumber() {
        return sponsorTelephoneNumber;
    }

    /**
     * Sets the value of the sponsorTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorTelephoneNumber(String value) {
        this.sponsorTelephoneNumber = value;
    }

    /**
     * Gets the value of the sponsorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorAddress() {
        return sponsorAddress;
    }

    /**
     * Sets the value of the sponsorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorAddress(String value) {
        this.sponsorAddress = value;
    }

    /**
     * Gets the value of the externalEntityOrganisationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEntityOrganisationNumber() {
        return externalEntityOrganisationNumber;
    }

    /**
     * Sets the value of the externalEntityOrganisationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEntityOrganisationNumber(String value) {
        this.externalEntityOrganisationNumber = value;
    }

    /**
     * Gets the value of the externalEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEntityName() {
        return externalEntityName;
    }

    /**
     * Sets the value of the externalEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEntityName(String value) {
        this.externalEntityName = value;
    }

    /**
     * Gets the value of the localisedExternalEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisedExternalEntityName() {
        return localisedExternalEntityName;
    }

    /**
     * Sets the value of the localisedExternalEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisedExternalEntityName(String value) {
        this.localisedExternalEntityName = value;
    }

    /**
     * Gets the value of the externalEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEntityType() {
        return externalEntityType;
    }

    /**
     * Sets the value of the externalEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEntityType(String value) {
        this.externalEntityType = value;
    }

    /**
     * Gets the value of the externalEntityEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEntityEmailId() {
        return externalEntityEmailId;
    }

    /**
     * Sets the value of the externalEntityEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEntityEmailId(String value) {
        this.externalEntityEmailId = value;
    }

    /**
     * Gets the value of the externalEntityTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEntityTelephoneNumber() {
        return externalEntityTelephoneNumber;
    }

    /**
     * Sets the value of the externalEntityTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEntityTelephoneNumber(String value) {
        this.externalEntityTelephoneNumber = value;
    }

    /**
     * Gets the value of the externalEntityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEntityAddress() {
        return externalEntityAddress;
    }

    /**
     * Sets the value of the externalEntityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEntityAddress(String value) {
        this.externalEntityAddress = value;
    }

    /**
     * Gets the value of the printDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintDate() {
        return printDate;
    }

    /**
     * Sets the value of the printDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintDate(XMLGregorianCalendar value) {
        this.printDate = value;
    }

    /**
     * Gets the value of the usebyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsebyDate() {
        return usebyDate;
    }

    /**
     * Sets the value of the usebyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsebyDate(XMLGregorianCalendar value) {
        this.usebyDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the stayExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStayExpiryDate() {
        return stayExpiryDate;
    }

    /**
     * Sets the value of the stayExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStayExpiryDate(XMLGregorianCalendar value) {
        this.stayExpiryDate = value;
    }

    /**
     * Gets the value of the grantedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantedBy() {
        return grantedBy;
    }

    /**
     * Sets the value of the grantedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantedBy(String value) {
        this.grantedBy = value;
    }

    /**
     * Gets the value of the placeofGrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceofGrant() {
        return placeofGrant;
    }

    /**
     * Sets the value of the placeofGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceofGrant(String value) {
        this.placeofGrant = value;
    }

    /**
     * Gets the value of the placeofIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceofIssue() {
        return placeofIssue;
    }

    /**
     * Sets the value of the placeofIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceofIssue(String value) {
        this.placeofIssue = value;
    }

    /**
     * Gets the value of the grantDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGrantDate() {
        return grantDate;
    }

    /**
     * Sets the value of the grantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGrantDate(XMLGregorianCalendar value) {
        this.grantDate = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the visaUsedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisaUsedIndicator() {
        return visaUsedIndicator;
    }

    /**
     * Sets the value of the visaUsedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisaUsedIndicator(Boolean value) {
        this.visaUsedIndicator = value;
    }

    /**
     * Gets the value of the previousVisaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousVisaNumber() {
        return previousVisaNumber;
    }

    /**
     * Sets the value of the previousVisaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousVisaNumber(String value) {
        this.previousVisaNumber = value;
    }

    /**
     * Gets the value of the currentVisaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentVisaNumber() {
        return currentVisaNumber;
    }

    /**
     * Sets the value of the currentVisaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentVisaNumber(String value) {
        this.currentVisaNumber = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the expectedDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDepartureDate() {
        return expectedDepartureDate;
    }

    /**
     * Sets the value of the expectedDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDepartureDate(XMLGregorianCalendar value) {
        this.expectedDepartureDate = value;
    }

    /**
     * Gets the value of the lengthofStay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLengthofStay() {
        return lengthofStay;
    }

    /**
     * Sets the value of the lengthofStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLengthofStay(BigInteger value) {
        this.lengthofStay = value;
    }

    /**
     * Gets the value of the dependentVisaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentVisaNumber() {
        return dependentVisaNumber;
    }

    /**
     * Sets the value of the dependentVisaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentVisaNumber(String value) {
        this.dependentVisaNumber = value;
    }

    /**
     * Gets the value of the dependentFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentFullname() {
        return dependentFullname;
    }

    /**
     * Sets the value of the dependentFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentFullname(String value) {
        this.dependentFullname = value;
    }

    /**
     * Gets the value of the dependentRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentRelationship() {
        return dependentRelationship;
    }

    /**
     * Sets the value of the dependentRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentRelationship(String value) {
        this.dependentRelationship = value;
    }

    /**
     * Gets the value of the dependentNationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentNationalId() {
        return dependentNationalId;
    }

    /**
     * Sets the value of the dependentNationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentNationalId(String value) {
        this.dependentNationalId = value;
    }

    /**
     * Gets the value of the dependentDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentDocumentNumber() {
        return dependentDocumentNumber;
    }

    /**
     * Sets the value of the dependentDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentDocumentNumber(String value) {
        this.dependentDocumentNumber = value;
    }

    /**
     * Gets the value of the dependentDocumentCountryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentDocumentCountryOfIssue() {
        return dependentDocumentCountryOfIssue;
    }

    /**
     * Sets the value of the dependentDocumentCountryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentDocumentCountryOfIssue(String value) {
        this.dependentDocumentCountryOfIssue = value;
    }

    /**
     * Gets the value of the dependentNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentNationality() {
        return dependentNationality;
    }

    /**
     * Sets the value of the dependentNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentNationality(String value) {
        this.dependentNationality = value;
    }

    /**
     * Gets the value of the finalExitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalExitIndicator() {
        return finalExitIndicator;
    }

    /**
     * Sets the value of the finalExitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalExitIndicator(Boolean value) {
        this.finalExitIndicator = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the gccResidency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCCResidency() {
        return gccResidency;
    }

    /**
     * Sets the value of the gccResidency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCCResidency(String value) {
        this.gccResidency = value;
    }

    /**
     * Gets the value of the quotaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaType() {
        return quotaType;
    }

    /**
     * Sets the value of the quotaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaType(String value) {
        this.quotaType = value;
    }

    /**
     * Gets the value of the quotaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaNumber() {
        return quotaNumber;
    }

    /**
     * Sets the value of the quotaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaNumber(String value) {
        this.quotaNumber = value;
    }

    /**
     * Gets the value of the mothersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersName() {
        return mothersName;
    }

    /**
     * Sets the value of the mothersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersName(String value) {
        this.mothersName = value;
    }

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNumber(String value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the applicationSubmittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationSubmittedDate() {
        return applicationSubmittedDate;
    }

    /**
     * Sets the value of the applicationSubmittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationSubmittedDate(XMLGregorianCalendar value) {
        this.applicationSubmittedDate = value;
    }

    /**
     * Gets the value of the applicationLastUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationLastUpdatedDate() {
        return applicationLastUpdatedDate;
    }

    /**
     * Sets the value of the applicationLastUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationLastUpdatedDate(XMLGregorianCalendar value) {
        this.applicationLastUpdatedDate = value;
    }

    /**
     * Gets the value of the actioningOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActioningOfficer() {
        return actioningOfficer;
    }

    /**
     * Sets the value of the actioningOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActioningOfficer(String value) {
        this.actioningOfficer = value;
    }

    /**
     * Gets the value of the actioningLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActioningLocation() {
        return actioningLocation;
    }

    /**
     * Sets the value of the actioningLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActioningLocation(String value) {
        this.actioningLocation = value;
    }

    /**
     * Gets the value of the visaPortalUserAccount property.
     * 
     * @return
     *     possible object is
     *     {@link VisaPortalUserAccountType }
     *     
     */
    public VisaPortalUserAccountType getVisaPortalUserAccount() {
        return visaPortalUserAccount;
    }

    /**
     * Sets the value of the visaPortalUserAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaPortalUserAccountType }
     *     
     */
    public void setVisaPortalUserAccount(VisaPortalUserAccountType value) {
        this.visaPortalUserAccount = value;
    }

}
