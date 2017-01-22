package xmlObjects;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tranzakcja")
@XmlAccessorType(XmlAccessType.FIELD)
public class TranzakcjaXml {

	@XmlElement(name = "id")
	public Integer id;

	@XmlElement(name = "kontoPlus")
	public String kontoPlus;

	@XmlElement(name = "kontoMinus")
	public String kontoMinus;

	@XmlElement(name = "kwota")
	public Float kwota;

	@XmlElement(name = "data")
	public Date data;

	@XmlElement(name = "tytul")
	public String tytul;

}
