package com.xu.test10;

//方法重写
public class Test {
    public static void main(String[] args) {
        Student s = new Student("计算机科学与技术");
        s.eat();
        s.walk(10);
        System.out.println("=========================================");

        s.study();

        Person p = new Person();
        p.eat();
    }
}
