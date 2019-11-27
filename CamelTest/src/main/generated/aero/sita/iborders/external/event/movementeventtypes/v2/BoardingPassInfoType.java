
package aero.sita.iborders.external.event.movementeventtypes.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.external.event.eventcommontypes.v2.FrequentFlyerType;


/**
 * Traveller boarding pass Information.
 * 
 * <p>Java class for BoardingPassInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoardingPassInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatNumber" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}SeatNumberType" minOccurs="0"/>
 *         &lt;element name="FrequentFlyerInfo" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}FrequentFlyerType" minOccurs="0"/>
 *         &lt;element name="BagTagNumber" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}BagTagNumberType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="ServiceCode" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}ServiceCodeType" minOccurs="0"/>
 *         &lt;element name="ServiceNumber" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}ServiceNumberType" minOccurs="0"/>
 *         &lt;element name="DateOfJourney" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DeparturePort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType" minOccurs="0"/>
 *         &lt;element name="ArrivalPort" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingPassInfoType", propOrder = {
    "seatNumber",
    "frequentFlyerInfo",
    "bagTagNumber",
    "serviceCode",
    "serviceNumber",
    "dateOfJourney",
    "departurePort",
    "arrivalPort"
})
public class BoardingPassInfoType {

    @XmlElement(name = "SeatNumber")
    protected String seatNumber;
    @XmlElement(name = "FrequentFlyerInfo")
    protected FrequentFlyerType frequentFlyerInfo;
    @XmlElement(name = "BagTagNumber")
    protected List<String> bagTagNumber;
    @XmlElement(name = "ServiceCode")
    protected String serviceCode;
    @XmlElement(name = "ServiceNumber")
    protected String serviceNumber;
    @XmlElement(name = "DateOfJourney")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfJourney;
    @XmlElement(name = "DeparturePort")
    protected String departurePort;
    @XmlElement(name = "ArrivalPort")
    protected String arrivalPort;

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the frequentFlyerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentFlyerType }
     *     
     */
    public FrequentFlyerType getFrequentFlyerInfo() {
        return frequentFlyerInfo;
    }

    /**
     * Sets the value of the frequentFlyerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentFlyerType }
     *     
     */
    public void setFrequentFlyerInfo(FrequentFlyerType value) {
        this.frequentFlyerInfo = value;
    }

    /**
     * Gets the value of the bagTagNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagTagNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagTagNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBagTagNumber() {
        if (bagTagNumber == null) {
            bagTagNumber = new ArrayList<String>();
        }
        return this.bagTagNumber;
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
     * Gets the value of the dateOfJourney property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfJourney() {
        return dateOfJourney;
    }

    /**
     * Sets the value of the dateOfJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfJourney(XMLGregorianCalendar value) {
        this.dateOfJourney = value;
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

}
