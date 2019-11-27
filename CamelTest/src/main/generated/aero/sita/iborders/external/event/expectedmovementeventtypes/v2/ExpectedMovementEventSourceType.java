
package aero.sita.iborders.external.event.expectedmovementeventtypes.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Expected Movement Event Source and Status Information.
 * 
 * <p>Java class for ExpectedMovementEventSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedMovementEventSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpectedMovementEventSource" type="{http://sita.aero/iborders/external/event/ExpectedMovementEventTypes/V2}ExpectedMovementSourceType" maxOccurs="4"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/external/event/ExpectedMovementEventTypes/V2}MovementStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedMovementEventSourceType", propOrder = {
    "expectedMovementEventSource",
    "eventStatus"
})
public class ExpectedMovementEventSourceType {

    @XmlElement(name = "ExpectedMovementEventSource", required = true)
    protected List<ExpectedMovementSourceType> expectedMovementEventSource;
    @XmlElement(name = "EventStatus", required = true)
    protected MovementStatusType eventStatus;

    /**
     * Gets the value of the expectedMovementEventSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expectedMovementEventSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedMovementEventSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpectedMovementSourceType }
     * 
     * 
     */
    public List<ExpectedMovementSourceType> getExpectedMovementEventSource() {
        if (expectedMovementEventSource == null) {
            expectedMovementEventSource = new ArrayList<ExpectedMovementSourceType>();
        }
        return this.expectedMovementEventSource;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementStatusType }
     *     
     */
    public MovementStatusType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementStatusType }
     *     
     */
    public void setEventStatus(MovementStatusType value) {
        this.eventStatus = value;
    }

}
