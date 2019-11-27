
package com.iton.services.dms.v1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Movenment" type="{http://iton.com/services/dms/V1}MovementType" maxOccurs="unbounded"/>
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
    "movenment"
})
@XmlRootElement(name = "GetDocumentByMovementIdResponse")
public class GetDocumentByMovementIdResponse {

    @XmlElement(name = "Movenment", required = true)
    protected List<MovementType> movenment;

    /**
     * Gets the value of the movenment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movenment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovenment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovementType }
     * 
     * 
     */
    public List<MovementType> getMovenment() {
        if (movenment == null) {
            movenment = new ArrayList<MovementType>();
        }
        return this.movenment;
    }

}
