package org.souza.charles.digitalContentExample.designPatter.finalKeyword.bankExample.entities;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import org.souza.charles.digitalContentExample.designPatter.finalKeyword.bankExample.utils.InsufficientBalanceException;

public class CurrentAccount extends Account {
    private double limit;

    @Override
    public void withdraw(double value) throws InsufficientBalanceException {
        if (value> balance){
            throw new InsufficientBalanceException("Insufficient Value Balance!");
        }
        balance -= value;
    }

    @Override
    public double checkBalance() {
        return balance + limit;
    }

}
