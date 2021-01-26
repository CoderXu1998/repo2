package com.xu3.test4;

import java.util.Objects;

public class B {
    private int id;
    private String hehe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return id == b.id &&
                Objects.equals(hehe, b.hehe);
    }

}
