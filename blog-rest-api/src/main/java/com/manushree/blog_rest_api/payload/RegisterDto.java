package com.manushree.blog_rest_api.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
