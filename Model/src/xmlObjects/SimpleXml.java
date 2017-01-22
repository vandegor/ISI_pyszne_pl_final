package xmlObjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "simple")
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleXml {
	@XmlElement(name = "string")
	public String string;
}
