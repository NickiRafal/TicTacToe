package com.kodilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int select = InputFromTheKeyboard.SelectAGameType();
        // Pobieranie danych graczy
        User[] players = InputFromTheKeyboard.collectingDataFromPlayers(scanner);

        // Ustawianie planszy
        char[][] board = InputFromTheKeyboard.boardDimensions(scanner);

        // Informacja o graczach
        System.out.println(players[0].getUsername() + " będzie grał figurą " + players[0].getFigure());
        System.out.println(players[1].getUsername() + " będzie grał figurą " + players[1].getFigure());

        // Ustawianie figury na wybranym polu
        int currentPlayerIndex = 0; // Indeks aktualnego gracza

        while (true) {
            PlayGame.buildingTheBoard(board, players[currentPlayerIndex]); // Przekazanie aktualnego gracza jako argument

            if (CheckingTheResults.checkForXWinRow(board, players[currentPlayerIndex].getFigure())) {
                System.out.println("Gracz " + players[currentPlayerIndex].getUsername() + " wygrał!");
                break; // Zakończenie gry
            }
            if (CheckingTheResults.checkForXWinColumn(board, players[currentPlayerIndex].getFigure())) {
                System.out.println("Gracz " + players[currentPlayerIndex].getUsername() + " wygrał!");
                break; // Zakończenie gry
            }
            if (CheckingTheResults.checkForXWinDiagonal(board, players[currentPlayerIndex].getFigure())) {
                System.out.println("Gracz " + players[currentPlayerIndex].getUsername() + " wygrał!");
                break; // Zakończenie gry
            }

            if (CheckingTheResults.checkForOWinRow(board, players[currentPlayerIndex].getFigure())) {
                System.out.println("Gracz " + players[currentPlayerIndex].getUsername() + " wygrał!");
                break; // Zakończenie gry
            }
            if (CheckingTheResults.checkForOWinColumn(board, players[currentPlayerIndex].getFigure())) {
                System.out.println("Gracz " + players[currentPlayerIndex].getUsername() + " wygrał!");
                break; // Zakończenie gry
            }
            if (CheckingTheResults.checkForOWinDiagonal(board, players[currentPlayerIndex].getFigure())) {
                System.out.println("Gracz " + players[currentPlayerIndex].getUsername() + " wygrał!");
                break; // Zakończenie gry
            }

            if (CheckingTheResults.checkForDraw(board)) {
                System.out.println("Gra zakończona remisem!");
                break; // Zakończenie gry
            }

            // Zamiana graczy
            currentPlayerIndex = (currentPlayerIndex + 1) % 2;
        }

        scanner.close();
    }
}
