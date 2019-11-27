
package aero.sita.iborders.external.event.movementeventtypes.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commondomaintypes.v2.MovementDirectionType;
import aero.sita.iborders.external.common.commondomaintypes.v2.TravellerType;
import aero.sita.iborders.external.common.commondomaintypes.v2.VisaCommonType;
import aero.sita.iborders.external.event.eventcommontypes.v2.AssociatedDocsType;
import aero.sita.iborders.external.event.eventcommontypes.v2.EventDataType;


/**
 * <p>Java class for MovementEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}EventDataType">
 *       &lt;sequence>
 *         &lt;element name="EventSource" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}MovementEventSourceType"/>
 *         &lt;element name="WorkstationId" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}WorkstationIdType" minOccurs="0"/>
 *         &lt;element name="ApplicationRefId" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}ApplicationRefIdType" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}MovementDirectionType" minOccurs="0"/>
 *         &lt;element name="PassengerType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}TravellerType" minOccurs="0"/>
 *         &lt;element name="MRZ" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}MRZType" minOccurs="0"/>
 *         &lt;element name="EntryType" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}TypeOfEntryType" minOccurs="0"/>
 *         &lt;element name="VesselNumber" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}VesselNumberType" minOccurs="0"/>
 *         &lt;element name="CompanionLinkTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}OccupationType" minOccurs="0"/>
 *         &lt;element name="VisaInfo" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}VisaCommonType" minOccurs="0"/>
 *         &lt;element name="AssociatedDocs" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V2}AssociatedDocsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BoardingPassInfo" type="{http://sita.aero/iborders/external/event/MovementEventTypes/V2}BoardingPassInfoType" minOccurs="0"/>
 *         &lt;element name="ReferencedExpectedMovementID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "vesselNumber",
    "companionLinkTo",
    "occupation",
    "visaInfo",
    "associatedDocs",
    "boardingPassInfo",
    "referencedExpectedMovementID"
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
    @XmlElement(name = "VesselNumber")
    protected String vesselNumber;
    @XmlElement(name = "CompanionLinkTo")
    protected String companionLinkTo;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "VisaInfo")
    protected VisaCommonType visaInfo;
    @XmlElement(name = "AssociatedDocs")
    protected List<AssociatedDocsType> associatedDocs;
    @XmlElement(name = "BoardingPassInfo")
    protected BoardingPassInfoType boardingPassInfo;
    @XmlElement(name = "ReferencedExpectedMovementID")
    protected Long referencedExpectedMovementID;

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
     * Gets the value of the referencedExpectedMovementID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferencedExpectedMovementID() {
        return referencedExpectedMovementID;
    }

    /**
     * Sets the value of the referencedExpectedMovementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferencedExpectedMovementID(Long value) {
        this.referencedExpectedMovementID = value;
    }

}
