package com.kodilla;
import java.util.Scanner;
import static com.kodilla.CheckingTheResults.checkGameResultPlayer;
import static com.kodilla.CheckingTheResults.checkGameResultPlayers;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //Wybór typu gry 2 graczy czy 1 gracz
        int select = InputFromTheKeyboard.selectAGameType();
        if (select == 2) {
            // Pobieranie danych graczy
            User[] players = InputFromTheKeyboard.collectingDataFromPlayers();

            // Ustawianie planszy
            char[][] board = InputFromTheKeyboard.boardDimensions();

            // Informacja o graczach
            System.out.println(players[0].getUsername() + " będzie grał figurą " + players[0].getFigure());
            System.out.println(players[1].getUsername() + " będzie grał figurą " + players[1].getFigure());

            PlayGame.printBoard(board);
            int currentPlayerIndex = 0; // Indeks aktualnego gracza

            while (true) {
                // Ustawianie figury na wybranym polu
                PlayGame.buildingTheBoard(board, players[currentPlayerIndex]);
                //sprawdzanie wygranej
                if (checkGameResultPlayers(board, players, currentPlayerIndex)) {
                    break; // Zakończenie gry
                }
                // Zamiana graczy
                currentPlayerIndex = (currentPlayerIndex + 1) % 2;

            }

        } else {
            // Pobieranie danych gracza
            User player = InputFromTheKeyboard.collectingDataFromPlayer(scanner);

            // Ustawianie planszy
            char[][] board = InputFromTheKeyboard.boardDimensions();
                PlayGame.printBoard(board);

            int currentPlayerIndex = 0; // Indeks aktualnego gracza

            while (true) {
                // Ruch gracza
                if (currentPlayerIndex == 0) {
                    PlayGame.buildingTheBoard(board, player);
                }

                // Ruch komputera
                if (currentPlayerIndex == 1) {
                    Computer computerPlay = new Computer("Komputer", player.getComputer().getFigure());
                    PlayGame.buildingTheBoardComputer(board, computerPlay);
                }

                // Wyświetlanie planszy po ruchu
                //PlayGame.printBoard(board);

                // Sprawdzanie warunków wygranej lub remisu
                if (checkGameResultPlayer(board,player)) {
                    break; // Zakończenie gry
                }


                if (CheckingTheResults.checkForDraw(board)) {
                    System.out.println("Gra zakończona remisem!");
                    break; // Zakończenie gry
                }

                // Zamiana graczy
                currentPlayerIndex = (currentPlayerIndex + 1) % 2;
            }

        }
    }
}
