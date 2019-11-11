package edu.mum.cs544.ecommerce.dbservice.repository;

import edu.mum.cs544.ecommerce.dbservice.model.Payment;
import edu.mum.cs544.ecommerce.dbservice.model.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface PaysPpServiceShowcase {

	@RequestMapping("/pays_pp/pay")
	ResponseEntity<Result> pay(@RequestBody Payment payment);

}
