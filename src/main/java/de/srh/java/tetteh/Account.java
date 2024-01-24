package de.srh.java.tetteh;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String customerName;
    private int pin;
    private boolean state;
    private int accountValue;


    public Account(int accountNumber, String customerName, int pin, int accountValue) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
        this.state = true;
        this.accountValue = accountValue;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getPin() {
        return pin;
    }

    public boolean isState() {
        return state;
    }

    public int getAccountValue() {
        return accountValue;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setAccountValue(int accountValue) {
        this.accountValue = accountValue;
    }



}
