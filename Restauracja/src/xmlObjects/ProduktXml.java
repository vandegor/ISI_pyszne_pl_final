package xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "produkt")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProduktXml {
	@XmlElement(name = "id")
	public Integer id;

	@XmlElement(name = "nazwa")
	public String nazwa;

	@XmlElement(name = "cena")
	public Double cena;

}
