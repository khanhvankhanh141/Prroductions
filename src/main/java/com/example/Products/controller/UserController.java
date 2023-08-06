package com.example.Products.controller;

import com.example.Products.model.input.UserInput;
import com.example.Products.model.response.BaseResponse;
import com.example.Products.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    private ResponseEntity<BaseResponse> addUser(@RequestBody UserInput userInput) {
        BaseResponse result = userService.insertUser(userInput);
        return new ResponseEntity(result, HttpStatus.valueOf(result.getMessage().getCode()));
    }
}
