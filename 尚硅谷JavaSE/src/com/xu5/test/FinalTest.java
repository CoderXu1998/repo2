package com.xu5.test;

public class FinalTest {
    final int WIDTH = 10;
    final int LEFT;
    final int RIGHT;

    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

    public FinalTest(int n){
        RIGHT = n;

    }

    public void doWidth(){
        //width = 20;
    }

    public void show(){
        //常量
        final int NUM = 10;
    }

    public void show(final int num){
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 10;
        num = num + 5;
        FinalTest test = new FinalTest();
        test.show(10);
    }
}






