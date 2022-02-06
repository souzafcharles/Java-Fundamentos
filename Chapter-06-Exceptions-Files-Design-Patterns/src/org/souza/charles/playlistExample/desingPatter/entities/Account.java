package org.souza.charles.playlistExample.desingPatter.entities;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
import org.souza.charles.digitalContentExample.exception.example06.utils.InvalidValueException;
import org.souza.charles.playlistExample.desingPatter.utils.InsufficientBalanceException;
public abstract class Account{
    protected double balance;

    public void deposit(double value){
        if (value < 0){
            throw new InvalidValueException("Invalid Value!");
        }
        balance += value;
    }

    public void withdraw(double value) throws InsufficientBalanceException {
        if (value> balance){
            throw new InsufficientBalanceException("Insufficient Value Balance!");
        }
        balance -= value;
    }
    public abstract double checkBalance();

}


