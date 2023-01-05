package com.udemy.spring.springselenium.window;

import com.udemy.spring.springselenium.SpringBaseTestNgTest;
import com.udemy.spring.springselenium.kelvin.service.WindowSwitchService;
import com.udemy.spring.springselenium.pages.window.MainPage;
import com.udemy.spring.springselenium.pages.window.PageA;
import com.udemy.spring.springselenium.pages.window.PageB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
@TestPropertySource(properties="browser=firefox")
public class WindowSwitchTest extends SpringBaseTestNgTest {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private PageA pageA;

    @Autowired
    private PageB pageB;

    @Autowired
    private WindowSwitchService switchService;

    @BeforeClass
    public void setup () {
        this.mainPage.goTo();
        this.mainPage.isAt();
        this.mainPage.launchAllWindows();

    }

    @Test
    public void switchTest() {
        this.switchService.switchByTitle("Page A");
        this.pageA.addToArea("hi page a");
        this.switchService.switchByIndex(2);
        this.pageB.addToArea("Hello page B");
    }
}

