package com.cs544.accountservice.accountservice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "payment_methods")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentMethodId;
    private String csv;
    private String creditNumber;
    private String routingNumber;
    private String bankNumber;
    private String PhoneNumber;
    private String title;

    public PaymentMethod() {
    }

    public PaymentMethod(String csv, String creditNumber, String routingNumber,
                         String bankNumber, String phoneNumber, String title) {
        this.csv = csv;
        this.creditNumber = creditNumber;
        this.routingNumber = routingNumber;
        this.bankNumber = bankNumber;
        PhoneNumber = phoneNumber;
        this.title = title;
    }

    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getCsv() {
        return csv;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
