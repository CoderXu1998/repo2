package com.xu4.test1;

import org.junit.Test;

public class Test2 {
    @Test
    public void method1(){
        /*
        new了两个对象，地址值不一样，所以false。虽然包装类重写了
        toString方法，但是并没有输出变量名，所以不执行toString
        比较的是地址值，实体内容了！
        */
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); //false

        /*Integer内部定义了IntegerCache结构，该结构中定义了Integer[]，
        保存了从-128~127范围内的整数，如果我们使用自动装箱的方式给Integer
        赋值的范围在-128~127范围内时，可以直接使用数组中的元素，就不用再去
        new了，所以调用的是同一个，地址值一样。目的是提高效率。
        */
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); //true

        //超出了数组范围，相当于new了两个对象，地址不一样，所以false
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); //false
    }
}
