package com.xu.p.service;

import com.xu.p.bean.Customer;

//管理customer对象，进行增删改查，共CustomerView调用
public class CustomerList {
    private Customer[] customers;  //客户数组，用来存储客户对象
    private int total;    //记录已保存客户对象的数量


    //构造方法，用来初始化数组的最大长度
    public CustomerList(int totalCustomer){
        this.customers = new Customer[totalCustomer];
    }


    //将指定的客户添加到数组中
    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }else {
            customers[total] = customer;
            total ++;
            return true;
        }
    }

    //修改指定位置上的客户信息
    public boolean replaceCustomer(int index,Customer customer){
        if (index < 0 || index >= total){
            return false;
        }else {
            customers[index] = customer;
            return true;
        }
    }

    //删除指定索引位置上的客户
    public boolean deleteCustomer(int index){
        if (index < 0 || index >= total){
            return false;
        }
        for (int i = index; i <= total - 1 ; i ++){
            customers[i] = customers[i + 1];
        }
        //最后一个元素需要制空 :null
        customers[total - 1] = null;
        total --;
        return true;
    }

    //获取所有客户
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    //获取指定索引位置上的的客户
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }else {
            return customers[index];
        }
    }

    //获取客户的数量
    public int getTotal(){
        return total;
    }
}
