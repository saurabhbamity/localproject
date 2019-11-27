
package aero.sita.iborders.entryexit.movementservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.entryexit.common.v1.Direction;
import aero.sita.iborders.entryexit.common.v1.TravelDocumentType;


/**
 * Traveller movement
 * 
 * <p>Java class for MovementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://sita.aero/iborders/entryExit/Common/V1}guid"/>
 *         &lt;element name="WorkstationID" type="{http://sita.aero/iborders/entryExit/Common/V1}WorkstationID"/>
 *         &lt;element name="App" type="{http://sita.aero/iborders/entryExit/MovementService/V1}appField"/>
 *         &lt;element name="AppRefId" type="{http://sita.aero/iborders/entryExit/MovementService/V1}appField" minOccurs="0"/>
 *         &lt;element name="PersonId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdentityId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Location" type="{http://sita.aero/iborders/entryExit/Common/V1}locationCodeType"/>
 *         &lt;element name="Status" type="{http://sita.aero/iborders/entryExit/MovementService/V1}movementStatus"/>
 *         &lt;element name="OwnerRole" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://sita.aero/iborders/entryExit/Common/V1}direction"/>
 *         &lt;element name="PaxType" type="{http://sita.aero/iborders/entryExit/MovementService/V1}paxType"/>
 *         &lt;element name="ForeignPortCode" type="{http://sita.aero/iborders/entryExit/MovementService/V1}portCodeType" minOccurs="0"/>
 *         &lt;element name="TravelDocument" type="{http://sita.aero/iborders/entryExit/Common/V1}TravelDocumentType"/>
 *         &lt;element name="EntryTypeId" type="{http://sita.aero/iborders/entryExit/Common/V1}entryTypeIdType" minOccurs="0"/>
 *         &lt;element name="Visa" type="{http://sita.aero/iborders/entryExit/MovementService/V1}VisaType" minOccurs="0"/>
 *         &lt;element name="Mrz" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RuleId" type="{http://sita.aero/iborders/entryExit/MovementService/V1}ruleId" minOccurs="0"/>
 *         &lt;element name="AssessRiskResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;maxLength value="300"/>
 *               &lt;pattern value="[A-Z0-9]+:[A-Z0-9]+(,[A-Z0-9]+:[A-Z0-9]+)*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Outcome" type="{http://sita.aero/iborders/entryExit/MovementService/V1}outcomeType" minOccurs="0"/>
 *         &lt;element name="VesselId" type="{http://sita.aero/iborders/entryExit/Common/V1}flightVesselCode" minOccurs="0"/>
 *         &lt;element name="StayExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OverstayPayment" type="{http://sita.aero/iborders/entryExit/MovementService/V1}PaymentType" minOccurs="0"/>
 *         &lt;element name="Events" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Event" type="{http://sita.aero/iborders/entryExit/MovementService/V1}EventType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalData" type="{http://sita.aero/iborders/entryExit/MovementService/V1}AdditionalDataType" minOccurs="0"/>
 *         &lt;element name="Links" type="{http://sita.aero/iborders/entryExit/MovementService/V1}MovementLinkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementType", propOrder = {
    "id",
    "workstationID",
    "app",
    "appRefId",
    "personId",
    "identityId",
    "dateTime",
    "location",
    "status",
    "ownerRole",
    "direction",
    "paxType",
    "foreignPortCode",
    "travelDocument",
    "entryTypeId",
    "visa",
    "mrz",
    "ruleId",
    "assessRiskResult",
    "outcome",
    "vesselId",
    "stayExpiryDate",
    "overstayPayment",
    "events",
    "additionalData",
    "links"
})
public class MovementType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "WorkstationID", required = true)
    protected String workstationID;
    @XmlElement(name = "App", required = true)
    protected String app;
    @XmlElement(name = "AppRefId")
    protected String appRefId;
    @XmlElement(name = "PersonId")
    protected String personId;
    @XmlElement(name = "IdentityId")
    protected String identityId;
    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "Status", required = true)
    protected MovementStatus status;
    @XmlElementRef(name = "OwnerRole", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<Short> ownerRole;
    @XmlElement(name = "Direction", required = true)
    protected Direction direction;
    @XmlElement(name = "PaxType", required = true)
    protected PaxType paxType;
    @XmlElement(name = "ForeignPortCode")
    protected String foreignPortCode;
    @XmlElement(name = "TravelDocument", required = true)
    protected TravelDocumentType travelDocument;
    @XmlElement(name = "EntryTypeId")
    protected String entryTypeId;
    @XmlElementRef(name = "Visa", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<VisaType> visa;
    @XmlElement(name = "Mrz")
    protected String mrz;
    @XmlElement(name = "RuleId")
    protected String ruleId;
    @XmlElement(name = "AssessRiskResult")
    protected String assessRiskResult;
    @XmlElement(name = "Outcome")
    protected Short outcome;
    @XmlElementRef(name = "VesselId", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<String> vesselId;
    @XmlElementRef(name = "StayExpiryDate", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> stayExpiryDate;
    @XmlElement(name = "OverstayPayment")
    protected PaymentType overstayPayment;
    @XmlElementRef(name = "Events", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<MovementType.Events> events;
    @XmlElementRef(name = "AdditionalData", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<AdditionalDataType> additionalData;
    @XmlElementRef(name = "Links", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<MovementLinkType> links;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the workstationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstationID() {
        return workstationID;
    }

    /**
     * Sets the value of the workstationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstationID(String value) {
        this.workstationID = value;
    }

    /**
     * Gets the value of the app property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApp() {
        return app;
    }

    /**
     * Sets the value of the app property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApp(String value) {
        this.app = value;
    }

    /**
     * Gets the value of the appRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRefId() {
        return appRefId;
    }

    /**
     * Sets the value of the appRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRefId(String value) {
        this.appRefId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the identityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * Sets the value of the identityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityId(String value) {
        this.identityId = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MovementStatus }
     *     
     */
    public MovementStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementStatus }
     *     
     */
    public void setStatus(MovementStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the ownerRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOwnerRole() {
        return ownerRole;
    }

    /**
     * Sets the value of the ownerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOwnerRole(JAXBElement<Short> value) {
        this.ownerRole = ((JAXBElement<Short> ) value);
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setDirection(Direction value) {
        this.direction = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link PaxType }
     *     
     */
    public PaxType getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxType }
     *     
     */
    public void setPaxType(PaxType value) {
        this.paxType = value;
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
     * Gets the value of the travelDocument property.
     * 
     * @return
     *     possible object is
     *     {@link TravelDocumentType }
     *     
     */
    public TravelDocumentType getTravelDocument() {
        return travelDocument;
    }

    /**
     * Sets the value of the travelDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDocumentType }
     *     
     */
    public void setTravelDocument(TravelDocumentType value) {
        this.travelDocument = value;
    }

    /**
     * Gets the value of the entryTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryTypeId() {
        return entryTypeId;
    }

    /**
     * Sets the value of the entryTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryTypeId(String value) {
        this.entryTypeId = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VisaType }{@code >}
     *     
     */
    public JAXBElement<VisaType> getVisa() {
        return visa;
    }

    /**
     * Sets the value of the visa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VisaType }{@code >}
     *     
     */
    public void setVisa(JAXBElement<VisaType> value) {
        this.visa = ((JAXBElement<VisaType> ) value);
    }

    /**
     * Gets the value of the mrz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrz() {
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
    public void setMrz(String value) {
        this.mrz = value;
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
     * Gets the value of the assessRiskResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessRiskResult() {
        return assessRiskResult;
    }

    /**
     * Sets the value of the assessRiskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessRiskResult(String value) {
        this.assessRiskResult = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOutcome(Short value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the vesselId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVesselId() {
        return vesselId;
    }

    /**
     * Sets the value of the vesselId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVesselId(JAXBElement<String> value) {
        this.vesselId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stayExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStayExpiryDate() {
        return stayExpiryDate;
    }

    /**
     * Sets the value of the stayExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStayExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.stayExpiryDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the overstayPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getOverstayPayment() {
        return overstayPayment;
    }

    /**
     * Sets the value of the overstayPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setOverstayPayment(PaymentType value) {
        this.overstayPayment = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovementType.Events }{@code >}
     *     
     */
    public JAXBElement<MovementType.Events> getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovementType.Events }{@code >}
     *     
     */
    public void setEvents(JAXBElement<MovementType.Events> value) {
        this.events = ((JAXBElement<MovementType.Events> ) value);
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdditionalDataType }{@code >}
     *     
     */
    public JAXBElement<AdditionalDataType> getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdditionalDataType }{@code >}
     *     
     */
    public void setAdditionalData(JAXBElement<AdditionalDataType> value) {
        this.additionalData = ((JAXBElement<AdditionalDataType> ) value);
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovementLinkType }{@code >}
     *     
     */
    public JAXBElement<MovementLinkType> getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovementLinkType }{@code >}
     *     
     */
    public void setLinks(JAXBElement<MovementLinkType> value) {
        this.links = ((JAXBElement<MovementLinkType> ) value);
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
     *         &lt;element name="Event" type="{http://sita.aero/iborders/entryExit/MovementService/V1}EventType" maxOccurs="unbounded" minOccurs="0"/>
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
        "event"
    })
    public static class Events {

        @XmlElement(name = "Event", nillable = true)
        protected List<EventType> event;

        /**
         * Gets the value of the event property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventType }
         * 
         * 
         */
        public List<EventType> getEvent() {
            if (event == null) {
                event = new ArrayList<EventType>();
            }
            return this.event;
        }

    }

}
