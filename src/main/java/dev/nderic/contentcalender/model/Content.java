package dev.nderic.contentcalender.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Content(
        @Id // set an Identifier SD JDBC
        Integer id,
        @NotBlank // Validate content title
        String title,
        String desc,
        String url,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated
) {

}
