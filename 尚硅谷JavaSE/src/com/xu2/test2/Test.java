package com.xu2.test2;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            int random = (int)(Math.random() * (6 - 1 + 1) + 1);
            System.out.println(random);
        }
    }
}
