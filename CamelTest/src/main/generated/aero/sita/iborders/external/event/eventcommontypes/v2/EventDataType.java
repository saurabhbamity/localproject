
package aero.sita.iborders.external.event.eventcommontypes.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.external.event.expectedmovementeventtypes.v2.ExpectedMovementEventType;
import aero.sita.iborders.external.event.movementeventtypes.v2.MovementEventType;
import aero.sita.iborders.external.event.riskassessmenteventtypes.v2.RiskAssessmentEventType;
import aero.sita.iborders.external.identity.identitytypes.v2.IdentityType;


/**
 * Super class for all events.
 * 
 * <p>Java class for EventDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReferralId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EventDetailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceEventId" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}SourceEventIdType" minOccurs="0"/>
 *         &lt;element name="EventOccurred" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EventCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Identity" type="{http://sita.aero/iborders/external/identity/IdentityTypes/V2}IdentityType" maxOccurs="unbounded"/>
 *         &lt;element name="LocationId" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LocationCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDataType", propOrder = {
    "eventId",
    "referralId",
    "eventDetailId",
    "sourceEventId",
    "eventOccurred",
    "eventCreateDate",
    "identity",
    "locationId"
})
@XmlSeeAlso({
    ExpectedMovementEventType.class,
    MovementEventType.class,
    RiskAssessmentEventType.class
})
public class EventDataType {

    @XmlElement(name = "EventId")
    protected Long eventId;
    @XmlElement(name = "ReferralId")
    protected Long referralId;
    @XmlElement(name = "EventDetailId")
    protected Long eventDetailId;
    @XmlElement(name = "SourceEventId")
    protected String sourceEventId;
    @XmlElement(name = "EventOccurred", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventOccurred;
    @XmlElement(name = "EventCreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventCreateDate;
    @XmlElement(name = "Identity", required = true)
    protected List<IdentityType> identity;
    @XmlElement(name = "LocationId")
    protected String locationId;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventId(Long value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the referralId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferralId() {
        return referralId;
    }

    /**
     * Sets the value of the referralId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferralId(Long value) {
        this.referralId = value;
    }

    /**
     * Gets the value of the eventDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventDetailId() {
        return eventDetailId;
    }

    /**
     * Sets the value of the eventDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventDetailId(Long value) {
        this.eventDetailId = value;
    }

    /**
     * Gets the value of the sourceEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceEventId() {
        return sourceEventId;
    }

    /**
     * Sets the value of the sourceEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceEventId(String value) {
        this.sourceEventId = value;
    }

    /**
     * Gets the value of the eventOccurred property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventOccurred() {
        return eventOccurred;
    }

    /**
     * Sets the value of the eventOccurred property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventOccurred(XMLGregorianCalendar value) {
        this.eventOccurred = value;
    }

    /**
     * Gets the value of the eventCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventCreateDate() {
        return eventCreateDate;
    }

    /**
     * Sets the value of the eventCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventCreateDate(XMLGregorianCalendar value) {
        this.eventCreateDate = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityType }
     * 
     * 
     */
    public List<IdentityType> getIdentity() {
        if (identity == null) {
            identity = new ArrayList<IdentityType>();
        }
        return this.identity;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

}
