
package aero.sita.iborders.entryexit.rlupdateservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Enum status of attempt to save update in database
 * 
 * <p>Java class for UpdateStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStatusResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateStatusResult" type="{http://sita.aero/iborders/entryExit/RLUpdateService/V1/}updateStatusResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStatusResponseType", propOrder = {
    "updateStatusResult"
})
public class UpdateStatusResponseType {

    @XmlElement(name = "UpdateStatusResult", required = true)
    protected UpdateStatusResult updateStatusResult;

    /**
     * Gets the value of the updateStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatusResult }
     *     
     */
    public UpdateStatusResult getUpdateStatusResult() {
        return updateStatusResult;
    }

    /**
     * Sets the value of the updateStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatusResult }
     *     
     */
    public void setUpdateStatusResult(UpdateStatusResult value) {
        this.updateStatusResult = value;
    }

}
