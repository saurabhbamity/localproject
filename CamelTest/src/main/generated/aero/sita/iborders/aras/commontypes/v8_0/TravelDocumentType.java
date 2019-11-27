
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TravelDocumentCommonType">
 *       &lt;sequence>
 *         &lt;element name="DocumentIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "documentIssueAuthority",
    "documentIssuePlace"
})
public class TravelDocumentType
    extends TravelDocumentCommonType
{

    @XmlElement(name = "DocumentIssueAuthority")
    protected String documentIssueAuthority;
    @XmlElement(name = "DocumentIssuePlace")
    protected String documentIssuePlace;
    @XmlAttribute(name = "IsEndorsee")
    protected Boolean isEndorsee;

    /**
     * Gets the value of the documentIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssueAuthority() {
        return documentIssueAuthority;
    }

    /**
     * Sets the value of the documentIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssueAuthority(String value) {
        this.documentIssueAuthority = value;
    }

    /**
     * Gets the value of the documentIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssuePlace() {
        return documentIssuePlace;
    }

    /**
     * Sets the value of the documentIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssuePlace(String value) {
        this.documentIssuePlace = value;
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
