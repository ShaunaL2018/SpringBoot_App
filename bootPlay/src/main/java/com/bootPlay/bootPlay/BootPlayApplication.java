package com.bootPlay.bootPlay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.bootPlay.controller", "com.bootPlay.repository",
//		"com.bootPlay.service"})
@ComponentScan(basePackages = {"com.bootPlay.*"})
@EnableJpaRepositories(basePackages = {"com.bootPlay.*"})
public class BootPlayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootPlayApplication.class, args);
	}

//GRADLE BUILD FAILS with this Project/Application :-<
}
