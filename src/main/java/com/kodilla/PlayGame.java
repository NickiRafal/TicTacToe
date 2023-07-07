package com.kodilla;

import java.util.Random;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println(user.getUsername() + ", podaj indeks wiersza: ");
        int row = scanner.nextInt();
        System.out.println(user.getUsername() + ", podaj indeks kolumny: ");
        int column = scanner.nextInt();

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

    public static void buildingTheBoardComputer(char[][] board, Computer computer) {
        while (true) {
            //Losowanie liczb dla komputera
            Random random = new Random();
            int row = random.nextInt(3);
            int column = random.nextInt(3);
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
