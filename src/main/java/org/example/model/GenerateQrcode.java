package org.example.model;

public class GenerateQrcode {
    String transactionID;
    int storeAccountNumber;
    double amount;
    String description;
    String terminalID;
    String terminalChannel;
    String terminalCompanyName;


    public GenerateQrcode setTransactionId(String transactionId) {
        this.transactionID = transactionId;
        return this;
    }
    public GenerateQrcode setStoreAccountNumber(int storeAccountNumber) {
        this.storeAccountNumber = storeAccountNumber;
        return this;
    }
    public GenerateQrcode setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public GenerateQrcode setDescription(String description) {
        this.description = description;
        return this;
    }

    public GenerateQrcode setTerminalID(String terminalID) {
        this.terminalID = terminalID;
        return this;
    }
    public GenerateQrcode setTerminalChannel(String terminalChannel) {
        this.terminalChannel = terminalChannel;
        return this;
    }
    public GenerateQrcode setTerminalCompanyName(String terminalCompanyName) {
        this.terminalCompanyName = terminalCompanyName;
        return this;
    }
}
