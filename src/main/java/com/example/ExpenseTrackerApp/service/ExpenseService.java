package com.example.ExpenseTrackerApp.service;


import com.example.ExpenseTrackerApp.dto.ExpenseDto;

import java.util.List;

public interface ExpenseService {
    ExpenseDto createExpense(ExpenseDto expenseDto);
    List<ExpenseDto> getExpense(String emailID);
    ExpenseDto updateExpense(ExpenseDto expenseDto);
}
