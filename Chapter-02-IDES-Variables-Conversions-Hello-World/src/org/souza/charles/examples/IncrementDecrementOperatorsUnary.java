package org.souza.charles.examples;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 26, 2022
 */

public class IncrementDecrementOperatorsUnary {

	public static void main(String[] args) {
		
		int x = 9;
		int y = 2;
		
		int soma = x + y ;
		int subtracao = x -y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y ;
 
		System.out.println("Resultado da adicao:        " + soma);
		System.out.println("Resultado da subtracao:     " + subtracao);
		System.out.println("Resultado da multiplicacao: " + multiplicacao);
		System.out.println("Resultado da divisao:       " + divisao);
		System.out.println("Resultado do modulo:        " + resto);
		
		
		x++;
		System.out.println("Resultado do incremento x:  " + x);
		 
		y--;
		System.out.println("Resultado de decremento y:  " + y);
		
		x += 10;
		System.out.println("Atribuicaoo aditiva de x:   " + x);
		
		y-= 10;
		System.out.println("Atribuicaoo subtrativa y:  " + y);

	}
}
