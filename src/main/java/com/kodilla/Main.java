package com.kodilla;
import java.util.Scanner;
import static com.kodilla.CheckingTheResults.checkGameResultComputer;
import static com.kodilla.CheckingTheResults.checkGameResultPlayer;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //Wybór typu gry 2 graczy czy 1 gracz
        int select = InputFromTheKeyboard.selectAGameType();
        if (select == 2) {
            // Pobieranie danych graczy
            User[] players = InputFromTheKeyboard.collectingDataFromPlayers();
            Board board = new Board();
            // Ustawianie planszy
            char[][] gameBoard = board.boardDimensions();

            // Informacja o graczach
            System.out.println(players[0].getUsername() + " będzie grał figurą " + players[0].getFigure());
            System.out.println(players[1].getUsername() + " będzie grał figurą " + players[1].getFigure());

            board.printBoard(gameBoard);
            int currentPlayerIndex = 0; // Indeks aktualnego gracza

            while (true) {
                // Ustawianie figury na wybranym polu
                Board.buildingTheBoard(gameBoard, players[currentPlayerIndex]);
                //sprawdzanie wygranej
                if (checkGameResultPlayer(gameBoard,players[currentPlayerIndex])) {
                    break; // Zakończenie gry
                }
                // Zamiana graczy
                currentPlayerIndex = (currentPlayerIndex + 1) % 2;
            }

        } else {
            // Pobieranie danych gracza
            User player = InputFromTheKeyboard.collectingDataFromPlayer(scanner);
            Board board = new Board();
            // Ustawianie planszy
            char[][] gameBoard = board.boardDimensions();
            board.printBoard(gameBoard);

            int currentPlayerIndex = 0; // Indeks aktualnego gracza

            while (true) {
                // Ruch gracza
                if (currentPlayerIndex == 0) {
                    board.buildingTheBoard(gameBoard, player);
                }
                Computer computerPlay = new Computer(player.getComputer().getFigure());
                // Ruch komputera
                if (currentPlayerIndex == 1) {

                    computerPlay.buildingTheBoardComputer(gameBoard, computerPlay);
                }

                // Sprawdzanie warunków wygranej lub remisu
                if (checkGameResultComputer(gameBoard,computerPlay)){
                    break; // Zakończenie gry
                }

                if (CheckingTheResults.checkForDraw(gameBoard)) {
                    System.out.println("Gra zakończona remisem!");
                    break; // Zakończenie gry
                }

                // Zamiana graczy
                currentPlayerIndex = (currentPlayerIndex + 1) % 2;
            }

        }
    }
}
