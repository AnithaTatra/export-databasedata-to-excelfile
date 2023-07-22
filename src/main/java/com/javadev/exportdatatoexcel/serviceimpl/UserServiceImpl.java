package com.javadev.exportdatatoexcel.serviceimpl;

import com.javadev.exportdatatoexcel.dto.ResponseDto;
import com.javadev.exportdatatoexcel.dto.UserRequest;
import com.javadev.exportdatatoexcel.entity.User;
import com.javadev.exportdatatoexcel.repository.UserRepository;
import com.javadev.exportdatatoexcel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
   private  UserRepository userRepository;

    @Override
    public String addUser(User user) {
        userRepository.save(user);
        return "Success";
    }

    @Override
    public List<User> getTheUsersList() {
        return userRepository.findAll();
    }
}
