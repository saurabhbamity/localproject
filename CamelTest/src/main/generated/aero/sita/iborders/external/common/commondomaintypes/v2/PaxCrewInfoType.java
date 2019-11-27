
package aero.sita.iborders.external.common.commondomaintypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxCrewInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxCrewInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Crew" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxCrewInfoType", propOrder = {
    "pax",
    "crew"
})
public class PaxCrewInfoType {

    @XmlElement(name = "Pax")
    protected long pax;
    @XmlElement(name = "Crew")
    protected long crew;

    /**
     * Gets the value of the pax property.
     * 
     */
    public long getPax() {
        return pax;
    }

    /**
     * Sets the value of the pax property.
     * 
     */
    public void setPax(long value) {
        this.pax = value;
    }

    /**
     * Gets the value of the crew property.
     * 
     */
    public long getCrew() {
        return crew;
    }

    /**
     * Sets the value of the crew property.
     * 
     */
    public void setCrew(long value) {
        this.crew = value;
    }

}
