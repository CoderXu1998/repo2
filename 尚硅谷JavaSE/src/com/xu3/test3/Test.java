package com.xu3.test3;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Test {
    public static void main(String[] args) {
        Order o1 = new Order(1, "xuzhibin");
        Order o2 = new Order(1,"xuzhibin");
        System.out.println(o1.equals(o2));
    }
}
