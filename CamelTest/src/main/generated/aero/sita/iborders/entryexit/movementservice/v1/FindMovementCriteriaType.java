
package aero.sita.iborders.entryexit.movementservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.sita.iborders.entryexit.common.v1.DirectionIndicator;


/**
 * Criteria find for FindMovement
 * 
 * <p>Java class for FindMovementCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindMovementCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxResult" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="ContentInResponse" type="{http://sita.aero/iborders/entryExit/MovementService/V1}contentInResponseLevel" maxOccurs="unbounded" form="qualified"/>
 *         &lt;element name="TDNo" type="{http://sita.aero/iborders/entryExit/Common/V1}tdNo" minOccurs="0" form="qualified"/>
 *         &lt;element name="TDType" type="{http://sita.aero/iborders/entryExit/MovementService/V1}oneCharCode" minOccurs="0" form="qualified"/>
 *         &lt;element name="IssuingState" type="{http://sita.aero/iborders/entryExit/Common/V1}country" minOccurs="0" form="qualified"/>
 *         &lt;element name="Direction" type="{http://sita.aero/iborders/entryExit/Common/V1}directionIndicator" form="qualified"/>
 *         &lt;element name="Location" type="{http://sita.aero/iborders/entryExit/Common/V1}locationCodeType" form="qualified"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="Status" type="{http://sita.aero/iborders/entryExit/MovementService/V1}movementStatus" minOccurs="0" form="qualified"/>
 *         &lt;element name="VesselId" type="{http://sita.aero/iborders/entryExit/Common/V1}flightVesselCode" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMovementCriteriaType", propOrder = {
    "maxResult",
    "contentInResponse",
    "tdNo",
    "tdType",
    "issuingState",
    "direction",
    "location",
    "startDateTime",
    "endDateTime",
    "status",
    "vesselId"
})
public class FindMovementCriteriaType {

    @XmlElement(name = "MaxResult")
    protected int maxResult;
    @XmlElement(name = "ContentInResponse", required = true)
    protected List<ContentInResponseLevel> contentInResponse;
    @XmlElement(name = "TDNo")
    protected String tdNo;
    @XmlElement(name = "TDType")
    protected String tdType;
    @XmlElement(name = "IssuingState")
    protected String issuingState;
    @XmlElement(name = "Direction", required = true)
    protected DirectionIndicator direction;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElementRef(name = "StartDateTime", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startDateTime;
    @XmlElementRef(name = "EndDateTime", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endDateTime;
    @XmlElementRef(name = "Status", namespace = "http://sita.aero/iborders/entryExit/MovementService/V1", type = JAXBElement.class)
    protected JAXBElement<MovementStatus> status;
    @XmlElement(name = "VesselId")
    protected String vesselId;

    /**
     * Gets the value of the maxResult property.
     * 
     */
    public int getMaxResult() {
        return maxResult;
    }

    /**
     * Sets the value of the maxResult property.
     * 
     */
    public void setMaxResult(int value) {
        this.maxResult = value;
    }

    /**
     * Gets the value of the contentInResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentInResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentInResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentInResponseLevel }
     * 
     * 
     */
    public List<ContentInResponseLevel> getContentInResponse() {
        if (contentInResponse == null) {
            contentInResponse = new ArrayList<ContentInResponseLevel>();
        }
        return this.contentInResponse;
    }

    /**
     * Gets the value of the tdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDNo() {
        return tdNo;
    }

    /**
     * Sets the value of the tdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDNo(String value) {
        this.tdNo = value;
    }

    /**
     * Gets the value of the tdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDType() {
        return tdType;
    }

    /**
     * Sets the value of the tdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDType(String value) {
        this.tdType = value;
    }

    /**
     * Gets the value of the issuingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingState() {
        return issuingState;
    }

    /**
     * Sets the value of the issuingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingState(String value) {
        this.issuingState = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionIndicator }
     *     
     */
    public DirectionIndicator getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionIndicator }
     *     
     */
    public void setDirection(DirectionIndicator value) {
        this.direction = value;
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
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateTime = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MovementStatus }{@code >}
     *     
     */
    public JAXBElement<MovementStatus> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MovementStatus }{@code >}
     *     
     */
    public void setStatus(JAXBElement<MovementStatus> value) {
        this.status = ((JAXBElement<MovementStatus> ) value);
    }

    /**
     * Gets the value of the vesselId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselId() {
        return vesselId;
    }

    /**
     * Sets the value of the vesselId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselId(String value) {
        this.vesselId = value;
    }

}
