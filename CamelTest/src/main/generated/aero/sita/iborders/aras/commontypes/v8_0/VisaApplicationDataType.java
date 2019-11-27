
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VisaApplicationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaApplicationDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sita.aero/iborders/aras/CommonTypes/V8_0}VisaDataType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ApplicationIndicator" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}SystemIndicatorType"/>
 *         &lt;element name="DecidedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FinalDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaApplicationDataType", propOrder = {
    "applicationStatusDate",
    "applicationIndicator",
    "decidedDate",
    "finalDecision"
})
public class VisaApplicationDataType
    extends VisaDataType
{

    @XmlElement(name = "ApplicationStatusDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationStatusDate;
    @XmlElement(name = "ApplicationIndicator", required = true)
    protected SystemIndicatorType applicationIndicator;
    @XmlElement(name = "DecidedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decidedDate;
    @XmlElement(name = "FinalDecision")
    protected String finalDecision;

    /**
     * Gets the value of the applicationStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationStatusDate() {
        return applicationStatusDate;
    }

    /**
     * Sets the value of the applicationStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationStatusDate(XMLGregorianCalendar value) {
        this.applicationStatusDate = value;
    }

    /**
     * Gets the value of the applicationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIndicatorType }
     *     
     */
    public SystemIndicatorType getApplicationIndicator() {
        return applicationIndicator;
    }

    /**
     * Sets the value of the applicationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIndicatorType }
     *     
     */
    public void setApplicationIndicator(SystemIndicatorType value) {
        this.applicationIndicator = value;
    }

    /**
     * Gets the value of the decidedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecidedDate() {
        return decidedDate;
    }

    /**
     * Sets the value of the decidedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecidedDate(XMLGregorianCalendar value) {
        this.decidedDate = value;
    }

    /**
     * Gets the value of the finalDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalDecision() {
        return finalDecision;
    }

    /**
     * Sets the value of the finalDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalDecision(String value) {
        this.finalDecision = value;
    }

}
