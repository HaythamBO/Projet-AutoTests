package com.example.projetstage;

import org.springframework.boot.SpringApplication;

public class TestProjetStageApplication {

    public static void main(String[] args) {
        SpringApplication.from(ProjetStageApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
