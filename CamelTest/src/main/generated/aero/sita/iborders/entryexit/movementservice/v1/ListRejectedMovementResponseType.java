
package aero.sita.iborders.entryexit.movementservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response object for the List of Rejected movements
 * 
 * <p>Java class for ListRejectedMovementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRejectedMovementResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RejectedMovementList" type="{http://sita.aero/iborders/entryExit/MovementService/V1}RejectedMovementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRejectedMovementResponseType", propOrder = {
    "rejectedMovementList"
})
public class ListRejectedMovementResponseType {

    @XmlElement(name = "RejectedMovementList")
    protected List<RejectedMovementType> rejectedMovementList;

    /**
     * Gets the value of the rejectedMovementList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectedMovementList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectedMovementList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectedMovementType }
     * 
     * 
     */
    public List<RejectedMovementType> getRejectedMovementList() {
        if (rejectedMovementList == null) {
            rejectedMovementList = new ArrayList<RejectedMovementType>();
        }
        return this.rejectedMovementList;
    }

}
