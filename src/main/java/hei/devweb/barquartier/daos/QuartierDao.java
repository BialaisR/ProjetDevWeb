package hei.devweb.barquartier.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import hei.dewweb.barquartier.pojos.Quartiers;

public class QuartierDao {
	
	
	public List<Quartiers> listQuartiers() {
		List<Quartiers> quartiers = new ArrayList<Quartiers>();

		try (Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM quartiers ORDER BY name")) {
			while (resultSet.next()) {
				quartiers.add(new Quartiers(resultSet.getInt("numeroQuartier"), resultSet.getString("nomQuartier"),resultSet.getString("descritpionQuartier"), resultSet.getString("imgQuartier")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return quartiers;
	}

	public Quartiers getQuartier(Integer numeroQuartier) {
		try (Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM quartiers WHERE numeroQuartier = ?")) {
			statement.setInt(1, numeroQuartier);
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					return new Quartiers(resultSet.getInt("numeroQuartier"), resultSet.getString("nomQuartier"), resultSet.getString("descritpionQuartier"),resultSet.getString("imgQuartier"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public void addQuartier(Quartiers newQuartier) {
		try (Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection();
				PreparedStatement statement = connection.prepareStatement(
						"INSERT INTO quartiers(nomQuartier, descriptionBar, imgBar) VALUES (?,?,?)")) {
			statement.setString(1,newQuartier.getNameQ());
			statement.setString(2, newQuartier.getDescritpionQ());
			statement.setString(3,newQuartier.getImgQuartier());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void deleteQuartier(String numeroQuartier) throws Exception{
        try(Connection connection = DataSourceProvider.getInstance().getDataSource().getConnection()){
            PreparedStatement statement = connection.prepareStatement("DELETE FROM quartiers WHERE numeroQuartier = ?");
            statement.setString(1,numeroQuartier);
            statement.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}