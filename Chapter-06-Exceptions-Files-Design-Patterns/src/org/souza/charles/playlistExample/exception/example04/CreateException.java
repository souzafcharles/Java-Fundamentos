package org.souza.charles.playlistExample.exception.example04;

/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
public class CreateException {

    public static void main(String[] args) throws DivisionByZeroException {
        try {
            float val = 10 / 0;
            System.out.println(val);
        } catch(Exception e) {
            throw new DivisionByZeroException();
        }
    }
}
