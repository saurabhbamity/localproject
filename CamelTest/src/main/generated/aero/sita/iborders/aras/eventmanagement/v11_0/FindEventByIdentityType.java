
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.aras.commontypes.v8_0.DateRangeType;
import aero.sita.iborders.aras.commontypes.v8_0.EventNameType;
import aero.sita.iborders.aras.commontypes.v8_0.GenderType;
import aero.sita.iborders.aras.commontypes.v8_0.IdentityCommonType;
import aero.sita.iborders.aras.commontypes.v8_0.OperatorType;
import aero.sita.iborders.aras.commontypes.v8_0.TraveldocType;


/**
 * Find Event by Identity
 * 
 * <p>Java class for FindEventByIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindEventByIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityCommon" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}IdentityCommonType" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}GenderType" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TraveldocType" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentIssueCountry" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="VisaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventName" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventNameType" minOccurs="0"/>
 *         &lt;element name="DateRange" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}DateRangeType" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}OperatorType" minOccurs="0"/>
 *         &lt;element name="ServiceCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ServiceCodeType" minOccurs="0"/>
 *         &lt;element name="ServiceNumber" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ServiceNumberType" minOccurs="0"/>
 *         &lt;element name="DeparturePort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ArrivalPort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindEventByIdentityType", propOrder = {
    "identityCommon",
    "gender",
    "documentType",
    "documentNumber",
    "documentIssueCountry",
    "visaNumber",
    "eventName",
    "dateRange",
    "operator",
    "serviceCode",
    "serviceNumber",
    "departurePort",
    "departureDateTime",
    "arrivalPort",
    "arrivalDateTime"
})
public class FindEventByIdentityType {

    @XmlElement(name = "IdentityCommon")
    protected IdentityCommonType identityCommon;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "DocumentType")
    protected TraveldocType documentType;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "DocumentIssueCountry")
    protected String documentIssueCountry;
    @XmlElement(name = "VisaNumber")
    protected String visaNumber;
    @XmlElement(name = "EventName")
    protected EventNameType eventName;
    @XmlElement(name = "DateRange")
    protected DateRangeType dateRange;
    @XmlElement(name = "Operator")
    protected OperatorType operator;
    @XmlElement(name = "ServiceCode")
    protected String serviceCode;
    @XmlElement(name = "ServiceNumber")
    protected String serviceNumber;
    @XmlElement(name = "DeparturePort")
    protected String departurePort;
    @XmlElement(name = "DepartureDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(name = "ArrivalPort")
    protected String arrivalPort;
    @XmlElement(name = "ArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;

    /**
     * Gets the value of the identityCommon property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityCommonType }
     *     
     */
    public IdentityCommonType getIdentityCommon() {
        return identityCommon;
    }

    /**
     * Sets the value of the identityCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityCommonType }
     *     
     */
    public void setIdentityCommon(IdentityCommonType value) {
        this.identityCommon = value;
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
     *     {@link TraveldocType }
     *     
     */
    public TraveldocType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraveldocType }
     *     
     */
    public void setDocumentType(TraveldocType value) {
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
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber(String value) {
        this.visaNumber = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link EventNameType }
     *     
     */
    public EventNameType getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventNameType }
     *     
     */
    public void setEventName(EventNameType value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setDateRange(DateRangeType value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorType }
     *     
     */
    public OperatorType getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorType }
     *     
     */
    public void setOperator(OperatorType value) {
        this.operator = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the value of the serviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Gets the value of the departurePort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeparturePort() {
        return departurePort;
    }

    /**
     * Sets the value of the departurePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparturePort(String value) {
        this.departurePort = value;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalPort() {
        return arrivalPort;
    }

    /**
     * Sets the value of the arrivalPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalPort(String value) {
        this.arrivalPort = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

}
