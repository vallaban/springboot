package com.udemy.spring.springselenium.pages.google;



import com.udemy.spring.springselenium.kelvin.annotation.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.udemy.spring.springselenium.pages.BasePage;

@Page
public class GooglePage extends BasePage {
    @Autowired
    private SearchComponent searchcomponent;

    @Autowired 
    private SearchResult searchResult;

    public SearchComponent getsearchComponent() {
        return searchcomponent;
    }

    public SearchResult getsearcResult ()
    {
        return searchResult;
    }

   
    @Value("${application.url}")
    private  String url;
    public void goTo() {
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        // TODO Auto-generated method stub
        return this.searchcomponent.isAt();
    }

    public void close()
    {
        this.driver.quit();
    }

    
}
