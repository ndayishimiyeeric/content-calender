package dev.nderic.contentcalender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ContentCalenderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ContentCalenderApplication.class, args);
		RestTemplate restTemplate = (RestTemplate) context.getBean("restTemplate"); // getting our created RestTemplate
		System.out.println(restTemplate); // print the signature
	}

}
