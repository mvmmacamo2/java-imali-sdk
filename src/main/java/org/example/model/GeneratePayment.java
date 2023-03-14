package org.example.model;

public class GeneratePayment {
    String transactionID;
    int storeAccountNumber;
    int customerAccountNumber;
    double amount;
    String description;
    String terminalID;
    String terminalChannel;
    String terminalCompanyName;

    public GeneratePayment() {
    }

    public String getTransactionID() {
        return transactionID;
    }

    public GeneratePayment setTransactionID(String transactionID) {
        this.transactionID = transactionID;
        return this;
    }

    public GeneratePayment setStoreAccountNumber(int storeAccountNumber) {
        this.storeAccountNumber = storeAccountNumber;
        return this;
    }

    public GeneratePayment setCustomerAccountNumber(int customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
        return this;
    }

    public GeneratePayment setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public GeneratePayment setDescription(String description) {
        this.description = description;
        return this;
    }

    public GeneratePayment setTerminalID(String terminalID) {
        this.terminalID = terminalID;
        return this;
    }

    public GeneratePayment setTerminalChannel(String terminalChannel) {
        this.terminalChannel = terminalChannel;
        return this;
    }

    public GeneratePayment setTerminalCompanyName(String terminalCompanyName) {
        this.terminalCompanyName = terminalCompanyName;
        return this;
    }
}
