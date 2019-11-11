package com.cs544.accountservice.accountservice.service;

import com.cs544.accountservice.accountservice.model.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {
    public List<PaymentMethod> savePaymentMethods(List<PaymentMethod> paymentMethod);
}
