
package aero.sita.iborders.entryexit.rlupdateservice.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.sita.iborders.entryexit.rlupdateservice.v1 package. 
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

    private final static QName _GetStatusRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUpdateService/V1/", "GetStatusRequest");
    private final static QName _GetStatusResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUpdateService/V1/", "GetStatusResponse");
    private final static QName _UpdateStatusRequest_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUpdateService/V1/", "UpdateStatusRequest");
    private final static QName _UpdateStatusResponse_QNAME = new QName("http://sita.aero/iborders/entryExit/RLUpdateService/V1/", "UpdateStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.sita.iborders.entryexit.rlupdateservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatusFault }
     * 
     */
    public GetStatusFault createGetStatusFault() {
        return new GetStatusFault();
    }

    /**
     * Create an instance of {@link GetStatusRequestType }
     * 
     */
    public GetStatusRequestType createGetStatusRequestType() {
        return new GetStatusRequestType();
    }

    /**
     * Create an instance of {@link UpdateStatusRequestType }
     * 
     */
    public UpdateStatusRequestType createUpdateStatusRequestType() {
        return new UpdateStatusRequestType();
    }

    /**
     * Create an instance of {@link UpdateStatusFault }
     * 
     */
    public UpdateStatusFault createUpdateStatusFault() {
        return new UpdateStatusFault();
    }

    /**
     * Create an instance of {@link UpdateStatusResponseType }
     * 
     */
    public UpdateStatusResponseType createUpdateStatusResponseType() {
        return new UpdateStatusResponseType();
    }

    /**
     * Create an instance of {@link GetStatusResponseType }
     * 
     */
    public GetStatusResponseType createGetStatusResponseType() {
        return new GetStatusResponseType();
    }

    /**
     * Create an instance of {@link RLStatusResultType }
     * 
     */
    public RLStatusResultType createRLStatusResultType() {
        return new RLStatusResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/", name = "GetStatusRequest")
    public JAXBElement<GetStatusRequestType> createGetStatusRequest(GetStatusRequestType value) {
        return new JAXBElement<GetStatusRequestType>(_GetStatusRequest_QNAME, GetStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/", name = "GetStatusResponse")
    public JAXBElement<GetStatusResponseType> createGetStatusResponse(GetStatusResponseType value) {
        return new JAXBElement<GetStatusResponseType>(_GetStatusResponse_QNAME, GetStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/", name = "UpdateStatusRequest")
    public JAXBElement<UpdateStatusRequestType> createUpdateStatusRequest(UpdateStatusRequestType value) {
        return new JAXBElement<UpdateStatusRequestType>(_UpdateStatusRequest_QNAME, UpdateStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/", name = "UpdateStatusResponse")
    public JAXBElement<UpdateStatusResponseType> createUpdateStatusResponse(UpdateStatusResponseType value) {
        return new JAXBElement<UpdateStatusResponseType>(_UpdateStatusResponse_QNAME, UpdateStatusResponseType.class, null, value);
    }

}
