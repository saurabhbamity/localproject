
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VisaDocumentDetailsCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaDocumentDetailsCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}VisaNumberType"/>
 *         &lt;element name="UseByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}VisaDocType" minOccurs="0"/>
 *         &lt;element name="SubType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TravelDocSubType" minOccurs="0"/>
 *         &lt;element name="IssuePlace" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}DocumentIssuePlaceType" minOccurs="0"/>
 *         &lt;element name="IssueCountry" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}IsoCountryCodeType" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StayExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PrintDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PrintLocation" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}DocumentIssuePlaceType" minOccurs="0"/>
 *         &lt;element name="CancelDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IsUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LengthOfStay" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}VisaPeriodType" minOccurs="0"/>
 *         &lt;element name="StayType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}VisaStayDataType" minOccurs="0"/>
 *         &lt;element name="NumberOfEntries" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}VisaNoOfEntriesType" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}VisaPeriodType" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaDocumentDetailsCommonType", propOrder = {
    "number",
    "useByDate",
    "type",
    "subType",
    "issuePlace",
    "issueCountry",
    "issueDate",
    "stayExpiryDate",
    "printDate",
    "printLocation",
    "cancelDate",
    "isUsed",
    "lengthOfStay",
    "stayType",
    "numberOfEntries",
    "validityPeriod",
    "expiryDate"
})
public class VisaDocumentDetailsCommonType {

    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "UseByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar useByDate;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "SubType")
    protected String subType;
    @XmlElement(name = "IssuePlace")
    protected String issuePlace;
    @XmlElement(name = "IssueCountry")
    protected String issueCountry;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "StayExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stayExpiryDate;
    @XmlElement(name = "PrintDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar printDate;
    @XmlElement(name = "PrintLocation")
    protected String printLocation;
    @XmlElement(name = "CancelDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancelDate;
    @XmlElement(name = "IsUsed")
    protected Boolean isUsed;
    @XmlElement(name = "LengthOfStay")
    protected String lengthOfStay;
    @XmlElement(name = "StayType")
    protected VisaStayDataType stayType;
    @XmlElement(name = "NumberOfEntries")
    protected VisaNoOfEntriesType numberOfEntries;
    @XmlElement(name = "ValidityPeriod")
    protected String validityPeriod;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the useByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUseByDate() {
        return useByDate;
    }

    /**
     * Sets the value of the useByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUseByDate(XMLGregorianCalendar value) {
        this.useByDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the issuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuePlace() {
        return issuePlace;
    }

    /**
     * Sets the value of the issuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuePlace(String value) {
        this.issuePlace = value;
    }

    /**
     * Gets the value of the issueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueCountry() {
        return issueCountry;
    }

    /**
     * Sets the value of the issueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueCountry(String value) {
        this.issueCountry = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
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
     * Gets the value of the printLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintLocation() {
        return printLocation;
    }

    /**
     * Sets the value of the printLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintLocation(String value) {
        this.printLocation = value;
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
     * Gets the value of the isUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUsed() {
        return isUsed;
    }

    /**
     * Sets the value of the isUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUsed(Boolean value) {
        this.isUsed = value;
    }

    /**
     * Gets the value of the lengthOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthOfStay() {
        return lengthOfStay;
    }

    /**
     * Sets the value of the lengthOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthOfStay(String value) {
        this.lengthOfStay = value;
    }

    /**
     * Gets the value of the stayType property.
     * 
     * @return
     *     possible object is
     *     {@link VisaStayDataType }
     *     
     */
    public VisaStayDataType getStayType() {
        return stayType;
    }

    /**
     * Sets the value of the stayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaStayDataType }
     *     
     */
    public void setStayType(VisaStayDataType value) {
        this.stayType = value;
    }

    /**
     * Gets the value of the numberOfEntries property.
     * 
     * @return
     *     possible object is
     *     {@link VisaNoOfEntriesType }
     *     
     */
    public VisaNoOfEntriesType getNumberOfEntries() {
        return numberOfEntries;
    }

    /**
     * Sets the value of the numberOfEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaNoOfEntriesType }
     *     
     */
    public void setNumberOfEntries(VisaNoOfEntriesType value) {
        this.numberOfEntries = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityPeriod(String value) {
        this.validityPeriod = value;
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

}
