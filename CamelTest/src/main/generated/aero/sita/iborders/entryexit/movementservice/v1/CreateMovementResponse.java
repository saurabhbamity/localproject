
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CreateMovementSatus" type="{http://sita.aero/iborders/entryExit/MovementService/V1}operationStatus"/>
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
    "createMovementSatus"
})
@XmlRootElement(name = "CreateMovementResponse")
public class CreateMovementResponse {

    @XmlElement(name = "CreateMovementSatus", required = true)
    protected OperationStatus createMovementSatus;

    /**
     * Gets the value of the createMovementSatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationStatus }
     *     
     */
    public OperationStatus getCreateMovementSatus() {
        return createMovementSatus;
    }

    /**
     * Sets the value of the createMovementSatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationStatus }
     *     
     */
    public void setCreateMovementSatus(OperationStatus value) {
        this.createMovementSatus = value;
    }

}
