
package aero.sita.iborders.external.event.eventcommontypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AssociatedDocsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedDocsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AttachmentUri" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}ImageIdType" minOccurs="0"/>
 *         &lt;element name="AttachmentName" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V1}AttachmentNameType" minOccurs="0"/>
 *         &lt;element name="AttachmentType" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V1}TypeOfAttachmentType" minOccurs="0"/>
 *         &lt;element name="AttachmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AttachedBy" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V1}AttachedByType" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://sita.aero/iborders/external/event/EventCommonTypes/V1}CreatedByType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedDocsType", propOrder = {
    "attachmentId",
    "attachmentUri",
    "attachmentName",
    "attachmentType",
    "attachmentDate",
    "attachedBy",
    "createdDate",
    "createdBy"
})
public class AssociatedDocsType {

    @XmlElement(name = "AttachmentId")
    protected Long attachmentId;
    @XmlElement(name = "AttachmentUri")
    protected String attachmentUri;
    @XmlElement(name = "AttachmentName")
    protected String attachmentName;
    @XmlElement(name = "AttachmentType")
    protected String attachmentType;
    @XmlElement(name = "AttachmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar attachmentDate;
    @XmlElement(name = "AttachedBy")
    protected String attachedBy;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;

    /**
     * Gets the value of the attachmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttachmentId() {
        return attachmentId;
    }

    /**
     * Sets the value of the attachmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttachmentId(Long value) {
        this.attachmentId = value;
    }

    /**
     * Gets the value of the attachmentUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentUri() {
        return attachmentUri;
    }

    /**
     * Sets the value of the attachmentUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentUri(String value) {
        this.attachmentUri = value;
    }

    /**
     * Gets the value of the attachmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * Sets the value of the attachmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentName(String value) {
        this.attachmentName = value;
    }

    /**
     * Gets the value of the attachmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentType() {
        return attachmentType;
    }

    /**
     * Sets the value of the attachmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentType(String value) {
        this.attachmentType = value;
    }

    /**
     * Gets the value of the attachmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttachmentDate() {
        return attachmentDate;
    }

    /**
     * Sets the value of the attachmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttachmentDate(XMLGregorianCalendar value) {
        this.attachmentDate = value;
    }

    /**
     * Gets the value of the attachedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedBy() {
        return attachedBy;
    }

    /**
     * Sets the value of the attachedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedBy(String value) {
        this.attachedBy = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

}
