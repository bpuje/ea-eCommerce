package edu.mum.cs544.ecommerce.productsservice.interfaces;

import edu.mum.shared.interfaces.UsersServiceShowcase;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "users-service"
        , url = "http://localhost:8066"
)
public interface UsersService extends UsersServiceShowcase {
}
