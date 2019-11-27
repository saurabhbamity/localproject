
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ExpectedService" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ExpectedServiceType"/>
 *           &lt;element name="Participant" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ParticipantType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "expectedService",
    "participant"
})
public class ServiceType {

    @XmlElement(name = "ExpectedService")
    protected ExpectedServiceType expectedService;
    @XmlElement(name = "Participant")
    protected ParticipantType participant;

    /**
     * Gets the value of the expectedService property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedServiceType }
     *     
     */
    public ExpectedServiceType getExpectedService() {
        return expectedService;
    }

    /**
     * Sets the value of the expectedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedServiceType }
     *     
     */
    public void setExpectedService(ExpectedServiceType value) {
        this.expectedService = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantType }
     *     
     */
    public ParticipantType getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantType }
     *     
     */
    public void setParticipant(ParticipantType value) {
        this.participant = value;
    }

}
