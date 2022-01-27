package org.souza.charles.exercise;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Exercise solved by: Charles Fernandes de Souza
 * Date: January 26, 2022
 */
import java.util.Scanner;

public class BMICalculatorExcersice {

	public static void main(String[] args) {
		
		float height, weight, bmi;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the height: ");
		height = input.nextFloat();

		System.out.print("Enter the weight: ");
		weight = input.nextFloat();

		bmi = weight / (height * height);
		
		if (bmi >= 18.5 && bmi <= 25) {
			System.out.println("Body Mass Index is ideal: " + bmi);
		} else {
			System.out.println("Body Mass Index is outside the ideal: " + bmi);
				
		input.close();
		}
	}
}
