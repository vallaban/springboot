package com.udemy.spring.springselenium.kelvin.config;
import com.udemy.spring.springselenium.kelvin.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;
import com.github.javafaker.Faker;
@LazyConfiguration
public class FakerConfig {
    @Bean
    public Faker getFaker() {
        return new Faker();
    }

}
