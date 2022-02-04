package org.souza.charles.digitalContentExample.exception;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
public class example02 {
    public static void main(String[] args) {

        int[] array = new int[2];

        try {
            // Attempt to access a non-existent array position
            array[2] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
