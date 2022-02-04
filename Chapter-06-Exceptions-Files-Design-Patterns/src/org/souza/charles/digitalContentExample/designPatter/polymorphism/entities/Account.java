package org.souza.charles.digitalContentExample.designPatter.polymorphism.entities;

import org.souza.charles.digitalContentExample.designPatter.polymorphism.utils.InsufficientBalanceException;

/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */

public class Account{
    protected double balance;

    public void withdraw(double value) throws InsufficientBalanceException {
        if (value> balance){
            throw new InsufficientBalanceException("Insufficient Value Balance!");
        }
        balance -= value;
    }
}

