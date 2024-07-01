package com.example.spring_profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.spring_profiles.repository")
public class SpringProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesApplication.class, args);
	}

}
