package org.souza.charles.bank.entities;

public class CheckingAccount extends Account{

    private String type;
    private double overdraft;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getBalanceAvailable(){
        return super.getBalance() + overdraft;
    }

    @Override
    public void withdraw (double value){
        value += 10;
        super.withdraw(value);
    }
}
