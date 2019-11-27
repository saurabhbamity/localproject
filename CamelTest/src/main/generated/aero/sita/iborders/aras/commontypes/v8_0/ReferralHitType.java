
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This determines whether there was a Referral hit for the request
 *                       
 * 
 * <p>Java class for ReferralHitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferralHitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PrimaryLineActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryLineSubAction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferralStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferralHitType", propOrder = {
    "refId",
    "eventId",
    "primaryLineActionCode",
    "primaryLineSubAction",
    "referralStatus"
})
public class ReferralHitType {

    @XmlElement(name = "RefId")
    protected long refId;
    @XmlElement(name = "EventId")
    protected long eventId;
    @XmlElement(name = "PrimaryLineActionCode")
    protected String primaryLineActionCode;
    @XmlElement(name = "PrimaryLineSubAction")
    protected List<String> primaryLineSubAction;
    @XmlElement(name = "ReferralStatus", required = true)
    protected String referralStatus;

    /**
     * Gets the value of the refId property.
     * 
     */
    public long getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     */
    public void setRefId(long value) {
        this.refId = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     */
    public long getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     */
    public void setEventId(long value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the primaryLineActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLineActionCode() {
        return primaryLineActionCode;
    }

    /**
     * Sets the value of the primaryLineActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLineActionCode(String value) {
        this.primaryLineActionCode = value;
    }

    /**
     * Gets the value of the primaryLineSubAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryLineSubAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryLineSubAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrimaryLineSubAction() {
        if (primaryLineSubAction == null) {
            primaryLineSubAction = new ArrayList<String>();
        }
        return this.primaryLineSubAction;
    }

    /**
     * Gets the value of the referralStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralStatus() {
        return referralStatus;
    }

    /**
     * Sets the value of the referralStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralStatus(String value) {
        this.referralStatus = value;
    }

}
