package org.souza.charles.digitalContentExample.exception;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
public class example04 {
    public int divide(int n1, int n2) {
        try {
            return n1 / n2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
