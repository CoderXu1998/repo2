package com.xu4.test4;

public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation = "中国";

        Chinese c1 = new Chinese();
        c1.name = "徐志斌";
        c1.age = 40;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "朱育廷";
        c2.age = 30;
        c2.nation = "CHINA";

        System.out.println(c1.nation);


    }
}


//中国人
class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println(2);

    }

    public static void show(){
        System.out.println("1");
        System.out.println(nation);
        walk();
    }

    public static void walk(){

    }
}