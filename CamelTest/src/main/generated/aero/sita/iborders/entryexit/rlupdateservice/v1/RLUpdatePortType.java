package aero.sita.iborders.entryexit.rlupdateservice.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-18T14:22:03.189+05:30
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/", name = "RLUpdatePortType")
@XmlSeeAlso({aero.sita.iborders.entryexit.common.v1.ObjectFactory.class, ObjectFactory.class, aero.sita.iborders.aras.commontypes.v8_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RLUpdatePortType {

    @WebMethod(operationName = "UpdateStatus", action = "urn:UpdateStatus")
    @WebResult(name = "UpdateStatusResponse", targetNamespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/", partName = "UpdateStatusOutputPart")
    public UpdateStatusResponseType updateStatus(
        @WebParam(partName = "UpdateStatusInputPart", name = "UpdateStatusRequest", targetNamespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/")
        UpdateStatusRequestType updateStatusInputPart
    ) throws UpdateStatusFaultMessage;

    @WebMethod(operationName = "GetStatus", action = "urn:GetStatus")
    @WebResult(name = "GetStatusResponse", targetNamespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/", partName = "GetStatusOutputPart")
    public GetStatusResponseType getStatus(
        @WebParam(partName = "GetStatusInputPart", name = "GetStatusRequest", targetNamespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/")
        GetStatusRequestType getStatusInputPart
    ) throws GetStatusFaultMessage;
}