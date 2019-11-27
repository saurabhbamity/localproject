
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.entryexit.common.v1.CompanionLink;


/**
 * Links relating to a Companion
 * 
 * <p>Java class for CompanionLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanionLinkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/entryExit/MovementService/V1}MovementLinkBaseType">
 *       &lt;sequence>
 *         &lt;element name="LinkTo" type="{http://sita.aero/iborders/entryExit/Common/V1}guid"/>
 *         &lt;element name="LinkType" type="{http://sita.aero/iborders/entryExit/Common/V1}companionLink" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanionLinkType", propOrder = {
    "linkTo",
    "linkType"
})
public class CompanionLinkType
    extends MovementLinkBaseType
{

    @XmlElement(name = "LinkTo", required = true)
    protected String linkTo;
    @XmlElement(name = "LinkType")
    protected CompanionLink linkType;

    /**
     * Gets the value of the linkTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTo() {
        return linkTo;
    }

    /**
     * Sets the value of the linkTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTo(String value) {
        this.linkTo = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanionLink }
     *     
     */
    public CompanionLink getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanionLink }
     *     
     */
    public void setLinkType(CompanionLink value) {
        this.linkType = value;
    }

}
