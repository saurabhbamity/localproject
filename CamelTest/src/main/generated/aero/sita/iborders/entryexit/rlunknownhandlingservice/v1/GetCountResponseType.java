
package aero.sita.iborders.entryexit.rlunknownhandlingservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.ReturnCodeType;


/**
 * <p>Java class for GetCountResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCountResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rl1UnknownCount" type="{http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/}rl1UnknownCount"/>
 *         &lt;element name="rl2UnknownCount" type="{http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/}rl2UnknownCount"/>
 *         &lt;element name="returnCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ReturnCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCountResponseType", propOrder = {
    "rl1UnknownCount",
    "rl2UnknownCount",
    "returnCode"
})
public class GetCountResponseType {

    protected int rl1UnknownCount;
    protected int rl2UnknownCount;
    @XmlElement(required = true)
    protected ReturnCodeType returnCode;

    /**
     * Gets the value of the rl1UnknownCount property.
     * 
     */
    public int getRl1UnknownCount() {
        return rl1UnknownCount;
    }

    /**
     * Sets the value of the rl1UnknownCount property.
     * 
     */
    public void setRl1UnknownCount(int value) {
        this.rl1UnknownCount = value;
    }

    /**
     * Gets the value of the rl2UnknownCount property.
     * 
     */
    public int getRl2UnknownCount() {
        return rl2UnknownCount;
    }

    /**
     * Sets the value of the rl2UnknownCount property.
     * 
     */
    public void setRl2UnknownCount(int value) {
        this.rl2UnknownCount = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCodeType }
     *     
     */
    public ReturnCodeType getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCodeType }
     *     
     */
    public void setReturnCode(ReturnCodeType value) {
        this.returnCode = value;
    }

}
