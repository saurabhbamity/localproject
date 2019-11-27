
package aero.sita.iborders.aras.commontypes.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileDetailsCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileDetailsCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionName" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ProfileConditionNameType"/>
 *         &lt;element name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConditionValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssessedConditionValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comparator" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ComparatorType"/>
 *         &lt;element name="AllowedComparators" type="{http://sita.aero/iborders/aras/CommonTypes/V8_0}ComparatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProfileConditionHit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileDetailsCommonType", propOrder = {
    "conditionName",
    "included",
    "conditionValues",
    "assessedConditionValue",
    "comparator",
    "allowedComparators",
    "weight",
    "profileConditionHit"
})
public class ProfileDetailsCommonType {

    @XmlElement(name = "ConditionName", required = true)
    protected ProfileConditionNameType conditionName;
    @XmlElement(name = "Included")
    protected boolean included;
    @XmlElement(name = "ConditionValues")
    protected List<String> conditionValues;
    @XmlElement(name = "AssessedConditionValue")
    protected List<String> assessedConditionValue;
    @XmlElement(name = "Comparator", required = true)
    protected ComparatorType comparator;
    @XmlElement(name = "AllowedComparators")
    protected List<ComparatorType> allowedComparators;
    @XmlElement(name = "Weight")
    protected int weight;
    @XmlElement(name = "ProfileConditionHit")
    protected Boolean profileConditionHit;

    /**
     * Gets the value of the conditionName property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileConditionNameType }
     *     
     */
    public ProfileConditionNameType getConditionName() {
        return conditionName;
    }

    /**
     * Sets the value of the conditionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileConditionNameType }
     *     
     */
    public void setConditionName(ProfileConditionNameType value) {
        this.conditionName = value;
    }

    /**
     * Gets the value of the included property.
     * 
     */
    public boolean isIncluded() {
        return included;
    }

    /**
     * Sets the value of the included property.
     * 
     */
    public void setIncluded(boolean value) {
        this.included = value;
    }

    /**
     * Gets the value of the conditionValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConditionValues() {
        if (conditionValues == null) {
            conditionValues = new ArrayList<String>();
        }
        return this.conditionValues;
    }

    /**
     * Gets the value of the assessedConditionValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessedConditionValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessedConditionValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessedConditionValue() {
        if (assessedConditionValue == null) {
            assessedConditionValue = new ArrayList<String>();
        }
        return this.assessedConditionValue;
    }

    /**
     * Gets the value of the comparator property.
     * 
     * @return
     *     possible object is
     *     {@link ComparatorType }
     *     
     */
    public ComparatorType getComparator() {
        return comparator;
    }

    /**
     * Sets the value of the comparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparatorType }
     *     
     */
    public void setComparator(ComparatorType value) {
        this.comparator = value;
    }

    /**
     * Gets the value of the allowedComparators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedComparators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedComparators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparatorType }
     * 
     * 
     */
    public List<ComparatorType> getAllowedComparators() {
        if (allowedComparators == null) {
            allowedComparators = new ArrayList<ComparatorType>();
        }
        return this.allowedComparators;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

    /**
     * Gets the value of the profileConditionHit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfileConditionHit() {
        return profileConditionHit;
    }

    /**
     * Sets the value of the profileConditionHit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfileConditionHit(Boolean value) {
        this.profileConditionHit = value;
    }

}
