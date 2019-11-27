
package aero.sita.iborders.entryexit.rlunknownhandlingservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Override Allowed Request Type
 * 
 * <p>Java class for ResetCountRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetCountRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workStationId" type="{http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/}workStationId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetCountRequestType", propOrder = {
    "workStationId"
})
public class ResetCountRequestType {

    @XmlElement(required = true)
    protected String workStationId;

    /**
     * Gets the value of the workStationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStationId() {
        return workStationId;
    }

    /**
     * Sets the value of the workStationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStationId(String value) {
        this.workStationId = value;
    }

}
