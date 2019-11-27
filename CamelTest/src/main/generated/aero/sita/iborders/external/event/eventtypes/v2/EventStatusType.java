
package aero.sita.iborders.external.event.eventtypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.event.expectedmovementeventtypes.v2.MovementStatusType;
import aero.sita.iborders.external.event.movementeventtypes.v2.MovementEventStatusType;


/**
 * Contain each Event Status
 *             
 * 
 * <p>Java class for EventStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="MovementStatus" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}MovementEventStatusType"/>
 *           &lt;element name="ExpectedMovementStatus" type="{http://sita.aero/iborders/external/event/ExpectedMovementEventTypes/V2}MovementStatusType"/>
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
@XmlType(name = "EventStatusType", propOrder = {
    "movementStatus",
    "expectedMovementStatus"
})
public class EventStatusType {

    @XmlElement(name = "MovementStatus")
    protected MovementEventStatusType movementStatus;
    @XmlElement(name = "ExpectedMovementStatus")
    protected MovementStatusType expectedMovementStatus;

    /**
     * Gets the value of the movementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementEventStatusType }
     *     
     */
    public MovementEventStatusType getMovementStatus() {
        return movementStatus;
    }

    /**
     * Sets the value of the movementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementEventStatusType }
     *     
     */
    public void setMovementStatus(MovementEventStatusType value) {
        this.movementStatus = value;
    }

    /**
     * Gets the value of the expectedMovementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementStatusType }
     *     
     */
    public MovementStatusType getExpectedMovementStatus() {
        return expectedMovementStatus;
    }

    /**
     * Sets the value of the expectedMovementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementStatusType }
     *     
     */
    public void setExpectedMovementStatus(MovementStatusType value) {
        this.expectedMovementStatus = value;
    }

}
