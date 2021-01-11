package com.emse.spring.faircorp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FaircorpApplicationConfig {
    @Bean
    public CommandLineRunner greetingCommandLine() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                greetingCommandLine();
            }
        };
    }
}
