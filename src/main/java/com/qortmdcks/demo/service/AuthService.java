package com.qortmdcks.demo.service;

import com.qortmdcks.demo.config.SecurityConfig;
import com.qortmdcks.demo.model.User;
import com.qortmdcks.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;

    public User authenticate(User user){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword())
        );

        return user;
    }

    // authority : 회원가입, 인가
    // authentication : 로그인, 인증
    // auth
}
