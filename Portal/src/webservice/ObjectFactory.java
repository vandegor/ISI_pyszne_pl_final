
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

    private final static QName _PobierzKatalogProduktowResponse_QNAME = new QName("http://webservice/", "pobierzKatalogProduktowResponse");
    private final static QName _SprawdzStatusResponse_QNAME = new QName("http://webservice/", "sprawdzStatusResponse");
    private final static QName _Adres_QNAME = new QName("http://webservice/", "adres");
    private final static QName _Produkty_QNAME = new QName("http://webservice/", "produkty");
    private final static QName _PrzyjmijZamowienie_QNAME = new QName("http://webservice/", "przyjmijZamowienie");
    private final static QName _ReazlizujZamowienieResponse_QNAME = new QName("http://webservice/", "reazlizujZamowienieResponse");
    private final static QName _Status_QNAME = new QName("http://webservice/", "status");
    private final static QName _PrzyjmijZamowienieResponse_QNAME = new QName("http://webservice/", "przyjmijZamowienieResponse");
    private final static QName _SprawdzStatus_QNAME = new QName("http://webservice/", "sprawdzStatus");
    private final static QName _ReazlizujZamowienie_QNAME = new QName("http://webservice/", "reazlizujZamowienie");
    private final static QName _PobierzKatalogProduktow_QNAME = new QName("http://webservice/", "pobierzKatalogProduktow");
    private final static QName _PozycjaZamowienia_QNAME = new QName("http://webservice/", "pozycjaZamowienia");
    private final static QName _Produkt_QNAME = new QName("http://webservice/", "produkt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReazlizujZamowienie }
     * 
     */
    public ReazlizujZamowienie createReazlizujZamowienie() {
        return new ReazlizujZamowienie();
    }

    /**
     * Create an instance of {@link PobierzKatalogProduktow }
     * 
     */
    public PobierzKatalogProduktow createPobierzKatalogProduktow() {
        return new PobierzKatalogProduktow();
    }

    /**
     * Create an instance of {@link PozycjaZamowieniaXml }
     * 
     */
    public PozycjaZamowieniaXml createPozycjaZamowieniaXml() {
        return new PozycjaZamowieniaXml();
    }

    /**
     * Create an instance of {@link ProduktXml }
     * 
     */
    public ProduktXml createProduktXml() {
        return new ProduktXml();
    }

    /**
     * Create an instance of {@link PobierzKatalogProduktowResponse }
     * 
     */
    public PobierzKatalogProduktowResponse createPobierzKatalogProduktowResponse() {
        return new PobierzKatalogProduktowResponse();
    }

    /**
     * Create an instance of {@link SprawdzStatusResponse }
     * 
     */
    public SprawdzStatusResponse createSprawdzStatusResponse() {
        return new SprawdzStatusResponse();
    }

    /**
     * Create an instance of {@link KatalogProduktowXml }
     * 
     */
    public KatalogProduktowXml createKatalogProduktowXml() {
        return new KatalogProduktowXml();
    }

    /**
     * Create an instance of {@link AdresXml }
     * 
     */
    public AdresXml createAdresXml() {
        return new AdresXml();
    }

    /**
     * Create an instance of {@link PrzyjmijZamowienieResponse }
     * 
     */
    public PrzyjmijZamowienieResponse createPrzyjmijZamowienieResponse() {
        return new PrzyjmijZamowienieResponse();
    }

    /**
     * Create an instance of {@link SprawdzStatus }
     * 
     */
    public SprawdzStatus createSprawdzStatus() {
        return new SprawdzStatus();
    }

    /**
     * Create an instance of {@link PrzyjmijZamowienie }
     * 
     */
    public PrzyjmijZamowienie createPrzyjmijZamowienie() {
        return new PrzyjmijZamowienie();
    }

    /**
     * Create an instance of {@link ReazlizujZamowienieResponse }
     * 
     */
    public ReazlizujZamowienieResponse createReazlizujZamowienieResponse() {
        return new ReazlizujZamowienieResponse();
    }

    /**
     * Create an instance of {@link ZamowienieXml }
     * 
     */
    public ZamowienieXml createZamowienieXml() {
        return new ZamowienieXml();
    }

    /**
     * Create an instance of {@link StatusXml }
     * 
     */
    public StatusXml createStatusXml() {
        return new StatusXml();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzKatalogProduktowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pobierzKatalogProduktowResponse")
    public JAXBElement<PobierzKatalogProduktowResponse> createPobierzKatalogProduktowResponse(PobierzKatalogProduktowResponse value) {
        return new JAXBElement<PobierzKatalogProduktowResponse>(_PobierzKatalogProduktowResponse_QNAME, PobierzKatalogProduktowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SprawdzStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sprawdzStatusResponse")
    public JAXBElement<SprawdzStatusResponse> createSprawdzStatusResponse(SprawdzStatusResponse value) {
        return new JAXBElement<SprawdzStatusResponse>(_SprawdzStatusResponse_QNAME, SprawdzStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdresXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "adres")
    public JAXBElement<AdresXml> createAdres(AdresXml value) {
        return new JAXBElement<AdresXml>(_Adres_QNAME, AdresXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KatalogProduktowXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "produkty")
    public JAXBElement<KatalogProduktowXml> createProdukty(KatalogProduktowXml value) {
        return new JAXBElement<KatalogProduktowXml>(_Produkty_QNAME, KatalogProduktowXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzyjmijZamowienie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "przyjmijZamowienie")
    public JAXBElement<PrzyjmijZamowienie> createPrzyjmijZamowienie(PrzyjmijZamowienie value) {
        return new JAXBElement<PrzyjmijZamowienie>(_PrzyjmijZamowienie_QNAME, PrzyjmijZamowienie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReazlizujZamowienieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "reazlizujZamowienieResponse")
    public JAXBElement<ReazlizujZamowienieResponse> createReazlizujZamowienieResponse(ReazlizujZamowienieResponse value) {
        return new JAXBElement<ReazlizujZamowienieResponse>(_ReazlizujZamowienieResponse_QNAME, ReazlizujZamowienieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "status")
    public JAXBElement<Object> createStatus(Object value) {
        return new JAXBElement<Object>(_Status_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzyjmijZamowienieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "przyjmijZamowienieResponse")
    public JAXBElement<PrzyjmijZamowienieResponse> createPrzyjmijZamowienieResponse(PrzyjmijZamowienieResponse value) {
        return new JAXBElement<PrzyjmijZamowienieResponse>(_PrzyjmijZamowienieResponse_QNAME, PrzyjmijZamowienieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SprawdzStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sprawdzStatus")
    public JAXBElement<SprawdzStatus> createSprawdzStatus(SprawdzStatus value) {
        return new JAXBElement<SprawdzStatus>(_SprawdzStatus_QNAME, SprawdzStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReazlizujZamowienie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "reazlizujZamowienie")
    public JAXBElement<ReazlizujZamowienie> createReazlizujZamowienie(ReazlizujZamowienie value) {
        return new JAXBElement<ReazlizujZamowienie>(_ReazlizujZamowienie_QNAME, ReazlizujZamowienie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzKatalogProduktow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pobierzKatalogProduktow")
    public JAXBElement<PobierzKatalogProduktow> createPobierzKatalogProduktow(PobierzKatalogProduktow value) {
        return new JAXBElement<PobierzKatalogProduktow>(_PobierzKatalogProduktow_QNAME, PobierzKatalogProduktow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PozycjaZamowieniaXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pozycjaZamowienia")
    public JAXBElement<PozycjaZamowieniaXml> createPozycjaZamowienia(PozycjaZamowieniaXml value) {
        return new JAXBElement<PozycjaZamowieniaXml>(_PozycjaZamowienia_QNAME, PozycjaZamowieniaXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduktXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "produkt")
    public JAXBElement<ProduktXml> createProdukt(ProduktXml value) {
        return new JAXBElement<ProduktXml>(_Produkt_QNAME, ProduktXml.class, null, value);
    }

}
