package com.udemy.spring.springselenium.pages.google;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import com.udemy.spring.springselenium.pages.BasePage;
@Component
public class SearchComponent extends BasePage {

    @FindBy( name = "q")
    private WebElement searchBox;

    @FindBy(xpath = "(//input[@name='btnK'])[2]")
    private List<WebElement> searchBtns;

    public void search(final String keyword)
    {
        this.searchBox.sendKeys(keyword);
        this.searchBox.sendKeys(Keys.TAB);
        this.searchBtns
            .stream()
            .filter(e->e.isDisplayed()&&e.isEnabled())
            .findFirst()
            .ifPresent(WebElement::click);
    }

    @Override
    public boolean isAt() {
     return this.wait.until(d->this.searchBox.isDisplayed());
    }
    
}
