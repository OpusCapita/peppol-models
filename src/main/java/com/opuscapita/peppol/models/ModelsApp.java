package com.opuscapita.peppol.models;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelsApp implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
    }

    public static void main(String[] args) {
        SpringApplication.run(ModelsApp.class, args);
    }
}
