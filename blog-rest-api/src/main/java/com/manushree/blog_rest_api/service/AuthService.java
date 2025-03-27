package com.manushree.blog_rest_api.service;

import com.manushree.blog_rest_api.payload.LoginDto;
import com.manushree.blog_rest_api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
