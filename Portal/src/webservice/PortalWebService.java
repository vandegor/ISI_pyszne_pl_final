package webservice;  
import javax.jws.WebMethod;  
import javax.jws.WebService;  
  
@WebService  
public interface PortalWebService {  
  
 @WebMethod public String sprawdüstatus(String name);  
}  
