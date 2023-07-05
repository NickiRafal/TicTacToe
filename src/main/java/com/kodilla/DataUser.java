package com.kodilla;

import java.util.Scanner;

public class DataUser {

    public static User[] playersData(){
        //Pobieranie danych od graczy
        Scanner scanner = new Scanner(System.in);
        User[] players = new User[2];
        System.out.println("Podaj imię pierwszego gracza ");
        String user1 = new Scanner(System.in).nextLine();
        //Pobieranie danych o figurze
        System.out.println("Podaj jaką figurą chcesz grać Kółko wciśnij o , Krzyżyk wciśnij x");
        char figure1 = new Scanner(System.in).next().charAt(0);
        players[0] = new User(user1,figure1);
        char figure2;
        // przypisywanie drugiemu graczowi niewybranej figury
        if(players[0].getX()=='x'){
            System.out.println(players[0].getUsername()+" Wybrałeś Figurę "+players[0].getX()+" drugi gracz zagra o ");
            figure2 = 'o';
        }else {
            System.out.println(players[0].getUsername()+" Wybrałeś Figurę "+players[0].getX()+" drugi gracz zagra x ");
            figure2 = 'x';
        }
        System.out.println("Podaj imię drugiego  gracza ");
        String user2 = new Scanner(System.in).nextLine();
        players[1] = new User(user2,figure2);
        scanner.close();
        return players;

    }
    public static char[][] boardDimensions(){
        //Funkcja pobierająca dane na temat ilości pól planszy
        System.out.println("Podaj rozmiar planszy format liczbowy");
        int dimension = new Scanner(System.in).nextInt();
        char[][]board = new char[dimension][dimension];
        System.out.println("Rozpoczynamy grę");

        return board;
    }
}
