
package aero.sita.iborders.external.eventservicewsdltypes.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.event.movementeventtypes.v2.MovementEventType;


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
 *         &lt;element name="MovementEvent" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}MovementEventType"/>
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
    "movementEvent"
})
@XmlRootElement(name = "SubmitBorderMovementRequest")
public class SubmitBorderMovementRequest {

    @XmlElement(name = "MovementEvent", required = true)
    protected MovementEventType movementEvent;

    /**
     * Gets the value of the movementEvent property.
     * 
     * @return
     *     possible object is
     *     {@link MovementEventType }
     *     
     */
    public MovementEventType getMovementEvent() {
        return movementEvent;
    }

    /**
     * Sets the value of the movementEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementEventType }
     *     
     */
    public void setMovementEvent(MovementEventType value) {
        this.movementEvent = value;
    }

}
