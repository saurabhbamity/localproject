
package aero.sita.iborders.aras.person.v7_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.aras.commontypes.v8_0.GenderType;


/**
 * <p>Java class for PersonSearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonSearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FindPersonByDocumentCriteria" type="{http://sita.aero/iborders/aras/Person/V7_0}FindPersonByDocumentCriteriaType"/>
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivenNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}GenderType" minOccurs="0"/>
 *         &lt;element name="DateofBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "PersonSearchCriteriaType", propOrder = {
    "findPersonByDocumentCriteria",
    "familyName",
    "givenNames",
    "gender",
    "dateofBirth",
    "nationality"
})
public class PersonSearchCriteriaType {

    @XmlElement(name = "FindPersonByDocumentCriteria", required = true)
    protected FindPersonByDocumentCriteriaType findPersonByDocumentCriteria;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "GivenNames")
    protected String givenNames;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "DateofBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateofBirth;
    @XmlElement(name = "Nationality")
    protected String nationality;

    /**
     * Gets the value of the findPersonByDocumentCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FindPersonByDocumentCriteriaType }
     *     
     */
    public FindPersonByDocumentCriteriaType getFindPersonByDocumentCriteria() {
        return findPersonByDocumentCriteria;
    }

    /**
     * Sets the value of the findPersonByDocumentCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindPersonByDocumentCriteriaType }
     *     
     */
    public void setFindPersonByDocumentCriteria(FindPersonByDocumentCriteriaType value) {
        this.findPersonByDocumentCriteria = value;
    }

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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dateofBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateofBirth() {
        return dateofBirth;
    }

    /**
     * Sets the value of the dateofBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateofBirth(XMLGregorianCalendar value) {
        this.dateofBirth = value;
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
