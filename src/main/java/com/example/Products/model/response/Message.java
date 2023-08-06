package com.example.Products.model.response;

import com.example.Products.config.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String message;
    private int code;

    public static Message success() {
        return new Message(Constants.SUCCESS, Constants.SUCCESS_CODE);
    }

    public static Message internal() {
        return new Message(Constants.INTERNAL_SERVER, Constants.INTERNAL_CODE);
    }

}
