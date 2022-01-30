package org.souza.charles;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 30, 2022
 */
public class CashExample02 {

    public static void main(String[] args) {

        int quantityOfProducts = 5;
        int registration = 0;

        do {
            registration++;
            System.out.println("Product number " + registration + " has been registered");
        } while (registration < quantityOfProducts);

    }
}
