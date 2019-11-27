
package aero.sita.iborders.entryexit.rlunknownhandlingservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.entryexit.common.v1.FaultType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverrideAllowedFault" type="{http://sita.aero/iborders/entryExit/Common/V1}FaultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "overrideAllowedFault"
})
@XmlRootElement(name = "OverrideAllowedFault")
public class OverrideAllowedFault {

    @XmlElement(name = "OverrideAllowedFault", required = true)
    protected FaultType overrideAllowedFault;

    /**
     * Gets the value of the overrideAllowedFault property.
     * 
     * @return
     *     possible object is
     *     {@link FaultType }
     *     
     */
    public FaultType getOverrideAllowedFault() {
        return overrideAllowedFault;
    }

    /**
     * Sets the value of the overrideAllowedFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultType }
     *     
     */
    public void setOverrideAllowedFault(FaultType value) {
        this.overrideAllowedFault = value;
    }

}
