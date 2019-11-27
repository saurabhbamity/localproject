
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TraveldocType"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentIssueCountry" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="DocumentIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DocumentIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsEndorsee" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentSearchCriteriaType", propOrder = {
    "document",
    "documentNumber",
    "documentIssueCountry",
    "documentIssueDate",
    "documentIssuePlace"
})
public class DocumentSearchCriteriaType {

    @XmlElement(name = "Document", required = true)
    protected TraveldocType document;
    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentIssueCountry")
    protected String documentIssueCountry;
    @XmlElement(name = "DocumentIssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentIssueDate;
    @XmlElement(name = "DocumentIssuePlace")
    protected String documentIssuePlace;
    @XmlAttribute(name = "IsEndorsee")
    protected Boolean isEndorsee;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link TraveldocType }
     *     
     */
    public TraveldocType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraveldocType }
     *     
     */
    public void setDocument(TraveldocType value) {
        this.document = value;
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
     * Gets the value of the documentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentIssueDate() {
        return documentIssueDate;
    }

    /**
     * Sets the value of the documentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentIssueDate(XMLGregorianCalendar value) {
        this.documentIssueDate = value;
    }

    /**
     * Gets the value of the documentIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssuePlace() {
        return documentIssuePlace;
    }

    /**
     * Sets the value of the documentIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssuePlace(String value) {
        this.documentIssuePlace = value;
    }

    /**
     * Gets the value of the isEndorsee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEndorsee() {
        return isEndorsee;
    }

    /**
     * Sets the value of the isEndorsee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEndorsee(Boolean value) {
        this.isEndorsee = value;
    }

}
