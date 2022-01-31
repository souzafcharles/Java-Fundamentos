package org.souza.charles.repetitionStatements;

/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 30, 2022
 */
public class CashExample03 {

    public static void main(String[] args) {
        int quantityOfProducts = 5;
        for (int i = 1; i < quantityOfProducts; i++) {
            System.out.println("Product number " + i + " has been registered");
        }
    }
}
