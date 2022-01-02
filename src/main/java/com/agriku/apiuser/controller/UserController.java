package com.agriku.apiuser.controller;

import com.agriku.apiuser.dto.UserDto;
import com.agriku.apiuser.model.UserRequestModel;
import com.agriku.apiuser.model.UserResponseModel;
import com.agriku.apiuser.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    Environment environment;

    @Autowired
    UserService userService;

    @GetMapping("/status/check")
    public String status() {
        return "Working on port " + environment.getProperty("local.server.port");
    }

    @PostMapping
    public ResponseEntity createUser(@Valid @RequestBody UserRequestModel userDetails) {
        ModelMapper mapper = new ModelMapper();
        UserDto userDto = mapper.map(userDetails, UserDto.class);
        UserDto userCreated = userService.createUser(userDto);
        UserResponseModel returnValue = mapper.map(userCreated, UserResponseModel.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
    }
}
