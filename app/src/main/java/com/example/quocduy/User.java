package com.example.quocduy;

public class User {
    private String fullname;
    private String email;
    private String phone;
    private String username;
    private String password;

    public User(String fullname, String email, String phone, String username, String password) {
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
