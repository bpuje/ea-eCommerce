package edu.mum.cs544.ecommerce.ordersservice.interfaces;

import edu.mum.shared.interfaces.ShipServiceShowcase;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ship-service"
//		, url = "http://localhost:8095"
)
public interface ShipService extends ShipServiceShowcase { }

