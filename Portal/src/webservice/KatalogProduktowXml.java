
package webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for katalogProduktowXml complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="katalogProduktowXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produkt" type="{http://webservice/}produktXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "katalogProduktowXml", propOrder = {
    "produkt"
})
public class KatalogProduktowXml {

    protected List<ProduktXml> produkt;

    /**
     * Gets the value of the produkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdukt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProduktXml }
     * 
     * 
     */
    public List<ProduktXml> getProdukt() {
        if (produkt == null) {
            produkt = new ArrayList<ProduktXml>();
        }
        return this.produkt;
    }

}
