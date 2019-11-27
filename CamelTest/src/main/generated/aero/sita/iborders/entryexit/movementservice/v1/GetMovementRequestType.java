
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Select Movement by ID
 * 
 * <p>Java class for GetMovementRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMovementRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Verbosity" type="{http://sita.aero/iborders/entryExit/MovementService/V1}movementVerbosityLevel" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMovementRequestType", propOrder = {
    "movementId",
    "verbosity"
})
public class GetMovementRequestType {

    @XmlElement(name = "MovementId", required = true)
    protected String movementId;
    @XmlElement(name = "Verbosity", required = true)
    protected MovementVerbosityLevel verbosity;

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

    /**
     * Gets the value of the verbosity property.
     * 
     * @return
     *     possible object is
     *     {@link MovementVerbosityLevel }
     *     
     */
    public MovementVerbosityLevel getVerbosity() {
        return verbosity;
    }

    /**
     * Sets the value of the verbosity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementVerbosityLevel }
     *     
     */
    public void setVerbosity(MovementVerbosityLevel value) {
        this.verbosity = value;
    }

}
