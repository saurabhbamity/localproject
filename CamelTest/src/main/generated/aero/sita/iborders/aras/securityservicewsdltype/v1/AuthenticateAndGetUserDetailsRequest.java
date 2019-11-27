
package aero.sita.iborders.aras.securityservicewsdltype.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.aras.security.v1.UserLoginDetailsType;


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
 *         &lt;element name="UserLoginDetails" type="{http://sita.aero/iborders/aras/Security/V1}UserLoginDetailsType"/>
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
    "userLoginDetails"
})
@XmlRootElement(name = "AuthenticateAndGetUserDetailsRequest")
public class AuthenticateAndGetUserDetailsRequest {

    @XmlElement(name = "UserLoginDetails", required = true)
    protected UserLoginDetailsType userLoginDetails;

    /**
     * Gets the value of the userLoginDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserLoginDetailsType }
     *     
     */
    public UserLoginDetailsType getUserLoginDetails() {
        return userLoginDetails;
    }

    /**
     * Sets the value of the userLoginDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLoginDetailsType }
     *     
     */
    public void setUserLoginDetails(UserLoginDetailsType value) {
        this.userLoginDetails = value;
    }

}
