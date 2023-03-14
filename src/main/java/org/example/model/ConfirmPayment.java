package org.example.model;

public class ConfirmPayment {

    String paymentTransaction;
    String partnerTransactionID;
    String otp;

    public ConfirmPayment() {
    }

    public ConfirmPayment setPartnerTransactionID(String transactionID) {
        this.partnerTransactionID = transactionID;
        return this;
    }

    public ConfirmPayment setOtp(String transactionID) {
        this.partnerTransactionID = transactionID;
        return this;
    }
}
