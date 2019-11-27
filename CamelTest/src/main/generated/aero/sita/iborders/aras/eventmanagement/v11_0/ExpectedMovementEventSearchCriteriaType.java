
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.aras.commontypes.v8_0.OperatorType;
import aero.sita.iborders.aras.commontypes.v8_0.PaxCrewInfoType;
import aero.sita.iborders.aras.commontypes.v8_0.SystemIndicatorType;


/**
 * Criteria for ExpectedMovementEventSearch.
 * 
 * <p>Java class for ExpectedMovementEventSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedMovementEventSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}OperatorType" minOccurs="0"/>
 *         &lt;element name="ServiceCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ServiceCodeType" minOccurs="0"/>
 *         &lt;element name="ServiceNumber" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ServiceNumberType" minOccurs="0"/>
 *         &lt;element name="ServiceRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="App" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PaxCrewInfoType" minOccurs="0"/>
 *         &lt;element name="Api" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PaxCrewInfoType" minOccurs="0"/>
 *         &lt;element name="ReferenceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JourneyLegStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeparturePort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="ArrivalPort" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDetailed" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}SystemIndicatorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedMovementEventSearchCriteriaType", propOrder = {
    "flightId",
    "operator",
    "serviceCode",
    "serviceNumber",
    "serviceRoute",
    "app",
    "api",
    "referenceIndicator",
    "journeyLegStatus",
    "departurePort",
    "arrivalPort",
    "departureDateTime",
    "arrivalDateTime",
    "isDetailed"
})
public class ExpectedMovementEventSearchCriteriaType {

    @XmlElement(name = "FlightId")
    protected Long flightId;
    @XmlElement(name = "Operator")
    protected OperatorType operator;
    @XmlElement(name = "ServiceCode")
    protected String serviceCode;
    @XmlElement(name = "ServiceNumber")
    protected String serviceNumber;
    @XmlElement(name = "ServiceRoute")
    protected String serviceRoute;
    @XmlElement(name = "App")
    protected PaxCrewInfoType app;
    @XmlElement(name = "Api")
    protected PaxCrewInfoType api;
    @XmlElement(name = "ReferenceIndicator")
    protected Boolean referenceIndicator;
    @XmlElement(name = "JourneyLegStatus")
    protected String journeyLegStatus;
    @XmlElement(name = "DeparturePort")
    protected String departurePort;
    @XmlElement(name = "ArrivalPort")
    protected String arrivalPort;
    @XmlElement(name = "DepartureDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(name = "ArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(name = "IsDetailed", required = true, defaultValue = "N")
    protected SystemIndicatorType isDetailed;

    /**
     * Gets the value of the flightId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlightId() {
        return flightId;
    }

    /**
     * Sets the value of the flightId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlightId(Long value) {
        this.flightId = value;
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
     * Gets the value of the app property.
     * 
     * @return
     *     possible object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public PaxCrewInfoType getApp() {
        return app;
    }

    /**
     * Sets the value of the app property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public void setApp(PaxCrewInfoType value) {
        this.app = value;
    }

    /**
     * Gets the value of the api property.
     * 
     * @return
     *     possible object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public PaxCrewInfoType getApi() {
        return api;
    }

    /**
     * Sets the value of the api property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxCrewInfoType }
     *     
     */
    public void setApi(PaxCrewInfoType value) {
        this.api = value;
    }

    /**
     * Gets the value of the referenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReferenceIndicator() {
        return referenceIndicator;
    }

    /**
     * Sets the value of the referenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReferenceIndicator(Boolean value) {
        this.referenceIndicator = value;
    }

    /**
     * Gets the value of the journeyLegStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyLegStatus() {
        return journeyLegStatus;
    }

    /**
     * Sets the value of the journeyLegStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyLegStatus(String value) {
        this.journeyLegStatus = value;
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

    /**
     * Gets the value of the isDetailed property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIndicatorType }
     *     
     */
    public SystemIndicatorType getIsDetailed() {
        return isDetailed;
    }

    /**
     * Sets the value of the isDetailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIndicatorType }
     *     
     */
    public void setIsDetailed(SystemIndicatorType value) {
        this.isDetailed = value;
    }

}
