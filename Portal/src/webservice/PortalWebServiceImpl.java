package webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "webservice.PortalWebService")
public class PortalWebServiceImpl implements PortalWebService {

	public String sprawdüstatus(String name) {
		return "Hello world from " + name;
	}

}