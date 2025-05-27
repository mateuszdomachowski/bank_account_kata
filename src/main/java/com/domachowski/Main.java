package com.domachowski;

import com.domachowski.bank_account.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10);
        bankAccount.withdraw(5);
        bankAccount.deposit(3);
        bankAccount.operationHistory();
    }
}