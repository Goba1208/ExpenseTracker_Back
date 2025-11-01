package com.example.ExpenseTrackerApp.controller;

import com.example.ExpenseTrackerApp.dto.LoginRequest;
import com.example.ExpenseTrackerApp.dto.LoginResponse;
import com.example.ExpenseTrackerApp.dto.UserBalanceDto;
import com.example.ExpenseTrackerApp.dto.UserDto;
import com.example.ExpenseTrackerApp.mapper.UserMapper;
import com.example.ExpenseTrackerApp.model.User;
import com.example.ExpenseTrackerApp.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    //Sign up
    @PostMapping("/create")
    ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        System.out.println(userDto);
        return ResponseEntity.status(201).body(userService.createUser(userDto));
    }
    //Login
    @PostMapping("/get")
    ResponseEntity<LoginResponse> getUser(@RequestBody LoginRequest loginRequest, HttpSession session){
        LoginResponse loggedInUser=userService.getUser(loginRequest);
        session.setAttribute("USER",loggedInUser);
        return ResponseEntity.ok().body(loggedInUser);
    }

    //Get Me
    @GetMapping("/me")
    ResponseEntity<LoginResponse> getCurrUser(HttpSession session){
        LoginResponse user=(LoginResponse) session.getAttribute("USER");
        if(user==null)
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        return ResponseEntity.ok(userService.getCurrUser(user.getEmailID()));
    }

    //Logout
    @PostMapping("/logout")
    ResponseEntity<Void> logOut(HttpSession session){
        if(session!=null)
            session.invalidate();
        return ResponseEntity.status(200).build();
    }

    //Add Balance
    @PostMapping("/addBalance")
    ResponseEntity<LoginResponse> addBalance(@RequestBody UserBalanceDto userBalanceDto){
        return ResponseEntity.status(201).body(userService.addBalance(userBalanceDto));
    }
}
