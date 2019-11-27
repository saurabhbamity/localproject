
package aero.sita.iborders.entryexit.movementservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Request object for Cancel Movement operation
 * 
 * <p>Java class for CancelMovementRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelMovementRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementId" type="{http://sita.aero/iborders/entryExit/Common/V1}guid" maxOccurs="unbounded"/>
 *         &lt;element name="CancelledBy" type="{http://sita.aero/iborders/entryExit/Common/V1}userName"/>
 *         &lt;element name="CancelledUserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CancelledOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelMovementRequestType", propOrder = {
    "movementId",
    "cancelledBy",
    "cancelledUserName",
    "cancelledOn"
})
public class CancelMovementRequestType {

    @XmlElement(name = "MovementId", required = true)
    protected List<String> movementId;
    @XmlElement(name = "CancelledBy", required = true)
    protected String cancelledBy;
    @XmlElement(name = "CancelledUserName")
    protected String cancelledUserName;
    @XmlElement(name = "CancelledOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelledOn;

    /**
     * Gets the value of the movementId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movementId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovementId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMovementId() {
        if (movementId == null) {
            movementId = new ArrayList<String>();
        }
        return this.movementId;
    }

    /**
     * Gets the value of the cancelledBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledBy() {
        return cancelledBy;
    }

    /**
     * Sets the value of the cancelledBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledBy(String value) {
        this.cancelledBy = value;
    }

    /**
     * Gets the value of the cancelledUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledUserName() {
        return cancelledUserName;
    }

    /**
     * Sets the value of the cancelledUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledUserName(String value) {
        this.cancelledUserName = value;
    }

    /**
     * Gets the value of the cancelledOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelledOn() {
        return cancelledOn;
    }

    /**
     * Sets the value of the cancelledOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelledOn(XMLGregorianCalendar value) {
        this.cancelledOn = value;
    }

}
