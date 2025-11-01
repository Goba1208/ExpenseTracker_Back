package com.example.ExpenseTrackerApp.repository;

import com.example.ExpenseTrackerApp.model.Expense;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
    Optional<List<Expense>> findAllByEmailID(String emailID, Sort sort);
}
