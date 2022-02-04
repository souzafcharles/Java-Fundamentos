package org.souza.charles.digitalContentExample.exception.example06.application;

import org.souza.charles.digitalContentExample.exception.example06.entities.Account;

/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
public class App {
    public static void main(String[] args) {
        // Create a new Account instance
        Account c = new Account();
        try {
            // check
            c.withdraw(100);
        } catch(Exception e) {
            e.printStackTrace();
        }
        // deposit
        c.deposit(200);
    }
}
