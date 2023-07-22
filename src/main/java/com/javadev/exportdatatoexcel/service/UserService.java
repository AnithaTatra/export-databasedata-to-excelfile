package com.javadev.exportdatatoexcel.service;

import com.javadev.exportdatatoexcel.dto.ResponseDto;
import com.javadev.exportdatatoexcel.dto.UserRequest;
import com.javadev.exportdatatoexcel.entity.User;

import java.util.List;

public interface UserService {
    String addUser(User user);
    List < User > getTheUsersList();
}
