package dev.nderic.contentcalender;

import dev.nderic.contentcalender.config.ContentCalendarProperties;
import dev.nderic.contentcalender.model.Content;
import dev.nderic.contentcalender.model.Status;
import dev.nderic.contentcalender.model.Type;
import dev.nderic.contentcalender.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class ContentCalenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentCalenderApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ContentRepository repository) {
        return args -> {
            // insert data into database at bootstrap
            Content content = new Content(
                    null,
                    "Java and Artificial Intelligence",
                    "All about Java and artificial intelligence",
                    null,
                    Status.IN_PROGRESS,
                    Type.VIDEO,
                    LocalDateTime.now(),
                    null
            );
            repository.save(content);
        };
    }

}
