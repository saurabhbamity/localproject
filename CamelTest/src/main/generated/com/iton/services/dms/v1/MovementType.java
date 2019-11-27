
package com.iton.services.dms.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BlobValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "valueString",
    "blobValue"
})
public class MovementType {

    @XmlElement(name = "ValueString", required = true)
    protected String valueString;
    @XmlElement(name = "BlobValue", required = true)
    protected byte[] blobValue;

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the blobValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBlobValue() {
        return blobValue;
    }

    /**
     * Sets the value of the blobValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBlobValue(byte[] value) {
        this.blobValue = ((byte[]) value);
    }

}
