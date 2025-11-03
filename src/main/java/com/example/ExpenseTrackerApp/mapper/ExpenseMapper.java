package com.example.ExpenseTrackerApp.mapper;

import com.example.ExpenseTrackerApp.dto.ExpenseDto;
import com.example.ExpenseTrackerApp.model.Expense;

public class ExpenseMapper {
    public static Expense mapToExpense(ExpenseDto expenseDto){
        return new Expense(
                expenseDto.getEmailID(),
                expenseDto.getDate(),
                expenseDto.getTime(),
                expenseDto.getCategory(),
                expenseDto.getDay(),
                expenseDto.getLocation(),
                expenseDto.getDescription(),
                expenseDto.getAmount()
        );
    }
    public static ExpenseDto mapToExpenseDto(Expense expense){
        return new ExpenseDto(
                expense.getId(),
                expense.getEmailID(),
                expense.getDate(),
                expense.getDay(),
                expense.getTime(),
                expense.getCategory(),
                expense.getLocation(),
                expense.getDescription(),
                expense.getAmount()
        );
    }
}
