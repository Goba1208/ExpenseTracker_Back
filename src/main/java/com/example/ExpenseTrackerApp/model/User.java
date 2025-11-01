package com.example.ExpenseTrackerApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String firstName;
    private String lastName;
    @Column(unique = true,nullable = false)
    private String emailID;
    private long phoneNo;
    private String password;
    @Column(nullable = true)
    private int balance;
    public User(){

    }

    public User(String userName, String firstName, String lastName, String emailID, long phoneNo, String password) {
        this(userName,firstName,lastName,emailID,phoneNo,password,0);
    }
    public User(String userName, String firstName, String lastName, String emailID, long phoneNo, String password,int balance){
        this.userName=userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.phoneNo = phoneNo;
        this.password = password;
        this.balance=balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
