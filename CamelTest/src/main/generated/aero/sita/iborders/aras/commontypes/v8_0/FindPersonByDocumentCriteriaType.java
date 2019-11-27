
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="DocumentSearchCriteria" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}DocumentSearchCriteriaType" maxOccurs="unbounded"/>
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
    protected List<DocumentSearchCriteriaType> documentSearchCriteria;

    /**
     * Gets the value of the documentSearchCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentSearchCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentSearchCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentSearchCriteriaType }
     * 
     * 
     */
    public List<DocumentSearchCriteriaType> getDocumentSearchCriteria() {
        if (documentSearchCriteria == null) {
            documentSearchCriteria = new ArrayList<DocumentSearchCriteriaType>();
        }
        return this.documentSearchCriteria;
    }

}
