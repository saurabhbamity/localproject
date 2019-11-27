
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerArrivalListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerArrivalListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartingPassengerList" type="{http://sita.aero/iborders/entryExit/MovementService/V1}MovementListType"/>
 *         &lt;element name="ExclusionList" type="{http://sita.aero/iborders/entryExit/MovementService/V1}MovementListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerArrivalListType", propOrder = {
    "departingPassengerList",
    "exclusionList"
})
public class PassengerArrivalListType {

    @XmlElement(name = "DepartingPassengerList", required = true)
    protected MovementListType departingPassengerList;
    @XmlElement(name = "ExclusionList", required = true)
    protected MovementListType exclusionList;

    /**
     * Gets the value of the departingPassengerList property.
     * 
     * @return
     *     possible object is
     *     {@link MovementListType }
     *     
     */
    public MovementListType getDepartingPassengerList() {
        return departingPassengerList;
    }

    /**
     * Sets the value of the departingPassengerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementListType }
     *     
     */
    public void setDepartingPassengerList(MovementListType value) {
        this.departingPassengerList = value;
    }

    /**
     * Gets the value of the exclusionList property.
     * 
     * @return
     *     possible object is
     *     {@link MovementListType }
     *     
     */
    public MovementListType getExclusionList() {
        return exclusionList;
    }

    /**
     * Sets the value of the exclusionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementListType }
     *     
     */
    public void setExclusionList(MovementListType value) {
        this.exclusionList = value;
    }

}
