package br.com.priscilagalassini.app_auth_devgalassini.security;

import br.com.priscilagalassini.app_auth_devgalassini.AppAuthDevgalassiniApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class AppAuthdevgalassiniApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppAuthdevgalassiniApplication.class, args);
    }

}