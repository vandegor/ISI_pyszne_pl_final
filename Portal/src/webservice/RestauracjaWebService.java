
package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RestauracjaWebService", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RestauracjaWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reazlizujZamowienie", targetNamespace = "http://webservice/", className = "webservice.ReazlizujZamowienie")
    @ResponseWrapper(localName = "reazlizujZamowienieResponse", targetNamespace = "http://webservice/", className = "webservice.ReazlizujZamowienieResponse")
    public boolean reazlizujZamowienie(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sprawdzStatus", targetNamespace = "http://webservice/", className = "webservice.SprawdzStatus")
    @ResponseWrapper(localName = "sprawdzStatusResponse", targetNamespace = "http://webservice/", className = "webservice.SprawdzStatusResponse")
    public String sprawdzStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "przyjmijZamowienie", targetNamespace = "http://webservice/", className = "webservice.PrzyjmijZamowienie")
    @ResponseWrapper(localName = "przyjmijZamowienieResponse", targetNamespace = "http://webservice/", className = "webservice.PrzyjmijZamowienieResponse")
    public boolean przyjmijZamowienie(
        @WebParam(name = "arg0", targetNamespace = "")
        ZamowienieXml arg0);

    /**
     * 
     * @return
     *     returns webservice.KatalogProduktowXml
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pobierzKatalogProduktow", targetNamespace = "http://webservice/", className = "webservice.PobierzKatalogProduktow")
    @ResponseWrapper(localName = "pobierzKatalogProduktowResponse", targetNamespace = "http://webservice/", className = "webservice.PobierzKatalogProduktowResponse")
    public KatalogProduktowXml pobierzKatalogProduktow();

}
