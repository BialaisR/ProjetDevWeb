package hei.devweb.barquartier.services;

import java.util.List;
import hei.devweb.barquartier.daos.BarDao;
import hei.dewweb.barquartier.pojos.Bars;

public class BarService {

	private BarDao barDao = new BarDao();
	
	private static class BarServiceHolder {
		private static BarService instance = new BarService();
	}
	
	public static BarService getInstance() {
		return BarServiceHolder.instance;
	}

	private BarService() {
	}
	
	public List<Bars> listBars() {
		return barDao.listBars();
	}
	
	public Bars getBar(Integer numeroBar){
		return barDao.getBar(numeroBar);	
	}
	public void addBar(Bars newBar){
		barDao.addBar(newBar);
	}
	
	public void deleteBar(String numeroBar){
		try {
			barDao.deleteBar(numeroBar);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
