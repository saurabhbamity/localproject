
package aero.sita.iborders.aras.eventmanagementservicewsdltype.v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.ReturnCodeType;
import aero.sita.iborders.aras.eventmanagement.v11_0.EventGroupType;


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
 *         &lt;element name="EventGroup" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}EventGroupType" minOccurs="0"/>
 *         &lt;element name="ReturnCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ReturnCodeType"/>
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
    "eventGroup",
    "returnCode"
})
@XmlRootElement(name = "RetrieveEventByEventDetailIdResponse")
public class RetrieveEventByEventDetailIdResponse {

    @XmlElement(name = "EventGroup")
    protected EventGroupType eventGroup;
    @XmlElement(name = "ReturnCode", required = true)
    protected ReturnCodeType returnCode;

    /**
     * Gets the value of the eventGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EventGroupType }
     *     
     */
    public EventGroupType getEventGroup() {
        return eventGroup;
    }

    /**
     * Sets the value of the eventGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventGroupType }
     *     
     */
    public void setEventGroup(EventGroupType value) {
        this.eventGroup = value;
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
