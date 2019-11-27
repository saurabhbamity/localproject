
package com.iton.services.dms.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:13:59.840+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "UpdateDocumentFault", targetNamespace = "http://iton.com/services/dms/V1")
public class UpdateDocumentFaultMessage extends Exception {
    
    private com.iton.services.dms.v1.UpdateDocumentFault updateDocumentFault;

    public UpdateDocumentFaultMessage() {
        super();
    }
    
    public UpdateDocumentFaultMessage(String message) {
        super(message);
    }
    
    public UpdateDocumentFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateDocumentFaultMessage(String message, com.iton.services.dms.v1.UpdateDocumentFault updateDocumentFault) {
        super(message);
        this.updateDocumentFault = updateDocumentFault;
    }

    public UpdateDocumentFaultMessage(String message, com.iton.services.dms.v1.UpdateDocumentFault updateDocumentFault, Throwable cause) {
        super(message, cause);
        this.updateDocumentFault = updateDocumentFault;
    }

    public com.iton.services.dms.v1.UpdateDocumentFault getFaultInfo() {
        return this.updateDocumentFault;
    }
}
