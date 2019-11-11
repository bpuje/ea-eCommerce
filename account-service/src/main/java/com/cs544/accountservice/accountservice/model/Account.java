package com.cs544.accountservice.accountservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private  String firstName;
    private String lastName;
    private String address;
    private String  username;
    @Transient
    private String password;
    private String defaultPaymentMethod;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "account_fk")
    private List<PaymentMethod> paymentMethods;

    public Account() {
    }

    public Account(String firstName, String lastName, String address, String defaultPaymentMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.defaultPaymentMethod = defaultPaymentMethod;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public String getDefaultPaymentMethod() {
        return defaultPaymentMethod;
    }

    public void setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
    }
}
