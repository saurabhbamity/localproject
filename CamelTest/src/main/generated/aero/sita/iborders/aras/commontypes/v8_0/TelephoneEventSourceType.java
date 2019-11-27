
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Telephone Event Source and Provider Information.
 *             
 * 
 * <p>Java class for TelephoneEventSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneEventSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InCountryEventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}InCountryEventSourceType"/>
 *         &lt;element name="EventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TelephoneEventStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneEventSourceType", propOrder = {
    "inCountryEventSource",
    "eventStatus"
})
public class TelephoneEventSourceType {

    @XmlElement(name = "InCountryEventSource", required = true)
    protected InCountryEventSourceType inCountryEventSource;
    @XmlElement(name = "EventStatus", required = true)
    protected TelephoneEventStatusType eventStatus;

    /**
     * Gets the value of the inCountryEventSource property.
     * 
     * @return
     *     possible object is
     *     {@link InCountryEventSourceType }
     *     
     */
    public InCountryEventSourceType getInCountryEventSource() {
        return inCountryEventSource;
    }

    /**
     * Sets the value of the inCountryEventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InCountryEventSourceType }
     *     
     */
    public void setInCountryEventSource(InCountryEventSourceType value) {
        this.inCountryEventSource = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneEventStatusType }
     *     
     */
    public TelephoneEventStatusType getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneEventStatusType }
     *     
     */
    public void setEventStatus(TelephoneEventStatusType value) {
        this.eventStatus = value;
    }

}
