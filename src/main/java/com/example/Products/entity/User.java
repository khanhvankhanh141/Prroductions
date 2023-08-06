package com.example.Products.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String user_name;
    private String password;
    private String first_name;
    private String last_name;
    private String full_name;

    public User(String username, String password, String first_name, String last_name, String full_name) {
        this.user_name = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.full_name = full_name;
    }

    public User() {

    }
}
