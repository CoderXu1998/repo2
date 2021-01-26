package com.xu2.test7;

import java.util.Date;

public class PersonTest {
    public static void main(String[] args) {
        //问题一：编译通过，运行不通过
        //举例一：
        //Person p3 = new Woman();
        //Man m3 = (Man) p3;
        //举例二：
        //Person p4 = new Person();
        //Man m4 = (Man)p4;


        //问题二：编译通过，运行也通过
        //举例二：
        //Object obj = new Woman();
        //Person p = (Person) obj;


        //问题三：编译不通过
        //Man m5 = new Woman();
        //String str = new Date();



    }
}
