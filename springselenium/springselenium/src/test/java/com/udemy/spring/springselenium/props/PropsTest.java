package com.udemy.spring.springselenium.props;

import com.udemy.spring.springselenium.SpringBaseTestNgTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class PropsTest extends SpringBaseTestNgTest {

    @Autowired
    private ResourceLoader loader;

    @Test
    public void propsTest() throws IOException {

                Properties properties = PropertiesLoaderUtils.loadProperties(loader.getResource("my.properties"));
        System.out.println(
                properties
        );
    }
}
