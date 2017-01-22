
package webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "przyjmijZamowienie", namespace = "http://webservice/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przyjmijZamowienie", namespace = "http://webservice/")
public class PrzyjmijZamowienie {

    @XmlElement(name = "arg0", namespace = "")
    private xmlObjects.ZamowienieXml arg0;

    /**
     * 
     * @return
     *     returns ZamowienieXml
     */
    public xmlObjects.ZamowienieXml getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(xmlObjects.ZamowienieXml arg0) {
        this.arg0 = arg0;
    }

}
