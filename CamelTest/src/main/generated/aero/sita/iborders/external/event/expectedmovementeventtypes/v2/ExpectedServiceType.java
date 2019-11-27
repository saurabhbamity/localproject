
package aero.sita.iborders.external.event.expectedmovementeventtypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.external.common.commondomaintypes.v2.OperatorType;


/**
 * <p>Java class for ExpectedServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceType" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}OperatorType"/>
 *         &lt;element name="ServiceCode" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}ServiceCodeType"/>
 *         &lt;element name="ServiceNumber" type="{http://sita.aero/iborders/external/common/CommonDomainTypes/V2}ServiceNumberType"/>
 *         &lt;element name="CountryOfRegistration" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedServiceType", propOrder = {
    "serviceType",
    "serviceCode",
    "serviceNumber",
    "countryOfRegistration"
})
public class ExpectedServiceType {

    @XmlElement(name = "ServiceType", required = true)
    protected OperatorType serviceType;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "ServiceNumber", required = true)
    protected String serviceNumber;
    @XmlElement(name = "CountryOfRegistration")
    protected String countryOfRegistration;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorType }
     *     
     */
    public OperatorType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorType }
     *     
     */
    public void setServiceType(OperatorType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the value of the serviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Gets the value of the countryOfRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfRegistration() {
        return countryOfRegistration;
    }

    /**
     * Sets the value of the countryOfRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfRegistration(String value) {
        this.countryOfRegistration = value;
    }

}
