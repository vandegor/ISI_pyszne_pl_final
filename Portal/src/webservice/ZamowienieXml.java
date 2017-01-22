
package webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for zamowienieXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zamowienieXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice/}statusXml" minOccurs="0"/>
 *         &lt;element name="adres" type="{http://webservice/}adresXml" minOccurs="0"/>
 *         &lt;element name="dataZamowienia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataDostawy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pozycjaZamowienia" type="{http://webservice/}pozycjaZamowieniaXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zamowienieXml", propOrder = {
    "id",
    "status",
    "adres",
    "dataZamowienia",
    "dataDostawy",
    "pozycjaZamowienia"
})
public class ZamowienieXml {

    protected Integer id;
    protected StatusXml status;
    protected AdresXml adres;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataZamowienia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDostawy;
    protected List<PozycjaZamowieniaXml> pozycjaZamowienia;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusXml }
     *     
     */
    public StatusXml getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusXml }
     *     
     */
    public void setStatus(StatusXml value) {
        this.status = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link AdresXml }
     *     
     */
    public AdresXml getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresXml }
     *     
     */
    public void setAdres(AdresXml value) {
        this.adres = value;
    }

    /**
     * Gets the value of the dataZamowienia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataZamowienia() {
        return dataZamowienia;
    }

    /**
     * Sets the value of the dataZamowienia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataZamowienia(XMLGregorianCalendar value) {
        this.dataZamowienia = value;
    }

    /**
     * Gets the value of the dataDostawy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDostawy() {
        return dataDostawy;
    }

    /**
     * Sets the value of the dataDostawy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDostawy(XMLGregorianCalendar value) {
        this.dataDostawy = value;
    }

    /**
     * Gets the value of the pozycjaZamowienia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pozycjaZamowienia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPozycjaZamowienia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PozycjaZamowieniaXml }
     * 
     * 
     */
    public List<PozycjaZamowieniaXml> getPozycjaZamowienia() {
        if (pozycjaZamowienia == null) {
            pozycjaZamowienia = new ArrayList<PozycjaZamowieniaXml>();
        }
        return this.pozycjaZamowienia;
    }

}
