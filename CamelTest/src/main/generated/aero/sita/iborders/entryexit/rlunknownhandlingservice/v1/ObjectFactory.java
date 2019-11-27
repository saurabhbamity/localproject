
package aero.sita.iborders.entryexit.rlunknownhandlingservice.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.sita.iborders.entryexit.rlunknownhandlingservice.v1 package. 
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

    private final static QName _GetCountResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", "GetCountResponse");
    private final static QName _GetCountRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", "GetCountRequest");
    private final static QName _OverrideAllowedRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", "OverrideAllowedRequest");
    private final static QName _OverrideAllowedResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", "OverrideAllowedResponse");
    private final static QName _ResetCountResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", "ResetCountResponse");
    private final static QName _ResetCountRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", "ResetCountRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.sita.iborders.entryexit.rlunknownhandlingservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCountRequestType }
     * 
     */
    public GetCountRequestType createGetCountRequestType() {
        return new GetCountRequestType();
    }

    /**
     * Create an instance of {@link OverrideAllowedResponseType }
     * 
     */
    public OverrideAllowedResponseType createOverrideAllowedResponseType() {
        return new OverrideAllowedResponseType();
    }

    /**
     * Create an instance of {@link ResetCountResponseType }
     * 
     */
    public ResetCountResponseType createResetCountResponseType() {
        return new ResetCountResponseType();
    }

    /**
     * Create an instance of {@link ResetCountRequestType }
     * 
     */
    public ResetCountRequestType createResetCountRequestType() {
        return new ResetCountRequestType();
    }

    /**
     * Create an instance of {@link OverrideAllowedFault }
     * 
     */
    public OverrideAllowedFault createOverrideAllowedFault() {
        return new OverrideAllowedFault();
    }

    /**
     * Create an instance of {@link OverrideAllowedRequestType }
     * 
     */
    public OverrideAllowedRequestType createOverrideAllowedRequestType() {
        return new OverrideAllowedRequestType();
    }

    /**
     * Create an instance of {@link GetCountResponseType }
     * 
     */
    public GetCountResponseType createGetCountResponseType() {
        return new GetCountResponseType();
    }

    /**
     * Create an instance of {@link ResetCountFault }
     * 
     */
    public ResetCountFault createResetCountFault() {
        return new ResetCountFault();
    }

    /**
     * Create an instance of {@link GetCountFault }
     * 
     */
    public GetCountFault createGetCountFault() {
        return new GetCountFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", name = "GetCountResponse")
    public JAXBElement<GetCountResponseType> createGetCountResponse(GetCountResponseType value) {
        return new JAXBElement<GetCountResponseType>(_GetCountResponse_QNAME, GetCountResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", name = "GetCountRequest")
    public JAXBElement<GetCountRequestType> createGetCountRequest(GetCountRequestType value) {
        return new JAXBElement<GetCountRequestType>(_GetCountRequest_QNAME, GetCountRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverrideAllowedRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", name = "OverrideAllowedRequest")
    public JAXBElement<OverrideAllowedRequestType> createOverrideAllowedRequest(OverrideAllowedRequestType value) {
        return new JAXBElement<OverrideAllowedRequestType>(_OverrideAllowedRequest_QNAME, OverrideAllowedRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverrideAllowedResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", name = "OverrideAllowedResponse")
    public JAXBElement<OverrideAllowedResponseType> createOverrideAllowedResponse(OverrideAllowedResponseType value) {
        return new JAXBElement<OverrideAllowedResponseType>(_OverrideAllowedResponse_QNAME, OverrideAllowedResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetCountResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", name = "ResetCountResponse")
    public JAXBElement<ResetCountResponseType> createResetCountResponse(ResetCountResponseType value) {
        return new JAXBElement<ResetCountResponseType>(_ResetCountResponse_QNAME, ResetCountResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetCountRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", name = "ResetCountRequest")
    public JAXBElement<ResetCountRequestType> createResetCountRequest(ResetCountRequestType value) {
        return new JAXBElement<ResetCountRequestType>(_ResetCountRequest_QNAME, ResetCountRequestType.class, null, value);
    }

}
