package org.souza.charles.examples;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 27, 2022
 */
public class ControlStatements {

	public static void main(String[] args) {
		
		int idade = 80;
		
		if(idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if(idade >= 70){
			System.out.println("Terceira idade");
		} else {
			System.out.println("Menor idade");
		}
	}
}
