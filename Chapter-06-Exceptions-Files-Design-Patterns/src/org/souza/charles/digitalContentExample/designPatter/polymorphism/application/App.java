package org.souza.charles.digitalContentExample.designPatter.polymorphism.application;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import org.souza.charles.digitalContentExample.designPatter.polymorphism.utils.InsufficientBalanceException;
import org.souza.charles.digitalContentExample.designPatter.polymorphism.entities.Account;

public class App {

    public static void main(String[] args) {

        Account cc = new Account();
        try {
            cc.withdraw(20);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }

    }
}
