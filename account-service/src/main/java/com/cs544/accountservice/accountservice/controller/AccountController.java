package com.cs544.accountservice.accountservice.controller;

import com.cs544.accountservice.accountservice.model.Account;
import com.cs544.accountservice.accountservice.model.AuthModel;
import com.cs544.accountservice.accountservice.model.PaymentMethod;
import com.cs544.accountservice.accountservice.serviceImpl.AccountServiceImpl;
import com.cs544.accountservice.accountservice.serviceImpl.PaymentMethodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private AccountServiceImpl accountService;
    @Autowired
    private PaymentMethodServiceImpl methodService;

    @PostMapping("/addaccount")
    public AuthModel addAccount(@RequestBody Account account) {
        AuthModel authModel = new AuthModel(account.getUsername(), account.getPassword());
        ResponseEntity<?> responseEntity = restTemplate.postForEntity("http://localhost:8080/api/auth/adduser", authModel, Object.class);

      LinkedHashMap response =  (LinkedHashMap) responseEntity.getBody();
      //add the account authentication detail to audit-service
      if(response.get("username") != null || response.get("username") != "") {
          List<PaymentMethod> paymentMethods = methodService.savePaymentMethods(account.getPaymentMethods());
          account.setPaymentMethods(paymentMethods);

          //save account
          accountService.saveAccount(account);
      }
      return new AuthModel((String)response.get("username"), "");
    }
}
