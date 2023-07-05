package com.kodilla;

import java.util.Objects;

public class User {
    private String username;
    private char X;

    public User(String username, char x) {
        this.username = username;
        X = x;
    }

    public String getUsername() {
        return username;
    }

    public char getX() {
        return X;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return X == user.X && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, X);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", X=" + X +
                '}';
    }
}