package com.curso.microservices.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class CursoMsbServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoMsbServicioProductosApplication.class, args);
	}

}
