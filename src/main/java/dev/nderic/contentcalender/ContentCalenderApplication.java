package dev.nderic.contentcalender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ContentCalenderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ContentCalenderApplication.class, args);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
