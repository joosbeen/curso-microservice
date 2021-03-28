package com.curso.microservices.items.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Bean(name = "clientProducto")
	public RestTemplate productoClientRestTemaplate() {
		return new RestTemplate();
	}
}
