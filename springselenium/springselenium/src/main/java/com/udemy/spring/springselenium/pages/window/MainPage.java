package com.udemy.spring.springselenium.pages.window;

import com.udemy.spring.springselenium.kelvin.annotation.Page;
import com.udemy.spring.springselenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
@Page
public class MainPage  extends BasePage {

    @FindBy(tagName = "a")
    private List<WebElement> links;
    public void goTo()
    {
        this.driver.get("https://vins-udemy.s3.amazonaws.com/ds/window/main.html");
    }

    public void launchAllWindows() {
        for ( int  i =0; i<links.size(); i++)
        {
            links.get(i).click();
        }
    }
    @Override
    public boolean isAt() {
        return this.wait.until((d)->!this.links.isEmpty());
    }
}
