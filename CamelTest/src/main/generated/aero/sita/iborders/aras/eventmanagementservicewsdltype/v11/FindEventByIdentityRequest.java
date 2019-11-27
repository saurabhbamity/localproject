
package aero.sita.iborders.aras.eventmanagementservicewsdltype.v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.PagingType;
import aero.sita.iborders.aras.eventmanagement.v11_0.FindEventByIdentityType;


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
 *         &lt;element name="FindEventByIdentity" type="{http://sita.aero/iborders/aras/EventManagement/V11_0}FindEventByIdentityType"/>
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
    "findEventByIdentity"
})
@XmlRootElement(name = "FindEventByIdentityRequest")
public class FindEventByIdentityRequest {

    @XmlElement(name = "Paging")
    protected PagingType paging;
    @XmlElement(name = "FindEventByIdentity", required = true)
    protected FindEventByIdentityType findEventByIdentity;

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
     * Gets the value of the findEventByIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link FindEventByIdentityType }
     *     
     */
    public FindEventByIdentityType getFindEventByIdentity() {
        return findEventByIdentity;
    }

    /**
     * Sets the value of the findEventByIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindEventByIdentityType }
     *     
     */
    public void setFindEventByIdentity(FindEventByIdentityType value) {
        this.findEventByIdentity = value;
    }

}
