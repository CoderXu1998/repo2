package com.xu4.test5;
//银行账户
public class Account {
    private int id;//账号
    private String pwd = "000000"; //密码
    private double balance;//存款余额

    private static double interestRate; //利率
    private static double minMoney = 1.0; //最小余额
    private static int init = 1001;//用于自动生成id使用

    public Account(){
        id = init ++;
    }

    public Account(String pwd,double balance){
        id = init ++;
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
