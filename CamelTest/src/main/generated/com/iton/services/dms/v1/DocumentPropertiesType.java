
package com.iton.services.dms.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to identify the file with location and its
 * 				unique identifier.
 * 			
 * 
 * <p>Java class for DocumentPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://iton.com/services/dms/V1}guidType"/>
 *         &lt;element name="DocumentLocation" type="{http://iton.com/services/dms/V1}DocumentLocationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentPropertiesType", propOrder = {
    "id",
    "documentLocation"
})
public class DocumentPropertiesType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "DocumentLocation", required = true)
    protected DocumentLocationType documentLocation;

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
     * Gets the value of the documentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentLocationType }
     *     
     */
    public DocumentLocationType getDocumentLocation() {
        return documentLocation;
    }

    /**
     * Sets the value of the documentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentLocationType }
     *     
     */
    public void setDocumentLocation(DocumentLocationType value) {
        this.documentLocation = value;
    }

}
