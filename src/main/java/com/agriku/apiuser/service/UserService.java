package com.agriku.apiuser.service;

import com.agriku.apiuser.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDetails);
    UserDto getUserDetailByEmail(String email);
}
