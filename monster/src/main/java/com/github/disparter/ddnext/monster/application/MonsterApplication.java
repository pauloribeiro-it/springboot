package com.github.disparter.ddnext.monster.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MonsterApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MonsterApplication.class, args);
	}
}
