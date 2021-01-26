package com.xu.test3;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //System.out.println(bank.getNumOfCustomers());
        bank.addCustomer("xu","zhibin");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);
    }
}
