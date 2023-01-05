package com.udemy.spring.springselenium.kelvin.service;

import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import javax.annotation.PostConstruct;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
@Lazy
@Service
public class ScreenshotService {
    
    @Autowired
    private ApplicationContext ctx;

    @Value ("${screenshot.path}")
    private Path path;
    
    @PostConstruct
    private void init() {

    }
    @Autowired
    private Faker faker;
    public void takescreenshot() throws IOException
    {
         File sourceFile = this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
         FileCopyUtils.copy(sourceFile, this.path.resolve(faker.name().firstName()+".png").toFile());
    }


}
