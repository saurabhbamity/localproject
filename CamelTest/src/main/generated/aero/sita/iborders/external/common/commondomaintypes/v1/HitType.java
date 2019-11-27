
package aero.sita.iborders.external.common.commondomaintypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commontypes.v1.CodeType;


/**
 * <p>Java class for HitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}TypeOfHitType" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}ScoreType" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CodeType" minOccurs="0"/>
 *         &lt;element name="SeverityLevel" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V1}SeverityLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HitType", propOrder = {
    "id",
    "type",
    "score",
    "actionCode",
    "reasonCode",
    "severityLevel"
})
public class HitType {

    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Type")
    protected TypeOfHitType type;
    @XmlElement(name = "Score")
    protected Integer score;
    @XmlElement(name = "ActionCode")
    protected CodeType actionCode;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;
    @XmlElement(name = "SeverityLevel")
    protected Integer severityLevel;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfHitType }
     *     
     */
    public TypeOfHitType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfHitType }
     *     
     */
    public void setType(TypeOfHitType value) {
        this.type = value;
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

    /**
     * Gets the value of the severityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeverityLevel(Integer value) {
        this.severityLevel = value;
    }

}
