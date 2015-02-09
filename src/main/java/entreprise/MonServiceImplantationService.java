
package entreprise;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MonServiceImplantationService", targetNamespace = "http://entreprise/", wsdlLocation = "http://localhost:8080/WS/MonServiceWeb?wsdl")
public class MonServiceImplantationService
    extends Service
{

    private final static URL MONSERVICEIMPLANTATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException MONSERVICEIMPLANTATIONSERVICE_EXCEPTION;
    private final static QName MONSERVICEIMPLANTATIONSERVICE_QNAME = new QName("http://entreprise/", "MonServiceImplantationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WS/MonServiceWeb?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MONSERVICEIMPLANTATIONSERVICE_WSDL_LOCATION = url;
        MONSERVICEIMPLANTATIONSERVICE_EXCEPTION = e;
    }

    public MonServiceImplantationService() {
        super(__getWsdlLocation(), MONSERVICEIMPLANTATIONSERVICE_QNAME);
    }

    public MonServiceImplantationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MONSERVICEIMPLANTATIONSERVICE_QNAME, features);
    }

    public MonServiceImplantationService(URL wsdlLocation) {
        super(wsdlLocation, MONSERVICEIMPLANTATIONSERVICE_QNAME);
    }

    public MonServiceImplantationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MONSERVICEIMPLANTATIONSERVICE_QNAME, features);
    }

    public MonServiceImplantationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MonServiceImplantationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MonService
     */
    @WebEndpoint(name = "MonServiceImplantationPort")
    public MonService getMonServiceImplantationPort() {
        return super.getPort(new QName("http://entreprise/", "MonServiceImplantationPort"), MonService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MonService
     */
    @WebEndpoint(name = "MonServiceImplantationPort")
    public MonService getMonServiceImplantationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://entreprise/", "MonServiceImplantationPort"), MonService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MONSERVICEIMPLANTATIONSERVICE_EXCEPTION!= null) {
            throw MONSERVICEIMPLANTATIONSERVICE_EXCEPTION;
        }
        return MONSERVICEIMPLANTATIONSERVICE_WSDL_LOCATION;
    }

}