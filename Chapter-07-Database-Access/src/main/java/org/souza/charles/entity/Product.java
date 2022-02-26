package org.souza.charles.entity;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 25, 2022
 */
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private int code;
	private String name;
	private float value;
	private Calendar expirationDate;

	public Product(int code, String name, float value, Calendar dateValid) {
		super();
		this.code = code;
		this.name = name;
		this.value = value;
		this.expirationDate = expirationDate;
	}

	public Product() {};

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Calendar getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Calendar expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Product [code =" + code
				+ ", Name=" + name
				+ ", Value=" + value
				+ ",Expiration Date="
				+ sdf.format(expirationDate.getTime())
				+ "]";
	}
}
