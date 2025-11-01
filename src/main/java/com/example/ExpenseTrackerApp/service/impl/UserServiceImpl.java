package com.example.ExpenseTrackerApp.service.impl;

import com.example.ExpenseTrackerApp.dto.LoginRequest;
import com.example.ExpenseTrackerApp.dto.LoginResponse;
import com.example.ExpenseTrackerApp.dto.UserBalanceDto;
import com.example.ExpenseTrackerApp.dto.UserDto;
import com.example.ExpenseTrackerApp.exception.ResourceNotFoundException;
import com.example.ExpenseTrackerApp.exception.UnauthorizedException;
import com.example.ExpenseTrackerApp.mapper.UserMapper;
import com.example.ExpenseTrackerApp.model.User;
import com.example.ExpenseTrackerApp.repository.UserRepository;
import com.example.ExpenseTrackerApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        return UserMapper.mapToUserDto(userRepository.save(UserMapper.maptoUser(userDto)));
    }

    @Override
    public LoginResponse getUser(LoginRequest loginRequest) {
        User user=userRepository.findByEmailID(loginRequest.getEmailID())
                .orElseThrow(()->new ResourceNotFoundException("User Not Found!"));
        if (user.getPassword().equals(loginRequest.getPassword()))
        return UserMapper.maptoLoginResponse(user);
        else
           throw new UnauthorizedException("Invalid Credentials");
    }

    @Override
    public LoginResponse addBalance(UserBalanceDto userBalanceDto) {
        User user= userRepository.findByEmailID(userBalanceDto.getEmailID())
                .orElseThrow(()->new ResourceNotFoundException("User Not Found!"));
        user.setBalance(userBalanceDto.getBalance());
        return UserMapper.maptoLoginResponse(userRepository.save(user));
    }

    @Override
    public LoginResponse getCurrUser(String emailID) {
        User user= userRepository.findByEmailID(emailID)
                .orElseThrow(()->new ResourceNotFoundException("User Not Found!"));
        return UserMapper.maptoLoginResponse(user);
    }


}
