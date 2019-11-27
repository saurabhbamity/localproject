package aero.sita.iborders.external.bordermovementservice.v2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2018-04-19T23:13:58.955+05:30
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "BorderMovementServiceV2", 
                  wsdlLocation = "file:/D:/workspace/sita/entryexit-orchestration-adaptor/src/main/resources/wsdl/BorderMovementServiceV2.wsdl",
                  targetNamespace = "http://sita.aero/iborders/external/BorderMovementService/V2") 
public class BorderMovementServiceV2 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sita.aero/iborders/external/BorderMovementService/V2", "BorderMovementServiceV2");
    public final static QName BorderMovementPort = new QName("http://sita.aero/iborders/external/BorderMovementService/V2", "BorderMovementPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/workspace/sita/entryexit-orchestration-adaptor/src/main/resources/wsdl/BorderMovementServiceV2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BorderMovementServiceV2.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/workspace/sita/entryexit-orchestration-adaptor/src/main/resources/wsdl/BorderMovementServiceV2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BorderMovementServiceV2(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BorderMovementServiceV2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BorderMovementServiceV2() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BorderMovementServiceV2(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BorderMovementServiceV2(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BorderMovementServiceV2(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BorderMovementPortType
     */
    @WebEndpoint(name = "BorderMovementPort")
    public BorderMovementPortType getBorderMovementPort() {
        return super.getPort(BorderMovementPort, BorderMovementPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BorderMovementPortType
     */
    @WebEndpoint(name = "BorderMovementPort")
    public BorderMovementPortType getBorderMovementPort(WebServiceFeature... features) {
        return super.getPort(BorderMovementPort, BorderMovementPortType.class, features);
    }

}
