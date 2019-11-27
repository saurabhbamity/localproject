
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * Watch List Hit details
 * 
 * <p>Java class for WatchListHitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WatchListHitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HitStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}HitStatusType"/>
 *         &lt;element name="HitCategoryType" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}WatchlistHitCategoryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WatchListCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ScoreType" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CodeType" minOccurs="0"/>
 *         &lt;element name="TargetDetails" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TargetBasicInfoType" minOccurs="0"/>
 *         &lt;element name="WatchListType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalSystemAction" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ActionType" minOccurs="0"/>
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProtocolNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Originator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowHitAccessDepts" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QualificationStatus" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}QualificationStatusType" minOccurs="0"/>
 *         &lt;element name="IgnoreWatchLists" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IgnorePassportChecks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreVisaChecks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WatchListHitType", propOrder = {
    "hitType",
    "hitStatus",
    "hitCategoryType",
    "name",
    "watchListCode",
    "id",
    "score",
    "actionCode",
    "reasonCode",
    "targetDetails",
    "watchListType",
    "externalSystemAction",
    "departmentCode",
    "severity",
    "protocolNumber",
    "originator",
    "allowHitAccessDepts",
    "qualificationStatus",
    "ignoreWatchLists",
    "ignorePassportChecks",
    "ignoreVisaChecks"
})
public class WatchListHitType {

    @XmlElement(name = "HitType", required = true)
    protected String hitType;
    @XmlElement(name = "HitStatus", required = true)
    protected HitStatusType hitStatus;
    @XmlElement(name = "HitCategoryType")
    protected WatchlistHitCategoryType hitCategoryType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "WatchListCode")
    protected CodeType watchListCode;
    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "Score")
    protected Integer score;
    @XmlElement(name = "ActionCode")
    protected CodeType actionCode;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;
    @XmlElement(name = "TargetDetails")
    protected TargetBasicInfoType targetDetails;
    @XmlElement(name = "WatchListType")
    protected String watchListType;
    @XmlElement(name = "ExternalSystemAction")
    protected ActionType externalSystemAction;
    @XmlElement(name = "DepartmentCode")
    protected String departmentCode;
    @XmlElement(name = "Severity")
    protected Long severity;
    @XmlElement(name = "ProtocolNumber")
    protected String protocolNumber;
    @XmlElement(name = "Originator")
    protected String originator;
    @XmlList
    @XmlElement(name = "AllowHitAccessDepts")
    protected List<String> allowHitAccessDepts;
    @XmlElement(name = "QualificationStatus")
    protected QualificationStatusType qualificationStatus;
    @XmlList
    @XmlElement(name = "IgnoreWatchLists")
    protected List<String> ignoreWatchLists;
    @XmlElement(name = "IgnorePassportChecks")
    protected Boolean ignorePassportChecks;
    @XmlElement(name = "IgnoreVisaChecks")
    protected Boolean ignoreVisaChecks;

    /**
     * Gets the value of the hitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitType() {
        return hitType;
    }

    /**
     * Sets the value of the hitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitType(String value) {
        this.hitType = value;
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
     * Gets the value of the hitCategoryType property.
     * 
     * @return
     *     possible object is
     *     {@link WatchlistHitCategoryType }
     *     
     */
    public WatchlistHitCategoryType getHitCategoryType() {
        return hitCategoryType;
    }

    /**
     * Sets the value of the hitCategoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WatchlistHitCategoryType }
     *     
     */
    public void setHitCategoryType(WatchlistHitCategoryType value) {
        this.hitCategoryType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the watchListCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWatchListCode() {
        return watchListCode;
    }

    /**
     * Sets the value of the watchListCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWatchListCode(CodeType value) {
        this.watchListCode = value;
    }

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
     * Gets the value of the targetDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TargetBasicInfoType }
     *     
     */
    public TargetBasicInfoType getTargetDetails() {
        return targetDetails;
    }

    /**
     * Sets the value of the targetDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetBasicInfoType }
     *     
     */
    public void setTargetDetails(TargetBasicInfoType value) {
        this.targetDetails = value;
    }

    /**
     * Gets the value of the watchListType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatchListType() {
        return watchListType;
    }

    /**
     * Sets the value of the watchListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatchListType(String value) {
        this.watchListType = value;
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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeverity(Long value) {
        this.severity = value;
    }

    /**
     * Gets the value of the protocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolNumber() {
        return protocolNumber;
    }

    /**
     * Sets the value of the protocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolNumber(String value) {
        this.protocolNumber = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the allowHitAccessDepts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowHitAccessDepts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowHitAccessDepts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllowHitAccessDepts() {
        if (allowHitAccessDepts == null) {
            allowHitAccessDepts = new ArrayList<String>();
        }
        return this.allowHitAccessDepts;
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
     * Gets the value of the ignoreWatchLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ignoreWatchLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIgnoreWatchLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIgnoreWatchLists() {
        if (ignoreWatchLists == null) {
            ignoreWatchLists = new ArrayList<String>();
        }
        return this.ignoreWatchLists;
    }

    /**
     * Gets the value of the ignorePassportChecks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnorePassportChecks() {
        return ignorePassportChecks;
    }

    /**
     * Sets the value of the ignorePassportChecks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnorePassportChecks(Boolean value) {
        this.ignorePassportChecks = value;
    }

    /**
     * Gets the value of the ignoreVisaChecks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreVisaChecks() {
        return ignoreVisaChecks;
    }

    /**
     * Sets the value of the ignoreVisaChecks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreVisaChecks(Boolean value) {
        this.ignoreVisaChecks = value;
    }

}
