
package aero.sita.iborders.aras.commontypes.v8_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FetchNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ResultsPerFetch" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PageAction" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}PageActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagingType", propOrder = {
    "fetchNumber",
    "resultsPerFetch",
    "pageAction"
})
public class PagingType {

    @XmlElement(name = "FetchNumber", required = true)
    protected BigInteger fetchNumber;
    @XmlElement(name = "ResultsPerFetch", required = true)
    protected BigInteger resultsPerFetch;
    @XmlElement(name = "PageAction")
    protected PageActionType pageAction;

    /**
     * Gets the value of the fetchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFetchNumber() {
        return fetchNumber;
    }

    /**
     * Sets the value of the fetchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFetchNumber(BigInteger value) {
        this.fetchNumber = value;
    }

    /**
     * Gets the value of the resultsPerFetch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultsPerFetch() {
        return resultsPerFetch;
    }

    /**
     * Sets the value of the resultsPerFetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultsPerFetch(BigInteger value) {
        this.resultsPerFetch = value;
    }

    /**
     * Gets the value of the pageAction property.
     * 
     * @return
     *     possible object is
     *     {@link PageActionType }
     *     
     */
    public PageActionType getPageAction() {
        return pageAction;
    }

    /**
     * Sets the value of the pageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageActionType }
     *     
     */
    public void setPageAction(PageActionType value) {
        this.pageAction = value;
    }

}
