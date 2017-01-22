
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tranzakcjaXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tranzakcjaXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="kontoPlus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kontoMinus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kwota" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tytul" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tranzakcjaXml", propOrder = {
    "id",
    "kontoPlus",
    "kontoMinus",
    "kwota",
    "data",
    "tytul"
})
public class TranzakcjaXml {

    protected Integer id;
    protected String kontoPlus;
    protected String kontoMinus;
    protected Float kwota;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected String tytul;

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
     * Gets the value of the kontoPlus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontoPlus() {
        return kontoPlus;
    }

    /**
     * Sets the value of the kontoPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontoPlus(String value) {
        this.kontoPlus = value;
    }

    /**
     * Gets the value of the kontoMinus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontoMinus() {
        return kontoMinus;
    }

    /**
     * Sets the value of the kontoMinus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontoMinus(String value) {
        this.kontoMinus = value;
    }

    /**
     * Gets the value of the kwota property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKwota() {
        return kwota;
    }

    /**
     * Sets the value of the kwota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKwota(Float value) {
        this.kwota = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the tytul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTytul() {
        return tytul;
    }

    /**
     * Sets the value of the tytul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTytul(String value) {
        this.tytul = value;
    }

}