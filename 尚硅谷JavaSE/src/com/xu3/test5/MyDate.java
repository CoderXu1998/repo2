package com.xu3.test5;

import java.util.Objects;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o instanceof MyDate && o.getClass() == this.getClass()){
            MyDate o1 = (MyDate) o;
            if (this.day == o1.day && this.month == o1.month && this.year == o1.year){
                return true;
            }
        }
        return false;
    }
}
