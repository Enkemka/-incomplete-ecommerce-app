package com.example.demo.Users;

public class userDto {


    private String userName;
    private String creationDate;
    private Role role;

    public userDto(String userName, String creationDate, Role role) {
        this.userName = userName;
        this.creationDate = creationDate;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
