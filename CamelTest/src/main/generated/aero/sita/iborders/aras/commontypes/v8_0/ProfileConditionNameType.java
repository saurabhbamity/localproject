
package aero.sita.iborders.aras.commontypes.v8_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileConditionNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfileConditionNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOOKING_CLASS"/>
 *     &lt;enumeration value="CREDIT_CARD"/>
 *     &lt;enumeration value="AGENT_IATA_CODE"/>
 *     &lt;enumeration value="LOCATIONS_EN_ROUTE"/>
 *     &lt;enumeration value="AGENT_PSEUDO_CITY_CODE"/>
 *     &lt;enumeration value="EXTRA_SEAT"/>
 *     &lt;enumeration value="GO_SHOW"/>
 *     &lt;enumeration value="ITINERARY_TYPE"/>
 *     &lt;enumeration value="NO_OF_PEOPLE_IN_PNR"/>
 *     &lt;enumeration value="NUMBER_OF_BAGS"/>
 *     &lt;enumeration value="BAGGAGE_WEIGHT"/>
 *     &lt;enumeration value="PNR_AGE"/>
 *     &lt;enumeration value="OCCUPATION"/>
 *     &lt;enumeration value="PLACE_OF_BIRTH"/>
 *     &lt;enumeration value="JOURNEY_ROUTE_LOCATION"/>
 *     &lt;enumeration value="JOURNEY_ROUTE_COUNTRY"/>
 *     &lt;enumeration value="TELEPHONE"/>
 *     &lt;enumeration value="NATIONALITY"/>
 *     &lt;enumeration value="AGE"/>
 *     &lt;enumeration value="GENDER"/>
 *     &lt;enumeration value="DOCUMENT_ISSUING_STATE"/>
 *     &lt;enumeration value="AIRPORT_EN_ROUTE"/>
 *     &lt;enumeration value="COUNTRIES_EN_ROUTE"/>
 *     &lt;enumeration value="TRAVEL_TYPE"/>
 *     &lt;enumeration value="PAYMENT_METHOD"/>
 *     &lt;enumeration value="LENGTH_OF_STAY"/>
 *     &lt;enumeration value="DOCUMENT_ISSUE_STATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProfileConditionNameType")
@XmlEnum
public enum ProfileConditionNameType {


    /**
     * booking class
     * 
     */
    BOOKING_CLASS,

    /**
     * credit card
     * 
     */
    CREDIT_CARD,

    /**
     * Agent iata code
     * 
     */
    AGENT_IATA_CODE,

    /**
     * Locations en route
     * 
     */
    LOCATIONS_EN_ROUTE,

    /**
     * Agent pseudo city code
     * 
     */
    AGENT_PSEUDO_CITY_CODE,

    /**
     * extra seat
     * 
     */
    EXTRA_SEAT,

    /**
     * go show
     * 
     */
    GO_SHOW,

    /**
     * itinerary type
     * 
     */
    ITINERARY_TYPE,

    /**
     * no of people in pnr
     * 
     */
    NO_OF_PEOPLE_IN_PNR,

    /**
     * number of bags
     * 
     */
    NUMBER_OF_BAGS,

    /**
     * weight of bags
     * 
     */
    BAGGAGE_WEIGHT,

    /**
     * pnr age
     * 
     */
    PNR_AGE,

    /**
     * occupation
     * 
     */
    OCCUPATION,

    /**
     * place of birth
     * 
     */
    PLACE_OF_BIRTH,

    /**
     * journey route location
     * 
     */
    JOURNEY_ROUTE_LOCATION,

    /**
     * journey route country
     * 
     */
    JOURNEY_ROUTE_COUNTRY,

    /**
     * telephone
     * 
     */
    TELEPHONE,

    /**
     * Nationality
     * 
     */
    NATIONALITY,

    /**
     * Age
     * 
     */
    AGE,

    /**
     * Gender
     * 
     */
    GENDER,

    /**
     * DocumentIssuingState
     * 
     */
    DOCUMENT_ISSUING_STATE,

    /**
     * AirportonRoute
     * 
     */
    AIRPORT_EN_ROUTE,

    /**
     * CountryonRoute
     * 
     */
    COUNTRIES_EN_ROUTE,

    /**
     * TravelType
     * 
     */
    TRAVEL_TYPE,

    /**
     * PaymentMethod
     * 
     */
    PAYMENT_METHOD,

    /**
     * Length of the Stay
     * 
     */
    LENGTH_OF_STAY,

    /**
     * Document Issue State
     * 
     */
    DOCUMENT_ISSUE_STATE;

    public String value() {
        return name();
    }

    public static ProfileConditionNameType fromValue(String v) {
        return valueOf(v);
    }

}
