
package aero.sita.iborders.aras.eventmanagementservicewsdltype.v11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.ReturnCodeType;
import aero.sita.iborders.aras.eventmanagement.v11_0.TelephoneEventGroupType;


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
 *         &lt;element name="EventGroups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TelephoneEventGroup" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}TelephoneEventGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "eventGroups",
    "returnCode"
})
@XmlRootElement(name = "FindTelephoneEventResponse")
public class FindTelephoneEventResponse {

    @XmlElement(name = "EventGroups")
    protected FindTelephoneEventResponse.EventGroups eventGroups;
    @XmlElement(name = "ReturnCode", required = true)
    protected ReturnCodeType returnCode;

    /**
     * Gets the value of the eventGroups property.
     * 
     * @return
     *     possible object is
     *     {@link FindTelephoneEventResponse.EventGroups }
     *     
     */
    public FindTelephoneEventResponse.EventGroups getEventGroups() {
        return eventGroups;
    }

    /**
     * Sets the value of the eventGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindTelephoneEventResponse.EventGroups }
     *     
     */
    public void setEventGroups(FindTelephoneEventResponse.EventGroups value) {
        this.eventGroups = value;
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
     *         &lt;element name="TelephoneEventGroup" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}TelephoneEventGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "telephoneEventGroup"
    })
    public static class EventGroups {

        @XmlElement(name = "TelephoneEventGroup")
        protected List<TelephoneEventGroupType> telephoneEventGroup;

        /**
         * Gets the value of the telephoneEventGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the telephoneEventGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTelephoneEventGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TelephoneEventGroupType }
         * 
         * 
         */
        public List<TelephoneEventGroupType> getTelephoneEventGroup() {
            if (telephoneEventGroup == null) {
                telephoneEventGroup = new ArrayList<TelephoneEventGroupType>();
            }
            return this.telephoneEventGroup;
        }

    }

}
