
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the profiler hit response along with the
 *                 main info
 *             
 * 
 * <p>Java class for ProfileHitDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileHitDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Profile" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType"/>
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HitStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HitStatusType"/>
 *         &lt;element name="Score" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ScoreType" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileHitDetailsType", propOrder = {
    "profile",
    "profileName",
    "hitStatus",
    "score",
    "actionCode",
    "reasonCode"
})
public class ProfileHitDetailsType {

    @XmlElement(name = "Profile", required = true)
    protected CodeType profile;
    @XmlElement(name = "ProfileName", required = true)
    protected String profileName;
    @XmlElement(name = "HitStatus", required = true)
    protected HitStatusType hitStatus;
    @XmlElement(name = "Score")
    protected Integer score;
    @XmlElement(name = "ActionCode")
    protected CodeType actionCode;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setProfile(CodeType value) {
        this.profile = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the hitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HitStatusType }
     *     
     */
    public HitStatusType getHitStatus() {
        return hitStatus;
    }

    /**
     * Sets the value of the hitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HitStatusType }
     *     
     */
    public void setHitStatus(HitStatusType value) {
        this.hitStatus = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setActionCode(CodeType value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReasonCode(CodeType value) {
        this.reasonCode = value;
    }

}
