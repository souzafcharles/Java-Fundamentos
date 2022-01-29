package org.souza.charles.bank.application;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 29, 2022
 */
import org.souza.charles.bank.entities.Account;
import org.souza.charles.bank.entities.CheckingAccount;

public class App {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAgency(1111);
        checkingAccount.setNumber(2222);
        checkingAccount.setType("Individual");
        checkingAccount.setOverdraft(1000.00);
    }
}
