
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request object for retrieving a rejected movement by unique identifier
 * 
 * <p>Java class for GetRejectedMovementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRejectedMovementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementId" type="{http://sita.aero/iborders/entryExit/Common/V1}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRejectedMovementType", propOrder = {
    "movementId"
})
public class GetRejectedMovementType {

    @XmlElement(name = "MovementId", required = true)
    protected String movementId;

    /**
     * Gets the value of the movementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementId() {
        return movementId;
    }

    /**
     * Sets the value of the movementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementId(String value) {
        this.movementId = value;
    }

}
