package com.udemy.spring.springselenium.resources;

import com.udemy.spring.springselenium.SpringBaseTestNgTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ResourceTest extends SpringBaseTestNgTest {

    @Value("classpath:data/testData.csv")
    private Resource resource;

    @Value("${screenshot.path}")
    private Path path;
    @Autowired
    private ResourceLoader resourceLoader;

    @Test(dataProvider = "getData")
    public void resoureTest(String url, String saveas) throws IOException {
       FileCopyUtils.copy(
               resourceLoader.getResource(url).getInputStream(),
               Files.newOutputStream(path.resolve(saveas))
       );
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return Files.readAllLines(resource.getFile().toPath())
                .stream()
                .map(s->s.split(","))
                .toArray(Object[][]:: new);
    }
}
