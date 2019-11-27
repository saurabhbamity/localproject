
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the details of the journey leg that the
 *                 traveller is on.
 *             
 * 
 * <p>Java class for ExpectedMovementEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedMovementEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ExpectedMovementEventSourceType"/>
 *         &lt;element name="ExpectedService" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ServiceType"/>
 *         &lt;element name="OriginCountry" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CountryCodeType"/>
 *         &lt;element name="DepartureCountry" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CountryCodeType"/>
 *         &lt;element name="OriginPort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType"/>
 *         &lt;element name="OriginPortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeparturePort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType"/>
 *         &lt;element name="DeparturePortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArrivalPort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType"/>
 *         &lt;element name="ArrivalPortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArrivalCountry" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="PrimaryWorkingPort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="SecondaryWorkingPort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="TransBorderPort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="TransBorderPortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledDepDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledArrDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CheckInPort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="CheckInPortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ServiceRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravellerType" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TravellerType"/>
 *         &lt;element name="TravelType" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TravelType"/>
 *         &lt;element name="AtRiskFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideCodeFlag" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}OverrideCodeType" minOccurs="0"/>
 *         &lt;element name="TransferPaxCrewInfo" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PaxCrewInfoType" minOccurs="0"/>
 *         &lt;element name="TransitPaxCrewInfo" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PaxCrewInfoType" minOccurs="0"/>
 *         &lt;element name="NormalPaxCrewInfo" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PaxCrewInfoType" minOccurs="0"/>
 *         &lt;element name="UnmatchedPaxCrewInfo" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PaxCrewInfoType" minOccurs="0"/>
 *         &lt;element name="OverrideDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OverrideNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideOfficerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementDirectionType"/>
 *         &lt;element name="HitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelCase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventDetailSources" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDetailSourceListType" minOccurs="0"/>
 *         &lt;element name="ExpectedMovementId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BusinessRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectiveMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravellerStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}StatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedMovementEventType", propOrder = {
    "eventSource",
    "expectedService",
    "originCountry",
    "departureCountry",
    "originPort",
    "originPortName",
    "departurePort",
    "departurePortName",
    "arrivalPort",
    "arrivalPortName",
    "arrivalCountry",
    "primaryWorkingPort",
    "secondaryWorkingPort",
    "transBorderPort",
    "transBorderPortName",
    "scheduledDepDateTime",
    "scheduledArrDateTime",
    "checkInPort",
    "checkInPortName",
    "checkInTime",
    "serviceRoute",
    "travellerType",
    "travelType",
    "atRiskFlag",
    "overrideCodeFlag",
    "transferPaxCrewInfo",
    "transitPaxCrewInfo",
    "normalPaxCrewInfo",
    "unmatchedPaxCrewInfo",
    "overrideDate",
    "overrideNote",
    "overrideOfficerName",
    "overrideAuthority",
    "fullStatus",
    "direction",
    "hitId",
    "hitStatus",
    "hitCode",
    "bookingReference",
    "clearance",
    "travelCase",
    "eventDetailSources",
    "expectedMovementId",
    "businessRule",
    "directiveMessage",
    "travellerStatus"
})
public class ExpectedMovementEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected ExpectedMovementEventSourceType eventSource;
    @XmlElement(name = "ExpectedService", required = true)
    protected ServiceType expectedService;
    @XmlElement(name = "OriginCountry", required = true)
    protected String originCountry;
    @XmlElement(name = "DepartureCountry", required = true)
    protected String departureCountry;
    @XmlElement(name = "OriginPort", required = true)
    protected String originPort;
    @XmlElement(name = "OriginPortName", required = true)
    protected String originPortName;
    @XmlElement(name = "DeparturePort", required = true)
    protected String departurePort;
    @XmlElement(name = "DeparturePortName", required = true)
    protected String departurePortName;
    @XmlElement(name = "ArrivalPort", required = true)
    protected String arrivalPort;
    @XmlElement(name = "ArrivalPortName", required = true)
    protected String arrivalPortName;
    @XmlElement(name = "ArrivalCountry")
    protected String arrivalCountry;
    @XmlElement(name = "PrimaryWorkingPort")
    protected String primaryWorkingPort;
    @XmlElement(name = "SecondaryWorkingPort")
    protected String secondaryWorkingPort;
    @XmlElement(name = "TransBorderPort")
    protected String transBorderPort;
    @XmlElement(name = "TransBorderPortName")
    protected String transBorderPortName;
    @XmlElement(name = "ScheduledDepDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepDateTime;
    @XmlElement(name = "ScheduledArrDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrDateTime;
    @XmlElement(name = "CheckInPort")
    protected String checkInPort;
    @XmlElement(name = "CheckInPortName")
    protected String checkInPortName;
    @XmlElement(name = "CheckInTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInTime;
    @XmlElement(name = "ServiceRoute")
    protected String serviceRoute;
    @XmlElement(name = "TravellerType", required = true)
    protected TravellerType travellerType;
    @XmlElement(name = "TravelType", required = true)
    protected TravelType travelType;
    @XmlElement(name = "AtRiskFlag")
    protected String atRiskFlag;
    @XmlElement(name = "OverrideCodeFlag")
    protected OverrideCodeType overrideCodeFlag;
    @XmlElement(name = "TransferPaxCrewInfo")
    protected PaxCrewInfoType transferPaxCrewInfo;
    @XmlElement(name = "TransitPaxCrewInfo")
    protected PaxCrewInfoType transitPaxCrewInfo;
    @XmlElement(name = "NormalPaxCrewInfo")
    protected PaxCrewInfoType normalPaxCrewInfo;
    @XmlElement(name = "UnmatchedPaxCrewInfo")
    protected PaxCrewInfoType unmatchedPaxCrewInfo;
    @XmlElement(name = "OverrideDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overrideDate;
    @XmlElement(name = "OverrideNote")
    protected String overrideNote;
    @XmlElement(name = "OverrideOfficerName")
    protected String overrideOfficerName;
    @XmlElement(name = "OverrideAuthority")
    protected String overrideAuthority;
    @XmlElement(name = "FullStatus")
    protected String fullStatus;
    @XmlElement(name = "Direction", required = true)
    protected MovementDirectionType direction;
    @XmlElement(name = "HitId")
    protected Long hitId;
    @XmlElement(name = "HitStatus")
    protected String hitStatus;
    @XmlElement(name = "HitCode")
    protected String hitCode;
    @XmlElement(name = "BookingReference")
    protected String bookingReference;
    @XmlElement(name = "Clearance")
    protected String clearance;
    @XmlElement(name = "TravelCase")
    protected String travelCase;
    @XmlElement(name = "EventDetailSources")
    protected EventDetailSourceListType eventDetailSources;
    @XmlElement(name = "ExpectedMovementId")
    protected long expectedMovementId;
    @XmlElement(name = "BusinessRule")
    protected String businessRule;
    @XmlElement(name = "DirectiveMessage")
    protected String directiveMessage;
    @XmlElement(name = "TravellerStatus")
    protected StatusCodeType travellerStatus;

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedMovementEventSourceType }
     *     
     */
    public ExpectedMovementEventSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedMovementEventSourceType }
     *     
     */
    public void setEventSource(ExpectedMovementEventSourceType value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the expectedService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getExpectedService() {
        return expectedService;
    }

    /**
     * Sets the value of the expectedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setExpectedService(ServiceType value) {
        this.expectedService = value;
    }

    /**
     * Gets the value of the originCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets the value of the originCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountry(String value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the departureCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /**
     * Sets the value of the departureCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCountry(String value) {
        this.departureCountry = value;
    }

    /**
     * Gets the value of the originPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPort() {
        return originPort;
    }

    /**
     * Sets the value of the originPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPort(String value) {
        this.originPort = value;
    }

    /**
     * Gets the value of the originPortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginPortName() {
        return originPortName;
    }

    /**
     * Sets the value of the originPortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginPortName(String value) {
        this.originPortName = value;
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
     * Gets the value of the departurePortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeparturePortName() {
        return departurePortName;
    }

    /**
     * Sets the value of the departurePortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparturePortName(String value) {
        this.departurePortName = value;
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
     * Gets the value of the arrivalPortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalPortName() {
        return arrivalPortName;
    }

    /**
     * Sets the value of the arrivalPortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalPortName(String value) {
        this.arrivalPortName = value;
    }

    /**
     * Gets the value of the arrivalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCountry() {
        return arrivalCountry;
    }

    /**
     * Sets the value of the arrivalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCountry(String value) {
        this.arrivalCountry = value;
    }

    /**
     * Gets the value of the primaryWorkingPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWorkingPort() {
        return primaryWorkingPort;
    }

    /**
     * Sets the value of the primaryWorkingPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWorkingPort(String value) {
        this.primaryWorkingPort = value;
    }

    /**
     * Gets the value of the secondaryWorkingPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryWorkingPort() {
        return secondaryWorkingPort;
    }

    /**
     * Sets the value of the secondaryWorkingPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryWorkingPort(String value) {
        this.secondaryWorkingPort = value;
    }

    /**
     * Gets the value of the transBorderPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransBorderPort() {
        return transBorderPort;
    }

    /**
     * Sets the value of the transBorderPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransBorderPort(String value) {
        this.transBorderPort = value;
    }

    /**
     * Gets the value of the transBorderPortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransBorderPortName() {
        return transBorderPortName;
    }

    /**
     * Sets the value of the transBorderPortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransBorderPortName(String value) {
        this.transBorderPortName = value;
    }

    /**
     * Gets the value of the scheduledDepDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDepDateTime() {
        return scheduledDepDateTime;
    }

    /**
     * Sets the value of the scheduledDepDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDepDateTime(XMLGregorianCalendar value) {
        this.scheduledDepDateTime = value;
    }

    /**
     * Gets the value of the scheduledArrDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledArrDateTime() {
        return scheduledArrDateTime;
    }

    /**
     * Sets the value of the scheduledArrDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledArrDateTime(XMLGregorianCalendar value) {
        this.scheduledArrDateTime = value;
    }

    /**
     * Gets the value of the checkInPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInPort() {
        return checkInPort;
    }

    /**
     * Sets the value of the checkInPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInPort(String value) {
        this.checkInPort = value;
    }

    /**
     * Gets the value of the checkInPortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInPortName() {
        return checkInPortName;
    }

    /**
     * Sets the value of the checkInPortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInPortName(String value) {
        this.checkInPortName = value;
    }

    /**
     * Gets the value of the checkInTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInTime() {
        return checkInTime;
    }

    /**
     * Sets the value of the checkInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInTime(XMLGregorianCalendar value) {
        this.checkInTime = value;
    }

    /**
     * Gets the value of the serviceRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRoute() {
        return serviceRoute;
    }

    /**
     * Sets the value of the serviceRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRoute(String value) {
        this.serviceRoute = value;
    }

    /**
     * Gets the value of the travellerType property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerType }
     *     
     */
    public TravellerType getTravellerType() {
        return travellerType;
    }

    /**
     * Sets the value of the travellerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerType }
     *     
     */
    public void setTravellerType(TravellerType value) {
        this.travellerType = value;
    }

    /**
     * Gets the value of the travelType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelType }
     *     
     */
    public TravelType getTravelType() {
        return travelType;
    }

    /**
     * Sets the value of the travelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelType }
     *     
     */
    public void setTravelType(TravelType value) {
        this.travelType = value;
    }

    /**
     * Gets the value of the atRiskFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtRiskFlag() {
        return atRiskFlag;
    }

    /**
     * Sets the value of the atRiskFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtRiskFlag(String value) {
        this.atRiskFlag = value;
    }

    /**
     * Gets the value of the overrideCodeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideCodeType }
     *     
     */
    public OverrideCodeType getOverrideCodeFlag() {
        return overrideCodeFlag;
    }

    /**
     * Sets the value of the overrideCodeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideCodeType }
     *     
     */
    public void setOverrideCodeFlag(OverrideCodeType value) {
        this.overrideCodeFlag = value;
    }

    /**
     * Gets the value of the transferPaxCrewInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public PaxCrewInfoType getTransferPaxCrewInfo() {
        return transferPaxCrewInfo;
    }

    /**
     * Sets the value of the transferPaxCrewInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public void setTransferPaxCrewInfo(PaxCrewInfoType value) {
        this.transferPaxCrewInfo = value;
    }

    /**
     * Gets the value of the transitPaxCrewInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public PaxCrewInfoType getTransitPaxCrewInfo() {
        return transitPaxCrewInfo;
    }

    /**
     * Sets the value of the transitPaxCrewInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public void setTransitPaxCrewInfo(PaxCrewInfoType value) {
        this.transitPaxCrewInfo = value;
    }

    /**
     * Gets the value of the normalPaxCrewInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public PaxCrewInfoType getNormalPaxCrewInfo() {
        return normalPaxCrewInfo;
    }

    /**
     * Sets the value of the normalPaxCrewInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public void setNormalPaxCrewInfo(PaxCrewInfoType value) {
        this.normalPaxCrewInfo = value;
    }

    /**
     * Gets the value of the unmatchedPaxCrewInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public PaxCrewInfoType getUnmatchedPaxCrewInfo() {
        return unmatchedPaxCrewInfo;
    }

    /**
     * Sets the value of the unmatchedPaxCrewInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public void setUnmatchedPaxCrewInfo(PaxCrewInfoType value) {
        this.unmatchedPaxCrewInfo = value;
    }

    /**
     * Gets the value of the overrideDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverrideDate() {
        return overrideDate;
    }

    /**
     * Sets the value of the overrideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverrideDate(XMLGregorianCalendar value) {
        this.overrideDate = value;
    }

    /**
     * Gets the value of the overrideNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideNote() {
        return overrideNote;
    }

    /**
     * Sets the value of the overrideNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideNote(String value) {
        this.overrideNote = value;
    }

    /**
     * Gets the value of the overrideOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideOfficerName() {
        return overrideOfficerName;
    }

    /**
     * Sets the value of the overrideOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideOfficerName(String value) {
        this.overrideOfficerName = value;
    }

    /**
     * Gets the value of the overrideAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideAuthority() {
        return overrideAuthority;
    }

    /**
     * Sets the value of the overrideAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideAuthority(String value) {
        this.overrideAuthority = value;
    }

    /**
     * Gets the value of the fullStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullStatus() {
        return fullStatus;
    }

    /**
     * Sets the value of the fullStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullStatus(String value) {
        this.fullStatus = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link MovementDirectionType }
     *     
     */
    public MovementDirectionType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementDirectionType }
     *     
     */
    public void setDirection(MovementDirectionType value) {
        this.direction = value;
    }

    /**
     * Gets the value of the hitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHitId() {
        return hitId;
    }

    /**
     * Sets the value of the hitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHitId(Long value) {
        this.hitId = value;
    }

    /**
     * Gets the value of the hitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitStatus() {
        return hitStatus;
    }

    /**
     * Sets the value of the hitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitStatus(String value) {
        this.hitStatus = value;
    }

    /**
     * Gets the value of the hitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitCode() {
        return hitCode;
    }

    /**
     * Sets the value of the hitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitCode(String value) {
        this.hitCode = value;
    }

    /**
     * Gets the value of the bookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReference(String value) {
        this.bookingReference = value;
    }

    /**
     * Gets the value of the clearance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearance() {
        return clearance;
    }

    /**
     * Sets the value of the clearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearance(String value) {
        this.clearance = value;
    }

    /**
     * Gets the value of the travelCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelCase() {
        return travelCase;
    }

    /**
     * Sets the value of the travelCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelCase(String value) {
        this.travelCase = value;
    }

    /**
     * Gets the value of the eventDetailSources property.
     * 
     * @return
     *     possible object is
     *     {@link EventDetailSourceListType }
     *     
     */
    public EventDetailSourceListType getEventDetailSources() {
        return eventDetailSources;
    }

    /**
     * Sets the value of the eventDetailSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDetailSourceListType }
     *     
     */
    public void setEventDetailSources(EventDetailSourceListType value) {
        this.eventDetailSources = value;
    }

    /**
     * Gets the value of the expectedMovementId property.
     * 
     */
    public long getExpectedMovementId() {
        return expectedMovementId;
    }

    /**
     * Sets the value of the expectedMovementId property.
     * 
     */
    public void setExpectedMovementId(long value) {
        this.expectedMovementId = value;
    }

    /**
     * Gets the value of the businessRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessRule() {
        return businessRule;
    }

    /**
     * Sets the value of the businessRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessRule(String value) {
        this.businessRule = value;
    }

    /**
     * Gets the value of the directiveMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectiveMessage() {
        return directiveMessage;
    }

    /**
     * Sets the value of the directiveMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectiveMessage(String value) {
        this.directiveMessage = value;
    }

    /**
     * Gets the value of the travellerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getTravellerStatus() {
        return travellerStatus;
    }

    /**
     * Sets the value of the travellerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setTravellerStatus(StatusCodeType value) {
        this.travellerStatus = value;
    }

}
