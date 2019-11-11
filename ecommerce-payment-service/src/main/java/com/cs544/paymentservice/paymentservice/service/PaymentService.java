package com.cs544.paymentservice.paymentservice.service;

import com.cs544.paymentservice.paymentservice.model.Payment;

import java.util.LinkedHashMap;

public interface PaymentService {
    public Payment savePayment(LinkedHashMap response);
}
