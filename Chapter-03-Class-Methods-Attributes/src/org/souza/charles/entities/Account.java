package org.souza.charles.entities;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 29, 2022
 */

public class Account {
    public int agency;
    public int number;
    public double balance;

    public Account() {
    }

    public Account(int agency, int number, double balance) {
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    public void deposit (double value){
        this.balance += value;
    }

    public void withdraw (double value){
        this.balance -= value;
    }

    public double checkBalance (){
        return this.balance;
    }
}

