package edu.mum.cs544.ecommerce.ordersservice.interfaces;

import edu.mum.shared.interfaces.PaysServiceShowcase;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "pays-service"
//		, url = "http://localhost:8090"
)
public interface PaysService extends PaysServiceShowcase { }

