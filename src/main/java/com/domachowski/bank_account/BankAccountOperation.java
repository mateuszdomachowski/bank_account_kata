package com.domachowski.bank_account;

import java.time.LocalDate;

public class BankAccountOperation {

    String type;
    LocalDate date;
    int amount;

    public BankAccountOperation(String type, LocalDate date, int amount) {
        this.type = type;
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
