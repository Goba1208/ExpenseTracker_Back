package com.example.ExpenseTrackerApp.mapper;

import com.example.ExpenseTrackerApp.dto.LoginResponse;
import com.example.ExpenseTrackerApp.dto.UserDto;
import com.example.ExpenseTrackerApp.model.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getUserName(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmailID(),
                user.getPhoneNo(),
                user.getPassword()
        );
    }
    public static User maptoUser(UserDto userDto){
        return new User(
                userDto.getUserName(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmailID(),
                userDto.getPhoneNo(),
                userDto.getPassword()
        );
    }
    public static LoginResponse maptoLoginResponse(User user){
        return new LoginResponse(
                user.getUserName(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmailID(),
                user.getPhoneNo(),
                user.getBalance()
        );
    }
}
