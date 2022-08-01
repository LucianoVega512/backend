package com.proyectointegrador.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProyectoIntegradorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoIntegradorApplication.class, args);
    }

//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                        registry.addMapping("/api/*")
//                                .allowedOrigins("*")
//                                .allowedMethods("GET", "POST", "PUT", "DELETE")
//                                .maxAge(3600);
//                }
//        };
//    }
    
    /*
    @Bean
public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                        registry.addMapping(“/producto/**”)
                                .allowedOrigins(“http://localhost:9001”)
                                .allowedMethods(“GET”, “POST”, “PUT”, “DELETE”)
                                .maxAge(3600);
                }

        };
}
    */

}
