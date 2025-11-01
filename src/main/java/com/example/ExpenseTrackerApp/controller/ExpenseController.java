package com.example.ExpenseTrackerApp.controller;

import com.example.ExpenseTrackerApp.dto.ExpenseDto;
import com.example.ExpenseTrackerApp.dto.UserDto;
import com.example.ExpenseTrackerApp.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @PostMapping("/create")
    ResponseEntity<ExpenseDto> createExpense(@RequestBody ExpenseDto expenseDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(expenseService.createExpense(expenseDto));
    }

    @GetMapping("/get/{emailID}")
    ResponseEntity<List<ExpenseDto>> getExpense(@PathVariable String emailID){
        return ResponseEntity.status(HttpStatus.OK).body(expenseService.getExpense(emailID));
    }
}
