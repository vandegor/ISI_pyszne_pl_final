package webservice;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.j256.ormlite.support.ConnectionSource;

import DaoImpl.Bank.KontoDaoImpl;
import DaoImpl.Bank.TranzakcjaDaoImpl;
import DaoInterface.Bank.KontoDao;
import DaoInterface.Bank.TranzakcjaDao;
import Model.Bank.Konto;
import Model.Bank.Tranzakcja;
import ModelHelper.ConnectionSourceEnum;
import xmlObjects.TranzakcjaXml;

@WebService(endpointInterface = "webservice.BankWebService")
public class BankWebServiceImpl implements BankWebService {

	@Override
	public TranzakcjaXml pobierzTranzakcje(String tytul) {
		TranzakcjaXml tXml = null;
		ConnectionSource source = null;
		try {
			source = ConnectionSourceEnum.ISI_PYSZNE_PL.getConnectionSource();
			TranzakcjaDao tranzakcjaDao = new TranzakcjaDaoImpl(source);
			KontoDao kontoDao = new KontoDaoImpl(source);
			for (Tranzakcja t : tranzakcjaDao) {
				if (t.getTytul().equalsIgnoreCase(tytul)) {
					tXml = new TranzakcjaXml();
					tXml.id = t.getId();
					Konto konto = kontoDao.queryForId(t.getKontoPlus().getId());
					tXml.kontoPlus = konto != null ? konto.getNrKonta() : null;
					konto = t.getKontoMinus() != null ? kontoDao.queryForId(t.getKontoMinus().getId()) : null;
					tXml.kontoMinus = konto != null ? konto.getNrKonta() : null;
					tXml.kwota = t.getKwota();
					tXml.tytul = t.getTytul();
					tXml.data = t.getData();
					break;
				}

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		source.closeQuietly();
		return tXml;
	}

	@Override
	public TranzakcjaXml utworzTransakcje(String minus, String plus, Float wartosc, String tytul) {
		TranzakcjaXml tXml = null;
		ConnectionSource source = null;
		try {
			source = ConnectionSourceEnum.ISI_PYSZNE_PL.getConnectionSource();
			TranzakcjaDao tranzakcjaDao = new TranzakcjaDaoImpl(source);
			KontoDao kontoDao = new KontoDaoImpl(source);
			List<Konto> kontaPlus = kontoDao.queryForEq("nrKonta", plus);
			List<Konto> kontaMinus = kontoDao.queryForEq("nrKonta", minus);
			Konto kontoPlus = kontaPlus.isEmpty() ? null : kontaPlus.get(0);
			Konto kontoMinus = kontaMinus.isEmpty() ? null : kontaMinus.get(0);
			Tranzakcja tranzakcja = new Tranzakcja(kontoPlus, kontoMinus, wartosc, new Date());
			tranzakcja.setTytul(tytul);
			tranzakcjaDao.create(tranzakcja);

			tXml = new TranzakcjaXml();
			tXml.id = tranzakcja.getId();
			tXml.kontoPlus = plus;
			tXml.kontoMinus = minus;
			tXml.kwota = wartosc;
			tXml.tytul = tytul;
			tXml.data = tranzakcja.getData();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		source.closeQuietly();
		return tXml;
	}

}