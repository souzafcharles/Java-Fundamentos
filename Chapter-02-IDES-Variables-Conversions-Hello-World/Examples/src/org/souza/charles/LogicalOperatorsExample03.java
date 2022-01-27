package org.souza.charles;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 27, 2022
 */
public class LogicalOperatorsExample03 {

	public static void main(String[] args) {
		
		int x = 9, y = 11;
		
		boolean teste = x > 10 ^ y > 10;
		
		System.out.println(teste);
	}
}
