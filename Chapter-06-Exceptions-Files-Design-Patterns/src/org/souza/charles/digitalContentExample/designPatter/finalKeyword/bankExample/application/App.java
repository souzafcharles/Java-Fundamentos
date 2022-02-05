package org.souza.charles.digitalContentExample.designPatter.finalKeyword.bankExample.application;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import org.souza.charles.digitalContentExample.designPatter.finalKeyword.bankExample.entities.CurrentAccount;
import org.souza.charles.digitalContentExample.designPatter.finalKeyword.bankExample.entities.SavingsAccount;
import org.souza.charles.digitalContentExample.designPatter.finalKeyword.bankExample.utils.InsufficientBalanceException;

public class App {

    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount();
        try {
            currentAccount.withdraw(20);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }

        SavingsAccount savingsAccount = new SavingsAccount();
        try {
            savingsAccount.withdraw(20);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}
