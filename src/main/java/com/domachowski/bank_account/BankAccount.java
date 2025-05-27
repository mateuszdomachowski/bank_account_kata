package com.domachowski.bank_account;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount implements BankAccountService{

    private int balance;
    private List<BankAccountOperation> operations = new ArrayList<>();

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
        System.out.println("TYPE     | DATE       | AMOUNT  | BALANCE");
        int balance = 0;

        for (BankAccountOperation operation : operations) {
            balance += operation.getAmount();
            System.out.println(operation.getType() + " | " + operation.getDate() + " | " + operation.getAmount() + " | " + balance);

        }
    }
}
