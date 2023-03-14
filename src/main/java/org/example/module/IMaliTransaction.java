package org.example.module;

import org.example.model.CheckTransaction;
import org.example.model.GeneratePayment;
import org.example.model.GenerateQrcode;

public class IMaliTransaction {

     private final GenerateQrcode generateQrcode;
     private final CheckTransaction checkTransaction;
     final GeneratePayment generatePayment;
    public IMaliTransaction() {
        generateQrcode = new GenerateQrcode();
        checkTransaction = new CheckTransaction();
        generatePayment = new GeneratePayment();
    }

   public GenerateQrcode generateTransaction() {
     return generateQrcode;
   }
    public CheckTransaction checkTransaction() {
        return checkTransaction;
    }

    public GeneratePayment generatePayment() {
        return generatePayment;
    }
}
