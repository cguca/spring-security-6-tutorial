package com.chicobanana.eazybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
//@EnableWebSecurity(debug = true)
public class EazybankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazybankBackendApplication.class, args);
	}

}
