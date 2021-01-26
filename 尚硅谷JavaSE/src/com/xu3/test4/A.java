package com.xu3.test4;

import java.util.Objects;

public class A {
    private String name;
    private int age;
    private B b;

    public A(String name, int age, B b) {
        this.name = name;
        this.age = age;
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return age == a.age &&
                Objects.equals(name, a.name) &&
                Objects.equals(b, a.b);
    }

}
