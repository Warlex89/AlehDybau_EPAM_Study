package com.company.Tasks.Task_1.Classes_Information;

public class User {
    private String login;
    private String password;
    private Email email;
    private UserType userType;

    public User(String login, String password, Email email, UserType userType) {
        this.login = login;
        this.password = password;
        this.userType = userType;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email=" + email +
                ", userType=" + userType +
                '}';
    }
}
