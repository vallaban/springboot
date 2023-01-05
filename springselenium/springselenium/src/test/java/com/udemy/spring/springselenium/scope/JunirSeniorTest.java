package com.udemy.spring.springselenium.scope;

import com.udemy.spring.springselenium.SpringBaseTestNgTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class JunirSeniorTest  extends SpringBaseTestNgTest {
    @Autowired
    private JuniorEngg junior;

    @Autowired
    private SeniorEngg senior;

    @Test
    public void scopeTest() {
        junior.setAmount(100);
        System.out.println("Junior: :" + this.junior.getSalary().getAmount() );
        senior.setAmount(200);
        System.out.println("Senior: :" + this.senior.getSalary().getAmount() );
        System.out.println("Junior: :" + this.junior.getSalary().getAmount() );
    }
}
