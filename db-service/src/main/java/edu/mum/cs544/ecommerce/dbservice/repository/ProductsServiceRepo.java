package edu.mum.cs544.ecommerce.dbservice.repository;


import edu.mum.cs544.ecommerce.dbservice.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.xml.transform.Result;
import java.util.List;

public interface ProductsServiceRepo {

	@GetMapping("/products/{id}")
	Product findById(@PathVariable(value = "id") int id);

	@GetMapping("/products/")
	List<Product> findAll();

	@PostMapping("/products/")
	ResponseEntity<Result> add(Product model);

	@DeleteMapping("/products/{id}")
	ResponseEntity<Result> deleteProduct(@PathVariable(name = "id") int id);

	@PostMapping("/products/decrease/{id}/{quantity}")
	ResponseEntity<Result> decreaseAvailableCount(@PathVariable(name = "id") int id, @PathVariable(name = "quantity") int quantity);

	@PostMapping("/products/increase/{id}/{quantity}")
	ResponseEntity<Result> increaseAvailableCount(@PathVariable(name = "id") int id, @PathVariable(name = "quantity") int quantity);
}
