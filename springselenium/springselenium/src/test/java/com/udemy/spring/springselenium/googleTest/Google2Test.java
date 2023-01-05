package com.udemy.spring.springselenium.googleTest;

import java.io.IOException;

import com.udemy.spring.springselenium.kelvin.annotation.LazyAutowired;
import com.udemy.spring.springselenium.kelvin.annotation.LazyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.udemy.spring.springselenium.SpringBaseTestNgTest;
import com.udemy.spring.springselenium.pages.google.GooglePage;
import com.udemy.spring.springselenium.kelvin.service.ScreenshotService;

public class Google2Test extends SpringBaseTestNgTest {
    @LazyAutowired
    private GooglePage googlePage;
    @LazyAutowired
    private ScreenshotService screenshotUtil;
    @Test
    public void googleTest() throws InterruptedException, IOException{
        this.googlePage.goTo();

        Assert.assertTrue(this.googlePage.isAt());


        this.googlePage.getsearchComponent().search("selenium");
        Assert.assertTrue(this.googlePage.getsearcResult().isAt());

        Assert.assertTrue(this.googlePage.getsearcResult().getCount()>2);
        this.screenshotUtil.takescreenshot();
        this.googlePage.close();
    }
    
}
