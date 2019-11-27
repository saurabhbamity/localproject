
package aero.sita.iborders.external.common.commontypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullAddress" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}FullAddressType" minOccurs="0"/>
 *         &lt;element name="ContactName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CompanyName" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}JobTitleType" minOccurs="0"/>
 *         &lt;element name="PropertyNumber" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}PropertyNumberType" minOccurs="0"/>
 *         &lt;element name="PropertyName" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}PropertyNameType" minOccurs="0"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}AddressLineType" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}AddressLineType" minOccurs="0"/>
 *         &lt;element name="AddressLine3" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}AddressLineType" minOccurs="0"/>
 *         &lt;element name="AddressLine4" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}AddressLineType" minOccurs="0"/>
 *         &lt;element name="CityCode" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CityCodeType" minOccurs="0"/>
 *         &lt;element name="City" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CityNameType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CountrySubdivision" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}CountrySubdivisionType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}PostalCodeType" minOccurs="0"/>
 *         &lt;element name="GPSCordinates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Latitude" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LatitudeType"/>
 *                   &lt;element name="Longitude" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LongitudeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}TypesofAddress" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "fullAddress",
    "contactName",
    "companyName",
    "jobTitle",
    "propertyNumber",
    "propertyName",
    "addressId",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "cityCode",
    "city",
    "country",
    "countrySubdivision",
    "postalCode",
    "gpsCordinates"
})
public class AddressType {

    @XmlElement(name = "FullAddress")
    protected String fullAddress;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "PropertyNumber")
    protected String propertyNumber;
    @XmlElement(name = "PropertyName")
    protected String propertyName;
    @XmlElement(name = "AddressId")
    protected Long addressId;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "AddressLine4")
    protected String addressLine4;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "CountrySubdivision")
    protected String countrySubdivision;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "GPSCordinates")
    protected AddressType.GPSCordinates gpsCordinates;
    @XmlAttribute(name = "Type", required = true)
    protected TypesofAddress type;

    /**
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the propertyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyNumber() {
        return propertyNumber;
    }

    /**
     * Sets the value of the propertyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyNumber(String value) {
        this.propertyNumber = value;
    }

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddressId(Long value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivision() {
        return countrySubdivision;
    }

    /**
     * Sets the value of the countrySubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivision(String value) {
        this.countrySubdivision = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the gpsCordinates property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType.GPSCordinates }
     *     
     */
    public AddressType.GPSCordinates getGPSCordinates() {
        return gpsCordinates;
    }

    /**
     * Sets the value of the gpsCordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType.GPSCordinates }
     *     
     */
    public void setGPSCordinates(AddressType.GPSCordinates value) {
        this.gpsCordinates = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypesofAddress }
     *     
     */
    public TypesofAddress getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesofAddress }
     *     
     */
    public void setType(TypesofAddress value) {
        this.type = value;
    }


    /**
     * GPSCordinates for Northing and Easting.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Latitude" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LatitudeType"/>
     *         &lt;element name="Longitude" type="{http://sita.aero/iborders/external/common/CommonTypes/V1}LongitudeType"/>
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
        "latitude",
        "longitude"
    })
    public static class GPSCordinates {

        @XmlElement(name = "Latitude", required = true)
        protected String latitude;
        @XmlElement(name = "Longitude", required = true)
        protected String longitude;

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

    }

}
