package dev.nderic.contentcalender.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.nderic.contentcalender.model.Content;
import dev.nderic.contentcalender.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


import java.io.InputStream;
import java.util.List;

@Profile("!dev")
@Component
public class DataLoader implements CommandLineRunner {
    private final ContentRepository repository;
    private final ObjectMapper objectMapper;

    public DataLoader(ContentRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
                repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Content>>() {
                }));
            }
        }
    }
}
