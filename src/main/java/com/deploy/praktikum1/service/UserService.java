package com.deploy.praktikum1.service;

import com.deploy.praktikum1.model.dto.UserAddRequest;
import com.deploy.praktikum1.model.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto AddUser(UserAddRequest request);
    List<UserDto> GetAllUsers();
    UserDto GetUserById(String id);
    UserDto UpdateUser(String id, UserAddRequest request);
    void DeleteUser(String id);
}
