package com.kodilla;

import java.util.Scanner;

public class DataUser {

    public static User[] playersData(){
        User[] players = new User[2];
        Scanner scanner =new Scanner(System.in);
        System.out.println("Podaj imię pierwszego gracza ");

        String user1 = scanner.nextLine();
        System.out.println("Podaj jaką figurą chcesz grać Kółko wciśnij o , Krzyżyk wciśnij x");
        char figure1 = scanner.next().charAt(0);
        //usuwanie enter z pamięci
        scanner.nextLine();
        players[0] = new User(user1,figure1);
        char figure2;
        if(players[0].getX()=='x'){
            System.out.println(players[0].getUsername()+" Wybrałeś Figurę "+players[0].getX()+" drugi gracz zagra o ");
            figure2 = 'o';
        }else {
            System.out.println(players[0].getUsername()+" Wybrałeś Figurę "+players[0].getX()+" drugi gracz zagra x ");
            figure2 = 'x';
        }
        System.out.println("Podaj imię drugiego  gracza ");
        String user2 = scanner.nextLine();
        players[1] = new User(user2,figure2);

        return players;

    }
    public static char[][] boardDimensions(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Podaj rozmiar planszy format liczbowy");
        int wymiar = scanner.nextInt();
        char[][]plansza = new char[wymiar][wymiar];
        System.out.println("Rozpoczynamy grę");
       // System.out.println(gracz1.getUsername()+ " podaj współrzedne pola  które chcesz zaznaczyć");

        return plansza;
    }
}
