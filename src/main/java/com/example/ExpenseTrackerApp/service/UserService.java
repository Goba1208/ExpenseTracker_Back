package com.example.ExpenseTrackerApp.service;

import com.example.ExpenseTrackerApp.dto.LoginRequest;
import com.example.ExpenseTrackerApp.dto.LoginResponse;
import com.example.ExpenseTrackerApp.dto.UserBalanceDto;
import com.example.ExpenseTrackerApp.dto.UserDto;
import com.example.ExpenseTrackerApp.model.User;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDto createUser(UserDto userDto);
    LoginResponse getUser(LoginRequest loginRequest);
    LoginResponse addBalance(UserBalanceDto userBalanceDto);
    LoginResponse getCurrUser(String emailID);
}
