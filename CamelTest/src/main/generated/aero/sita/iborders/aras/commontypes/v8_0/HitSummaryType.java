
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies either a Person Hit or a Document Hit and/or Profile Hit or no Hit
 * 
 * <p>Java class for HitSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HitSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WatchListHitSummary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WatchListHitDetails" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}WatchListHitType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProfileHit" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ProfileHitType" minOccurs="0"/>
 *         &lt;element name="SystemHit" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}SystemHitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferralHit" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ReferralHitType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HitSummaryType", propOrder = {
    "watchListHitSummary",
    "profileHit",
    "systemHit",
    "referralHit"
})
public class HitSummaryType {

    @XmlElement(name = "WatchListHitSummary")
    protected HitSummaryType.WatchListHitSummary watchListHitSummary;
    @XmlElement(name = "ProfileHit")
    protected ProfileHitType profileHit;
    @XmlElement(name = "SystemHit")
    protected List<SystemHitType> systemHit;
    @XmlElement(name = "ReferralHit")
    protected ReferralHitType referralHit;

    /**
     * Gets the value of the watchListHitSummary property.
     * 
     * @return
     *     possible object is
     *     {@link HitSummaryType.WatchListHitSummary }
     *     
     */
    public HitSummaryType.WatchListHitSummary getWatchListHitSummary() {
        return watchListHitSummary;
    }

    /**
     * Sets the value of the watchListHitSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link HitSummaryType.WatchListHitSummary }
     *     
     */
    public void setWatchListHitSummary(HitSummaryType.WatchListHitSummary value) {
        this.watchListHitSummary = value;
    }

    /**
     * Gets the value of the profileHit property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileHitType }
     *     
     */
    public ProfileHitType getProfileHit() {
        return profileHit;
    }

    /**
     * Sets the value of the profileHit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileHitType }
     *     
     */
    public void setProfileHit(ProfileHitType value) {
        this.profileHit = value;
    }

    /**
     * Gets the value of the systemHit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemHit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemHit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemHitType }
     * 
     * 
     */
    public List<SystemHitType> getSystemHit() {
        if (systemHit == null) {
            systemHit = new ArrayList<SystemHitType>();
        }
        return this.systemHit;
    }

    /**
     * Gets the value of the referralHit property.
     * 
     * @return
     *     possible object is
     *     {@link ReferralHitType }
     *     
     */
    public ReferralHitType getReferralHit() {
        return referralHit;
    }

    /**
     * Sets the value of the referralHit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferralHitType }
     *     
     */
    public void setReferralHit(ReferralHitType value) {
        this.referralHit = value;
    }


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
     *         &lt;element name="WatchListHitDetails" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}WatchListHitType" maxOccurs="unbounded"/>
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
        "watchListHitDetails"
    })
    public static class WatchListHitSummary {

        @XmlElement(name = "WatchListHitDetails", required = true)
        protected List<WatchListHitType> watchListHitDetails;

        /**
         * Gets the value of the watchListHitDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the watchListHitDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWatchListHitDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WatchListHitType }
         * 
         * 
         */
        public List<WatchListHitType> getWatchListHitDetails() {
            if (watchListHitDetails == null) {
                watchListHitDetails = new ArrayList<WatchListHitType>();
            }
            return this.watchListHitDetails;
        }

    }

}
