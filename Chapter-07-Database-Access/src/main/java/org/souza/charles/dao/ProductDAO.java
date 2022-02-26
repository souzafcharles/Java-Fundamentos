package org.souza.charles.dao;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 25, 2022
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.souza.charles.entity.Product;
import org.souza.charles.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO implements DAO {

	private Connection connection;
	PreparedStatement pstmt = null;

	public void record(Product product) {
		try {
			connection = ConnectionFactory.createConnection();
			pstmt = connection.prepareStatement(
					"INSERT INTO T_PRODUCT (CD_PRODUCT, NM_PRODUCT, VL_PRODUCT, DT_VALIDADE)"
							+ "VALUES (SEQ_PRODUCT.NEXTVAL, ?, ?, ?)");

			pstmt.setString(1, product.getName());
			pstmt.setFloat(2, product.getValue());
			pstmt.setDate(3, new java.sql.Date(product.getExpirationDate().getTimeInMillis()));
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Product> findAll(){

		List<Product> products = new ArrayList<Product>();
		ResultSet rs = null;

		try {
			ConnectionFactory.createConnection();
			pstmt = connection.prepareStatement("SELECT * FROM T_PRODUCT");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				java.sql.Date date = rs.getDate("DT_VALIDADE");
				Calendar dtValid = Calendar.getInstance();
				dtValid.setTimeInMillis(date.getTime());
				Product product = new Product(rs.getInt("CD_PRODUCT"), rs.getString("NM_PRODUCT"),
						rs.getFloat("VL_PRODUCT"), dtValid);
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return products;
	}

	public Product getAllByCode(int code) {

		List<Product> products = new ArrayList<Product>();
		ResultSet rs = null;

		try {
			ConnectionFactory.createConnection();
			pstmt = connection.prepareStatement("SELECT * FROM T_PRODUCT WHERE CD_PRODUCT = ?");
			pstmt.setInt(1, code);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				java.sql.Date date = rs.getDate("DT_VALIDADE");
				Calendar dtValid = Calendar.getInstance();
				dtValid.setTimeInMillis(date.getTime());
				Product product = new Product(rs.getInt("CD_PRODUCT"), rs.getString("NM_PRODUCT"),
						rs.getFloat("VL_PRODUCT"), dtValid);
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return(Product) products;
	}


	public void update(Product product) {

		try {
			ConnectionFactory.createConnection();
			pstmt = connection.prepareStatement("UPDATE T_PRODUCT SET NM_PRODUCT = ?, VL_PRODUCT = ?, DT_VALIDADE = ? WHERE CD_PRODUCT = ?");
			pstmt.setString(1, product.getName());
			pstmt.setFloat(2, product.getValue());
			pstmt.setDate(3, new java.sql.Date(product.getExpirationDate().getTimeInMillis()));
			pstmt.setInt(4, product.getCode());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void remove(int code) {
		try {
			ConnectionFactory.createConnection();
			pstmt = connection.prepareStatement("DELETE FROM T_PRODUCT WHERE CD_PRODUCT = ?");
			pstmt.setInt(1, code);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
