package dev.nderic.contentcalender.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // enable method bean lookup
public class MyWebConfig {
    @Bean // create a bean method
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }
}
