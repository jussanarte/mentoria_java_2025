/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account.model.entities;

import reservation.model.exceptions.DomainException;

/**
 *
 * @author juuhl
 */
public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(Double amount) {
        if (amount > withdrawLimit) {
            throw new DomainException("Withdraw Error: the amount exceeds withdraw limit.");
        }
        if (amount > balance) {
            throw new DomainException("Withdraw Error:  Not enough balance");
        }
        if (amount < 0) {
            throw new DomainException("Withdraw Error: the amount is negative.");
        }
        balance -= amount;
    }

}
