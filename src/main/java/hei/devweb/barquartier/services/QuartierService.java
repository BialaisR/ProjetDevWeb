package hei.devweb.barquartier.services;

import java.util.List;

import hei.devweb.barquartier.daos.QuartierDao;
import hei.dewweb.barquartier.pojos.Quartiers;

public class QuartierService {

	private QuartierDao quartierDao = new QuartierDao();
	
	private static class QuartierServiceHolder {
		private static QuartierService instance = new QuartierService();
	}
	
	public static QuartierService getInstance() {
		return QuartierServiceHolder.instance;
	}

	private QuartierService() {
	}
	
	public List<Quartiers> listQuartiers() {
		return quartierDao.listQuartiers();
	}
	
	public Quartiers getQuartier(Integer numeroQuartier){
		return quartierDao.getQuartier(numeroQuartier);	
	}
	public void addQuartier(Quartiers newQuartier){
		quartierDao.addQuartier(newQuartier);
	}
	
	public void deleteQuartier(String numeroQuartier){
		try {
			quartierDao.deleteQuartier(numeroQuartier);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
