package com.kodilla;
import java.util.Objects;
import java.util.Random;
import static com.kodilla.Board.printBoard;

public class Computer {
    private char figure;

    public Computer( char figure) {

        this.figure = figure;
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
        Computer computer = (Computer) o;
        return figure == computer.figure;
    }

    @Override
    public int hashCode() {
        return Objects.hash(figure);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "figure=" + figure +
                '}';
    }

    public static void buildingTheBoardComputer(char[][] board, Computer computer) {
        while (true) {
            //Losowanie liczb dla komputera
            Random random = new Random();
            int auxiliaryVariable = board.length;
            int row = random.nextInt(auxiliaryVariable);
            int column = random.nextInt(auxiliaryVariable);
            // Sprawdzanie czy wylosowane indeksy są puste i wstawianie figury
            if (row < board.length && column < board[row].length) {
                if (board[row][column] == '\u0000') {
                    board[row][column] = computer.getFigure();
                    System.out.println("Plansza po ruchu Komputera:");
                    printBoard(board);
                    break;

                }
            }
        }
    }
}


