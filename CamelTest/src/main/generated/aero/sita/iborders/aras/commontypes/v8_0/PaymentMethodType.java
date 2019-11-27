
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="CompanyAccount"/>
 *     &lt;enumeration value="LoyaltyPoints"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodType")
@XmlEnum
public enum PaymentMethodType {


    /**
     * Cash.
     * 
     */
    @XmlEnumValue("Cash")
    CASH("Cash"),

    /**
     * CompanyAccount.
     * 
     */
    @XmlEnumValue("CompanyAccount")
    COMPANY_ACCOUNT("CompanyAccount"),

    /**
     * LoyaltyPoints.
     * 
     */
    @XmlEnumValue("LoyaltyPoints")
    LOYALTY_POINTS("LoyaltyPoints"),

    /**
     * CreditCard.
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),

    /**
     * Other.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PaymentMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodType fromValue(String v) {
        for (PaymentMethodType c: PaymentMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
