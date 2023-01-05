package com.udemy.spring.springselenium.rough;

import net.minidev.json.JSONUtil;

public interface Functional1 {


    public int perform(int a, int b);

    Functional1 adding = (int a, int b) -> ((a+b));
    Functional1 multiplying = (int a, int b) -> ((a*b));
    Functional1 dividing = (int a, int b) -> ((a/b));
}
