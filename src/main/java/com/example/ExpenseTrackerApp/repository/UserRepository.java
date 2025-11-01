package com.example.ExpenseTrackerApp.repository;

import com.example.ExpenseTrackerApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailID(String emailID);
}
