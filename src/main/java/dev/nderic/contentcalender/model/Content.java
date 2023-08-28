package dev.nderic.contentcalender.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        String url,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated
) {

}
