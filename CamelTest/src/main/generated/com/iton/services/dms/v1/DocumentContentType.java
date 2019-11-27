
package com.iton.services.dms.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to define the document location and its
 * 				content.
 * 			
 * 
 * <p>Java class for DocumentContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentLocation" type="{http://iton.com/services/dms/V1}DocumentLocationType"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentContentType", propOrder = {
    "documentLocation",
    "data"
})
public class DocumentContentType {

    @XmlElement(name = "DocumentLocation", required = true)
    protected DocumentLocationType documentLocation;
    @XmlElement(name = "Data", required = true)
    protected byte[] data;

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

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = ((byte[]) value);
    }

}
