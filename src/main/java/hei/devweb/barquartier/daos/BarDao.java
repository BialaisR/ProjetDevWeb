package hei.devweb.barquartier.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hei.dewweb.barquartier.pojos.Bars;

public class BarDao {

	public List<Bars> listBars() {
		List<Bars> bars = new ArrayList<Bars>();

		try (Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM bars ORDER BY name")) {
			while (resultSet.next()) {
				bars.add(new Bars(resultSet.getInt("numeroBar"), resultSet.getString("nomBar"),
						resultSet.getString("descritpionBar"), resultSet.getString("jourOuverture"),
						resultSet.getTime("heureOuv"), resultSet.getTime("heureFermeture"),
						resultSet.getString("quartierBar"), resultSet.getString("styleBar"),
						resultSet.getString("imgBar")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bars;
	}
	
	public Bars getBar(Integer numeroBar) {
		try (Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM bars WHERE numeroBar = ?")) {
			statement.setInt(1, numeroBar);
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					return new Bars(resultSet.getInt("numeroBar"), resultSet.getString("nomBar"),
							resultSet.getString("descritpionBar"), resultSet.getString("jourOuverture"),
							resultSet.getTime("heureOuv"), resultSet.getTime("heureFermeture"),
							resultSet.getString("quartierBar"), resultSet.getString("styleBar"),
							resultSet.getString("imgBar"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addBar(Bars newBar) {
		try (Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection();
				PreparedStatement statement = connection.prepareStatement(
						"INSERT INTO bars(nomBar, descriptionBar, jourOuverture, heureOuv, heureFermeture, quartierBar, styleBar, imgBar) VALUES (?,?,?,?,?,?,?,?)")) {
			statement.setString(1,newBar.getNameB());
			statement.setString(2, newBar.getDescritpionB());
			statement.setString(3,newBar.getJourOuvB());
			statement.setTime(4, newBar.getHeureOuvB());
			statement.setTime(5, newBar.getHeureFermB());
			statement.setString(6,newBar.getNomQ());
			statement.setString(7,newBar.getStyleB());
			statement.setString(8, newBar.getImgB());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteBar(String numeroBar) throws Exception{
        try(Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection()){
            PreparedStatement statement = connection.prepareStatement("DELETE FROM bars WHERE numeroBar = ?");
            statement.setString(1,numeroBar);
            statement.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }

}