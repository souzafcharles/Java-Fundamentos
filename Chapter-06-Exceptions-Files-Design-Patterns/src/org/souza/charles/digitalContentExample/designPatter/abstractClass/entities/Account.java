package org.souza.charles.digitalContentExample.designPatter.abstractClass.entities;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import org.souza.charles.digitalContentExample.designPatter.abstractClass.utils.InsufficientBalanceException;

public abstract class Account{
    protected double balance;

    public void withdraw(double value) throws InsufficientBalanceException {
        if (value> balance){
            throw new InsufficientBalanceException("Insufficient Value Balance!");
        }
        balance -= value;
    }
    public abstract double checkBalance();
}

