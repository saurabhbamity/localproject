
package aero.sita.iborders.aras.eventmanagementservicewsdltype.v11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.ReturnCodeType;
import aero.sita.iborders.aras.eventmanagement.v11_0.ExpectedMovementEventGroupType;


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
 *                   &lt;element name="ExpectedMovementEventGroup" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}ExpectedMovementEventGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "FindExpectedMovementEventResponse")
public class FindExpectedMovementEventResponse {

    @XmlElement(name = "EventGroups")
    protected FindExpectedMovementEventResponse.EventGroups eventGroups;
    @XmlElement(name = "ReturnCode", required = true)
    protected ReturnCodeType returnCode;

    /**
     * Gets the value of the eventGroups property.
     * 
     * @return
     *     possible object is
     *     {@link FindExpectedMovementEventResponse.EventGroups }
     *     
     */
    public FindExpectedMovementEventResponse.EventGroups getEventGroups() {
        return eventGroups;
    }

    /**
     * Sets the value of the eventGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindExpectedMovementEventResponse.EventGroups }
     *     
     */
    public void setEventGroups(FindExpectedMovementEventResponse.EventGroups value) {
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
     *         &lt;element name="ExpectedMovementEventGroup" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}ExpectedMovementEventGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "expectedMovementEventGroup"
    })
    public static class EventGroups {

        @XmlElement(name = "ExpectedMovementEventGroup")
        protected List<ExpectedMovementEventGroupType> expectedMovementEventGroup;

        /**
         * Gets the value of the expectedMovementEventGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the expectedMovementEventGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExpectedMovementEventGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExpectedMovementEventGroupType }
         * 
         * 
         */
        public List<ExpectedMovementEventGroupType> getExpectedMovementEventGroup() {
            if (expectedMovementEventGroup == null) {
                expectedMovementEventGroup = new ArrayList<ExpectedMovementEventGroupType>();
            }
            return this.expectedMovementEventGroup;
        }

    }

}
