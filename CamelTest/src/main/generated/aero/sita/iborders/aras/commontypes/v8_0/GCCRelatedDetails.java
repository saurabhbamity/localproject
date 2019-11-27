
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details for traveller travelling from another GCC country.
 * 
 * <p>Java class for GCCRelatedDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCCRelatedDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GCCOccupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OmanAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OmanTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GCCCountry" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="GCCAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GCCTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GCCVisaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GCCVisaExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCCRelatedDetails", propOrder = {
    "gccOccupation",
    "omanAddress",
    "omanTelephone",
    "gccCountry",
    "gccAddress",
    "gccTelephone",
    "gccVisaNumber",
    "gccVisaExpiryDate"
})
public class GCCRelatedDetails {

    @XmlElement(name = "GCCOccupation")
    protected String gccOccupation;
    @XmlElement(name = "OmanAddress")
    protected String omanAddress;
    @XmlElement(name = "OmanTelephone")
    protected String omanTelephone;
    @XmlElement(name = "GCCCountry")
    protected String gccCountry;
    @XmlElement(name = "GCCAddress")
    protected String gccAddress;
    @XmlElement(name = "GCCTelephone")
    protected String gccTelephone;
    @XmlElement(name = "GCCVisaNumber")
    protected String gccVisaNumber;
    @XmlElement(name = "GCCVisaExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gccVisaExpiryDate;

    /**
     * Gets the value of the gccOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCCOccupation() {
        return gccOccupation;
    }

    /**
     * Sets the value of the gccOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCCOccupation(String value) {
        this.gccOccupation = value;
    }

    /**
     * Gets the value of the omanAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmanAddress() {
        return omanAddress;
    }

    /**
     * Sets the value of the omanAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmanAddress(String value) {
        this.omanAddress = value;
    }

    /**
     * Gets the value of the omanTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmanTelephone() {
        return omanTelephone;
    }

    /**
     * Sets the value of the omanTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmanTelephone(String value) {
        this.omanTelephone = value;
    }

    /**
     * Gets the value of the gccCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCCCountry() {
        return gccCountry;
    }

    /**
     * Sets the value of the gccCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCCCountry(String value) {
        this.gccCountry = value;
    }

    /**
     * Gets the value of the gccAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCCAddress() {
        return gccAddress;
    }

    /**
     * Sets the value of the gccAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCCAddress(String value) {
        this.gccAddress = value;
    }

    /**
     * Gets the value of the gccTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCCTelephone() {
        return gccTelephone;
    }

    /**
     * Sets the value of the gccTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCCTelephone(String value) {
        this.gccTelephone = value;
    }

    /**
     * Gets the value of the gccVisaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCCVisaNumber() {
        return gccVisaNumber;
    }

    /**
     * Sets the value of the gccVisaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCCVisaNumber(String value) {
        this.gccVisaNumber = value;
    }

    /**
     * Gets the value of the gccVisaExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGCCVisaExpiryDate() {
        return gccVisaExpiryDate;
    }

    /**
     * Sets the value of the gccVisaExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGCCVisaExpiryDate(XMLGregorianCalendar value) {
        this.gccVisaExpiryDate = value;
    }

}
