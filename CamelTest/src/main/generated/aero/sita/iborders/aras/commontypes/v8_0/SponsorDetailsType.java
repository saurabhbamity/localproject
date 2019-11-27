
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 Sponsor details in case of companion departure.
 *             
 * 
 * <p>Java class for SponsorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SponsorDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityDetails" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}IdentityCommonType" minOccurs="0"/>
 *         &lt;element name="DocumentDetails" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TravelDocumentCommonType" minOccurs="0"/>
 *         &lt;element name="CompanionRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SponsorDetailsType", propOrder = {
    "identityDetails",
    "documentDetails",
    "companionRelationship",
    "arrivalDateTime"
})
public class SponsorDetailsType {

    @XmlElement(name = "IdentityDetails")
    protected IdentityCommonType identityDetails;
    @XmlElement(name = "DocumentDetails")
    protected TravelDocumentCommonType documentDetails;
    @XmlElement(name = "CompanionRelationship")
    protected String companionRelationship;
    @XmlElement(name = "ArrivalDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;

    /**
     * Gets the value of the identityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityCommonType }
     *     
     */
    public IdentityCommonType getIdentityDetails() {
        return identityDetails;
    }

    /**
     * Sets the value of the identityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityCommonType }
     *     
     */
    public void setIdentityDetails(IdentityCommonType value) {
        this.identityDetails = value;
    }

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocumentCommonType }
     *     
     */
    public TravelDocumentCommonType getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocumentCommonType }
     *     
     */
    public void setDocumentDetails(TravelDocumentCommonType value) {
        this.documentDetails = value;
    }

    /**
     * Gets the value of the companionRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanionRelationship() {
        return companionRelationship;
    }

    /**
     * Sets the value of the companionRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanionRelationship(String value) {
        this.companionRelationship = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

}
