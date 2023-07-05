package com.kodilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Pobieranie danych graczy
        User[] players = DataUser.playersData();
        //ustawianie planszy
        char[][] board = DataUser.boardDimensions();
        // informacja o graczach
        System.out.println(players[0].getUsername()+" będzie grał figurą "+ players[0].getX());
        System.out.println(players[1].getUsername()+" będzie grał figurą "+ players[1].getX());
        //ustawianie figury na wybranym polu
        PlayGame.checkBox(board,players[0]);

    }



}