package com.xu3.test7;


import org.junit.Test;


public class JunitTest {
    public static void main(String[] args) {
        JunitTest j = new JunitTest();
        int num1 = 10;
        j.method(num1);
    }

    public void method(Object obj){
        System.out.println(obj);
    }
}
