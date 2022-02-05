package org.souza.charles.digitalContentExample.exception;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Read the two numbers
            float number1 = sc.nextInt();
            float number2 = sc.nextInt();
            // Perform the division
            float division = number1 / number2;
            // Display the result
            System.out.println("The result is: " + division);
        } catch (ArithmeticException e) {
            System.err.println("Error dividing!");
        } catch(InputMismatchException e) {
            System.err.println("Data entry error!");
        } finally{
            System.out.println("Finishing program execution!");
            sc.close();
        }
    }
}
