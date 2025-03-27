package com.manushree.blog_rest_api.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
