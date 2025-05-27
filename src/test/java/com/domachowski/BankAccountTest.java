package com.domachowski;

import com.domachowski.bank_account.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {


    @Test
    void deposit_shouldIncreaseBalance() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(3);
        assertEquals(3, bankAccount.getBalance());
    }

    @Test
    void withdraw_shouldDecreaseBalance() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10);
        bankAccount.withdraw(3);
        assertEquals(7, bankAccount.getBalance());
    }

    @Test
    void operationHistory_shouldPrintOperationsHistory(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10);
        bankAccount.withdraw(5);
        bankAccount.deposit(20);

        bankAccount.operationHistory();

    }
}