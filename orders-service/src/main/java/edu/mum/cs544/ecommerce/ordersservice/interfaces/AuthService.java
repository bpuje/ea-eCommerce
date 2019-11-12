package edu.mum.cs544.ecommerce.ordersservice.interfaces;


import edu.mum.shared.interfaces.AuthServiceShowcase;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "auth-service"
//		, url = "http://localhost:8081"
)
public interface AuthService extends AuthServiceShowcase { }

