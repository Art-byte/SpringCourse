package com.chakmol.SpringRedis;

import com.chakmol.SpringRedis.entity.Product;
import com.chakmol.SpringRedis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class SpringRedisApplication {

	@Autowired
	private ProductRepository productRepository;

	@PostMapping
	public Product save(@RequestBody Product product){
		return productRepository.save(product);
	}

	@GetMapping
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}

	@GetMapping("/{id}")
	public Product findProduct(@PathVariable("id") int id){
		return productRepository.findProductById(id);
	}

	@DeleteMapping("/{id}")
	public String remove(@PathVariable("id") int id){
		return productRepository.deleteProduct(id);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisApplication.class, args);
	}

}
