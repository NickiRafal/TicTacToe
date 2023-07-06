package com.kodilla;

import java.util.Scanner;

public class PlayGame {
    public static void printBoard(char[][] board) {
        // Funkcja drukująca planszę
        int dimension = board.length;
        System.out.print("\t");
        for (int i = 0; i < dimension; i++) {
            // Drukowanie indeksów nagłówka planszy
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int row = 0; row < board.length; row++) {
            // Drukowanie indeksów wierszy planszy
            System.out.print(row + " |\t");
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column] + "\t");
            }
            System.out.println();
        }
    }

    public static void buildingTheBoard(char[][] board, User user) {

        System.out.println(user.getUsername() + ", podaj indeks wiersza: ");
        int row = new Scanner(System.in).nextInt();
        System.out.println(user.getUsername() + ", podaj indeks kolumny: ");
        int column = new Scanner(System.in).nextInt();

        if (row >= 0 && row < board.length && column >= 0 && column < board[row].length) {
            if (board[row][column] == '\u0000') {
                board[row][column] = user.getFigure();
                System.out.println("Plansza po ustawieniu figury:");
                printBoard(board);
                System.out.println(user.getUsername() + ", wykonałeś swój ruch. Teraz przeciwnik.");
            } else {
                System.out.println("To pole jest już zajęte. Wybierz inne.");
            }
        } else {
            System.out.println("Nieprawidłowy indeks wiersza lub kolumny.");
        }
    }
}
