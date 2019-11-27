
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Status is mandatory field and it drives the other
 *                 information whether to send or not. NA if error/timeout, NF if not
 *                 found
 *             
 * 
 * <p>Java class for VisaDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisaReferenceData" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaReferenceDataType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaDetailType", propOrder = {
    "visaReferenceData",
    "status"
})
public class VisaDetailType {

    @XmlElement(name = "VisaReferenceData")
    protected VisaReferenceDataType visaReferenceData;
    @XmlElement(name = "Status", required = true)
    protected VisaStatusType status;

    /**
     * Gets the value of the visaReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link VisaReferenceDataType }
     *     
     */
    public VisaReferenceDataType getVisaReferenceData() {
        return visaReferenceData;
    }

    /**
     * Sets the value of the visaReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaReferenceDataType }
     *     
     */
    public void setVisaReferenceData(VisaReferenceDataType value) {
        this.visaReferenceData = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VisaStatusType }
     *     
     */
    public VisaStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaStatusType }
     *     
     */
    public void setStatus(VisaStatusType value) {
        this.status = value;
    }

}
