package com.xu2.test3;

//可透支的账户
public class CheckAccount extends Account{
    private double overdraft; //可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }


    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()){
            super.withdraw(amount);
        }else if (overdraft >= amount - getBalance()){
            overdraft -= (amount - getBalance());
            setBalance(0);
        }else {
            System.out.println("超过可透支限额！");
        }
    }
}
