package com.morgan.backend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Permitir CORS en todas las rutas y métodos
                registry.addMapping("/**")  // Permite todos los endpoints
                        .allowedOrigins("*")  // Permite todos los orígenes
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")  // Permite todos los métodos HTTP
                        .allowedHeaders("*")  // Permite todos los encabezados
                        .allowCredentials(false);  // No permite credenciales (cookies o autenticación)
            }
        };
    }
}
