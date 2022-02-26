package org.souza.charles.view;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 25, 2022
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");

			System.out.println("Connected!");

			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM T_PRODUCT");
			ResultSet result = preparedStatement.executeQuery();

			while (result.next()) {
				System.out.println( result.getInt("product_cd") + " " +
						result.getString("nm_product") + " " +
						result.getDouble("vl_product") + " " +
						result.getDate("dt_expiration"));
			}

			connection.close();
		} catch (SQLException e) {
			System.err.println("Could not connect!");
			e.printStackTrace();
		}
	}
}
