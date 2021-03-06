package com.bookstore.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bookstore.api")
public class AppAdapterConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
