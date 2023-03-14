package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.GenerateQrcode;
import org.example.module.IMaliTransaction;
import org.example.service.network.NetworkBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        GenerateQrcode generateQrcode = new GenerateQrcode();

        generateQrcode
                .setTerminalID("1001")
                .setTerminalChannel("POS")
                .setTerminalCompanyName("KayaEventos")
                .setDescription("Meu pagamento")
                .setAmount(20)
                .setStoreAccountNumber(1210229820)
                .setTransactionId("JIHJWOHSOWHSOI");

        NetworkBuilder networkBuilder = new NetworkBuilder();

        NetworkBuilder network = networkBuilder
                .setLocalization("en")
                .setApiKey("1|xiARGpCNTwphxVtcbnPyvErC7cWMjcgYeld5TbXX")
                .setProductionMode(false);

        Map<String, String> map = new HashMap<>();
        map.put("transactionID", "1swdwdwdwddwda5");
        map.put("accountNumber", "230000002");
        map.put("amount", "30");
        map.put("terminalID", "101");
        map.put("terminalChannel", "POS");
        map.put("terminalCompanyName", "Kaya");

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(map);


        network.requestHandler()
                .setMethod("GET")
                .setBody(requestBody)
                .setResource("check-transaction/1swdwdwdwddwda5");


        var mapper = new ObjectMapper();

//        var response = mapper.readValue(
//                networkBuilder.buildClient().body(),
//                new TypeReference<GenerateTransactionResponse>() {});


//        System.out.println("Transaction "+response.getTransaction());
//        System.out.println("Mensagem "+response.getMessage());
        System.out.println(networkBuilder.buildClient().body());

        IMaliTransaction imaliTransaction = new IMaliTransaction();

        imaliTransaction.generateTransaction()
                .setTransactionId("")
                .setTerminalID("");

        imaliTransaction.checkTransaction()
                .setTransactionId("cjslsdiss")
                .send();

    }


}
