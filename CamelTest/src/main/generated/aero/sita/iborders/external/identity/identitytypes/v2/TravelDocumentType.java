
package aero.sita.iborders.external.identity.identitytypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commondomaintypes.v2.TravelDocumentCommonType;


/**
 * <p>Java class for TravelDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TravelDocumentCommonType">
 *       &lt;sequence>
 *         &lt;element name="IssueAuthority" type="{http://sita.aero/iborders/external/identity/IdentityTypes/V2}DocumentIssueAuthorityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDocumentType", propOrder = {
    "issueAuthority"
})
public class TravelDocumentType
    extends TravelDocumentCommonType
{

    @XmlElement(name = "IssueAuthority")
    protected String issueAuthority;

    /**
     * Gets the value of the issueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueAuthority() {
        return issueAuthority;
    }

    /**
     * Sets the value of the issueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueAuthority(String value) {
        this.issueAuthority = value;
    }

}
