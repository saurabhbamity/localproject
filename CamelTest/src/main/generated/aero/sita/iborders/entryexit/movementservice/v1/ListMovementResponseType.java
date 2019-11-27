
package aero.sita.iborders.entryexit.movementservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  List of Movements fitting the search criteria
 * 
 * <p>Java class for ListMovementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListMovementResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaggedMovement" type="{http://sita.aero/iborders/entryExit/MovementService/V1}TaggedMovementType" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListMovementResponseType", propOrder = {
    "taggedMovement"
})
public class ListMovementResponseType {

    @XmlElement(name = "TaggedMovement")
    protected List<TaggedMovementType> taggedMovement;

    /**
     * Gets the value of the taggedMovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taggedMovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaggedMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaggedMovementType }
     * 
     * 
     */
    public List<TaggedMovementType> getTaggedMovement() {
        if (taggedMovement == null) {
            taggedMovement = new ArrayList<TaggedMovementType>();
        }
        return this.taggedMovement;
    }

}
