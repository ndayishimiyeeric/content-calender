package dev.nderic.contentcalender;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
    public String getMessage() {
        return "Hello world";
    }
}
