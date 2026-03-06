package com.praptigodshelwar.learningrestapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories("com.praptigodshelwar.learningrestapis.repository")
@EntityScan("com.praptigodshelwar.learningrestapis.entity")
public class LearningRestapisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningRestapisApplication.class, args);
	}
}