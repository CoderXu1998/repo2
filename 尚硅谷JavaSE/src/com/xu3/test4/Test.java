package com.xu3.test4;

public class Test {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();

        A a1 = new A("xuzhibin",20,b1);
        A a2 = new A("xuzhibin",20,b2);
        System.out.println(a1.equals(a2));
    }
}
