package org.souza.charles.playlistExample.desingPatter.entities;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
import org.souza.charles.playlistExample.desingPatter.utils.InsufficientBalanceException;
import org.souza.charles.playlistExample.desingPatter.utils.Transferable;

public class SpecialCurrentAccount extends CurrentAccount implements Transferable {
    private double limit;

    @Override
    public void withdraw(double value) throws InsufficientBalanceException {
        if (value> balance + limit){
            throw new InsufficientBalanceException("Insufficient Value Balance!");
        }
        balance -= value;
    }

    @Override
    public double checkBalance() {
        return balance + limit;
    }


    @Override
    public boolean performDoc(int bankNumber, int agencyNumber, int accountNumber, double value) {
        return false;
    }

    @Override
    public boolean performTed(int bankNumber, int agencyNumber, int accountNumber, double value) {
        return false;
    }

    @Override
    public boolean performInternalTransfer(int agencyNumber, int accountNumber, double value) {
        return Transferable.super.performInternalTransfer(agencyNumber, accountNumber, value);
    }
}
