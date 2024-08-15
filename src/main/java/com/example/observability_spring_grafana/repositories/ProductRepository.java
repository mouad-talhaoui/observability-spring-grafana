package com.example.observability_spring_grafana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.observability_spring_grafana.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
