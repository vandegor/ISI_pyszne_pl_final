
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PobierzTranzakcje_QNAME = new QName("http://webservice/", "pobierzTranzakcje");
    private final static QName _UtworzTransakcje_QNAME = new QName("http://webservice/", "utworzTransakcje");
    private final static QName _PobierzTranzakcjeResponse_QNAME = new QName("http://webservice/", "pobierzTranzakcjeResponse");
    private final static QName _Tranzakcja_QNAME = new QName("http://webservice/", "tranzakcja");
    private final static QName _UtworzTransakcjeResponse_QNAME = new QName("http://webservice/", "utworzTransakcjeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PobierzTranzakcje }
     * 
     */
    public PobierzTranzakcje createPobierzTranzakcje() {
        return new PobierzTranzakcje();
    }

    /**
     * Create an instance of {@link PobierzTranzakcjeResponse }
     * 
     */
    public PobierzTranzakcjeResponse createPobierzTranzakcjeResponse() {
        return new PobierzTranzakcjeResponse();
    }

    /**
     * Create an instance of {@link TranzakcjaXml }
     * 
     */
    public TranzakcjaXml createTranzakcjaXml() {
        return new TranzakcjaXml();
    }

    /**
     * Create an instance of {@link UtworzTransakcje }
     * 
     */
    public UtworzTransakcje createUtworzTransakcje() {
        return new UtworzTransakcje();
    }

    /**
     * Create an instance of {@link UtworzTransakcjeResponse }
     * 
     */
    public UtworzTransakcjeResponse createUtworzTransakcjeResponse() {
        return new UtworzTransakcjeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzTranzakcje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pobierzTranzakcje")
    public JAXBElement<PobierzTranzakcje> createPobierzTranzakcje(PobierzTranzakcje value) {
        return new JAXBElement<PobierzTranzakcje>(_PobierzTranzakcje_QNAME, PobierzTranzakcje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtworzTransakcje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "utworzTransakcje")
    public JAXBElement<UtworzTransakcje> createUtworzTransakcje(UtworzTransakcje value) {
        return new JAXBElement<UtworzTransakcje>(_UtworzTransakcje_QNAME, UtworzTransakcje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzTranzakcjeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pobierzTranzakcjeResponse")
    public JAXBElement<PobierzTranzakcjeResponse> createPobierzTranzakcjeResponse(PobierzTranzakcjeResponse value) {
        return new JAXBElement<PobierzTranzakcjeResponse>(_PobierzTranzakcjeResponse_QNAME, PobierzTranzakcjeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranzakcjaXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "tranzakcja")
    public JAXBElement<TranzakcjaXml> createTranzakcja(TranzakcjaXml value) {
        return new JAXBElement<TranzakcjaXml>(_Tranzakcja_QNAME, TranzakcjaXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtworzTransakcjeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "utworzTransakcjeResponse")
    public JAXBElement<UtworzTransakcjeResponse> createUtworzTransakcjeResponse(UtworzTransakcjeResponse value) {
        return new JAXBElement<UtworzTransakcjeResponse>(_UtworzTransakcjeResponse_QNAME, UtworzTransakcjeResponse.class, null, value);
    }

}
