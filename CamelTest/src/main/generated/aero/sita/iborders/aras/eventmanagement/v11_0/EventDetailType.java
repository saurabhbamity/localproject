
package aero.sita.iborders.aras.eventmanagement.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.EventDataType;
import aero.sita.iborders.aras.commontypes.v8_0.EventNameType;


/**
 * A Event Detail provides the information for the
 * 				event and its related person
 * 			
 * 
 * <p>Java class for EventDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EventType" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventNameType"/>
 *         &lt;element name="EventStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomizeResponseCriteria" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}SearchParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDetailType", propOrder = {
    "eventSource",
    "eventType",
    "eventStatus",
    "customizeResponseCriteria"
})
public class EventDetailType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected String eventSource;
    @XmlElement(name = "EventType", required = true)
    protected EventNameType eventType;
    @XmlElement(name = "EventStatus", required = true)
    protected String eventStatus;
    @XmlElement(name = "CustomizeResponseCriteria")
    protected List<SearchParametersType> customizeResponseCriteria;

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSource(String value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventNameType }
     *     
     */
    public EventNameType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventNameType }
     *     
     */
    public void setEventType(EventNameType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStatus(String value) {
        this.eventStatus = value;
    }

    /**
     * Gets the value of the customizeResponseCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizeResponseCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomizeResponseCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchParametersType }
     * 
     * 
     */
    public List<SearchParametersType> getCustomizeResponseCriteria() {
        if (customizeResponseCriteria == null) {
            customizeResponseCriteria = new ArrayList<SearchParametersType>();
        }
        return this.customizeResponseCriteria;
    }

}
