package org.souza.charles.digitalContentExample.exception.example06;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
public class InvalidValueException extends RuntimeException{
    public InvalidValueException(String message) {
        super("Warning: " + message);
    }
}
