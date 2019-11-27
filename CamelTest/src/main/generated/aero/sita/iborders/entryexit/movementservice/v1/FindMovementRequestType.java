
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request object for finding movements by criteria
 * 
 * <p>Java class for FindMovementRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindMovementRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FindMovementCriteria" type="{http://sita.aero/iborders/entryExit/MovementService/V1}FindMovementCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMovementRequestType", propOrder = {
    "findMovementCriteria"
})
public class FindMovementRequestType {

    @XmlElement(name = "FindMovementCriteria", required = true)
    protected FindMovementCriteriaType findMovementCriteria;

    /**
     * Gets the value of the findMovementCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FindMovementCriteriaType }
     *     
     */
    public FindMovementCriteriaType getFindMovementCriteria() {
        return findMovementCriteria;
    }

    /**
     * Sets the value of the findMovementCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindMovementCriteriaType }
     *     
     */
    public void setFindMovementCriteria(FindMovementCriteriaType value) {
        this.findMovementCriteria = value;
    }

}
