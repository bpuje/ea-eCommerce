package com.cs544.accountservice.accountservice.serviceImpl;

import com.cs544.accountservice.accountservice.model.PaymentMethod;
import com.cs544.accountservice.accountservice.repository.PaymentMethodRepository;
import com.cs544.accountservice.accountservice.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public List<PaymentMethod> savePaymentMethods(List<PaymentMethod> paymentMethod) {
        return paymentMethodRepository.saveAll(paymentMethod);
    }
}
