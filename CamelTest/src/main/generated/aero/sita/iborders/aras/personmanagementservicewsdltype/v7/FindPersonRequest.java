
package aero.sita.iborders.aras.personmanagementservicewsdltype.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.PagingType;
import aero.sita.iborders.aras.person.v7_0.PersonIdSearchCriteriaType;
import aero.sita.iborders.aras.person.v7_0.PersonSearchCriteriaType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Paging" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PagingType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="PersonSearchCriteria" type="{http://sita.aero/iborders/aras/Person/V7_0}PersonSearchCriteriaType"/>
 *           &lt;element name="PersonIdSearchCriteria" type="{http://sita.aero/iborders/aras/Person/V7_0}PersonIdSearchCriteriaType"/>
 *         &lt;/choice>
 *         &lt;element name="EnableWildcard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paging",
    "personSearchCriteria",
    "personIdSearchCriteria",
    "enableWildcard"
})
@XmlRootElement(name = "FindPersonRequest")
public class FindPersonRequest {

    @XmlElement(name = "Paging")
    protected PagingType paging;
    @XmlElement(name = "PersonSearchCriteria")
    protected PersonSearchCriteriaType personSearchCriteria;
    @XmlElement(name = "PersonIdSearchCriteria")
    protected PersonIdSearchCriteriaType personIdSearchCriteria;
    @XmlElement(name = "EnableWildcard")
    protected Boolean enableWildcard;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link PagingType }
     *     
     */
    public PagingType getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingType }
     *     
     */
    public void setPaging(PagingType value) {
        this.paging = value;
    }

    /**
     * Gets the value of the personSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PersonSearchCriteriaType }
     *     
     */
    public PersonSearchCriteriaType getPersonSearchCriteria() {
        return personSearchCriteria;
    }

    /**
     * Sets the value of the personSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonSearchCriteriaType }
     *     
     */
    public void setPersonSearchCriteria(PersonSearchCriteriaType value) {
        this.personSearchCriteria = value;
    }

    /**
     * Gets the value of the personIdSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdSearchCriteriaType }
     *     
     */
    public PersonIdSearchCriteriaType getPersonIdSearchCriteria() {
        return personIdSearchCriteria;
    }

    /**
     * Sets the value of the personIdSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdSearchCriteriaType }
     *     
     */
    public void setPersonIdSearchCriteria(PersonIdSearchCriteriaType value) {
        this.personIdSearchCriteria = value;
    }

    /**
     * Gets the value of the enableWildcard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableWildcard() {
        return enableWildcard;
    }

    /**
     * Sets the value of the enableWildcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableWildcard(Boolean value) {
        this.enableWildcard = value;
    }

}
