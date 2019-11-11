package com.cs544.paymentservice.paymentservice.serviceImpl;

import com.cs544.paymentservice.paymentservice.model.Payment;
import com.cs544.paymentservice.paymentservice.repository.PaymentRepository;
import com.cs544.paymentservice.paymentservice.service.PaymentService;
import org.hibernate.validator.internal.constraintvalidators.bv.time.past.PastValidatorForYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.LinkedHashMap;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment savePayment(LinkedHashMap response) {
        Payment payment = processReceipt(response);
        return paymentRepository.save(payment);
    }

    private Payment processReceipt(LinkedHashMap response) {
        Payment payment = new Payment();
        payment.setFirstName((String)response.get("firstName"));
        payment.setLastName((String)response.get("lastName"));
        payment.setPaymentType((String)response.get("description"));
        payment.setPaymentDate(LocalDate.now());
        return payment;
    }
}
