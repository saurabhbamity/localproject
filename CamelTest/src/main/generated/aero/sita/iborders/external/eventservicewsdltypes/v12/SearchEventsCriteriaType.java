
package aero.sita.iborders.external.eventservicewsdltypes.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commondomaintypes.v2.TypeOfEventType;
import aero.sita.iborders.external.common.commontypes.v1.DateRangeType;
import aero.sita.iborders.external.event.eventtypes.v2.EventStatusType;


/**
 * Criteria to search Events.
 * 
 * <p>Java class for SearchEventsCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchEventsCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TypeOfEventType" minOccurs="0"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/external/event/EventTypes/V2}EventStatusType" minOccurs="0"/>
 *         &lt;element name="DateRange" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}DateRangeType"/>
 *         &lt;element name="Identity" type="{http://sita.aero/iborders/external/EventServiceWSDLTypes/V12}SearchIdentityCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchEventsCriteriaType", propOrder = {
    "eventType",
    "eventStatus",
    "dateRange",
    "identity"
})
public class SearchEventsCriteriaType {

    @XmlElement(name = "EventType")
    protected TypeOfEventType eventType;
    @XmlElement(name = "EventStatus")
    protected EventStatusType eventStatus;
    @XmlElement(name = "DateRange", required = true)
    protected DateRangeType dateRange;
    @XmlElement(name = "Identity")
    protected SearchIdentityCriteriaType identity;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfEventType }
     *     
     */
    public TypeOfEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfEventType }
     *     
     */
    public void setEventType(TypeOfEventType value) {
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
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchIdentityCriteriaType }
     *     
     */
    public SearchIdentityCriteriaType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIdentityCriteriaType }
     *     
     */
    public void setIdentity(SearchIdentityCriteriaType value) {
        this.identity = value;
    }

}
