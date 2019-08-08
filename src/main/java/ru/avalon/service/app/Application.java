package ru.avalon.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import ru.avalon.service.properties.FileStorageProperties;

@SpringBootApplication
@ComponentScan(basePackages = "ru.avalon.service")
@EnableJpaRepositories(basePackages = "ru.avalon.service.repositories")
@EntityScan(basePackages = "ru.avalon.service.models")
@EnableConfigurationProperties({FileStorageProperties.class})

public class Application {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
