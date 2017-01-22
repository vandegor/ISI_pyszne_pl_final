package xmlObjects;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "adres")
@XmlAccessorType(XmlAccessType.FIELD)
public class AdresXml {

	@XmlElement(name = "id")
	public Integer id;

	@XmlElement(name = "miejscowosc")
	public String miejscowosc;

	@XmlElement(name = "ulica")
	public String ulica;

	@XmlElement(name = "kodpocztowy")
	public String kodpocztowy;

	@XmlElement(name = "numerBudynku")
	public Integer numerBudynku;

	@XmlElement(name = "numerlokalu")
	public Integer numerlokalu;

}
