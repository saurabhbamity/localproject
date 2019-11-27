
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Visa Event Source and Status Information.
 *             
 * 
 * <p>Java class for VisaApplicationEventSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaApplicationEventSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisaEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaSourceType"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaApplicationEventStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaApplicationEventSourceType", propOrder = {
    "visaEventSource",
    "eventStatus"
})
public class VisaApplicationEventSourceType {

    @XmlElement(name = "VisaEventSource", required = true)
    protected VisaSourceType visaEventSource;
    @XmlElement(name = "EventStatus", required = true)
    protected VisaApplicationEventStatusType eventStatus;

    /**
     * Gets the value of the visaEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link VisaSourceType }
     *     
     */
    public VisaSourceType getVisaEventSource() {
        return visaEventSource;
    }

    /**
     * Sets the value of the visaEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaSourceType }
     *     
     */
    public void setVisaEventSource(VisaSourceType value) {
        this.visaEventSource = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VisaApplicationEventStatusType }
     *     
     */
    public VisaApplicationEventStatusType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaApplicationEventStatusType }
     *     
     */
    public void setEventStatus(VisaApplicationEventStatusType value) {
        this.eventStatus = value;
    }

}
