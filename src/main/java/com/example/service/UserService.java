package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(){
        User user= new User();
        user.setUserId(134L);
        user.setUserName("sudheer");
        user.setEmail("sudheer@gmail.com");
        user.setAge(24);
        userRepository.save(user);
    }


    public void displayUserNames(){
       List<User> userList= userRepository.findAll();
       userList.stream().map(User::getUserName).collect(Collectors.toList()).forEach(System.out::println);
    }


}
