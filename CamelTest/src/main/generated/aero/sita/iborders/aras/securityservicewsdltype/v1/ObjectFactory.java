
package aero.sita.iborders.aras.securityservicewsdltype.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.sita.iborders.aras.securityservicewsdltype.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.sita.iborders.aras.securityservicewsdltype.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDetailsRequest }
     * 
     */
    public GetUserDetailsRequest createGetUserDetailsRequest() {
        return new GetUserDetailsRequest();
    }

    /**
     * Create an instance of {@link AuthenticateAndGetUserDetailsRequest }
     * 
     */
    public AuthenticateAndGetUserDetailsRequest createAuthenticateAndGetUserDetailsRequest() {
        return new AuthenticateAndGetUserDetailsRequest();
    }

    /**
     * Create an instance of {@link TouchIdentityTokenRequest }
     * 
     */
    public TouchIdentityTokenRequest createTouchIdentityTokenRequest() {
        return new TouchIdentityTokenRequest();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link SignoutResponse }
     * 
     */
    public SignoutResponse createSignoutResponse() {
        return new SignoutResponse();
    }

    /**
     * Create an instance of {@link SignoutRequest }
     * 
     */
    public SignoutRequest createSignoutRequest() {
        return new SignoutRequest();
    }

    /**
     * Create an instance of {@link AuthenticateAndGetUserDetailsResponse }
     * 
     */
    public AuthenticateAndGetUserDetailsResponse createAuthenticateAndGetUserDetailsResponse() {
        return new AuthenticateAndGetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link TouchIdentityTokenResponse }
     * 
     */
    public TouchIdentityTokenResponse createTouchIdentityTokenResponse() {
        return new TouchIdentityTokenResponse();
    }

}
