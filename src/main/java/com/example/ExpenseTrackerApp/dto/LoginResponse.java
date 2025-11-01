package com.example.ExpenseTrackerApp.dto;

public class LoginResponse {
    private String userName;
    private String firstName;
    private String lastName;
    private String emailID;
    private long phoneNo;
    private int balance;

    public LoginResponse() {
    }

    public LoginResponse(String userName, String firstName, String lastName, String emailID, long phoneNo, int balance) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.phoneNo = phoneNo;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
