package com.xu3.test8;

import org.junit.Test;

public class Test1 {
    //基本数据类型-->包装类，调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;

        Integer in1 = new Integer(num1);  //10
        Integer in2 = new Integer("123"); //123

        Float f1 = new Float(12.3f); //12.3
        Float f2 = new Float("12.3");  //12.3

        Boolean b1 = new Boolean(true);  //true
        Boolean b2 = new Boolean("true");  //true
        Boolean b3 = new Boolean("true123"); //false

        //Order为自定义类
        Order order = new Order();
        System.out.println(order.isFemale); //null
    }
}

class Order{
    boolean isMale;
    Boolean isFemale;
}
