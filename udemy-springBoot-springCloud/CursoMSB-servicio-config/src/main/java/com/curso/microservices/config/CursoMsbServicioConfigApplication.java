package com.curso.microservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CursoMsbServicioConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoMsbServicioConfigApplication.class, args);
	}

}
