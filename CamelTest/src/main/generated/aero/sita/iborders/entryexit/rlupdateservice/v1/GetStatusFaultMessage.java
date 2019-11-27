
package aero.sita.iborders.entryexit.rlupdateservice.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-18T14:22:03.157+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "GetStatusFault", targetNamespace = "http://sita.aero/iborders/entryExit/RLUpdateService/V1/")
public class GetStatusFaultMessage extends Exception {
    
    private aero.sita.iborders.entryexit.rlupdateservice.v1.GetStatusFault getStatusFault;

    public GetStatusFaultMessage() {
        super();
    }
    
    public GetStatusFaultMessage(String message) {
        super(message);
    }
    
    public GetStatusFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public GetStatusFaultMessage(String message, aero.sita.iborders.entryexit.rlupdateservice.v1.GetStatusFault getStatusFault) {
        super(message);
        this.getStatusFault = getStatusFault;
    }

    public GetStatusFaultMessage(String message, aero.sita.iborders.entryexit.rlupdateservice.v1.GetStatusFault getStatusFault, Throwable cause) {
        super(message, cause);
        this.getStatusFault = getStatusFault;
    }

    public aero.sita.iborders.entryexit.rlupdateservice.v1.GetStatusFault getFaultInfo() {
        return this.getStatusFault;
    }
}