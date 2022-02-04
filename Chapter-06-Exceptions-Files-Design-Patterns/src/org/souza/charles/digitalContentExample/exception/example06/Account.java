package org.souza.charles.digitalContentExample.exception.example06;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import java.io.Serializable;

public class Account implements Serializable {
    private int agency;
    private int number;
    private double balance;

    public Account() {
    }

    public Account(int agency, int number, double balance) {
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double value){
        if (value < 0){
            throw new InvalidValueException("Invalid Value!");
        }
        balance += value;
    }

    public void withdraw(double value) throws InsufficientBalanceException{
        if (value> balance){
            throw new InsufficientBalanceException("Insufficient Value Balance!");
        }
        balance -= value;
    }

    public double getBalance (){
        return this.balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

