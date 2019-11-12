package com.cs544.paymentservice.paymentservice.repository;

import com.cs544.paymentservice.paymentservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
