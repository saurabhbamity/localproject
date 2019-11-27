
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * These are the watchlists,profilers and external
 *                 systems.
 *             
 * 
 * <p>Java class for TargetSystemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetSystemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Watchlist" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="WatchlistCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Profiler" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProfilerCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExternalSystem" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExternalSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetSystemsType", propOrder = {
    "watchlist",
    "profiler",
    "externalSystem"
})
public class TargetSystemsType {

    @XmlElement(name = "Watchlist")
    protected TargetSystemsType.Watchlist watchlist;
    @XmlElement(name = "Profiler")
    protected TargetSystemsType.Profiler profiler;
    @XmlElement(name = "ExternalSystem")
    protected TargetSystemsType.ExternalSystem externalSystem;

    /**
     * Gets the value of the watchlist property.
     * 
     * @return
     *     possible object is
     *     {@link TargetSystemsType.Watchlist }
     *     
     */
    public TargetSystemsType.Watchlist getWatchlist() {
        return watchlist;
    }

    /**
     * Sets the value of the watchlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetSystemsType.Watchlist }
     *     
     */
    public void setWatchlist(TargetSystemsType.Watchlist value) {
        this.watchlist = value;
    }

    /**
     * Gets the value of the profiler property.
     * 
     * @return
     *     possible object is
     *     {@link TargetSystemsType.Profiler }
     *     
     */
    public TargetSystemsType.Profiler getProfiler() {
        return profiler;
    }

    /**
     * Sets the value of the profiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetSystemsType.Profiler }
     *     
     */
    public void setProfiler(TargetSystemsType.Profiler value) {
        this.profiler = value;
    }

    /**
     * Gets the value of the externalSystem property.
     * 
     * @return
     *     possible object is
     *     {@link TargetSystemsType.ExternalSystem }
     *     
     */
    public TargetSystemsType.ExternalSystem getExternalSystem() {
        return externalSystem;
    }

    /**
     * Sets the value of the externalSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetSystemsType.ExternalSystem }
     *     
     */
    public void setExternalSystem(TargetSystemsType.ExternalSystem value) {
        this.externalSystem = value;
    }


    /**
     * External System Code list
     *                                               
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
     *         &lt;element name="ExternalSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "externalSystemCode"
    })
    public static class ExternalSystem {

        @XmlElement(name = "ExternalSystemCode", required = true)
        protected List<String> externalSystemCode;

        /**
         * Gets the value of the externalSystemCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalSystemCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExternalSystemCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExternalSystemCode() {
            if (externalSystemCode == null) {
                externalSystemCode = new ArrayList<String>();
            }
            return this.externalSystemCode;
        }

    }


    /**
     * Profiler Code list
     *                                               
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
     *         &lt;element name="ProfilerCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "profilerCode"
    })
    public static class Profiler {

        @XmlElement(name = "ProfilerCode", required = true)
        protected List<String> profilerCode;

        /**
         * Gets the value of the profilerCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profilerCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfilerCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getProfilerCode() {
            if (profilerCode == null) {
                profilerCode = new ArrayList<String>();
            }
            return this.profilerCode;
        }

    }


    /**
     * Watch list Code list
     *                                               
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
     *         &lt;element name="WatchlistCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "watchlistCode"
    })
    public static class Watchlist {

        @XmlElement(name = "WatchlistCode", required = true)
        protected List<String> watchlistCode;

        /**
         * Gets the value of the watchlistCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the watchlistCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWatchlistCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWatchlistCode() {
            if (watchlistCode == null) {
                watchlistCode = new ArrayList<String>();
            }
            return this.watchlistCode;
        }

    }

}
