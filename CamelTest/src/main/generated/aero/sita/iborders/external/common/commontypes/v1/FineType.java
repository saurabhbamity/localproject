
package aero.sita.iborders.external.common.commontypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Amount Type Information.
 * 
 * <p>Java class for FineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}AmountType" minOccurs="0"/>
 *         &lt;element name="FineDiscount" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FineType", propOrder = {
    "amount",
    "fineDiscount"
})
public class FineType {

    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "FineDiscount")
    protected AmountType fineDiscount;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the fineDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFineDiscount() {
        return fineDiscount;
    }

    /**
     * Sets the value of the fineDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFineDiscount(AmountType value) {
        this.fineDiscount = value;
    }

}
