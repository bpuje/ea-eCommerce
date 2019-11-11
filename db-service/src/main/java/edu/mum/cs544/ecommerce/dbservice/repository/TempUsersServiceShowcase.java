package edu.mum.cs544.ecommerce.dbservice.repository;

import edu.mum.shared.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface TempUsersServiceShowcase {

	@RequestMapping("/users/{id}")
	User findById(@PathVariable(value = "id") int id);

//	@RequestMapping("/users")
//	List<User> findAll();
}
