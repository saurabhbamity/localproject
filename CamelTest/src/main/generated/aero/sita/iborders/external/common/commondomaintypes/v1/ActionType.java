
package aero.sita.iborders.external.common.commondomaintypes.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details of Action Types.
 *             
 * 
 * <p>Java class for ActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MappedAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubAction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionType", propOrder = {
    "appAction",
    "mappedAction",
    "subAction"
})
public class ActionType {

    @XmlElement(name = "AppAction")
    protected String appAction;
    @XmlElement(name = "MappedAction")
    protected String mappedAction;
    @XmlElement(name = "SubAction")
    protected List<String> subAction;

    /**
     * Gets the value of the appAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppAction() {
        return appAction;
    }

    /**
     * Sets the value of the appAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppAction(String value) {
        this.appAction = value;
    }

    /**
     * Gets the value of the mappedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedAction() {
        return mappedAction;
    }

    /**
     * Sets the value of the mappedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedAction(String value) {
        this.mappedAction = value;
    }

    /**
     * Gets the value of the subAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubAction() {
        if (subAction == null) {
            subAction = new ArrayList<String>();
        }
        return this.subAction;
    }

}
