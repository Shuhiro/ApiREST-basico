package com.gestion.producto.repositorio;

import com.gestion.producto.modelo.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
@EnableJpaRepositories("com.gestion.producto.modelo.Producto")
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
