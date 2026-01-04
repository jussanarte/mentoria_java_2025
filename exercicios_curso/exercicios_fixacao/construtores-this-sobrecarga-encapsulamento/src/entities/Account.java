/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author juuhl
 */
public class Account {
    private final Integer accountNumber;
    private String holder;
    private Double balance;
    private static final Double TAX = 5.0;

    public Account(Integer accountNumber, String holder, Double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(String holder, Integer accountNumber) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    public void deposit(Double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    
    public void withdraw(Double amount){
        if(amount > 0){
            balance -= amount + TAX;
        }
    }

    @Override
    public String toString() {
        return "Account "  + accountNumber + ", Holder: " + holder + ", Balance: $" + String.format("%.2f", balance);
    }
}
