package org.souza.charles.examples;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 22, 2022
 */

public class TypeConversion {

	public static void main(String[] args) {
		int x = 10;
		double y = (double) x;
		System.out.println(y);
		
		double valorDouble = 9.99;
		int valorInt = (int) valorDouble;
		System.out.println(valorInt);
	}
}