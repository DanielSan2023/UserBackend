package com.example.UserBackend.repository;

import com.example.UserBackend.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
}
