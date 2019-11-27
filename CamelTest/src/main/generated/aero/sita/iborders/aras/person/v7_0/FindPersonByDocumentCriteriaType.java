
package aero.sita.iborders.aras.person.v7_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindPersonByDocumentCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindPersonByDocumentCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentSearchCriteria" type="{http://sita.aero/iborders/aras/Person/V7_0}DocumentSearchCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPersonByDocumentCriteriaType", propOrder = {
    "documentSearchCriteria"
})
public class FindPersonByDocumentCriteriaType {

    @XmlElement(name = "DocumentSearchCriteria", required = true)
    protected DocumentSearchCriteriaType documentSearchCriteria;

    /**
     * Gets the value of the documentSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSearchCriteriaType }
     *     
     */
    public DocumentSearchCriteriaType getDocumentSearchCriteria() {
        return documentSearchCriteria;
    }

    /**
     * Sets the value of the documentSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSearchCriteriaType }
     *     
     */
    public void setDocumentSearchCriteria(DocumentSearchCriteriaType value) {
        this.documentSearchCriteria = value;
    }

}
