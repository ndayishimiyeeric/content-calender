package dev.nderic.contentcalender;

import dev.nderic.contentcalender.config.ContentCalendarProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class ContentCalenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentCalenderApplication.class, args);
    }

}
