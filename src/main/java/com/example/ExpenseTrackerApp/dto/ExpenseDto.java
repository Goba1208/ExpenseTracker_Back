package com.example.ExpenseTrackerApp.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class ExpenseDto {
    private String emailID;
    private LocalDate date;
    private String day;
    private LocalTime time;
    private String category;
    private String location;
    private String description;
    private int amount;

    public ExpenseDto() {
    }

    public ExpenseDto(String emailID, LocalDate date, String day, LocalTime time, String category, String location, String description, int amount) {
        this.emailID = emailID;
        this.date = date;
        this.day = day;
        this.time = time;
        this.category = category;
        this.location = location;
        this.description = description;
        this.amount = amount;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
