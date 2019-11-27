
package aero.sita.iborders.external.eventservicewsdltypes.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.external.common.commondomaintypes.v2.OperatorType;


/**
 * <p>Java class for SearchServiceCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchServiceCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}OperatorType"/>
 *         &lt;element name="ServiceCode" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}ServiceCodeType"/>
 *         &lt;element name="ServiceNumber" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}ServiceNumberType"/>
 *         &lt;element name="ServiceRoute" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}ServiceRouteType" minOccurs="0"/>
 *         &lt;element name="DeparturePort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="ArrivalPort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "SearchServiceCriteriaType", propOrder = {
    "serviceType",
    "serviceCode",
    "serviceNumber",
    "serviceRoute",
    "departurePort",
    "arrivalPort",
    "departureDateTime",
    "arrivalDateTime"
})
public class SearchServiceCriteriaType {

    @XmlElement(name = "ServiceType", required = true)
    protected OperatorType serviceType;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "ServiceNumber", required = true)
    protected String serviceNumber;
    @XmlElement(name = "ServiceRoute")
    protected String serviceRoute;
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

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorType }
     *     
     */
    public OperatorType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorType }
     *     
     */
    public void setServiceType(OperatorType value) {
        this.serviceType = value;
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

}
