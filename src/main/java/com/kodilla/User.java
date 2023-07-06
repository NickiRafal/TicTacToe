package com.kodilla;

import java.util.Objects;

public class User {
    private final String username;
    private final char figure;

    public User(String username, char figure) {
        this.username = username;
        this.figure = figure;
    }

    public String getUsername() {
        return username;
    }


    public char getFigure() {
        return figure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return figure == user.figure && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, figure);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", figure=" + figure +
                '}';
    }
}