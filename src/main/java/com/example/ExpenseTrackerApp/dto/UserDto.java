package com.example.ExpenseTrackerApp.dto;

import org.springframework.stereotype.Component;

@Component
public class UserDto {
    private String userName;
    private String firstName;
    private String lastName;
    private String emailID;
    private long phoneNo;
    private String password;
    public UserDto(){

    }

    public UserDto(String userName,String firstName, String lastName, String emailID, long phoneNo, String password) {
        this.userName=userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        this.phoneNo = phoneNo;
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    @Override
    public String toString() {
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailID='" + emailID + '\'' +
                ", phoneNo=" + phoneNo +
                ", password='" + password + '\'' +
                '}';
    }
}
