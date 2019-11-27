
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Movement Event Source and Status Information.
 *             
 * 
 * <p>Java class for MovementEventSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementEventSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementSourceType"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementEventStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementEventSourceType", propOrder = {
    "eventSource",
    "eventStatus"
})
public class MovementEventSourceType {

    @XmlElement(name = "EventSource", required = true)
    protected MovementSourceType eventSource;
    @XmlElement(name = "EventStatus", required = true)
    protected MovementEventStatusType eventStatus;

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link MovementSourceType }
     *     
     */
    public MovementSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementSourceType }
     *     
     */
    public void setEventSource(MovementSourceType value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementEventStatusType }
     *     
     */
    public MovementEventStatusType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementEventStatusType }
     *     
     */
    public void setEventStatus(MovementEventStatusType value) {
        this.eventStatus = value;
    }

}
