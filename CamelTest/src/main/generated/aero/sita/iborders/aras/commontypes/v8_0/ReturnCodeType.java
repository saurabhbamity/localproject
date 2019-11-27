
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the common return code for all operations.
 *                 For system exceptions, this will be a SOAP fault.
 *                 For all other
 *                 business validations it will be a response either
 *                 hardstop, warning
 *                 along with response or just the info with Success.
 *             
 * 
 * <p>Java class for ReturnCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ReturnType"/>
 *         &lt;element name="ReturnCodeDetail" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ReturnCodeDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnCodeType", propOrder = {
    "type",
    "returnCodeDetail",
    "transactionCode"
})
public class ReturnCodeType {

    @XmlElement(name = "Type", required = true)
    protected ReturnType type;
    @XmlElement(name = "ReturnCodeDetail")
    protected List<ReturnCodeDetailType> returnCodeDetail;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnType }
     *     
     */
    public ReturnType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnType }
     *     
     */
    public void setType(ReturnType value) {
        this.type = value;
    }

    /**
     * Gets the value of the returnCodeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnCodeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnCodeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnCodeDetailType }
     * 
     * 
     */
    public List<ReturnCodeDetailType> getReturnCodeDetail() {
        if (returnCodeDetail == null) {
            returnCodeDetail = new ArrayList<ReturnCodeDetailType>();
        }
        return this.returnCodeDetail;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

}
