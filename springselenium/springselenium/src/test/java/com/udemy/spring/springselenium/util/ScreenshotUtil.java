package com.udemy.spring.springselenium.util;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
@Component
public class ScreenshotUtil {
    
    @Autowired
    private TakesScreenshot driver;
    @Value ("${screenshot.path}/img.png")
    private Path path;
    

    public void takescreenshot() throws IOException
    {
         File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
         FileCopyUtils.copy(sourceFile, this.path.toFile());
    }

    


}
