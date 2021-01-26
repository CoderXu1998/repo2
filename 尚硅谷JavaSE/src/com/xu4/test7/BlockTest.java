package com.xu4.test7;

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);
    }
}


class Person{
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //代码块
    static {
        System.out.println("Hello,static block-1");
        desc = "我是一个爱学习的人";
        info();
    }

    //代码块
    static {
        System.out.println("Hello,static block-2");
    }

    {
        System.out.println("Hello,block");
        age = 1;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info(){
        System.out.println("我是一个快乐的人！");
    }
}