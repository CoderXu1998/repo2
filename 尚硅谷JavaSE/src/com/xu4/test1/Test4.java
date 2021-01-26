package com.xu4.test1;

import sun.plugin.cache.FileVersion;

import java.util.Scanner;
import java.util.Vector;

public class Test4 {
    public static void main(String[] args) {
        //实例化scanner
        Scanner sc = new Scanner(System.in);
        //创建Vector对象，相当于数组
        Vector v = new Vector();
        //学生成绩最大值
        int maxScore = 0;
        //通过循环，给vector赋值
        while (true) {
            System.out.println("请输入学生成绩（当输入为负数表示结束）");
            int score = sc.nextInt();
            //如果小于0，跳出循环
            if (score < 0){
                break;
            }
            if (score > 100){
                System.out.println("输入的数据非法，请重新输入");
                continue;
            }

            v.addElement(score); //自动装箱

            if (maxScore < score){
                maxScore = score;
            }

        }

        char level;

        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            Integer in = (Integer) obj;
            int score = in;
            //int score = (int)obj;

            if (maxScore - score <= 10){
                level = 'A';
            }else if (maxScore - score <= 20){
                level = 'B';
            }else if (maxScore - score <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student " + i + "score is " + score + "level is" + level);
        }

    }
}
