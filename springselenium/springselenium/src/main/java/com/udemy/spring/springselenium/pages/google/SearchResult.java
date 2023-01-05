package com.udemy.spring.springselenium.pages.google;
import com.udemy.spring.springselenium.kelvin.annotation.PageFragment;
import com.udemy.spring.springselenium.pages.BasePage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@PageFragment
public class SearchResult extends BasePage{

    @FindBy (xpath= "//h3[@class='LC20lb MBeuO DKV0Md']")
    private List<WebElement> results;

    public int getCount() {
        return this.results.size();
    }
    @Override
    public boolean isAt() {
       
        return this.wait.until(d-> !this.results.isEmpty());
    }

}