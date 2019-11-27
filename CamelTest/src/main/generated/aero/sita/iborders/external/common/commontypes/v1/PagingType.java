
package aero.sita.iborders.external.common.commontypes.v1;

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
    "resultsPerFetch"
})
public class PagingType {

    @XmlElement(name = "FetchNumber", required = true)
    protected BigInteger fetchNumber;
    @XmlElement(name = "ResultsPerFetch", required = true)
    protected BigInteger resultsPerFetch;

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

}
