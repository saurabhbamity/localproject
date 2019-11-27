
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information of Incourntry Evnet Source.
 *                     
 * 
 * <p>Java class for InCountryEventSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InCountryEventSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutletIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OutletName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InCountryEventSourceType", propOrder = {
    "groupName",
    "outletIdentifier",
    "outletName",
    "userId"
})
public class InCountryEventSourceType {

    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "OutletIdentifier", required = true)
    protected String outletIdentifier;
    @XmlElement(name = "OutletName")
    protected String outletName;
    @XmlElement(name = "UserId")
    protected String userId;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the outletIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutletIdentifier() {
        return outletIdentifier;
    }

    /**
     * Sets the value of the outletIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutletIdentifier(String value) {
        this.outletIdentifier = value;
    }

    /**
     * Gets the value of the outletName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutletName() {
        return outletName;
    }

    /**
     * Sets the value of the outletName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutletName(String value) {
        this.outletName = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
