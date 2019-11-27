
package aero.sita.iborders.entryexit.movementservice.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:08.349+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "FindShipArrivalMovementsFault", targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1")
public class FindShipArrivalMovementsFaultMessage extends Exception {
    
    private aero.sita.iborders.entryexit.common.v1.FaultType findShipArrivalMovementsFault;

    public FindShipArrivalMovementsFaultMessage() {
        super();
    }
    
    public FindShipArrivalMovementsFaultMessage(String message) {
        super(message);
    }
    
    public FindShipArrivalMovementsFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public FindShipArrivalMovementsFaultMessage(String message, aero.sita.iborders.entryexit.common.v1.FaultType findShipArrivalMovementsFault) {
        super(message);
        this.findShipArrivalMovementsFault = findShipArrivalMovementsFault;
    }

    public FindShipArrivalMovementsFaultMessage(String message, aero.sita.iborders.entryexit.common.v1.FaultType findShipArrivalMovementsFault, Throwable cause) {
        super(message, cause);
        this.findShipArrivalMovementsFault = findShipArrivalMovementsFault;
    }

    public aero.sita.iborders.entryexit.common.v1.FaultType getFaultInfo() {
        return this.findShipArrivalMovementsFault;
    }
}