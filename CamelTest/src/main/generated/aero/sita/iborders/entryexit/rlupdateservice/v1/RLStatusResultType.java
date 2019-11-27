
package aero.sita.iborders.entryexit.rlupdateservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.commontypes.v8_0.CodeType;


/**
 *  Formatted RL Update sent to the client, not using the VIS systemHitType to reduce rework on the client
 * 
 * <p>Java class for RLStatusResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RLStatusResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://sita.aero/iborders/entryExit/RLUpdateService/V1/}RLStatus"/>
 *         &lt;element name="CaptureActions" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RLStatusResultType", propOrder = {
    "systemName",
    "status",
    "captureActions"
})
public class RLStatusResultType {

    @XmlElement(name = "SystemName", required = true)
    protected String systemName;
    @XmlElement(name = "Status", required = true)
    protected RLStatus status;
    @XmlElement(name = "CaptureActions")
    protected List<CodeType> captureActions;

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RLStatus }
     *     
     */
    public RLStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RLStatus }
     *     
     */
    public void setStatus(RLStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the captureActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the captureActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaptureActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCaptureActions() {
        if (captureActions == null) {
            captureActions = new ArrayList<CodeType>();
        }
        return this.captureActions;
    }

}
