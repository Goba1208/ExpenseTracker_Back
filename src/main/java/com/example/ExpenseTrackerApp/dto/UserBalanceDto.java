package com.example.ExpenseTrackerApp.dto;

public class UserBalanceDto {
    private String emailID;
    private int balance;

    public UserBalanceDto(){}

    public UserBalanceDto(String emailID, int balance) {
        this.emailID = emailID;
        this.balance = balance;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
