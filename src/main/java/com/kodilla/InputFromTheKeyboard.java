package com.kodilla;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class InputFromTheKeyboard {
    public static int selectAGameType(){
        while (true) {
            System.out.println("Wybierz rodzaj gry, Dwoje graczy? -> wybierz 2, czy Gracz-Komputer wybierz 1");
            try{
                int gameType = new Scanner(System.in).nextInt();

                if (gameType == 1 || gameType == 2) {
                    return gameType;

                } else {
                    System.out.println("Można wpisać tylko 1 lub 2");
                }
            }catch (InputMismatchException e) {
                System.out.println("Nieprawidłowy format danych można wpisać tylko cyfry");
            }
        }

    }
    public static User collectingDataFromPlayer(Scanner scanner) {

        Computer computer = new Computer("Komputer", 'X');

        System.out.println("Podaj swoje imię");

        String user = null;
        try {
            user = scanner.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println("Nieprawidłowe wejście. Brak dostępnej linii.");
        } catch (IllegalStateException e) {
            System.out.println("Nieprawidłowy stan skanera. Sprawdź, czy strumień wejściowy jest prawidłowy.");
        }

        char figure = ' ';
        System.out.println("Podaj figurę jaką chcesz grać z komputerem (do wyboru X lub O)");
        try {
            String input = scanner.nextLine();
            if (input.length() > 0) {
                figure = Character.toUpperCase(input.charAt(0));
            }
        } catch (NoSuchElementException e) {
            System.out.println("Nieprawidłowe wejście. Brak dostępnej linii.");
        } catch (IllegalStateException e) {
            System.out.println("Nieprawidłowy stan skanera. Sprawdź, czy strumień wejściowy jest prawidłowy.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wpisałeś niedozwolony znak. Podaj X lub O.");
        }

        User player = new User(user, computer, figure);

        if (player.getFigure() == 'X') {
            System.out.println(player.getUsername() + " wybrałeś figurę " + player.getFigure() + ". Komputer zagra O.");
            computer.setFigure('O');
        } else {
            System.out.println(player.getUsername() + " wybrałeś figurę " + player.getFigure() + ". Komputer zagra X.");
            computer.setFigure('X');
        }

        return player;
    }

    public static User[] collectingDataFromPlayers() {
        Computer computer = new Computer("Komputer",'.');
        // Pobieranie danych od graczy
        User[] players = new User[2];

        System.out.println("Podaj imię pierwszego gracza: ");
        String user1 = new Scanner(System.in).nextLine();
        System.out.println("Podaj jaką figurą chcesz grać (Kółko - o, Krzyżyk - x): ");
        char figure = new Scanner(System.in).next().charAt(0);
        char figure1 = toUpperCase(figure);

        players[0] = new User(user1, computer, figure1);

        char figure2;
        if (players[0].getFigure() == 'X') {
            System.out.println(players[0].getUsername() + ", wybrałeś figurę " + players[0].getFigure() +
                    ". Drugi gracz zagra O");
            figure2 = 'O';
        } else {
            System.out.println(players[0].getUsername() + ", wybrałeś figurę " + players[0].getFigure() +
                    ". Drugi gracz zagra X");
            figure2 = 'X';
        }

        System.out.println("Podaj imię drugiego gracza: ");
        String user2 = new Scanner(System.in).nextLine();
        players[1] = new User(user2, computer, figure2);

        return players;
    }

    public static char[][] boardDimensions() {
        // Funkcja pobierająca dane na temat ilości pól planszy
        System.out.println("Podaj rozmiar planszy (format liczbowy): ");
        int dimension = new Scanner(System.in).nextInt();
        char[][] board = new char[dimension][dimension];
        System.out.println("Rozpoczynamy grę");

        return board;
    }
}
