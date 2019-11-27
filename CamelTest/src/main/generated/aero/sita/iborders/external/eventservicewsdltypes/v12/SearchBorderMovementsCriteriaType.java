
package aero.sita.iborders.external.eventservicewsdltypes.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commontypes.v1.DateRangeType;
import aero.sita.iborders.external.event.movementeventtypes.v2.MovementEventStatusType;


/**
 * Search criteria to use to find border movements.
 * 
 * <p>Java class for SearchBorderMovementsCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBorderMovementsCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementEventStatus" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}MovementEventStatusType" minOccurs="0"/>
 *         &lt;element name="DateRange" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}DateRangeType"/>
 *         &lt;element name="Identity" type="{http://sita.aero/iborders/external/EventServiceWSDLTypes/V12}SearchIdentityCriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBorderMovementsCriteriaType", propOrder = {
    "movementEventStatus",
    "dateRange",
    "identity"
})
public class SearchBorderMovementsCriteriaType {

    @XmlElement(name = "MovementEventStatus")
    protected MovementEventStatusType movementEventStatus;
    @XmlElement(name = "DateRange", required = true)
    protected DateRangeType dateRange;
    @XmlElement(name = "Identity")
    protected SearchIdentityCriteriaType identity;

    /**
     * Gets the value of the movementEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MovementEventStatusType }
     *     
     */
    public MovementEventStatusType getMovementEventStatus() {
        return movementEventStatus;
    }

    /**
     * Sets the value of the movementEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementEventStatusType }
     *     
     */
    public void setMovementEventStatus(MovementEventStatusType value) {
        this.movementEventStatus = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setDateRange(DateRangeType value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link SearchIdentityCriteriaType }
     *     
     */
    public SearchIdentityCriteriaType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIdentityCriteriaType }
     *     
     */
    public void setIdentity(SearchIdentityCriteriaType value) {
        this.identity = value;
    }

}
