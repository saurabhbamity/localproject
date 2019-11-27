
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operator" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}OperatorType"/>
 *         &lt;element name="OperatorCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ServiceCodeType"/>
 *         &lt;element name="OperatorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppApi" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}AppApiType"/>
 *         &lt;element name="OperatorCapability" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}SystemIndicatorType"/>
 *         &lt;element name="OperatorStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}OperatorStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorDetailType", propOrder = {
    "operator",
    "operatorCode",
    "operatorName",
    "appApi",
    "operatorCapability",
    "operatorStatus"
})
public class OperatorDetailType {

    @XmlElement(name = "Operator", required = true)
    protected OperatorType operator;
    @XmlElement(name = "OperatorCode", required = true)
    protected String operatorCode;
    @XmlElement(name = "OperatorName", required = true)
    protected String operatorName;
    @XmlElement(name = "AppApi", required = true)
    protected AppApiType appApi;
    @XmlElement(name = "OperatorCapability", required = true)
    protected SystemIndicatorType operatorCapability;
    @XmlElement(name = "OperatorStatus", required = true)
    protected OperatorStatusType operatorStatus;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorType }
     *     
     */
    public OperatorType getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorType }
     *     
     */
    public void setOperator(OperatorType value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * Sets the value of the operatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorCode(String value) {
        this.operatorCode = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Gets the value of the appApi property.
     * 
     * @return
     *     possible object is
     *     {@link AppApiType }
     *     
     */
    public AppApiType getAppApi() {
        return appApi;
    }

    /**
     * Sets the value of the appApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppApiType }
     *     
     */
    public void setAppApi(AppApiType value) {
        this.appApi = value;
    }

    /**
     * Gets the value of the operatorCapability property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIndicatorType }
     *     
     */
    public SystemIndicatorType getOperatorCapability() {
        return operatorCapability;
    }

    /**
     * Sets the value of the operatorCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIndicatorType }
     *     
     */
    public void setOperatorCapability(SystemIndicatorType value) {
        this.operatorCapability = value;
    }

    /**
     * Gets the value of the operatorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorStatusType }
     *     
     */
    public OperatorStatusType getOperatorStatus() {
        return operatorStatus;
    }

    /**
     * Sets the value of the operatorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorStatusType }
     *     
     */
    public void setOperatorStatus(OperatorStatusType value) {
        this.operatorStatus = value;
    }

}
