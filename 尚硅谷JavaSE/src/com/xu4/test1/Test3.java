package com.xu4.test1;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

public class Test3 {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        //学生人数
        int number = sc.nextInt();
        System.out.println("请输入" + number + "个成绩");
        //创建数组，存放学生输入的成绩
        int[] arr = new int[number];
        //将输入的成绩，存放到数组中
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        //最大值
        int max = 0;
        //遍历数组，找出最高分数输出
        for (int i = 0; i < number; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最高分是：" + max);


        for (int i = 0; i < number; i++) {
            if (arr[i] >= max - 10){
                System.out.println("student " + i + " score is " + arr[i]
                + " grade is A");
            }else if (arr[i] >= max - 20){
                System.out.println("student " + i + " score is " + arr[i]
                        + " grade is B");
            }else if (arr[i] >= max - 30){
                System.out.println("student " + i + " score is " + arr[i]
                        + " grade is C");
            }else {
                System.out.println("student " + i + " score is " + arr[i]
                        + " grade is D");
            }
        }
    }
}
