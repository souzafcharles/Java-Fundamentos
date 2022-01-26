package org.souza.charles;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 22, 2022
 */

public class IncrementDecrementOperatorsUnary {

	public static void main(String[] args) {
		
		int x = 9;
		int y = 2;
		
		int soma = x +y ;
		int subtra�ao = x -y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y ;
		
		System.out.println("Resultado da adi��o:        " + soma );
		System.out.println("Resultado da subtra�ao:     " + subtra�ao );
		System.out.println("Resultado da multiplicacao: " + multiplicacao);
		System.out.println("Resultado da divisao:       " + divisao );
		System.out.println("Resultado do m�dulo:        " + resto );
		
		
		x++;
		System.out.println("Resultado do incremento x: " + x);
		 
		y--;
		System.out.println("Resultado de decremento y: " + y);
		
		x += 10;
		System.out.println("Atribui��o aditiva de x:   " + x);
		
		y-= 10;
		System.out.println("Atribui��o subtrativa y:   " + y);

	}
}
