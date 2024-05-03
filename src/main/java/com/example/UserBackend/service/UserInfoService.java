package com.example.UserBackend.service;

import com.example.UserBackend.entity.UserInfo;
import com.example.UserBackend.repository.UserInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    private final UserInfoRepository userInfoRepository;

    public UserInfoService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    public void saveUser(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }
}
