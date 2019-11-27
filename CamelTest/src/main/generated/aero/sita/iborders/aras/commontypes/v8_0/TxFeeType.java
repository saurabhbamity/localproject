
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Amount Type Information.
 *             
 * 
 * <p>Java class for TxFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}AmountType" minOccurs="0"/>
 *         &lt;element name="TxFeeDiscount" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxFeeType", propOrder = {
    "amount",
    "txFeeDiscount"
})
public class TxFeeType {

    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "TxFeeDiscount")
    protected AmountType txFeeDiscount;

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
     * Gets the value of the txFeeDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTxFeeDiscount() {
        return txFeeDiscount;
    }

    /**
     * Sets the value of the txFeeDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTxFeeDiscount(AmountType value) {
        this.txFeeDiscount = value;
    }

}
