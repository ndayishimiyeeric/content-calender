package dev.nderic.contentcalender.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

// @Controller used for bootstrapping
public class DataLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
    }
}
