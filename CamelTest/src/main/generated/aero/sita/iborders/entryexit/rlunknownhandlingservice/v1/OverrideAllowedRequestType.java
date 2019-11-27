
package aero.sita.iborders.entryexit.rlunknownhandlingservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Override Allowed Request Type
 * 
 * <p>Java class for OverrideAllowedRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverrideAllowedRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workStationId" type="{http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/}workStationId"/>
 *         &lt;element name="isRl1UnkownFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isRl2UnkownFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverrideAllowedRequestType", propOrder = {
    "workStationId",
    "isRl1UnkownFlag",
    "isRl2UnkownFlag"
})
public class OverrideAllowedRequestType {

    @XmlElement(required = true)
    protected String workStationId;
    protected boolean isRl1UnkownFlag;
    protected boolean isRl2UnkownFlag;

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

    /**
     * Gets the value of the isRl1UnkownFlag property.
     * 
     */
    public boolean isIsRl1UnkownFlag() {
        return isRl1UnkownFlag;
    }

    /**
     * Sets the value of the isRl1UnkownFlag property.
     * 
     */
    public void setIsRl1UnkownFlag(boolean value) {
        this.isRl1UnkownFlag = value;
    }

    /**
     * Gets the value of the isRl2UnkownFlag property.
     * 
     */
    public boolean isIsRl2UnkownFlag() {
        return isRl2UnkownFlag;
    }

    /**
     * Sets the value of the isRl2UnkownFlag property.
     * 
     */
    public void setIsRl2UnkownFlag(boolean value) {
        this.isRl2UnkownFlag = value;
    }

}
