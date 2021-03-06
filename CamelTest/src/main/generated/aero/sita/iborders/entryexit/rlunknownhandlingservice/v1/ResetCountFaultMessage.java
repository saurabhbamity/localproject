
package aero.sita.iborders.entryexit.rlunknownhandlingservice.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:12.926+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "ResetCountFault", targetNamespace = "http://sita.aero/iborders/entryExit/RLUnknownHandlingService/V1/")
public class ResetCountFaultMessage extends Exception {
    
    private aero.sita.iborders.entryexit.rlunknownhandlingservice.v1.ResetCountFault resetCountFault;

    public ResetCountFaultMessage() {
        super();
    }
    
    public ResetCountFaultMessage(String message) {
        super(message);
    }
    
    public ResetCountFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ResetCountFaultMessage(String message, aero.sita.iborders.entryexit.rlunknownhandlingservice.v1.ResetCountFault resetCountFault) {
        super(message);
        this.resetCountFault = resetCountFault;
    }

    public ResetCountFaultMessage(String message, aero.sita.iborders.entryexit.rlunknownhandlingservice.v1.ResetCountFault resetCountFault, Throwable cause) {
        super(message, cause);
        this.resetCountFault = resetCountFault;
    }

    public aero.sita.iborders.entryexit.rlunknownhandlingservice.v1.ResetCountFault getFaultInfo() {
        return this.resetCountFault;
    }
}
