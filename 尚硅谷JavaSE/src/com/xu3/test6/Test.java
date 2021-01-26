package com.xu3.test6;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle("white",2.0,3.3);
        System.out.println("颜色是否相等：" + c1.color.equals(c2.color)); //true;
        System.out.println("半径是否相等：" + c1.equals(c2));
        System.out.println(c1);
        System.out.println(c2.toString());
    }

}
