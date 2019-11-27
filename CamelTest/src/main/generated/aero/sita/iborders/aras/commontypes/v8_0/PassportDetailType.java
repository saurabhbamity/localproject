
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Status is mandatory field and it drives the other
 *                 information whether to send or not.NA if error/timeout, NF if not
 *                 found
 *             
 * 
 * <p>Java class for PassportDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassportDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassportReferenceData" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="Passport" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PassportType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PassportReferenceDataStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassportDetailType", propOrder = {
    "passportReferenceData",
    "passport",
    "status"
})
public class PassportDetailType {

    @XmlElement(name = "PassportReferenceData")
    protected ReferenceDataType passportReferenceData;
    @XmlElement(name = "Passport")
    protected PassportType passport;
    @XmlElement(name = "Status", required = true)
    protected PassportReferenceDataStatusType status;

    /**
     * Gets the value of the passportReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getPassportReferenceData() {
        return passportReferenceData;
    }

    /**
     * Sets the value of the passportReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setPassportReferenceData(ReferenceDataType value) {
        this.passportReferenceData = value;
    }

    /**
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link PassportType }
     *     
     */
    public PassportType getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportType }
     *     
     */
    public void setPassport(PassportType value) {
        this.passport = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PassportReferenceDataStatusType }
     *     
     */
    public PassportReferenceDataStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportReferenceDataStatusType }
     *     
     */
    public void setStatus(PassportReferenceDataStatusType value) {
        this.status = value;
    }

}
