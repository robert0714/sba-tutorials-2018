package org.robert0714.ods2018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class Ods20181Application {

	public static void main(String[] args) {
		SpringApplication.run(Ods20181Application.class, args);
	}
}
