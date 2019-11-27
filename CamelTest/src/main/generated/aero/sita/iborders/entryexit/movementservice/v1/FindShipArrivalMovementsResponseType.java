
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Full Passenger List of a Ship
 * 
 * <p>Java class for FindShipArrivalMovementsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindShipArrivalMovementsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerArrivalLists" type="{http://sita.aero/iborders/entryExit/MovementService/V1}PassengerArrivalListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindShipArrivalMovementsResponseType", propOrder = {
    "passengerArrivalLists"
})
public class FindShipArrivalMovementsResponseType {

    @XmlElement(name = "PassengerArrivalLists")
    protected PassengerArrivalListType passengerArrivalLists;

    /**
     * Gets the value of the passengerArrivalLists property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerArrivalListType }
     *     
     */
    public PassengerArrivalListType getPassengerArrivalLists() {
        return passengerArrivalLists;
    }

    /**
     * Sets the value of the passengerArrivalLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerArrivalListType }
     *     
     */
    public void setPassengerArrivalLists(PassengerArrivalListType value) {
        this.passengerArrivalLists = value;
    }

}
