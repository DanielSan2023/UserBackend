package com.example.UserBackend.service;

import com.example.UserBackend.entity.User;
import com.example.UserBackend.repository.UserInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    private final UserInfoRepository userInfoRepository;

    public UserInfoService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    public void saveUser(User user) {
        userInfoRepository.save(user);
    }

    public List<User> getAllUsers() {
        List<User> users = userInfoRepository.findAll();
        return users;
    }
}
