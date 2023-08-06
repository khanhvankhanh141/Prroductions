package com.example.Products.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {
    private T data;
    private Message message;
    private String debugStack;
    private int quantity;
    private int page;
    private int size;
}
