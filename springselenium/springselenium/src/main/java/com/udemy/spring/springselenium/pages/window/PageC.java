package com.udemy.spring.springselenium.pages.window;

import com.udemy.spring.springselenium.kelvin.annotation.Page;
import com.udemy.spring.springselenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Page
public class PageC extends BasePage {

    @FindBy(id= "area")
    private WebElement textArea;

    public void addToArea(final String msg)
    {
        this.textArea.sendKeys(msg);
    }
    @Override
    public boolean isAt() {
        return this.wait.until((d)->!this.textArea.isDisplayed());
    }
}
