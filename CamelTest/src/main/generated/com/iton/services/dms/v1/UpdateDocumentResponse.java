
package com.iton.services.dms.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DocumentProperties" type="{http://iton.com/services/dms/V1}DocumentPropertiesType"/>
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
    "documentProperties"
})
@XmlRootElement(name = "UpdateDocumentResponse")
public class UpdateDocumentResponse {

    @XmlElement(name = "DocumentProperties", required = true)
    protected DocumentPropertiesType documentProperties;

    /**
     * Gets the value of the documentProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPropertiesType }
     *     
     */
    public DocumentPropertiesType getDocumentProperties() {
        return documentProperties;
    }

    /**
     * Sets the value of the documentProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPropertiesType }
     *     
     */
    public void setDocumentProperties(DocumentPropertiesType value) {
        this.documentProperties = value;
    }

}
