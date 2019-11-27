
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaApplicationEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaApplicationEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaApplicationEventSourceType"/>
 *         &lt;element name="VisaApplicationData" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaApplicationDataType"/>
 *         &lt;element name="VisaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociatedDocs" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}AssociatedDocsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternalEvents" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}InternalEventsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaApplicationEventType", propOrder = {
    "eventSource",
    "visaApplicationData",
    "visaType",
    "visaSubType",
    "visaApplicationType",
    "associatedDocs",
    "internalEvents"
})
public class VisaApplicationEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected VisaApplicationEventSourceType eventSource;
    @XmlElement(name = "VisaApplicationData", required = true)
    protected VisaApplicationDataType visaApplicationData;
    @XmlElement(name = "VisaType")
    protected String visaType;
    @XmlElement(name = "VisaSubType")
    protected String visaSubType;
    @XmlElement(name = "VisaApplicationType")
    protected String visaApplicationType;
    @XmlElement(name = "AssociatedDocs")
    protected List<AssociatedDocsType> associatedDocs;
    @XmlElement(name = "InternalEvents")
    protected List<InternalEventsType> internalEvents;

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link VisaApplicationEventSourceType }
     *     
     */
    public VisaApplicationEventSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaApplicationEventSourceType }
     *     
     */
    public void setEventSource(VisaApplicationEventSourceType value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the visaApplicationData property.
     * 
     * @return
     *     possible object is
     *     {@link VisaApplicationDataType }
     *     
     */
    public VisaApplicationDataType getVisaApplicationData() {
        return visaApplicationData;
    }

    /**
     * Sets the value of the visaApplicationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaApplicationDataType }
     *     
     */
    public void setVisaApplicationData(VisaApplicationDataType value) {
        this.visaApplicationData = value;
    }

    /**
     * Gets the value of the visaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaType() {
        return visaType;
    }

    /**
     * Sets the value of the visaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaType(String value) {
        this.visaType = value;
    }

    /**
     * Gets the value of the visaSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaSubType() {
        return visaSubType;
    }

    /**
     * Sets the value of the visaSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaSubType(String value) {
        this.visaSubType = value;
    }

    /**
     * Gets the value of the visaApplicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaApplicationType() {
        return visaApplicationType;
    }

    /**
     * Sets the value of the visaApplicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaApplicationType(String value) {
        this.visaApplicationType = value;
    }

    /**
     * Gets the value of the associatedDocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedDocsType }
     * 
     * 
     */
    public List<AssociatedDocsType> getAssociatedDocs() {
        if (associatedDocs == null) {
            associatedDocs = new ArrayList<AssociatedDocsType>();
        }
        return this.associatedDocs;
    }

    /**
     * Gets the value of the internalEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalEventsType }
     * 
     * 
     */
    public List<InternalEventsType> getInternalEvents() {
        if (internalEvents == null) {
            internalEvents = new ArrayList<InternalEventsType>();
        }
        return this.internalEvents;
    }

}
