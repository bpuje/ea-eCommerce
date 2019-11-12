package com.cs544.paymentservice.paymentservice.model;

public class CreditTransaction {
    private String firstName;
    private String lastName;
    private String csv;
    private String cardNumber;

    public CreditTransaction() {
    }

    public CreditTransaction(String firstName, String lastName, String csv, String cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.csv = csv;
        this.cardNumber = cardNumber;
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

    public String getCsv() {
        return csv;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
