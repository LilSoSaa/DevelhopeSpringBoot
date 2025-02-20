package com.develhope.demo.dto;

public class UserDTO {
    private String userName;
    private String email;

    public UserDTO(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
