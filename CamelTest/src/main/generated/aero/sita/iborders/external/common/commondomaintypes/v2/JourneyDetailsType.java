
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JourneyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementDirection" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}MovementDirectionType"/>
 *         &lt;element name="ExpectedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyDetailsType", propOrder = {
    "movementDirection",
    "expectedDate"
})
@XmlSeeAlso({
    TravellerJourneyDetailsType.class,
    BorderCrossingJourneyDetailsType.class
})
public class JourneyDetailsType {

    @XmlElement(name = "MovementDirection", required = true)
    protected MovementDirectionType movementDirection;
    @XmlElement(name = "ExpectedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedDate;

    /**
     * Gets the value of the movementDirection property.
     * 
     * @return
     *     possible object is
     *     {@link MovementDirectionType }
     *     
     */
    public MovementDirectionType getMovementDirection() {
        return movementDirection;
    }

    /**
     * Sets the value of the movementDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementDirectionType }
     *     
     */
    public void setMovementDirection(MovementDirectionType value) {
        this.movementDirection = value;
    }

    /**
     * Gets the value of the expectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDate() {
        return expectedDate;
    }

    /**
     * Sets the value of the expectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDate(XMLGregorianCalendar value) {
        this.expectedDate = value;
    }

}
