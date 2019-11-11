package com.cs544.accountservice.accountservice.repository;

import com.cs544.accountservice.accountservice.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
}
