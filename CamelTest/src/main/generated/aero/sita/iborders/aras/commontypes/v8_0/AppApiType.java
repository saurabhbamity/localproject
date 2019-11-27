
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppApiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppApiType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="API"/>
 *     &lt;enumeration value="BOTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppApiType")
@XmlEnum
public enum AppApiType {


    /**
     * APP
     * 
     */
    APP,

    /**
     * API
     * 
     */
    API,

    /**
     * BOTH
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static AppApiType fromValue(String v) {
        return valueOf(v);
    }

}
