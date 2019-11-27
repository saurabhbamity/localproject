
package aero.sita.iborders.external.common.commondomaintypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details of the Travellers journey or transportation.
 * 
 * <p>Java class for TravellerJourneyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerJourneyDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}JourneyDetailsType">
 *       &lt;sequence>
 *         &lt;element name="TravellerType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}TravellerType"/>
 *         &lt;element name="TravelType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}TravelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerJourneyDetailsType", propOrder = {
    "travellerType",
    "travelType"
})
public class TravellerJourneyDetailsType
    extends JourneyDetailsType
{

    @XmlElement(name = "TravellerType", required = true)
    protected TravellerType travellerType;
    @XmlElement(name = "TravelType")
    protected TravelType travelType;

    /**
     * Gets the value of the travellerType property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerType }
     *     
     */
    public TravellerType getTravellerType() {
        return travellerType;
    }

    /**
     * Sets the value of the travellerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerType }
     *     
     */
    public void setTravellerType(TravellerType value) {
        this.travellerType = value;
    }

    /**
     * Gets the value of the travelType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelType }
     *     
     */
    public TravelType getTravelType() {
        return travelType;
    }

    /**
     * Sets the value of the travelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelType }
     *     
     */
    public void setTravelType(TravelType value) {
        this.travelType = value;
    }

}
