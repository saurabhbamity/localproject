
package aero.sita.iborders.entryexit.rlunknownhandlingservice.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:12.703+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "GetCountFault", targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/")
public class GetCountFaultMessage extends Exception {
    
    private aero.sita.iborders.entryexit.rlunknownhandlingservice.v1.GetCountFault getCountFault;

    public GetCountFaultMessage() {
        super();
    }
    
    public GetCountFaultMessage(String message) {
        super(message);
    }
    
    public GetCountFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public GetCountFaultMessage(String message, aero.sita.iborders.entryexit.rlunknownhandlingservice.v1.GetCountFault getCountFault) {
        super(message);
        this.getCountFault = getCountFault;
    }

    public GetCountFaultMessage(String message, aero.sita.iborders.entryexit.rlunknownhandlingservice.v1.GetCountFault getCountFault, Throwable cause) {
        super(message, cause);
        this.getCountFault = getCountFault;
    }

    public aero.sita.iborders.entryexit.rlunknownhandlingservice.v1.GetCountFault getFaultInfo() {
        return this.getCountFault;
    }
}
