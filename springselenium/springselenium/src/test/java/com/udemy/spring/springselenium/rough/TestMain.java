package com.udemy.spring.springselenium.rough;

import static com.udemy.spring.springselenium.rough.Functional1.*;

public class TestMain {
    public static void main(String[] args) {
        int addingresult = adding.perform(5,6);
        int multiplyingresult = multiplying.perform(5,6);
        int divingresult = dividing.perform(5,6);
        System.out.println(addingresult + "," + multiplyingresult+","+ divingresult);
    }
}
