package edu.mum.cs544.ecommerce.ordersservice.interfaces;

import edu.mum.shared.interfaces.ProductsServiceShowcase;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "products-service"
//		, url = "http://localhost:8085"
)
public interface ProductsService extends ProductsServiceShowcase { }

