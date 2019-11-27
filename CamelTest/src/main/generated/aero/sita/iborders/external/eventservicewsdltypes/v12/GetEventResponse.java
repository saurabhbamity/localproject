
package aero.sita.iborders.external.eventservicewsdltypes.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commontypes.v1.ReturnCodeType;
import aero.sita.iborders.external.event.eventtypes.v2.EventsListType;


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
 *         &lt;element name="Event" type="{http://sita.aero/iborders/external/event/EventTypes/V2}EventsListType" minOccurs="0"/>
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
    "event",
    "returnCode"
})
@XmlRootElement(name = "GetEventResponse")
public class GetEventResponse {

    @XmlElement(name = "Event")
    protected EventsListType event;
    @XmlElement(name = "ReturnCode", required = true)
    protected ReturnCodeType returnCode;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link EventsListType }
     *     
     */
    public EventsListType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsListType }
     *     
     */
    public void setEvent(EventsListType value) {
        this.event = value;
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
