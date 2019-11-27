
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Event Detail Sources
 * 
 * <p>Java class for EventDetailSourceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDetailSourceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDetailSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDetailSourceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDetailSourceListType", propOrder = {
    "eventDetailSource"
})
public class EventDetailSourceListType {

    @XmlElement(name = "EventDetailSource", required = true)
    protected List<EventDetailSourceType> eventDetailSource;

    /**
     * Gets the value of the eventDetailSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDetailSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDetailSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDetailSourceType }
     * 
     * 
     */
    public List<EventDetailSourceType> getEventDetailSource() {
        if (eventDetailSource == null) {
            eventDetailSource = new ArrayList<EventDetailSourceType>();
        }
        return this.eventDetailSource;
    }

}
