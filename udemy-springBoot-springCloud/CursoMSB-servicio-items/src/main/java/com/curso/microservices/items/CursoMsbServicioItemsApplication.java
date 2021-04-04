package com.curso.microservices.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker // Activar hystrix
@EnableEurekaClient
//@RibbonClient(name = "servicio-productos") // Ya viene implicito en eureka client.
@EnableFeignClients
@SpringBootApplication
public class CursoMsbServicioItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoMsbServicioItemsApplication.class, args);
	}

}
