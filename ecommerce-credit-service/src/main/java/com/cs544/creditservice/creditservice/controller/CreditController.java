package com.cs544.creditservice.creditservice.controller;

import com.cs544.creditservice.creditservice.model.CreditTransaction;
import com.cs544.creditservice.creditservice.model.Receipt;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/credit")
@CrossOrigin
public class CreditController {

    @PostMapping("/validate")
    public Receipt validateCredit(@RequestBody CreditTransaction transaction) throws Exception {
        try {
            if (!transaction.getCsv().isEmpty() || transaction.getCsv() != null) {
                return new Receipt(transaction.getFirstName(), transaction.getLastName(),
                        LocalDate.now(), "Credit");
            }
        } catch (Exception ex) {
            return new Receipt();
        }
        return new Receipt();
    }
}
