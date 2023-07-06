package com.kodilla;

import java.util.Scanner;

public class InputFromTheKeyboard {
    public static int SelectAGameType(){
        System.out.println("Wybierz rodzaj gry, Dwoje graczy? -> wybierz 2, czy Gracz-Komputer wybierz 1");
        int gameType = new  Scanner(System.in).nextInt();
        return gameType;
    }
    public static User[] collectingDataFromPlayers(Scanner scanner) {
        // Pobieranie danych od graczy
        User[] players = new User[2];

        System.out.println("Podaj imię pierwszego gracza: ");
        String user1 = new Scanner(System.in).nextLine();
        System.out.println("Podaj jaką figurą chcesz grać (Kółko - o, Krzyżyk - x): ");
        char figure = new Scanner(System.in).next().charAt(0);
        char figure1 = Character.toUpperCase(figure);
        players[0] = new User(user1, figure1);

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
        players[1] = new User(user2, figure2);

        return players;
    }

    public static char[][] boardDimensions(Scanner scanner) {
        // Funkcja pobierająca dane na temat ilości pól planszy
        System.out.println("Podaj rozmiar planszy (format liczbowy): ");
        int dimension = new Scanner(System.in).nextInt();
        char[][] board = new char[dimension][dimension];
        System.out.println("Rozpoczynamy grę");

        return board;
    }
}
