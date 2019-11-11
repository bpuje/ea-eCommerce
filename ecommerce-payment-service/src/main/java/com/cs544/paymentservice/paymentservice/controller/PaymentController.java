package com.cs544.paymentservice.paymentservice.controller;

import com.cs544.paymentservice.paymentservice.model.BankTransaction;
import com.cs544.paymentservice.paymentservice.model.CreditTransaction;
import com.cs544.paymentservice.paymentservice.model.Payment;
import com.cs544.paymentservice.paymentservice.model.PaypalTransaction;
import com.cs544.paymentservice.paymentservice.serviceImpl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;

@RestController
@CrossOrigin
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping("/paywithcredit")
    public Payment payWithCredit(@RequestBody CreditTransaction transaction) {
        ResponseEntity<?> responseEntity = restTemplate.postForEntity("http://localhost:8090/api/credit/validate",
                transaction, Object.class);

        Payment payment = paymentService.savePayment((LinkedHashMap) responseEntity.getBody());
        return  payment;
    }

    @PostMapping("/paywithpaypal")
    public Payment payWithPaypal(@RequestBody PaypalTransaction transaction) {
        ResponseEntity<?> responseEntity = restTemplate.postForEntity("http://localhost:8070/api/paypal/validate",
                transaction, Object.class);

        Payment payment = paymentService.savePayment((LinkedHashMap) responseEntity.getBody());
        return  payment;
    }

    @PostMapping("/paywithbank")
    public Payment payWithBank(@RequestBody BankTransaction transaction) {
        ResponseEntity<?> responseEntity = restTemplate.postForEntity("http://localhost:8060/api/bank/validate",
                transaction, Object.class);

        Payment payment = paymentService.savePayment((LinkedHashMap) responseEntity.getBody());
        return  payment;
    }
}
