
package aero.sita.iborders.external.identity.identitytypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commondomaintypes.v1.TravelDocumentCommonType;


/**
 * <p>Java class for TravelDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}TravelDocumentCommonType">
 *       &lt;sequence>
 *         &lt;element name="IssueAuthority" type="{http://sita.aero/iborders/external/identity/IdentityTypes/V1}DocumentIssueAuthorityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsEndorsee" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    @XmlAttribute(name = "IsEndorsee")
    protected Boolean isEndorsee;

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

    /**
     * Gets the value of the isEndorsee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEndorsee() {
        return isEndorsee;
    }

    /**
     * Sets the value of the isEndorsee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEndorsee(Boolean value) {
        this.isEndorsee = value;
    }

}
