package com.xu4.test2;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Man m1 = new Man();

        boolean b1 = m1 instanceof Man;
        System.out.println(b1);
    }
}
