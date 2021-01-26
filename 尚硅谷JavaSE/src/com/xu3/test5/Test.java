package com.xu3.test5;

public class Test {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14,3,1976);
        MyDate m2 = new MyDate(14,3,1976);

        if (m1 == m2){
            System.out.println("m1 = m2");
        }else {
            System.out.println("m1 != m2"); //比较的是地址值，不相等
        }

        if (m1.equals(m2)){
            System.out.println("m1 is equal to m2"); //因为重写了equals，所以应该比较的时实体值
        }else {
            System.out.println("m1 is not equal to m2");
        }
    }
}
