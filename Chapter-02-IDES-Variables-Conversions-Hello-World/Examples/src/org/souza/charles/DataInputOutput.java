package org.souza.charles;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 26, 2022
 */
import java.util.Scanner;

public class DataInputOutput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int numero01 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int numero02 = input.nextInt();
		
		int soma = numero01 + numero02;
		System.out.println("A soma dos n�meros �: " + soma);
		
		int resto = soma % 2;
		if(resto == 0) {
				System.out.println("A soma � par");
		} else {
				System.out.println("A soma � impar");
		}
			input.close();
	}
}
