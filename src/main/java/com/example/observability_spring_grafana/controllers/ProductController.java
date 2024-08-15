package com.example.observability_spring_grafana.controllers;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.core.ParameterizedTypeReference;
import com.example.observability_spring_grafana.models.Post;
import com.example.observability_spring_grafana.entities.Product;
import com.example.observability_spring_grafana.repositories.ProductRepository;

@RestController
public class ProductController {
	private ProductRepository productRepository;
	private RestClient restClient;
	
	public ProductController(ProductRepository productRepository, RestClient.Builder restClient) {
		this.productRepository = productRepository;
		this.restClient = restClient
				.baseUrl("https://jsonplaceholder.typicode.com")
				.build();
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping("/posts")
	public List<Post> allPosts(){
		return restClient.get().uri("/posts")
				.retrieve()
				.body(new ParameterizedTypeReference<List<Post>>() {
				});
	}
	
}
