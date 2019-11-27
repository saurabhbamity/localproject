
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WatchlistHitCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WatchlistHitCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Document"/>
 *     &lt;enumeration value="Person"/>
 *     &lt;enumeration value="ApRules"/>
 *     &lt;enumeration value="Notify"/>
 *     &lt;enumeration value="NoHit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WatchlistHitCategoryType")
@XmlEnum
public enum WatchlistHitCategoryType {


    /**
     * Watchlist Document Hit
     * 
     */
    @XmlEnumValue("Document")
    DOCUMENT("Document"),

    /**
     * Watchlist Person Hit
     * 
     */
    @XmlEnumValue("Person")
    PERSON("Person"),

    /**
     * Watchlist Ap Rules Hit
     * 
     */
    @XmlEnumValue("ApRules")
    AP_RULES("ApRules"),

    /**
     * Watchlist Notify Hit
     * 
     */
    @XmlEnumValue("Notify")
    NOTIFY("Notify"),

    /**
     * Watchlist No Hit
     * 
     */
    @XmlEnumValue("NoHit")
    NO_HIT("NoHit");
    private final String value;

    WatchlistHitCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WatchlistHitCategoryType fromValue(String v) {
        for (WatchlistHitCategoryType c: WatchlistHitCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
