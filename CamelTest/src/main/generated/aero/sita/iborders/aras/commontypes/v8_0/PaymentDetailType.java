
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of Payment Type.
 *             
 * 
 * <p>Java class for PaymentDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}FeeType" minOccurs="0"/>
 *         &lt;element name="Fine" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}FineType" minOccurs="0"/>
 *         &lt;element name="TxFee" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TxFeeType" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PaymentMethodType"/>
 *         &lt;element name="PaymentTxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentReceiptNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailType", propOrder = {
    "paymentType",
    "fee",
    "fine",
    "txFee",
    "paymentMethod",
    "paymentTxNo",
    "paymentReceiptNo"
})
public class PaymentDetailType {

    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "Fee")
    protected FeeType fee;
    @XmlElement(name = "Fine")
    protected FineType fine;
    @XmlElement(name = "TxFee")
    protected TxFeeType txFee;
    @XmlElement(name = "PaymentMethod", required = true)
    protected PaymentMethodType paymentMethod;
    @XmlElement(name = "PaymentTxNo")
    protected String paymentTxNo;
    @XmlElement(name = "PaymentReceiptNo")
    protected String paymentReceiptNo;

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType }
     *     
     */
    public FeeType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public void setFee(FeeType value) {
        this.fee = value;
    }

    /**
     * Gets the value of the fine property.
     * 
     * @return
     *     possible object is
     *     {@link FineType }
     *     
     */
    public FineType getFine() {
        return fine;
    }

    /**
     * Sets the value of the fine property.
     * 
     * @param value
     *     allowed object is
     *     {@link FineType }
     *     
     */
    public void setFine(FineType value) {
        this.fine = value;
    }

    /**
     * Gets the value of the txFee property.
     * 
     * @return
     *     possible object is
     *     {@link TxFeeType }
     *     
     */
    public TxFeeType getTxFee() {
        return txFee;
    }

    /**
     * Sets the value of the txFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxFeeType }
     *     
     */
    public void setTxFee(TxFeeType value) {
        this.txFee = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentTxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTxNo() {
        return paymentTxNo;
    }

    /**
     * Sets the value of the paymentTxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTxNo(String value) {
        this.paymentTxNo = value;
    }

    /**
     * Gets the value of the paymentReceiptNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReceiptNo() {
        return paymentReceiptNo;
    }

    /**
     * Sets the value of the paymentReceiptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReceiptNo(String value) {
        this.paymentReceiptNo = value;
    }

}
