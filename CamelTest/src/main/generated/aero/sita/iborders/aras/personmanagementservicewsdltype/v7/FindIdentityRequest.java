
package aero.sita.iborders.aras.personmanagementservicewsdltype.v7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.PagingType;
import aero.sita.iborders.aras.person.v7_0.IdentitySearchCriteriaType;


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
 *         &lt;element name="IdentitySearchCriteria" type="{http://sita.aero/iborders/aras/Person/V7_0}IdentitySearchCriteriaType"/>
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
    "identitySearchCriteria"
})
@XmlRootElement(name = "FindIdentityRequest")
public class FindIdentityRequest {

    @XmlElement(name = "Paging")
    protected PagingType paging;
    @XmlElement(name = "IdentitySearchCriteria", required = true)
    protected IdentitySearchCriteriaType identitySearchCriteria;

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
     * Gets the value of the identitySearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link IdentitySearchCriteriaType }
     *     
     */
    public IdentitySearchCriteriaType getIdentitySearchCriteria() {
        return identitySearchCriteria;
    }

    /**
     * Sets the value of the identitySearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentitySearchCriteriaType }
     *     
     */
    public void setIdentitySearchCriteria(IdentitySearchCriteriaType value) {
        this.identitySearchCriteria = value;
    }

}
