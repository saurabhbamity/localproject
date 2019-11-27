
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.entryexit.common.v1.AuditTagType;


/**
 * Request object for a new update movement
 * 
 * <p>Java class for CreateUpdateMovementRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateUpdateMovementRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Movement" type="{http://sita.aero/iborders/entryExit/MovementService/V1}MovementType"/>
 *         &lt;element name="AuditTag" type="{http://sita.aero/iborders/entryExit/Common/V1}AuditTagType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateUpdateMovementRequestType", propOrder = {
    "movement",
    "auditTag"
})
@XmlRootElement(name="CreateUpdateMovementRequestType")
public class CreateUpdateMovementRequestType {

    @XmlElement(name = "Movement", required = true)
    protected MovementType movement;
    @XmlElement(name = "AuditTag", required = true)
    protected AuditTagType auditTag;

    /**
     * Gets the value of the movement property.
     * 
     * @return
     *     possible object is
     *     {@link MovementType }
     *     
     */
    public MovementType getMovement() {
        return movement;
    }

    /**
     * Sets the value of the movement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementType }
     *     
     */
    public void setMovement(MovementType value) {
        this.movement = value;
    }

    /**
     * Gets the value of the auditTag property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTagType }
     *     
     */
    public AuditTagType getAuditTag() {
        return auditTag;
    }

    /**
     * Sets the value of the auditTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTagType }
     *     
     */
    public void setAuditTag(AuditTagType value) {
        this.auditTag = value;
    }

}
