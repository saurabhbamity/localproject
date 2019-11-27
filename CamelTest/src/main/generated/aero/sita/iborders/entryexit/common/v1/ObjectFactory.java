
package aero.sita.iborders.entryexit.common.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.sita.iborders.entryexit.common.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EffectiveDatesTypeToDate_QNAME = new QName("http://sita.aero/iborders/entryExit/Common/V1", "ToDate");
    private final static QName _PersonNameTypeGivenNames_QNAME = new QName("http://sita.aero/iborders/entryExit/Common/V1", "GivenNames");
    private final static QName _PersonNameTypeFamilyName_QNAME = new QName("http://sita.aero/iborders/entryExit/Common/V1", "FamilyName");
    private final static QName _PersonNameTypeLocaleID_QNAME = new QName("http://sita.aero/iborders/entryExit/Common/V1", "LocaleID");
    private final static QName _AuditTagTypeLastUpdatedOn_QNAME = new QName("http://sita.aero/iborders/entryExit/Common/V1", "LastUpdatedOn");
    private final static QName _AuditTagTypeLastUpdatedBy_QNAME = new QName("http://sita.aero/iborders/entryExit/Common/V1", "LastUpdatedBy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.sita.iborders.entryexit.common.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link MoneyType }
     * 
     */
    public MoneyType createMoneyType() {
        return new MoneyType();
    }

    /**
     * Create an instance of {@link AuditTagType }
     * 
     */
    public AuditTagType createAuditTagType() {
        return new AuditTagType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link TravelDocumentType }
     * 
     */
    public TravelDocumentType createTravelDocumentType() {
        return new TravelDocumentType();
    }

    /**
     * Create an instance of {@link EffectiveDatesType }
     * 
     */
    public EffectiveDatesType createEffectiveDatesType() {
        return new EffectiveDatesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/Common/V1", name = "ToDate", scope = EffectiveDatesType.class)
    public JAXBElement<XMLGregorianCalendar> createEffectiveDatesTypeToDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EffectiveDatesTypeToDate_QNAME, XMLGregorianCalendar.class, EffectiveDatesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/Common/V1", name = "GivenNames", scope = PersonNameType.class)
    public JAXBElement<String> createPersonNameTypeGivenNames(String value) {
        return new JAXBElement<String>(_PersonNameTypeGivenNames_QNAME, String.class, PersonNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/Common/V1", name = "FamilyName", scope = PersonNameType.class)
    public JAXBElement<String> createPersonNameTypeFamilyName(String value) {
        return new JAXBElement<String>(_PersonNameTypeFamilyName_QNAME, String.class, PersonNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/Common/V1", name = "LocaleID", scope = PersonNameType.class)
    public JAXBElement<String> createPersonNameTypeLocaleID(String value) {
        return new JAXBElement<String>(_PersonNameTypeLocaleID_QNAME, String.class, PersonNameType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/Common/V1", name = "LastUpdatedOn", scope = AuditTagType.class)
    public JAXBElement<XMLGregorianCalendar> createAuditTagTypeLastUpdatedOn(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AuditTagTypeLastUpdatedOn_QNAME, XMLGregorianCalendar.class, AuditTagType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/Common/V1", name = "LastUpdatedBy", scope = AuditTagType.class)
    public JAXBElement<String> createAuditTagTypeLastUpdatedBy(String value) {
        return new JAXBElement<String>(_AuditTagTypeLastUpdatedBy_QNAME, String.class, AuditTagType.class, value);
    }

}
