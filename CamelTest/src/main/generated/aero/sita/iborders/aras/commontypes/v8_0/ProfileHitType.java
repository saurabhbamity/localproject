
package aero.sita.iborders.aras.commontypes.v8_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Profile Hit details based on privileges.
 * 
 * <p>Java class for ProfileHitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileHitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HitStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HitStatusType"/>
 *         &lt;element name="ProfileDetail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="ProfileCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType"/>
 *                   &lt;element name="ActionCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType"/>
 *                   &lt;element name="ReasonCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType"/>
 *                   &lt;element name="DepartmentCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Score" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ScoreType" minOccurs="0"/>
 *                   &lt;element name="Threshold" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="ExternalSystemAction" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ActionType" minOccurs="0"/>
 *                   &lt;element name="ProfileHitDetails" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ProfileDetailsCommonType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ProfileVersion" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="QualificationStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}QualificationStatusType" minOccurs="0"/>
 *                   &lt;element name="ExtendedProfileRuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExtendedProfileRuleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileHitType", propOrder = {
    "hitStatus",
    "profileDetail"
})
public class ProfileHitType {

    @XmlElement(name = "HitStatus", required = true)
    protected HitStatusType hitStatus;
    @XmlElement(name = "ProfileDetail")
    protected List<ProfileHitType.ProfileDetail> profileDetail;

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
     * Gets the value of the profileDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileHitType.ProfileDetail }
     * 
     * 
     */
    public List<ProfileHitType.ProfileDetail> getProfileDetail() {
        if (profileDetail == null) {
            profileDetail = new ArrayList<ProfileHitType.ProfileDetail>();
        }
        return this.profileDetail;
    }


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
     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="ProfileCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType"/>
     *         &lt;element name="ActionCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType"/>
     *         &lt;element name="ReasonCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType"/>
     *         &lt;element name="DepartmentCode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Score" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ScoreType" minOccurs="0"/>
     *         &lt;element name="Threshold" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="ExternalSystemAction" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ActionType" minOccurs="0"/>
     *         &lt;element name="ProfileHitDetails" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ProfileDetailsCommonType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ProfileVersion" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="QualificationStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}QualificationStatusType" minOccurs="0"/>
     *         &lt;element name="ExtendedProfileRuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExtendedProfileRuleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "id",
        "profileCode",
        "actionCode",
        "reasonCode",
        "departmentCode",
        "score",
        "threshold",
        "externalSystemAction",
        "profileHitDetails",
        "profileVersion",
        "qualificationStatus",
        "extendedProfileRuleName",
        "extendedProfileRuleDescription"
    })
    public static class ProfileDetail {

        @XmlElement(name = "Id")
        protected Long id;
        @XmlElement(name = "ProfileCode", required = true)
        protected CodeType profileCode;
        @XmlElement(name = "ActionCode", required = true)
        protected CodeType actionCode;
        @XmlElement(name = "ReasonCode", required = true)
        protected CodeType reasonCode;
        @XmlElement(name = "DepartmentCode")
        protected String departmentCode;
        @XmlElement(name = "Score")
        protected Integer score;
        @XmlElement(name = "Threshold")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger threshold;
        @XmlElement(name = "ExternalSystemAction")
        protected ActionType externalSystemAction;
        @XmlElement(name = "ProfileHitDetails")
        protected List<ProfileDetailsCommonType> profileHitDetails;
        @XmlElement(name = "ProfileVersion")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger profileVersion;
        @XmlElement(name = "QualificationStatus")
        protected QualificationStatusType qualificationStatus;
        @XmlElement(name = "ExtendedProfileRuleName")
        protected String extendedProfileRuleName;
        @XmlElement(name = "ExtendedProfileRuleDescription")
        protected String extendedProfileRuleDescription;

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
         * Gets the value of the profileCode property.
         * 
         * @return
         *     possible object is
         *     {@link CodeType }
         *     
         */
        public CodeType getProfileCode() {
            return profileCode;
        }

        /**
         * Sets the value of the profileCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeType }
         *     
         */
        public void setProfileCode(CodeType value) {
            this.profileCode = value;
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
         * Gets the value of the departmentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartmentCode() {
            return departmentCode;
        }

        /**
         * Sets the value of the departmentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartmentCode(String value) {
            this.departmentCode = value;
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
         * Gets the value of the threshold property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getThreshold() {
            return threshold;
        }

        /**
         * Sets the value of the threshold property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setThreshold(BigInteger value) {
            this.threshold = value;
        }

        /**
         * Gets the value of the externalSystemAction property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getExternalSystemAction() {
            return externalSystemAction;
        }

        /**
         * Sets the value of the externalSystemAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setExternalSystemAction(ActionType value) {
            this.externalSystemAction = value;
        }

        /**
         * Gets the value of the profileHitDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profileHitDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfileHitDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProfileDetailsCommonType }
         * 
         * 
         */
        public List<ProfileDetailsCommonType> getProfileHitDetails() {
            if (profileHitDetails == null) {
                profileHitDetails = new ArrayList<ProfileDetailsCommonType>();
            }
            return this.profileHitDetails;
        }

        /**
         * Gets the value of the profileVersion property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProfileVersion() {
            return profileVersion;
        }

        /**
         * Sets the value of the profileVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProfileVersion(BigInteger value) {
            this.profileVersion = value;
        }

        /**
         * Gets the value of the qualificationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link QualificationStatusType }
         *     
         */
        public QualificationStatusType getQualificationStatus() {
            return qualificationStatus;
        }

        /**
         * Sets the value of the qualificationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualificationStatusType }
         *     
         */
        public void setQualificationStatus(QualificationStatusType value) {
            this.qualificationStatus = value;
        }

        /**
         * Gets the value of the extendedProfileRuleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedProfileRuleName() {
            return extendedProfileRuleName;
        }

        /**
         * Sets the value of the extendedProfileRuleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedProfileRuleName(String value) {
            this.extendedProfileRuleName = value;
        }

        /**
         * Gets the value of the extendedProfileRuleDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedProfileRuleDescription() {
            return extendedProfileRuleDescription;
        }

        /**
         * Sets the value of the extendedProfileRuleDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedProfileRuleDescription(String value) {
            this.extendedProfileRuleDescription = value;
        }

    }

}
