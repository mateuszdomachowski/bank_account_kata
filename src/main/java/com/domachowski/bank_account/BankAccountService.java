package com.domachowski.bank_account;

public interface BankAccountService {

    void deposit(int amount);
    void withdraw(int amount);
    void operationHistory();
}
