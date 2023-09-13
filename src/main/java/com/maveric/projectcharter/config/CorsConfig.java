package com.maveric.projectcharter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping(Constants.ADD_MAPPING)
                        .allowedOrigins(Constants.CROSS_ORIGIN_URL)
                        .allowedMethods(Constants.ALLOWED_METHODS)
                        .allowCredentials(true);
            }
        };
    }
}
