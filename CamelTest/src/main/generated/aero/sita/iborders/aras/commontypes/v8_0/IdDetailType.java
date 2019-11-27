
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
 * <p>Java class for IdDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdReferenceData" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ReferenceDataType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}IdReferenceDataStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdDetailType", propOrder = {
    "idReferenceData",
    "status"
})
public class IdDetailType {

    @XmlElement(name = "IdReferenceData")
    protected ReferenceDataType idReferenceData;
    @XmlElement(name = "Status", required = true)
    protected IdReferenceDataStatusType status;

    /**
     * Gets the value of the idReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getIdReferenceData() {
        return idReferenceData;
    }

    /**
     * Sets the value of the idReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setIdReferenceData(ReferenceDataType value) {
        this.idReferenceData = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link IdReferenceDataStatusType }
     *     
     */
    public IdReferenceDataStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdReferenceDataStatusType }
     *     
     */
    public void setStatus(IdReferenceDataStatusType value) {
        this.status = value;
    }

}
