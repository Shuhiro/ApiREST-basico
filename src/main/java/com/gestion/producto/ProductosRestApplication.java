package com.gestion.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.gestion.producto.repositorio")
public class ProductosRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductosRestApplication.class, args);
	}

}
