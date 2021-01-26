package com.xu.test;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("徐志斌",22);
        boy.shout();

        Girl girl = new Girl("朱育廷",20);
        girl.marry(boy);
        Girl girl1 = new Girl("杨舒涵",1);
        int compare = girl.compare(girl1);
        if (compare > 0){
            System.out.println(girl.getName() + "年龄大");
        }else if (compare < 0){
            System.out.println(girl1.getName() + "年龄大");
        }else {
            System.out.println("一样大");
        }
    }
}
