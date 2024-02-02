package de.srh.java.tetteh;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String customerName;
    private String pin;
    private boolean state;
    private double accountValue;
    private int loginFailureCounter;
    private ArrayList<TransactionLog> transactionLog;

    public Account(int accountNumber, String customerName, String pin) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPin() {
        return pin;
    }

    public boolean isState() {
        return state;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public int getLoginFailureCounter() {
        return loginFailureCounter;
    }

    public ArrayList<TransactionLog> getTransactionLog() {
        return transactionLog;
    }

    public void withdraw(int withdrawAmount){

    }
    public void deposit(int depositAmount){

    }

    public void updateFailureLoginCounter(){

    }
}
