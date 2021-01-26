package com.xu.test3;


public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[10];

    }
    //添加客户
    public void addCustomer(String f,String l){
        Customer customer = new Customer(f, l);
        customers[numberOfCustomers] = customer;
        numberOfCustomers ++;
    }
    //获取客户的个数
    public int getNumOfCustomers(){
        return numberOfCustomers;
    }
    //获取指定位置上的顾客
    public Customer getCustomer(int index){
        if (index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
}
