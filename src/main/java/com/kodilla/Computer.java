package com.kodilla;

import java.util.Objects;

public class Computer {
    private final String computer;
    private char figure;

    public Computer(String computer, char figure) {
        this.computer = computer;
        this.figure = figure;
    }

    public String getComputer() {
        return computer;
    }

    public char getFigure() {
        return figure;
    }

    public void setFigure(char figure) {
        this.figure = figure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer1 = (Computer) o;
        return figure == computer1.figure && Objects.equals(computer, computer1.computer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computer, figure);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computer='" + computer + '\'' +
                ", figure=" + figure +
                '}';
    }
}


