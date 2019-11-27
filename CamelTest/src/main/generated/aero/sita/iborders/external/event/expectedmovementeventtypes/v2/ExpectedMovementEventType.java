
package aero.sita.iborders.external.event.expectedmovementeventtypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.external.common.commondomaintypes.v2.MovementDirectionType;
import aero.sita.iborders.external.common.commondomaintypes.v2.TravelType;
import aero.sita.iborders.external.common.commondomaintypes.v2.TravellerType;
import aero.sita.iborders.external.event.eventcommontypes.v2.EventDataType;


/**
 * Contains the details of the journey leg that the traveller is on.
 * 
 * <p>Java class for ExpectedMovementEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedMovementEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/external/event/ExpectedMovementEventTypes/V2}ExpectedMovementEventSourceType"/>
 *         &lt;element name="ExpectedService" type="{http://sita.aero/iborders/external/event/ExpectedMovementEventTypes/V2}ExpectedServiceType"/>
 *         &lt;element name="OriginCountry" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="OriginPort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="DepartureCountry" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="DeparturePort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType"/>
 *         &lt;element name="ArrivalCountry" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="ArrivalPort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType"/>
 *         &lt;element name="ScheduledDepDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ScheduledArrDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransBorderPort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="CheckInPort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ServiceRoute" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}ServiceRouteType" minOccurs="0"/>
 *         &lt;element name="TravellerType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TravellerType"/>
 *         &lt;element name="TravelType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TravelType"/>
 *         &lt;element name="Direction" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}MovementDirectionType"/>
 *         &lt;element name="BookingReference" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}BookingReferenceType" minOccurs="0"/>
 *         &lt;element name="TravelCase" type="{http://sita.aero/iborders/external/event/ExpectedMovementEventTypes/V2}TravelCaseType" minOccurs="0"/>
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
    "originPort",
    "departureCountry",
    "departurePort",
    "arrivalCountry",
    "arrivalPort",
    "scheduledDepDateTime",
    "scheduledArrDateTime",
    "transBorderPort",
    "checkInPort",
    "checkInTime",
    "serviceRoute",
    "travellerType",
    "travelType",
    "direction",
    "bookingReference",
    "travelCase"
})
public class ExpectedMovementEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected ExpectedMovementEventSourceType eventSource;
    @XmlElement(name = "ExpectedService", required = true)
    protected ExpectedServiceType expectedService;
    @XmlElement(name = "OriginCountry")
    protected String originCountry;
    @XmlElement(name = "OriginPort")
    protected String originPort;
    @XmlElement(name = "DepartureCountry")
    protected String departureCountry;
    @XmlElement(name = "DeparturePort", required = true)
    protected String departurePort;
    @XmlElement(name = "ArrivalCountry")
    protected String arrivalCountry;
    @XmlElement(name = "ArrivalPort", required = true)
    protected String arrivalPort;
    @XmlElement(name = "ScheduledDepDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDepDateTime;
    @XmlElement(name = "ScheduledArrDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledArrDateTime;
    @XmlElement(name = "TransBorderPort")
    protected String transBorderPort;
    @XmlElement(name = "CheckInPort")
    protected String checkInPort;
    @XmlElement(name = "CheckInTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInTime;
    @XmlElement(name = "ServiceRoute")
    protected String serviceRoute;
    @XmlElement(name = "TravellerType", required = true)
    protected TravellerType travellerType;
    @XmlElement(name = "TravelType", required = true)
    protected TravelType travelType;
    @XmlElement(name = "Direction", required = true)
    protected MovementDirectionType direction;
    @XmlElement(name = "BookingReference")
    protected String bookingReference;
    @XmlElement(name = "TravelCase")
    protected String travelCase;

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
     *     {@link ExpectedServiceType }
     *     
     */
    public ExpectedServiceType getExpectedService() {
        return expectedService;
    }

    /**
     * Sets the value of the expectedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedServiceType }
     *     
     */
    public void setExpectedService(ExpectedServiceType value) {
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

}
