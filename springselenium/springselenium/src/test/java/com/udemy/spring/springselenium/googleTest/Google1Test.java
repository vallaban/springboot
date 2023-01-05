package com.udemy.spring.springselenium.googleTest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.udemy.spring.springselenium.SpringBaseTestNgTest;
import com.udemy.spring.springselenium.pages.google.GooglePage;
import com.udemy.spring.springselenium.kelvin.service.ScreenshotService;

public class Google1Test extends SpringBaseTestNgTest {
    @Autowired
    private GooglePage googlePage;
    @Lazy
    @Autowired
    private ScreenshotService screenshotUtil;
    @Test
    public void googleTest() throws InterruptedException, IOException{
        this.googlePage.goTo();
        Thread.sleep(4000);
        Assert.assertTrue(this.googlePage.isAt());

        
        this.googlePage.getsearchComponent().search("spring boot");
        Assert.assertTrue(this.googlePage.getsearcResult().isAt());

        Assert.assertTrue(this.googlePage.getsearcResult().getCount()>2);
        this.screenshotUtil.takescreenshot();
        this.googlePage.close();
    }
    
}
