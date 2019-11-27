
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Selected Movement
 * 
 * <p>Java class for GetMovementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMovementResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Movement" type="{http://sita.aero/iborders/entryExit/MovementService/V1}TaggedMovementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMovementResponseType", propOrder = {
    "movement"
})
public class GetMovementResponseType {

    @XmlElement(name = "Movement")
    protected TaggedMovementType movement;

    /**
     * Gets the value of the movement property.
     * 
     * @return
     *     possible object is
     *     {@link TaggedMovementType }
     *     
     */
    public TaggedMovementType getMovement() {
        return movement;
    }

    /**
     * Sets the value of the movement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaggedMovementType }
     *     
     */
    public void setMovement(TaggedMovementType value) {
        this.movement = value;
    }

}
