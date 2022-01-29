package org.souza.charles.bank.entities;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 29, 2022
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

    public void deposit (double value){
        this.balance += value;
    }

    public void withdraw (double value){
        this.balance -= value;
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

