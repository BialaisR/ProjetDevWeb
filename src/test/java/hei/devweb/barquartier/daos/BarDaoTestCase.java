package hei.devweb.barquartier.daos;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import hei.dewweb.barquartier.pojos.Bars;

public class BarDaoTestCase {
	
	private BarDao bardao = new BarDao();
	
	@Before
	public void initDatabase() throws Exception{
		try (Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection();
				Statement statement = connection.createStatement()){
			statement.executeUpdate("DELETE FROM bars");
			statement.executeUpdate("INSERT INTO bars(numeroBar,nomBar,descriptionBar,jourOuverture,heureOuv,heureFermeture,quartierBar,styleBar,imgBar) VALUES (1,'bartest','descritpiton 1','lundi',17:00:00,18:00:00,'lille centre','etudiant','nophoto')");
			statement.executeUpdate("INSERT INTO bars(numeroBar,nomBar,descriptionBar,jourOuverture,heureOuv,heureFermeture,quartierBar,styleBar,imgBar) VALUES (2,'bartest','descritpiton 2','lundi',17:00:00,18:00:00,'lille centre','etudiant','nophoto')");
		}
	}
	
	@Test
	public void shouldListBars() throws Exception {
		//WHEN
		List<Bars> bars = bardao.listBars();
		//THEN
		Assertions.assertThat(bars).hasSize(2);
		Assertions.assertThat(bars).extracting("numeroBar,nomBar,descriptionBar,jourOuverture,heureOuv,heureFermeture,quartierBar,styleBar,imgBar").containsOnly(
				Assertions.tuple(1,"bartest","descritpiton 1","lundi",17,18,"lille centre","etudiant","nophoto"),
				Assertions.tuple(2,"bartest","descritpiton 2","lundi",17,18,"lille centre","etudiant","nophoto")
				);
	}
	
	@Test
	public void shouldaddBar() throws Exception {
		//GIVEN
	}

}
