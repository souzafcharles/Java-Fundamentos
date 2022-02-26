package org.souza.charles.dao;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 25, 2022
 */

public abstract class DAOFactory {
	public static DAO getProdutcDAO() {
		return new ProductDAO();
	}
}
