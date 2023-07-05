package com.kodilla;

public class PlayGame {


    public static int printBoards(char[][] plansza){

        int wymiar = plansza.length;
        System.out.print("\t");
        for (int i = 0;i <wymiar;i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int wiersz = 0; wiersz< plansza.length;wiersz++){
            System.out.print(wiersz+" |\t");
            for (int kolumna = 0;kolumna < plansza[wiersz].length;kolumna++){
                System.out.print(plansza[wiersz][kolumna]+"\t");

            }System.out.println();

        }
        return wymiar;
    }
}
