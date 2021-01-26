package com.xu4.test1;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

public class Test1 {
    //String类型——>基本数据类型、包装类：调用包装类的parseXxx(String s)方法
    @Test
    public void test5(){
        String str1 = "123";
        int num2 = Integer.parseInt(str1);
        System.out.println(num2);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }

    //基本数据类型、包装类——>String类型：调用String重载的valueOF方法
    @Test
    public void test3(){
        //方式一：连接运算
        int num1 = 10;
        String str1 = num1 + "";

        //方式二：调用String的valueOf方法
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        System.out.println(str2); //"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str3); //"12.4"
    }
}
