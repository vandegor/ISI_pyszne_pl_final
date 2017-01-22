package webservice;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import xmlObjects.TranzakcjaXml;

@WebService
public interface BankWebService {

	@WebMethod
	public @WebResult TranzakcjaXml pobierzTranzakcje(String tytul);

	@WebMethod
	public @WebResult TranzakcjaXml utworzTransakcje(String minus, String plus, Float wartosc, String tytul);
}
