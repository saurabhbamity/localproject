
package aero.sita.iborders.entryexit.movementservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Linked companion or endorsee movement
 * 
 * <p>Java class for MovementLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Endorsee" type="{http://sita.aero/iborders/entryExit/MovementService/V1}EndorseeLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Companion" type="{http://sita.aero/iborders/entryExit/MovementService/V1}CompanionLinkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementLinkType", propOrder = {
    "endorsee",
    "companion"
})
public class MovementLinkType {

    @XmlElement(name = "Endorsee", nillable = true)
    protected List<EndorseeLinkType> endorsee;
    @XmlElementRef(name = "Companion", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<CompanionLinkType> companion;

    /**
     * Gets the value of the endorsee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndorseeLinkType }
     * 
     * 
     */
    public List<EndorseeLinkType> getEndorsee() {
        if (endorsee == null) {
            endorsee = new ArrayList<EndorseeLinkType>();
        }
        return this.endorsee;
    }

    /**
     * Gets the value of the companion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanionLinkType }{@code >}
     *     
     */
    public JAXBElement<CompanionLinkType> getCompanion() {
        return companion;
    }

    /**
     * Sets the value of the companion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanionLinkType }{@code >}
     *     
     */
    public void setCompanion(JAXBElement<CompanionLinkType> value) {
        this.companion = ((JAXBElement<CompanionLinkType> ) value);
    }

}
