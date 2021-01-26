package com.xu3.test6;


//圆形类
public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        color = "white";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }


    @Override
    public boolean equals(Object obj) {
        //比较两个圆的半径是否相等，相等则返回true;
        if (this == obj){
            return true;
        }
        if (obj instanceof Circle){
            Circle c = (Circle) obj;
            if (c.radius == this.radius){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


}
