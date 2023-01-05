package com.udemy.spring.springselenium.googleTest;

import com.udemy.spring.springselenium.SpringBaseTestNgTest;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;

public class MultiBrowserTest extends SpringBaseTestNgTest {
    @Autowired
    private ApplicationContext ctx;
    @Test
    public void browserTest() {
        this.ctx.getBean("chromeDriver", WebDriver.class).get("https:/www.google.com");
        this.ctx.getBean("firefoxDriver", WebDriver.class).get("https:/www.yahoo.com");
    }
}
