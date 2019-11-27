
package aero.sita.iborders.aras.eventmanagementservicewsdltype.v11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.IdentityType;
import aero.sita.iborders.aras.commontypes.v8_0.PagingType;
import aero.sita.iborders.aras.commontypes.v8_0.VisaApplicationEventStatusType;
import aero.sita.iborders.aras.eventmanagement.v11_0.GenericEventSearchCriteriaType;
import aero.sita.iborders.aras.eventmanagement.v11_0.SearchParametersType;


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
 *         &lt;element name="VisaApplicationEventStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaApplicationEventStatusType" minOccurs="0"/>
 *         &lt;element name="VisaApplicationEventSearchCriteria" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}GenericEventSearchCriteriaType" minOccurs="0"/>
 *         &lt;element name="Identity" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}IdentityType" minOccurs="0"/>
 *         &lt;element name="CustomizeSearchCriteria" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}SearchParametersType" maxOccurs="unbounded" minOccurs="0"/>
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
    "visaApplicationEventStatus",
    "visaApplicationEventSearchCriteria",
    "identity",
    "customizeSearchCriteria"
})
@XmlRootElement(name = "FindVisaApplicationEventRequest")
public class FindVisaApplicationEventRequest {

    @XmlElement(name = "Paging")
    protected PagingType paging;
    @XmlElement(name = "VisaApplicationEventStatus")
    protected VisaApplicationEventStatusType visaApplicationEventStatus;
    @XmlElement(name = "VisaApplicationEventSearchCriteria")
    protected GenericEventSearchCriteriaType visaApplicationEventSearchCriteria;
    @XmlElement(name = "Identity")
    protected IdentityType identity;
    @XmlElement(name = "CustomizeSearchCriteria")
    protected List<SearchParametersType> customizeSearchCriteria;

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
     * Gets the value of the visaApplicationEventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VisaApplicationEventStatusType }
     *     
     */
    public VisaApplicationEventStatusType getVisaApplicationEventStatus() {
        return visaApplicationEventStatus;
    }

    /**
     * Sets the value of the visaApplicationEventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaApplicationEventStatusType }
     *     
     */
    public void setVisaApplicationEventStatus(VisaApplicationEventStatusType value) {
        this.visaApplicationEventStatus = value;
    }

    /**
     * Gets the value of the visaApplicationEventSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link GenericEventSearchCriteriaType }
     *     
     */
    public GenericEventSearchCriteriaType getVisaApplicationEventSearchCriteria() {
        return visaApplicationEventSearchCriteria;
    }

    /**
     * Sets the value of the visaApplicationEventSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericEventSearchCriteriaType }
     *     
     */
    public void setVisaApplicationEventSearchCriteria(GenericEventSearchCriteriaType value) {
        this.visaApplicationEventSearchCriteria = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityType }
     *     
     */
    public IdentityType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityType }
     *     
     */
    public void setIdentity(IdentityType value) {
        this.identity = value;
    }

    /**
     * Gets the value of the customizeSearchCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizeSearchCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomizeSearchCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchParametersType }
     * 
     * 
     */
    public List<SearchParametersType> getCustomizeSearchCriteria() {
        if (customizeSearchCriteria == null) {
            customizeSearchCriteria = new ArrayList<SearchParametersType>();
        }
        return this.customizeSearchCriteria;
    }

}
