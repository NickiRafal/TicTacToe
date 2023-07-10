package com.kodilla;
import java.util.Objects;

public class User {
    private final String username;
    private final Computer computer;
    private final char figure;

    public User(String username, Computer computer, char figure) {
        this.username = username;
        this.computer = computer;
        this.figure = figure;
    }

    public String getUsername() {
        return username;
    }

    public Computer getComputer() {
        return computer;
    }

    public char getFigure() {
        return figure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return figure == user.figure && Objects.equals(username, user.username) && Objects.equals(computer, user.computer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, computer, figure);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", computer=" + computer +
                ", figure=" + figure +
                '}';
    }
}