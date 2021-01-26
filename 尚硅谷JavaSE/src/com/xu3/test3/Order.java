package com.xu3.test3;

public class Order {
    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    //判断类中创建的两个对象是否相等，也就是比较实体内容是否相等
    //orderId   orderName
    public boolean equals(Object obj) {
        //如果地址值相等，那么这两个对象一定相等
        if (this == obj){
            return true;
        }
        //如果对应两个属性相等  并且  类名也相同  就返回true
        if (obj instanceof Order && obj.getClass() == this.getClass()){
            Order order = (Order) obj;
            if (this.orderId == order.orderId && this.orderName == order.orderName){
                return true;
            }
        }
        return false;
    }
}
