package org.example.model;

import org.example.service.data.RequestHandler;

public class CheckTransaction {
    String transaction;
    RequestHandler requestHandler;

    public CheckTransaction() {
        requestHandler = new RequestHandler();
    }

    public CheckTransaction setTransactionId(String transactionID) {
        this.transaction = transactionID;
        return this;
    }

    public CheckTransaction send() {
        return this;
    }
}
