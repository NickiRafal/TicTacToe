package com.kodilla;

import java.util.Scanner;

public class Board {
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
                System.out.println("Plansza po ustawieniu figury przez grzcza :" + user.getUsername());
                printBoard(board);
                System.out.println(user.getUsername() + ", wykonałeś swój ruch. Teraz przeciwnik.");
            } else {
                System.out.println("To pole jest już zajęte. Wybierz inne.");
            }
        } else {
            System.out.println("Nieprawidłowy indeks wiersza lub kolumny.");
        }
    }
    public static char[][] boardDimensions() {
        // Funkcja pobierająca dane na temat ilości pól planszy
        System.out.println("Czy czcesz zagrać w wariant klasyczny 3x3  ?/ wpisz 3  ");
        System.out.println("Czy alternatywny 10x10 ?/ Wpisz 10");
        int dimension;
        while (true) {
            dimension = new Scanner(System.in).nextInt();
            if (dimension == 3 || dimension == 10) {
                break;

            } else {
                System.out.println("Możesz wybrać 3 lub 10");
            }
        }
        char[][] board = new char[dimension][dimension];
        System.out.println("Rozpoczynamy grę");
        return  board;
    }

}
