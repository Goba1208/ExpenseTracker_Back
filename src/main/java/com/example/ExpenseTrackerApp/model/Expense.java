package com.example.ExpenseTrackerApp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String emailID;
    private LocalDate date;
    private String day;
    private LocalTime time;
    private String category;
    private String location;
    private String description;
    private int amount;

    public Expense() {
    }

    public Expense(Long id, String emailID, LocalDate date, LocalTime time, String category, String day, String location, String description, int amount) {
        this.id = id;
        this.emailID = emailID;
        this.date = date;
        this.time = time;
        this.category = category;
        this.day = day;
        this.location = location;
        this.description = description;
        this.amount = amount;
    }
    public Expense(String emailID, LocalDate date, LocalTime time, String category, String day, String location, String description, int amount) {
        this.emailID = emailID;
        this.date = date;
        this.time = time;
        this.category = category;
        this.day = day;
        this.location = location;
        this.description = description;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", emailID='" + emailID + '\'' +
                ", date=" + date +
                ", day='" + day + '\'' +
                ", time=" + time +
                ", category='" + category + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
