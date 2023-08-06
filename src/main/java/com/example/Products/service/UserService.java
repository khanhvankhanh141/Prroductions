package com.example.Products.service;

import com.example.Products.entity.User;
import com.example.Products.model.input.UserInput;
import com.example.Products.model.response.BaseResponse;
import com.example.Products.model.response.Message;
import com.example.Products.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public BaseResponse insertUser(UserInput user) {
        BaseResponse baseResponse = new BaseResponse<>();
            User insertUser = new User();
            insertUser.setUser_name(user.getUser_name());
            insertUser.setFull_name(user.getFull_name());
            insertUser.setFirst_name(user.getFirst_name());
            insertUser.setLast_name(user.getLast_name());
            userRepository.save(insertUser);
            baseResponse.setData(insertUser);
            baseResponse.setMessage(Message.success());
        return baseResponse;
    }
}
