
package aero.sita.iborders.aras.person.v7_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.CodeType;


/**
 * <p>Java class for PersonIdSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalPersonId" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *         &lt;element name="NationalId" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdSearchCriteriaType", propOrder = {
    "externalPersonId",
    "nationalId"
})
public class PersonIdSearchCriteriaType {

    @XmlElement(name = "ExternalPersonId")
    protected CodeType externalPersonId;
    @XmlElement(name = "NationalId")
    protected CodeType nationalId;

    /**
     * Gets the value of the externalPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getExternalPersonId() {
        return externalPersonId;
    }

    /**
     * Sets the value of the externalPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setExternalPersonId(CodeType value) {
        this.externalPersonId = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setNationalId(CodeType value) {
        this.nationalId = value;
    }

}
