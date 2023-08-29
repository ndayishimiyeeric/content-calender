package dev.nderic.contentcalender.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

public record Content(
        @Id // set an Identifier SD JDBC
        Integer id,
        @NotBlank // Validate content title
        String title,
        @Column(value = "description")
        String desc,
        String url,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated
) {

}
