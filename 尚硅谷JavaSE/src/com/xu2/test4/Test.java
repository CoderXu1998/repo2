package com.xu2.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 6 + 1);
        Scanner sc =  new Scanner(System.in);
        System.out.println("猜数字，请输入您猜的数字：");
        int i = sc.nextInt();  //输入自己猜的随机数
        System.out.println("随机数为: " + random); //输出程序随机的数字

        if (i == random){
            System.out.println("恭喜你，猜对了！");
        }else {
            System.out.println("很遗憾，猜错了！");
        }
    }

}
