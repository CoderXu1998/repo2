package com.xu3.test1;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        boolean b = test.equalsArea(new Circle("黄色", 5.0, 5.0),
                new MyRectangle("黄色", 5.0, 5.0, 5.0));
        // false;
        //System.out.println(b);

        double circle = test.displayGeometricObject(new Circle("黄色", 5.0, 5.0));
        System.out.println(circle);

        double myRectangle = test.displayGeometricObject(new MyRectangle("yello", 5.0, 5.0, 5.0));
        System.out.println(myRectangle);
    }

    //测试两个对象的面积是否相等
    public boolean equalsArea(Circle obj1,MyRectangle obj2){
        return obj1.findArea() == obj2.findArea();
    }

    //显示对象的面积
    public double displayGeometricObject(GeometricObject obj){
        return obj.findArea();
    }
}
