package dev.nderic.contentcalender.repository;

import dev.nderic.contentcalender.model.Content;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contents = new ArrayList<>();

    ContentCollectionRepository() {}

    public List<Content> findAll() { // get all available contents
        return contents;
    }

    public Optional<Content> findById(Integer id) {
        return contents.stream().filter(content -> content.id().equals(id)).findFirst();
    }
}
