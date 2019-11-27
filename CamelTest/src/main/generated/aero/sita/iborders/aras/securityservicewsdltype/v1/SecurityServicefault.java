
package aero.sita.iborders.aras.securityservicewsdltype.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:15.442+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "ReturnCode", targetNamespace = "http://sita.aero/iborders/aras/CommonTypes/V8_0")
public class SecurityServicefault extends Exception {
    
    private aero.sita.iborders.aras.commontypes.v8_0.ReturnCode returnCode;

    public SecurityServicefault() {
        super();
    }
    
    public SecurityServicefault(String message) {
        super(message);
    }
    
    public SecurityServicefault(String message, Throwable cause) {
        super(message, cause);
    }

    public SecurityServicefault(String message, aero.sita.iborders.aras.commontypes.v8_0.ReturnCode returnCode) {
        super(message);
        this.returnCode = returnCode;
    }

    public SecurityServicefault(String message, aero.sita.iborders.aras.commontypes.v8_0.ReturnCode returnCode, Throwable cause) {
        super(message, cause);
        this.returnCode = returnCode;
    }

    public aero.sita.iborders.aras.commontypes.v8_0.ReturnCode getFaultInfo() {
        return this.returnCode;
    }
}
