package dev.nderic.contentcalender.controller;

import dev.nderic.contentcalender.model.Content;
import dev.nderic.contentcalender.model.Status;
import dev.nderic.contentcalender.repository.ContentCollectionRepository;
import dev.nderic.contentcalender.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/content")
@CrossOrigin // set CORS to visible
public class ContentController {
    private final ContentRepository repository;

    public ContentController(ContentRepository repository) { // inject the repository
        this.repository = repository;
    }

    // make a request and find all pieces of content in the system
    @GetMapping("")
    public List<Content> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}") // Get by id
    public Content getById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Id")
        );
    }

    @ResponseStatus(HttpStatus.CREATED) // Create
    @PostMapping("")
    public void create(@Valid @RequestBody Content content) { // @Valid annotation for validating data
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT) // Update
    @PutMapping("/{id}")
    public void updateContent(@RequestBody Content content, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
        }

        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT) // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/filter/{keyword}")
    public List<Content> findByKeyword(@PathVariable String keyword){
        return repository.findAllByTitleContains(keyword);
    }

    @GetMapping("/filter/status/{status}")
    public List<Content> findByStatus(@PathVariable Status status) {
        return repository.listByStatus(status);
    }
}
