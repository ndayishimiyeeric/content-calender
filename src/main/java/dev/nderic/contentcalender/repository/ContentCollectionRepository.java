package dev.nderic.contentcalender.repository;

import dev.nderic.contentcalender.model.Content;
import dev.nderic.contentcalender.model.Status;
import dev.nderic.contentcalender.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contents = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() { // get all available contents
        return contents;
    }

    public Optional<Content> findById(Integer id) {
        return contents.stream().filter(content -> content.id().equals(id)).findFirst();
    }

    @PostConstruct
    // a method that needs to be executed after dependency injection is done to perform any initialization
    private void init() {
        Content content = new Content(
                1,
                "My First Blog post",
                "First blog post",
                null,
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null
        );
        contents.add(content);
    }

    public void save(Content content) {
        contents.removeIf(prev -> prev.id().equals(content.id()));
        contents.add(content);
    }

    public boolean existById(Integer id) {
        return contents.stream().filter(content -> content.id().equals(id)).count() == 1;
    }

    public void deleteById(Integer id) {
        contents.removeIf(prev -> prev.id().equals(id));
    }
}
