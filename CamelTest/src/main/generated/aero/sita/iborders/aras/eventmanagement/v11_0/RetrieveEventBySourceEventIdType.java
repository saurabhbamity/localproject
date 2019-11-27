
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.EventNameType;


/**
 * Retrieve the Event details by passing the Source
 * 				Event Code.
 * 			
 * 
 * <p>Java class for RetrieveEventBySourceEventIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEventBySourceEventIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceEventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EventName" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventNameType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEventBySourceEventIdType", propOrder = {
    "sourceEventId",
    "eventName"
})
public class RetrieveEventBySourceEventIdType {

    @XmlElement(name = "SourceEventId", required = true)
    protected String sourceEventId;
    @XmlElement(name = "EventName", required = true)
    protected EventNameType eventName;

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

}
