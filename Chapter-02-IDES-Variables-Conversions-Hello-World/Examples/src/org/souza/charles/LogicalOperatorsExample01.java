package org.souza.charles;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 26, 2022
 */
public class LogicalOperatorsExample01 {

	public static void main(String[] args) {
		
		int idade = 20;
		
		boolean precisaVotar = idade >= 18 && idade < 70;
		
		System.out.println(precisaVotar);
	}
}
