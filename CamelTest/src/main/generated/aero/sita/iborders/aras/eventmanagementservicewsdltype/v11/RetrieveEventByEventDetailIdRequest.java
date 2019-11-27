
package aero.sita.iborders.aras.eventmanagementservicewsdltype.v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.SystemIndicatorType;


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
 *         &lt;element name="EventDetailId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsDetailed" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}SystemIndicatorType"/>
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
    "eventDetailId",
    "isDetailed"
})
@XmlRootElement(name = "RetrieveEventByEventDetailIdRequest")
public class RetrieveEventByEventDetailIdRequest {

    @XmlElement(name = "EventDetailId")
    protected long eventDetailId;
    @XmlElement(name = "IsDetailed", required = true, defaultValue = "N")
    protected SystemIndicatorType isDetailed;

    /**
     * Gets the value of the eventDetailId property.
     * 
     */
    public long getEventDetailId() {
        return eventDetailId;
    }

    /**
     * Sets the value of the eventDetailId property.
     * 
     */
    public void setEventDetailId(long value) {
        this.eventDetailId = value;
    }

    /**
     * Gets the value of the isDetailed property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIndicatorType }
     *     
     */
    public SystemIndicatorType getIsDetailed() {
        return isDetailed;
    }

    /**
     * Sets the value of the isDetailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIndicatorType }
     *     
     */
    public void setIsDetailed(SystemIndicatorType value) {
        this.isDetailed = value;
    }

}
