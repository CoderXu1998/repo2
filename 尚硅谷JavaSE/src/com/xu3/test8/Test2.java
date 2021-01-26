package com.xu3.test8;

import org.junit.Test;

public class Test2 {
    //包装类-->基本数据类型：调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2);
    }

    public void method(Object obj){
        System.out.println(obj);
    }

    @Test
    public void test(){
        //自动装箱
        int num2 = 10;
        Integer in1 = num2;

        //自动拆箱
        int num3 = in1;
    }
}
