
package aero.sita.iborders.aras.person.v7_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.CodeType;
import aero.sita.iborders.aras.commontypes.v8_0.IdentityType;


/**
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExternalPersonId" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *         &lt;element name="NationalId" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *         &lt;element name="Identity" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}IdentityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Match" type="{http://sita.aero/iborders/aras/Person/V7_0}MatchType" minOccurs="0"/>
 *         &lt;element name="ManualReviewIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PossibleDuplicateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "personId",
    "externalPersonId",
    "nationalId",
    "identity",
    "match",
    "manualReviewIndicator",
    "possibleDuplicateIndicator"
})
public class PersonType {

    @XmlElement(name = "PersonId")
    protected Long personId;
    @XmlElement(name = "ExternalPersonId")
    protected CodeType externalPersonId;
    @XmlElement(name = "NationalId")
    protected CodeType nationalId;
    @XmlElement(name = "Identity")
    protected List<IdentityType> identity;
    @XmlElement(name = "Match")
    protected MatchType match;
    @XmlElement(name = "ManualReviewIndicator")
    protected Boolean manualReviewIndicator;
    @XmlElement(name = "PossibleDuplicateIndicator")
    protected Boolean possibleDuplicateIndicator;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

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

    /**
     * Gets the value of the identity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityType }
     * 
     * 
     */
    public List<IdentityType> getIdentity() {
        if (identity == null) {
            identity = new ArrayList<IdentityType>();
        }
        return this.identity;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link MatchType }
     *     
     */
    public MatchType getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchType }
     *     
     */
    public void setMatch(MatchType value) {
        this.match = value;
    }

    /**
     * Gets the value of the manualReviewIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualReviewIndicator() {
        return manualReviewIndicator;
    }

    /**
     * Sets the value of the manualReviewIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualReviewIndicator(Boolean value) {
        this.manualReviewIndicator = value;
    }

    /**
     * Gets the value of the possibleDuplicateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPossibleDuplicateIndicator() {
        return possibleDuplicateIndicator;
    }

    /**
     * Sets the value of the possibleDuplicateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPossibleDuplicateIndicator(Boolean value) {
        this.possibleDuplicateIndicator = value;
    }

}
