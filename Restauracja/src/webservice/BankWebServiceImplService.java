
package webservice;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankWebServiceImplService", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:8080/Bank/BankWebService?wsdl")
public class BankWebServiceImplService
    extends Service
{

    private final static URL BANKWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName BANKWEBSERVICEIMPLSERVICE_QNAME = new QName("http://webservice/", "BankWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Bank/BankWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        BANKWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public BankWebServiceImplService() {
        super(__getWsdlLocation(), BANKWEBSERVICEIMPLSERVICE_QNAME);
    }

    public BankWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public BankWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, BANKWEBSERVICEIMPLSERVICE_QNAME);
    }

    public BankWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public BankWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankWebService
     */
    @WebEndpoint(name = "BankWebServiceImplPort")
    public BankWebService getBankWebServiceImplPort() {
        return super.getPort(new QName("http://webservice/", "BankWebServiceImplPort"), BankWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankWebService
     */
    @WebEndpoint(name = "BankWebServiceImplPort")
    public BankWebService getBankWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "BankWebServiceImplPort"), BankWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw BANKWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return BANKWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}