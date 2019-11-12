package edu.mum.cs544.ecommerce.ordersservice.interfaces;


import edu.mum.shared.interfaces.TempUsersServiceShowcase;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "temp-users-service"
//		, url = "http://localhost:8088"
)
public interface TempUsersService extends TempUsersServiceShowcase { }

