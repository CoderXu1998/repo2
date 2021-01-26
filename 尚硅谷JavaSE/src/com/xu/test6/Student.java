package com.xu.test6;

public class Student extends Person{
    long number;
    int math;
    int english;
    int computer;


    public Student(String name, char sex, int age,long k,int m,int e,int c) {
        super(name, sex, age);
        this.number = k;
        this.math = m;
        this.english = e;
        this.computer = c;
    }
}
