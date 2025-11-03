package com.example.ExpenseTrackerApp.service.impl;

import com.example.ExpenseTrackerApp.dto.ExpenseDto;
import com.example.ExpenseTrackerApp.exception.ResourceNotFoundException;
import com.example.ExpenseTrackerApp.mapper.ExpenseMapper;
import com.example.ExpenseTrackerApp.model.Expense;
import com.example.ExpenseTrackerApp.repository.ExpenseRepository;
import com.example.ExpenseTrackerApp.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public ExpenseDto createExpense(ExpenseDto expenseDto) {
        return ExpenseMapper.mapToExpenseDto(expenseRepository.save(ExpenseMapper.mapToExpense(expenseDto)));
    }

    @Override
    public List<ExpenseDto> getExpense(String emailID) {
        List<Expense> expenses=expenseRepository.findAllByEmailID(emailID,
        Sort.by(Sort.Direction.DESC,"date").and(Sort.by(Sort.Direction.DESC,"time")))
                .orElseThrow(()->new ResourceNotFoundException("Expense Not Found!"));
        List<ExpenseDto> expenseDtos=new ArrayList<>();
        for(Expense exp: expenses){
            expenseDtos.add(ExpenseMapper.mapToExpenseDto(exp));
        }
        return expenseDtos;
    }

    @Override
    public ExpenseDto updateExpense(ExpenseDto expenseDto) {
        Expense expense=expenseRepository.findById(expenseDto.getId())
                .orElseThrow(()->new ResourceNotFoundException("Expense Not Found!"));
        expense.setCategory(expenseDto.getCategory());
        expense.setLocation(expenseDto.getLocation());
        expense.setDescription(expenseDto.getDescription());
        expense.setAmount(expenseDto.getAmount());
        return ExpenseMapper.mapToExpenseDto(expenseRepository.save(expense));
    }
}
