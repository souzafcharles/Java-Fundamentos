package org.souza.charles.digitalContentExample.designPatter.polymorphism.utils;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message) {
        super("Warning: " + message);
    }
}
