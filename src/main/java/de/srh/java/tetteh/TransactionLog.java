package de.srh.java.tetteh;

import java.time.LocalDateTime;

public class TransactionLog {
    private LocalDateTime timestamp;
    private String protocol;
    private TransactionType transactionType;
    private double  transactionAmount;
    private String atmID;
    private double postBalance;
    private String location;


    public TransactionLog(String protocol, TransactionType transactionType, double transactionAmount, String atmID, String location) {
        this.protocol = protocol;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.atmID = atmID;
        this.location = location;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getProtocol() {
        return protocol;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public String getAtmID() {
        return atmID;
    }

    public double getPostBalance() {
        return postBalance;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime generateTimeStamp(){
        return null;
    }
}
