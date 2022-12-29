package com.udemy.spring.springselenium.googleTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.udemy.spring.springselenium.SpringBaseTestNgTest;
import com.udemy.spring.springselenium.pages.google.GooglePage;

public class GoogleTest extends SpringBaseTestNgTest {
    @Autowired
    private GooglePage googlePage;
    @Test
    public void googleTest() throws InterruptedException{
        this.googlePage.goTo();
        Thread.sleep(4000);
        Assert.assertTrue(this.googlePage.isAt());
        
        this.googlePage.getsearchComponent().search("spring boot");
        System.out.println(this.googlePage.getsearcResult().getCount());

        Assert.assertTrue(this.googlePage.getsearcResult().getCount()>2);
    }
    
}
