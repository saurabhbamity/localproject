package aero.sita.iborders.aras.securityservicewsdltype.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:15.780+05:30
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1", name = "SecurityPortType")
@XmlSeeAlso({aero.sita.iborders.aras.security.v1.ObjectFactory.class, ObjectFactory.class, aero.sita.iborders.aras.commontypes.v8_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SecurityPortType {

    @WebMethod(operationName = "AuthenticateAndGetUserDetails")
    @WebResult(name = "AuthenticateAndGetUserDetailsResponse", targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1", partName = "AuthenticateAndGetUserDetailsResponse")
    public AuthenticateAndGetUserDetailsResponse authenticateAndGetUserDetails(
        @WebParam(partName = "AuthenticateAndGetUserDetailsRequest", name = "AuthenticateAndGetUserDetailsRequest", targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1")
        AuthenticateAndGetUserDetailsRequest authenticateAndGetUserDetailsRequest
    ) throws SecurityServicefault;

    @WebMethod(operationName = "Signout")
    @WebResult(name = "SignoutResponse", targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1", partName = "SignoutResponse")
    public SignoutResponse signout(
        @WebParam(partName = "SignoutRequest", name = "SignoutRequest", targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1")
        SignoutRequest signoutRequest
    ) throws SecurityServicefault;

    @WebMethod(operationName = "TouchIdentityToken")
    @WebResult(name = "TouchIdentityTokenResponse", targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1", partName = "TouchIdentityTokenResponse")
    public TouchIdentityTokenResponse touchIdentityToken(
        @WebParam(partName = "TouchIdentityTokenRequest", name = "TouchIdentityTokenRequest", targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1")
        TouchIdentityTokenRequest touchIdentityTokenRequest
    ) throws SecurityServicefault;

    @WebMethod(operationName = "GetUserDetails")
    @WebResult(name = "GetUserDetailsResponse", targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1", partName = "GetUserDetailsResponse")
    public GetUserDetailsResponse getUserDetails(
        @WebParam(partName = "GetUserDetailsRequest", name = "GetUserDetailsRequest", targetNamespace = "http://sita.aero/iborders/aras/SecurityServiceWSDLType/V1")
        GetUserDetailsRequest getUserDetailsRequest
    ) throws SecurityServicefault;
}
