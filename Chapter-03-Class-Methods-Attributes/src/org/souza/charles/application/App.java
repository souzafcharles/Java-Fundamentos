package org.souza.charles.application;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 29, 2022
 */
import org.souza.charles.entities.Account;

public class App {
    public static void main(String[] args) {

        Account currentAccount = new Account();
        currentAccount.deposit(50.00);
        currentAccount.setAgency(123);
        currentAccount.setNumber(321);
        currentAccount.deposit(1000);
        System.out.println(currentAccount.getBalance());

        Account savingAccount = new Account(111, 222, 1000);
        savingAccount.withdraw(50.00);
        System.out.println(savingAccount.getBalance());
    }
}
