package com.example.UserBackend.controller;


import com.example.UserBackend.entity.UserInfo;
import com.example.UserBackend.service.UserInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/fetchAll")
    public ResponseEntity<List<UserInfo>> fetchAllUsers(){
        List<UserInfo> users = userInfoService.getAllUsers();
        if (CollectionUtils.isEmpty(users)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
    }
}
