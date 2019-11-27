
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details of a person's Identity. This type
 *                 is used across multiple places
 *             
 * 
 * <p>Java class for IdentityCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivenNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalisedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birth" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}BirthType" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CountryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityCommonType", propOrder = {
    "familyName",
    "givenNames",
    "localisedName",
    "birth",
    "nationality"
})
@XmlSeeAlso({
    ReferenceDataType.class,
    VisaPortalUserAccountType.class,
    IdentityType.class,
    TargetBasicInfoType.class
})
public class IdentityCommonType {

    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "GivenNames")
    protected String givenNames;
    @XmlElement(name = "LocalisedName")
    protected String localisedName;
    @XmlElement(name = "Birth")
    protected BirthType birth;
    @XmlElement(name = "Nationality")
    protected String nationality;

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the givenNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNames() {
        return givenNames;
    }

    /**
     * Sets the value of the givenNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNames(String value) {
        this.givenNames = value;
    }

    /**
     * Gets the value of the localisedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisedName() {
        return localisedName;
    }

    /**
     * Sets the value of the localisedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisedName(String value) {
        this.localisedName = value;
    }

    /**
     * Gets the value of the birth property.
     * 
     * @return
     *     possible object is
     *     {@link BirthType }
     *     
     */
    public BirthType getBirth() {
        return birth;
    }

    /**
     * Sets the value of the birth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthType }
     *     
     */
    public void setBirth(BirthType value) {
        this.birth = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

}
