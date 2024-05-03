package com.example.UserBackend.controller;


import com.example.UserBackend.entity.UserInfo;
import com.example.UserBackend.service.UserInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserInfoController {

private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @PostMapping("/save")
    public ResponseEntity createUser(@RequestBody UserInfo userInfo){
        userInfoService.saveUser(userInfo);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
