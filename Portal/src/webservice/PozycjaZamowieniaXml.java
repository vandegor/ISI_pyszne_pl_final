
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pozycjaZamowieniaXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pozycjaZamowieniaXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nrPozycji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="produkt" type="{http://webservice/}produktXml" minOccurs="0"/>
 *         &lt;element name="ilosc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cenaJednostkowa" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pozycjaZamowieniaXml", propOrder = {
    "id",
    "nrPozycji",
    "produkt",
    "ilosc",
    "cenaJednostkowa"
})
public class PozycjaZamowieniaXml {

    protected Integer id;
    protected Integer nrPozycji;
    protected ProduktXml produkt;
    protected Integer ilosc;
    protected Float cenaJednostkowa;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the nrPozycji property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNrPozycji() {
        return nrPozycji;
    }

    /**
     * Sets the value of the nrPozycji property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNrPozycji(Integer value) {
        this.nrPozycji = value;
    }

    /**
     * Gets the value of the produkt property.
     * 
     * @return
     *     possible object is
     *     {@link ProduktXml }
     *     
     */
    public ProduktXml getProdukt() {
        return produkt;
    }

    /**
     * Sets the value of the produkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduktXml }
     *     
     */
    public void setProdukt(ProduktXml value) {
        this.produkt = value;
    }

    /**
     * Gets the value of the ilosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIlosc() {
        return ilosc;
    }

    /**
     * Sets the value of the ilosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIlosc(Integer value) {
        this.ilosc = value;
    }

    /**
     * Gets the value of the cenaJednostkowa property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCenaJednostkowa() {
        return cenaJednostkowa;
    }

    /**
     * Sets the value of the cenaJednostkowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCenaJednostkowa(Float value) {
        this.cenaJednostkowa = value;
    }

}
