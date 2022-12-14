package ru.rayumov.market.api;

public class UserDto {

    private String username;
    private String email;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDto() {
    }

    public UserDto(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
