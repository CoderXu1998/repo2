package com.xu4.test3;

import org.junit.Test;

public class ReviewTest {
    @Test
    public void test1(){
        String s = "abc";
        s = null;
        System.out.println(s); //null
        System.out.println(s.toString()); //NullPointerException
    }


}
