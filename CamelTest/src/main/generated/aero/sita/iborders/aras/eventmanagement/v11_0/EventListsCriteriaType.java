
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.DateRangeType;
import aero.sita.iborders.aras.commontypes.v8_0.EventNameType;
import aero.sita.iborders.aras.commontypes.v8_0.SystemIndicatorType;


/**
 * Contains list of Events List and Identity criteria
 * 			
 * 
 * <p>Java class for EventListsCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventListsCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EventDetailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventNameType" minOccurs="0"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}EventStatusType" minOccurs="0"/>
 *         &lt;element name="DateRange" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}DateRangeType"/>
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
@XmlType(name = "EventListsCriteriaType", propOrder = {
    "identityId",
    "personId",
    "eventId",
    "eventDetailId",
    "eventType",
    "eventStatus",
    "dateRange",
    "isDetailed"
})
public class EventListsCriteriaType {

    @XmlElement(name = "IdentityId")
    protected Long identityId;
    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "EventId")
    protected Long eventId;
    @XmlElement(name = "EventDetailId")
    protected Long eventDetailId;
    @XmlElement(name = "EventType")
    protected EventNameType eventType;
    @XmlElement(name = "EventStatus")
    protected EventStatusType eventStatus;
    @XmlElement(name = "DateRange", required = true)
    protected DateRangeType dateRange;
    @XmlElement(name = "IsDetailed", required = true, defaultValue = "N")
    protected SystemIndicatorType isDetailed;

    /**
     * Gets the value of the identityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentityId() {
        return identityId;
    }

    /**
     * Sets the value of the identityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentityId(Long value) {
        this.identityId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventNameType }
     *     
     */
    public EventNameType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventNameType }
     *     
     */
    public void setEventType(EventNameType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatusType }
     *     
     */
    public EventStatusType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatusType }
     *     
     */
    public void setEventStatus(EventStatusType value) {
        this.eventStatus = value;
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
