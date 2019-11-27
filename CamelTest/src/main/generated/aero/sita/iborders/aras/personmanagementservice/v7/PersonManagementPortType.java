package aero.sita.iborders.aras.personmanagementservice.v7;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:10.716+05:30
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://sita.aero/iborders/aras/PersonManagementService/V7", name = "PersonManagementPortType")
@XmlSeeAlso({aero.sita.iborders.aras.person.v7_0.ObjectFactory.class, aero.sita.iborders.aras.commontypes.v8_0.ObjectFactory.class, aero.sita.iborders.aras.personmanagementservicewsdltype.v7.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PersonManagementPortType {

    @WebMethod(operationName = "FindorCreatePerson", action = "http://PersonManagementService/FindorCreatePerson")
    @WebResult(name = "FindorCreatePersonResponse", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7", partName = "FindorCreatePersonOutputPart")
    public aero.sita.iborders.aras.personmanagementservicewsdltype.v7.FindorCreatePersonResponse findorCreatePerson(
        @WebParam(partName = "FindorCreatePersonInputPart", name = "FindorCreatePersonRequest", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7")
        aero.sita.iborders.aras.personmanagementservicewsdltype.v7.FindorCreatePersonRequest findorCreatePersonInputPart
    ) throws PersonManagementFaultMessage;

    @WebMethod(operationName = "IndicateMergeCandidates", action = "http://PersonManagementService/IndicateMergeCandidates")
    @WebResult(name = "IndicateMergeCandidatesResponse", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7", partName = "IndicateMergeCandidatesOutputPart")
    public aero.sita.iborders.aras.personmanagementservicewsdltype.v7.IndicateMergeCandidatesResponse indicateMergeCandidates(
        @WebParam(partName = "IndicateMergeCandidatesInputPart", name = "IndicateMergeCandidatesRequest", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7")
        aero.sita.iborders.aras.personmanagementservicewsdltype.v7.IndicateMergeCandidatesRequest indicateMergeCandidatesInputPart
    ) throws PersonManagementFaultMessage;

    @WebMethod(operationName = "FindPerson", action = "http://PersonManagementService/FindPerson")
    @WebResult(name = "FindPersonResponse", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7", partName = "FindPersonOutputPart")
    public aero.sita.iborders.aras.personmanagementservicewsdltype.v7.FindPersonResponse findPerson(
        @WebParam(partName = "FindPersonInputPart", name = "FindPersonRequest", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7")
        aero.sita.iborders.aras.personmanagementservicewsdltype.v7.FindPersonRequest findPersonInputPart
    ) throws PersonManagementFaultMessage;

    @WebMethod(operationName = "CreateorUpdatePerson", action = "http://PersonManagementService/CreateorUpdatePerson")
    @WebResult(name = "CreateorUpdatePersonResponse", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7", partName = "CreateorUpdatePersonOutputPart")
    public aero.sita.iborders.aras.personmanagementservicewsdltype.v7.CreateorUpdatePersonResponse createorUpdatePerson(
        @WebParam(partName = "CreateorUpdatePersonInputPart", name = "CreateorUpdatePersonRequest", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7")
        aero.sita.iborders.aras.personmanagementservicewsdltype.v7.CreateorUpdatePersonRequest createorUpdatePersonInputPart
    ) throws PersonManagementFaultMessage;

    @WebMethod(operationName = "MoveIdentity", action = "http://PersonManagementService/MoveIdentity")
    @WebResult(name = "MoveIdentityResponse", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7", partName = "MoveIdentityOutputPart")
    public aero.sita.iborders.aras.personmanagementservicewsdltype.v7.MoveIdentityResponse moveIdentity(
        @WebParam(partName = "MoveIdentityInputPart", name = "MoveIdentityRequest", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7")
        aero.sita.iborders.aras.personmanagementservicewsdltype.v7.MoveIdentityRequest moveIdentityInputPart
    ) throws PersonManagementFaultMessage;

    @WebMethod(operationName = "FindIdentity", action = "http://PersonManagementService/FindIdentity")
    @WebResult(name = "FindIdentityResponse", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7", partName = "FindIdentityOutputPart")
    public aero.sita.iborders.aras.personmanagementservicewsdltype.v7.FindIdentityResponse findIdentity(
        @WebParam(partName = "FindIdentityInputPart", name = "FindIdentityRequest", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7")
        aero.sita.iborders.aras.personmanagementservicewsdltype.v7.FindIdentityRequest findIdentityInputPart
    ) throws PersonManagementFaultMessage;

    @WebMethod(operationName = "RetrievePerson", action = "http://PersonManagementService/RetrievePerson")
    @WebResult(name = "RetrievePersonResponse", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7", partName = "RetrievePersonOutputPart")
    public aero.sita.iborders.aras.personmanagementservicewsdltype.v7.RetrievePersonResponse retrievePerson(
        @WebParam(partName = "RetrievePersonInputPart", name = "RetrievePersonRequest", targetNamespace = "http://sita.aero/iborders/aras/PersonManagementServiceWSDLType/V7")
        aero.sita.iborders.aras.personmanagementservicewsdltype.v7.RetrievePersonRequest retrievePersonInputPart
    ) throws PersonManagementFaultMessage;
}
