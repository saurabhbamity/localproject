
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementEventSourceType"/>
 *         &lt;element name="WorkstationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}MovementDirectionType" minOccurs="0"/>
 *         &lt;element name="PassengerType" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}TravellerType" minOccurs="0"/>
 *         &lt;element name="MRZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanionLinkTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanionRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignPortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisaInfo" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaCommonType" minOccurs="0"/>
 *         &lt;element name="InternalEvents" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}InternalEventsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssociatedDocs" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}AssociatedDocsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BoardingPassInfo" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}BoardingPassInfoType" minOccurs="0"/>
 *         &lt;element name="BackloadFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GCCRelatedDetails" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}GCCRelatedDetails" minOccurs="0"/>
 *         &lt;element name="OfflineFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementEventType", propOrder = {
    "eventSource",
    "workstationId",
    "applicationRefId",
    "direction",
    "passengerType",
    "mrz",
    "entryType",
    "ruleId",
    "vesselNumber",
    "companionLinkTo",
    "companionRelationship",
    "occupation",
    "foreignPortCode",
    "visaInfo",
    "internalEvents",
    "associatedDocs",
    "boardingPassInfo",
    "backloadFlag",
    "gccRelatedDetails",
    "offlineFlag"
})
public class MovementEventType
    extends EventDataType
{

    @XmlElement(name = "EventSource", required = true)
    protected MovementEventSourceType eventSource;
    @XmlElement(name = "WorkstationId")
    protected String workstationId;
    @XmlElement(name = "ApplicationRefId")
    protected String applicationRefId;
    @XmlElement(name = "Direction")
    protected MovementDirectionType direction;
    @XmlElement(name = "PassengerType")
    protected TravellerType passengerType;
    @XmlElement(name = "MRZ")
    protected String mrz;
    @XmlElement(name = "EntryType")
    protected String entryType;
    @XmlElement(name = "RuleId")
    protected String ruleId;
    @XmlElement(name = "VesselNumber")
    protected String vesselNumber;
    @XmlElement(name = "CompanionLinkTo")
    protected String companionLinkTo;
    @XmlElement(name = "CompanionRelationship")
    protected String companionRelationship;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "ForeignPortCode")
    protected String foreignPortCode;
    @XmlElement(name = "VisaInfo")
    protected VisaCommonType visaInfo;
    @XmlElement(name = "InternalEvents")
    protected List<InternalEventsType> internalEvents;
    @XmlElement(name = "AssociatedDocs")
    protected List<AssociatedDocsType> associatedDocs;
    @XmlElement(name = "BoardingPassInfo")
    protected BoardingPassInfoType boardingPassInfo;
    @XmlElement(name = "BackloadFlag")
    protected String backloadFlag;
    @XmlElement(name = "GCCRelatedDetails")
    protected GCCRelatedDetails gccRelatedDetails;
    @XmlElement(name = "OfflineFlag")
    protected Boolean offlineFlag;

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link MovementEventSourceType }
     *     
     */
    public MovementEventSourceType getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementEventSourceType }
     *     
     */
    public void setEventSource(MovementEventSourceType value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the workstationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstationId() {
        return workstationId;
    }

    /**
     * Sets the value of the workstationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstationId(String value) {
        this.workstationId = value;
    }

    /**
     * Gets the value of the applicationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationRefId() {
        return applicationRefId;
    }

    /**
     * Sets the value of the applicationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationRefId(String value) {
        this.applicationRefId = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link MovementDirectionType }
     *     
     */
    public MovementDirectionType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementDirectionType }
     *     
     */
    public void setDirection(MovementDirectionType value) {
        this.direction = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerType }
     *     
     */
    public TravellerType getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerType }
     *     
     */
    public void setPassengerType(TravellerType value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the mrz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRZ() {
        return mrz;
    }

    /**
     * Sets the value of the mrz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRZ(String value) {
        this.mrz = value;
    }

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryType(String value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the ruleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Sets the value of the ruleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    /**
     * Gets the value of the vesselNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselNumber() {
        return vesselNumber;
    }

    /**
     * Sets the value of the vesselNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselNumber(String value) {
        this.vesselNumber = value;
    }

    /**
     * Gets the value of the companionLinkTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanionLinkTo() {
        return companionLinkTo;
    }

    /**
     * Sets the value of the companionLinkTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanionLinkTo(String value) {
        this.companionLinkTo = value;
    }

    /**
     * Gets the value of the companionRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanionRelationship() {
        return companionRelationship;
    }

    /**
     * Sets the value of the companionRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanionRelationship(String value) {
        this.companionRelationship = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the foreignPortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPortCode() {
        return foreignPortCode;
    }

    /**
     * Sets the value of the foreignPortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPortCode(String value) {
        this.foreignPortCode = value;
    }

    /**
     * Gets the value of the visaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VisaCommonType }
     *     
     */
    public VisaCommonType getVisaInfo() {
        return visaInfo;
    }

    /**
     * Sets the value of the visaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaCommonType }
     *     
     */
    public void setVisaInfo(VisaCommonType value) {
        this.visaInfo = value;
    }

    /**
     * Gets the value of the internalEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalEventsType }
     * 
     * 
     */
    public List<InternalEventsType> getInternalEvents() {
        if (internalEvents == null) {
            internalEvents = new ArrayList<InternalEventsType>();
        }
        return this.internalEvents;
    }

    /**
     * Gets the value of the associatedDocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedDocsType }
     * 
     * 
     */
    public List<AssociatedDocsType> getAssociatedDocs() {
        if (associatedDocs == null) {
            associatedDocs = new ArrayList<AssociatedDocsType>();
        }
        return this.associatedDocs;
    }

    /**
     * Gets the value of the boardingPassInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPassInfoType }
     *     
     */
    public BoardingPassInfoType getBoardingPassInfo() {
        return boardingPassInfo;
    }

    /**
     * Sets the value of the boardingPassInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPassInfoType }
     *     
     */
    public void setBoardingPassInfo(BoardingPassInfoType value) {
        this.boardingPassInfo = value;
    }

    /**
     * Gets the value of the backloadFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackloadFlag() {
        return backloadFlag;
    }

    /**
     * Sets the value of the backloadFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackloadFlag(String value) {
        this.backloadFlag = value;
    }

    /**
     * Gets the value of the gccRelatedDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GCCRelatedDetails }
     *     
     */
    public GCCRelatedDetails getGCCRelatedDetails() {
        return gccRelatedDetails;
    }

    /**
     * Sets the value of the gccRelatedDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCCRelatedDetails }
     *     
     */
    public void setGCCRelatedDetails(GCCRelatedDetails value) {
        this.gccRelatedDetails = value;
    }

    /**
     * Gets the value of the offlineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfflineFlag() {
        return offlineFlag;
    }

    /**
     * Sets the value of the offlineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfflineFlag(Boolean value) {
        this.offlineFlag = value;
    }

}
