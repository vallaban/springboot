package com.udemy.spring.springselenium.kelvin.config;

import java.time.Duration;

import com.udemy.spring.springselenium.kelvin.annotation.LazyConfiguration;
import com.udemy.spring.springselenium.kelvin.annotation.ThreadScopeBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import io.github.bonigarcia.wdm.WebDriverManager;

@LazyConfiguration
public class WebDriverConfig {

    @Value("${default.timeout:30}")
    private Duration timeout;
//    @Bean
//    public WebDriverWait webDriverWait(WebDriver driver)
//    {
//        return new WebDriverWait(driver, this.timeout);
//    }


    @ThreadScopeBean
    @ConditionalOnProperty (name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @ThreadScopeBean
    @ConditionalOnMissingBean
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
