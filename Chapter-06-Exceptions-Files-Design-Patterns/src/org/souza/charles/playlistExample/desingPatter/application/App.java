package org.souza.charles.playlistExample.desingPatter.application;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
import org.souza.charles.playlistExample.desingPatter.entities.CurrentAccount;
import org.souza.charles.playlistExample.desingPatter.entities.SavingsAccount;
import org.souza.charles.playlistExample.desingPatter.utils.InsufficientBalanceException;
import org.souza.charles.playlistExample.desingPatter.utils.InvalidValueException;

public class App {

    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount ();

        try {
            currentAccount.deposit(100);
        } catch (InvalidValueException e) {
            e.printStackTrace();
        }

        try {
            currentAccount.withdraw(20);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }

        System.out.println("Current Account Balance: " + currentAccount.checkBalance());


        SavingsAccount savingsAccount = new SavingsAccount();

        try {
            savingsAccount.deposit(200);
        } catch (InvalidValueException e) {
            e.printStackTrace();
        }

        try {
            savingsAccount.withdraw(50);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
        System.out.println("Savings Account Balance: " + savingsAccount.checkBalance());
    }
}
