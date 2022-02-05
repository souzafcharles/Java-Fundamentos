package org.souza.charles.digitalContentExample.designPatter.staticKeyword.application;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
import org.souza.charles.digitalContentExample.designPatter.staticKeyword.entities.TurnstileAccess;

public class App {

    public static void main(String[] args) {

        int total = TurnstileAccess.retrieveTotal();
        System.out.println("Total " + total);

        long number = Math.round(2.9);
        System.out.println("Rounded number: " + number);

        TurnstileAccess a1 = new TurnstileAccess();
        a1.enter("Charles");

        TurnstileAccess a2 = new TurnstileAccess();
        a2.enter("Balthazar");

        total = TurnstileAccess.retrieveTotal();
        System.out.println("Total " + total);
    }
}
