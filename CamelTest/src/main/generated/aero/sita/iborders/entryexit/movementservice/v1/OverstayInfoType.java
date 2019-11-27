
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.sita.iborders.entryexit.common.v1.MoneyType;


/**
 *  Overstay information
 * 
 * <p>Java class for OverstayInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverstayInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsOverstayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fine" type="{http://sita.aero/iborders/entryExit/Common/V1}MoneyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverstayInfoType", propOrder = {
    "isOverstayed",
    "day",
    "fine"
})
public class OverstayInfoType {

    @XmlElement(name = "IsOverstayed")
    protected boolean isOverstayed;
    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "Fine", required = true)
    protected MoneyType fine;

    /**
     * Gets the value of the isOverstayed property.
     * 
     */
    public boolean isIsOverstayed() {
        return isOverstayed;
    }

    /**
     * Sets the value of the isOverstayed property.
     * 
     */
    public void setIsOverstayed(boolean value) {
        this.isOverstayed = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Gets the value of the fine property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getFine() {
        return fine;
    }

    /**
     * Sets the value of the fine property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setFine(MoneyType value) {
        this.fine = value;
    }

}
