package aero.sita.iborders.entryexit.movementservice.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:08.478+05:30
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", name = "MovementServicePortType")
@XmlSeeAlso({aero.sita.iborders.entryexit.common.v1.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MovementServicePortType {

    @WebMethod(operationName = "GetRejectedMovement", action = "urn:GetRejectedMovement")
    @WebResult(name = "GetRejectedMovementResponse", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", partName = "GetRejectedMovementResponse")
    public GetRejectedMovementResponseType getRejectedMovement(
        @WebParam(partName = "GetRejectedMovementRequest", name = "GetRejectedMovementRequest", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
        GetRejectedMovementType getRejectedMovementRequest
    ) throws GetRejectedMovementFaultMessage;

    @WebMethod(operationName = "FindMovement", action = "urn:FindMovement")
    @WebResult(name = "FindMovementResponse", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", partName = "FindMovementResponse")
    public FindMovementResponseType findMovement(
        @WebParam(partName = "FindMovementRequest", name = "FindMovementRequest", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
        FindMovementRequestType findMovementRequest
    ) throws FindMovementFaultMessage;

    @WebMethod(operationName = "ListRejectedMovement", action = "urn:ListRejectedMovement")
    @WebResult(name = "ListRejectedMovementResponse", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", partName = "ListRejectedMovementResponse")
    public ListRejectedMovementResponseType listRejectedMovement(
        @WebParam(partName = "ListRejectedMovementRequest", name = "ListRejectedMovementRequest", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
        ListRejectedMovementRequestType listRejectedMovementRequest
    ) throws ListRejectedMovementFaultMessage;

    @WebMethod(operationName = "FindShipArrivalMovements", action = "urn:FindShipArrivalMovements")
    @WebResult(name = "FindShipArrivalMovementsResponse", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", partName = "FindShipArrivalMovementsResponse")
    public FindShipArrivalMovementsResponseType findShipArrivalMovements(
        @WebParam(partName = "FindShipArrivalMovementsRequest", name = "FindShipArrivalMovementsRequest", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
        FindShipArrivalMovementsRequestType findShipArrivalMovementsRequest
    ) throws FindShipArrivalMovementsFaultMessage;

    @WebMethod(operationName = "ListMovement", action = "urn:ListMovement")
    @WebResult(name = "ListMovementResponse", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", partName = "ListMovementResponse")
    public ListMovementResponseType listMovement(
        @WebParam(partName = "ListMovementRequest", name = "ListMovementRequest", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
        ListMovementRequestType listMovementRequest
    ) throws ListMovementFaultMessage;

    /**
     * Asynchronous operation for cancelling 1 or more movements
     */
    @WebMethod(operationName = "CancelMovement", action = "urn:CancelMovement")
    @WebResult(name = "CancelMovementResponse", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", partName = "CancelMovementResponse")
    public CancelMovementResponse cancelMovement(
        @WebParam(partName = "CancelMovementRequest", name = "CancelMovementRequest", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
        CancelMovementRequestType cancelMovementRequest
    ) throws CancelMovementFaultMessage;

    @WebMethod(operationName = "GetMovement", action = "urn:GetMovement")
    @WebResult(name = "GetMovementResponse", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", partName = "GetMovementResponse")
    public GetMovementResponseType getMovement(
        @WebParam(partName = "GetMovementRequest", name = "GetMovementRequest", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
        GetMovementRequestType getMovementRequest
    ) throws GetMovementFaultMessage;

    @WebMethod(operationName = "CreateUpdateMovement", action = "urn:CreateUpdateMovement")
    @WebResult(name = "CreateUpdateMovementResponse", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1", partName = "CreateUpdateMovementResponse")
    public CreateUpdateMovementResponse createUpdateMovement(
        @WebParam(partName = "CreateUpdateMovementRequest", name = "CreateUpdateMovementRequest", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
        CreateUpdateMovementRequestType createUpdateMovementRequest
    ) throws CreateUpdateMovementFaultMessage;
}