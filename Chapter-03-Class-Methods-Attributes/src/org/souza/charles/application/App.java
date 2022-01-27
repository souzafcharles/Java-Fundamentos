package org.souza.charles.application;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 27, 2022
 */

import org.souza.charles.entities.Account;

public class App {
    public static void main(String[] args) {
        Account currentAccount = new Account();
        Account savingsAccount = new Account();
        Account investmentAccount = new Account();

        currentAccount.number = 11;
        currentAccount.balance = 20.5;
        currentAccount.client.name = "Charles";
        currentAccount.client.age = 32;

        savingsAccount.number = 22;
        savingsAccount.balance = 30;
        savingsAccount.client.name = "Balthazar";
        savingsAccount.client.age = 2;

        investmentAccount.number = 33;
        investmentAccount.balance = 40;
        investmentAccount.client.name = "Ophélia";
        investmentAccount.client.age = 1;

        System.out.println("----Current Account Data----");
        System.out.println(currentAccount.number);
        System.out.println(currentAccount.balance);
        System.out.println(currentAccount.client.name);
        System.out.println(currentAccount.client.age);

        System.out.println("----Savings Account Data----");
        System.out.println(savingsAccount.number);
        System.out.println(savingsAccount.balance);
        System.out.println(savingsAccount.client.name);
        System.out.println(savingsAccount.client.age);

        System.out.println("----Investment Account Data----");
        System.out.println(investmentAccount.number);
        System.out.println(investmentAccount.balance);
        System.out.println(investmentAccount.client.name);
        System.out.println(investmentAccount.client.age);
    }
}
