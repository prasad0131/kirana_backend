package com.kirana.store.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;
    private String customerId;
    private double amount;
    private String currency;
    private String type; // "credit" or "debit"
    private String date;

    // Getters and Setters
}
