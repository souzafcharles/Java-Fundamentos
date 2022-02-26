package org.souza.charles.dao;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 25, 2022
 */
import java.util.List;

import org.souza.charles.entity.Product;

public interface DAO {

	void record(Product product);

	List<Product> findAll();

	Product getAllByCode(int code);

	void update(Product product);

	void remove(int code);
	
}
