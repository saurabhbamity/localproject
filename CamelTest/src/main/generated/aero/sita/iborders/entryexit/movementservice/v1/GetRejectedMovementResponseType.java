
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response object for GetRejectedMovement
 * 
 * <p>Java class for GetRejectedMovementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRejectedMovementResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RejectedMovement" type="{http://sita.aero/iborders/entryExit/MovementService/V1}RejectedMovementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRejectedMovementResponseType", propOrder = {
    "rejectedMovement"
})
public class GetRejectedMovementResponseType {

    @XmlElement(name = "RejectedMovement")
    protected RejectedMovementType rejectedMovement;

    /**
     * Gets the value of the rejectedMovement property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedMovementType }
     *     
     */
    public RejectedMovementType getRejectedMovement() {
        return rejectedMovement;
    }

    /**
     * Sets the value of the rejectedMovement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedMovementType }
     *     
     */
    public void setRejectedMovement(RejectedMovementType value) {
        this.rejectedMovement = value;
    }

}
