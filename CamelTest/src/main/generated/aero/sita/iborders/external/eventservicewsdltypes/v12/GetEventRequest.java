
package aero.sita.iborders.external.eventservicewsdltypes.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commondomaintypes.v2.TypeOfEventType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="EventDetailId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;sequence>
 *             &lt;element name="EventType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TypeOfEventType"/>
 *             &lt;element name="SourceEventId" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}SourceEventIdType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventId",
    "eventDetailId",
    "eventType",
    "sourceEventId"
})
@XmlRootElement(name = "GetEventRequest")
public class GetEventRequest {

    @XmlElement(name = "EventId")
    protected Long eventId;
    @XmlElement(name = "EventDetailId")
    protected Long eventDetailId;
    @XmlElement(name = "EventType")
    protected TypeOfEventType eventType;
    @XmlElement(name = "SourceEventId")
    protected String sourceEventId;

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

}
