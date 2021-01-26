package com.xu.test8;

public class Circle {
    private double radius;  //圆的半径

    public Circle(){
        radius = 1;  //创建对象时，radius赋值为1
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //返回圆的面积
    public double findArea(){
        return 3.14 * radius * radius;
    }
}
