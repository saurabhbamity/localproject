
package aero.sita.iborders.aras.eventmanagement.v11_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.SystemIndicatorType;
import aero.sita.iborders.aras.commontypes.v8_0.TimeRangeType;


/**
 * Contains list of Events List and Identity criteria
 * 			
 * 
 * <p>Java class for GenericEventSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericEventSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DateRange" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TimeRangeType"/>
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
@XmlType(name = "GenericEventSearchCriteriaType", propOrder = {
    "identityId",
    "personId",
    "dateRange",
    "isDetailed"
})
public class GenericEventSearchCriteriaType {

    @XmlElement(name = "IdentityId")
    protected Long identityId;
    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "DateRange", required = true)
    protected TimeRangeType dateRange;
    @XmlElement(name = "IsDetailed", required = true, defaultValue = "N")
    protected SystemIndicatorType isDetailed;

    /**
     * Gets the value of the identityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentityId() {
        return identityId;
    }

    /**
     * Sets the value of the identityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentityId(Long value) {
        this.identityId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRangeType }
     *     
     */
    public TimeRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRangeType }
     *     
     */
    public void setDateRange(TimeRangeType value) {
        this.dateRange = value;
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
