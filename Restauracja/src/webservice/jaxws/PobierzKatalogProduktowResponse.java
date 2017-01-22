
package webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "pobierzKatalogProduktowResponse", namespace = "http://webservice/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pobierzKatalogProduktowResponse", namespace = "http://webservice/")
public class PobierzKatalogProduktowResponse {

    @XmlElement(name = "return", namespace = "")
    private xmlObjects.KatalogProduktowXml _return;

    /**
     * 
     * @return
     *     returns KatalogProduktowXml
     */
    public xmlObjects.KatalogProduktowXml getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(xmlObjects.KatalogProduktowXml _return) {
        this._return = _return;
    }

}
