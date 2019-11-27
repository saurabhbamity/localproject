
package aero.sita.iborders.external.common.commondomaintypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.external.identity.identitytypes.v1.TravelDocumentType;


/**
 * <p>Java class for TravelDocumentCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDocumentCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}TravelDocType" minOccurs="0"/>
 *         &lt;element name="SubType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}TravelDocSubType" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}TravelDocNumberType" minOccurs="0"/>
 *         &lt;element name="AdditionalDocumentNumber" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}TravelDocNumberType" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IssuePlace" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}DocumentIssuePlaceType" minOccurs="0"/>
 *         &lt;element name="IssueCountry" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
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
@XmlType(name = "TravelDocumentCommonType", propOrder = {
    "type",
    "subType",
    "number",
    "additionalDocumentNumber",
    "issueDate",
    "issuePlace",
    "issueCountry",
    "expiryDate"
})
@XmlSeeAlso({
    TravelDocumentType.class
})
public class TravelDocumentCommonType {

    @XmlElement(name = "Type")
    protected TravelDocType type;
    @XmlElement(name = "SubType")
    protected String subType;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "AdditionalDocumentNumber")
    protected String additionalDocumentNumber;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "IssuePlace")
    protected String issuePlace;
    @XmlElement(name = "IssueCountry")
    protected String issueCountry;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocType }
     *     
     */
    public TravelDocType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocType }
     *     
     */
    public void setType(TravelDocType value) {
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
     * Gets the value of the additionalDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDocumentNumber() {
        return additionalDocumentNumber;
    }

    /**
     * Sets the value of the additionalDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDocumentNumber(String value) {
        this.additionalDocumentNumber = value;
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
