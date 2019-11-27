
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request object for selecting movements by criteria
 * 
 * <p>Java class for ListMovementRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListMovementRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListMovementCriteria" type="{http://sita.aero/iborders/entryExit/MovementService/V1}ListMovementCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListMovementRequestType", propOrder = {
    "listMovementCriteria"
})
public class ListMovementRequestType {

    @XmlElement(name = "ListMovementCriteria", required = true)
    protected ListMovementCriteriaType listMovementCriteria;

    /**
     * Gets the value of the listMovementCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ListMovementCriteriaType }
     *     
     */
    public ListMovementCriteriaType getListMovementCriteria() {
        return listMovementCriteria;
    }

    /**
     * Sets the value of the listMovementCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMovementCriteriaType }
     *     
     */
    public void setListMovementCriteria(ListMovementCriteriaType value) {
        this.listMovementCriteria = value;
    }

}
