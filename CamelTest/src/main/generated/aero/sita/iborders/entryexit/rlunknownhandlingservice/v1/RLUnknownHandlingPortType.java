package aero.sita.iborders.entryexit.rlunknownhandlingservice.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:13.415+05:30
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", name = "RLUnknownHandlingPortType")
@XmlSeeAlso({aero.sita.iborders.entryexit.common.v1.ObjectFactory.class, aero.sita.iborders.aras.commontypes.v8_0.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RLUnknownHandlingPortType {

    @WebMethod(operationName = "GetCount", action = "urn:GetCount")
    @WebResult(name = "GetCountResponse", targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", partName = "GetCountOutputPart")
    public GetCountResponseType getCount(
        @WebParam(partName = "GetCountInputPart", name = "GetCountRequest", targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/")
        GetCountRequestType getCountInputPart
    ) throws GetCountFaultMessage;

    @WebMethod(action = "urn:resetCount")
    @WebResult(name = "ResetCountResponse", targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", partName = "ResetCountOutputPart")
    public ResetCountResponseType resetCount(
        @WebParam(partName = "ResetCountInputPart", name = "ResetCountRequest", targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/")
        ResetCountRequestType resetCountInputPart
    ) throws ResetCountFaultMessage;

    @WebMethod(action = "urn:isOverrideAllowed")
    @WebResult(name = "OverrideAllowedResponse", targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/", partName = "OverrideAllowedOutputPart")
    public OverrideAllowedResponseType isOverrideAllowed(
        @WebParam(partName = "OverrideAllowedInputPart", name = "OverrideAllowedRequest", targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/")
        OverrideAllowedRequestType overrideAllowedInputPart
    ) throws OverrideAllowedFaultMessage;
}