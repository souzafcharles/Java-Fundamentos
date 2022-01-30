package org.souza.charles.bank.application;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 30, 2022
 */
import org.souza.charles.bank.entities.Account;
import org.souza.charles.bank.entities.CheckingAccount;

public class App {

    public static void main(String[] args) {

        Account account01 = new Account();
        account01.deposit(1000);
        account01.withdraw(100);

        CheckingAccount account02 = new CheckingAccount();
        account02.deposit(1000);
        account02.withdraw(100);

        Account account03 = new CheckingAccount();
        account03.deposit(1000);
        account03.withdraw(100);

        System.out.println("Account 01: " + account01.getBalance());
        System.out.println("Account 02: " + account02.getBalance());
        System.out.println("Account 03: " + account03.getBalance());
    }
}
