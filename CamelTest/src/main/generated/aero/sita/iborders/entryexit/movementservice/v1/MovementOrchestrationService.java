package aero.sita.iborders.entryexit.movementservice.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:14:06.305+05:30
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "MovementOrchestrationService", 
                  wsdlLocation = "file:/D:/workspace/sita/entryexit-orchestration-adaptor/src/main/resources/wsdl/MovementOrchestrationService.wsdl",
                  targetNamespace = "http://sita.aero/iborders/entryExit/MovementService/V1") 
public class MovementOrchestrationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "MovementOrchestrationService");
    public final static QName EeMovementOrchestrationServicePortType = new QName("http://sita.aero/iborders/entryExit/MovementService/V1", "ee:MovementOrchestrationServicePortType");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/workspace/sita/entryexit-orchestration-adaptor/src/main/resources/wsdl/MovementOrchestrationService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MovementOrchestrationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/workspace/sita/entryexit-orchestration-adaptor/src/main/resources/wsdl/MovementOrchestrationService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MovementOrchestrationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MovementOrchestrationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovementOrchestrationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MovementOrchestrationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MovementOrchestrationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MovementOrchestrationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MovementOrchestrationServicePortType
     */
    @WebEndpoint(name = "ee:MovementOrchestrationServicePortType")
    public MovementOrchestrationServicePortType getEeMovementOrchestrationServicePortType() {
        return super.getPort(EeMovementOrchestrationServicePortType, MovementOrchestrationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovementOrchestrationServicePortType
     */
    @WebEndpoint(name = "ee:MovementOrchestrationServicePortType")
    public MovementOrchestrationServicePortType getEeMovementOrchestrationServicePortType(WebServiceFeature... features) {
        return super.getPort(EeMovementOrchestrationServicePortType, MovementOrchestrationServicePortType.class, features);
    }

}
