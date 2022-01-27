package org.souza.charles.examples;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 26, 2022
 */
public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		int z = 15;
		
		int result = x + y;
		System.out.println(result);
		result = x - y;
		System.out.println(result);
		result = x * y;
		System.out.println(result);
		result = x / y;
		System.out.println(result);
		result = x % y;
		System.out.println(result);
		
		result = z - x + y * (x / y);
		System.out.println(result);

	}

}
