package com.domachowski.bank_account;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount implements BankAccountService{

    private int balance;
    private final List<BankAccountOperation> operations = new ArrayList<>();

    public BankAccount() {
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        operations.add(new BankAccountOperation("deposit", LocalDate.now(), amount));
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        operations.add(new BankAccountOperation("withdraw", LocalDate.now(), -amount));
    }

    @Override
    public void operationHistory() {
        System.out.printf("  %-10s | %-12s | %10s | %10s  %n", "TYPE", "DATE", "AMOUNT", "BALANCE");
        int balance = 0;

        for (BankAccountOperation operation : operations) {
            balance += operation.getAmount();
            System.out.printf("  %-10s | %-12s | %10s | %10s  %n", operation.getType(), operation.getDate(), operation.getAmount(), balance);

        }
    }
}
