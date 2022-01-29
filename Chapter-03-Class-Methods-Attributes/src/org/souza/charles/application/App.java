package org.souza.charles.application;

import org.souza.charles.entities.Account;

/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 29, 2022
 */


public class App {
    public static void main(String[] args) {

        Account currentAccount = new Account();
        currentAccount.balance = 50.00;
        currentAccount.agency = 123;
        currentAccount.number = 321;
        currentAccount.deposit(1000);
        System.out.println(currentAccount.checkBalance());

        Account savingAccount = new Account(111, 222, 1000);
        savingAccount.withdraw(50.00);
        System.out.println(savingAccount.checkBalance());







    }
}
