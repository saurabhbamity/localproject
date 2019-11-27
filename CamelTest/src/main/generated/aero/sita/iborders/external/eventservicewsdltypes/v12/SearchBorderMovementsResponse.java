
package aero.sita.iborders.external.eventservicewsdltypes.v12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commontypes.v1.ReturnCodeType;
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
 *         &lt;element name="MovementEvent" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}MovementEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnCode" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}ReturnCodeType"/>
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
    "movementEvent",
    "returnCode"
})
@XmlRootElement(name = "SearchBorderMovementsResponse")
public class SearchBorderMovementsResponse {

    @XmlElement(name = "MovementEvent")
    protected List<MovementEventType> movementEvent;
    @XmlElement(name = "ReturnCode", required = true)
    protected ReturnCodeType returnCode;

    /**
     * Gets the value of the movementEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movementEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovementEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovementEventType }
     * 
     * 
     */
    public List<MovementEventType> getMovementEvent() {
        if (movementEvent == null) {
            movementEvent = new ArrayList<MovementEventType>();
        }
        return this.movementEvent;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCodeType }
     *     
     */
    public ReturnCodeType getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCodeType }
     *     
     */
    public void setReturnCode(ReturnCodeType value) {
        this.returnCode = value;
    }

}
