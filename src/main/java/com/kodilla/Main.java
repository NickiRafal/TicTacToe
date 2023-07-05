package com.kodilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        User[] players = DataUser.playersData();
        char[][] board = DataUser.boardDimensions();
        System.out.println(players[0].getUsername()+" będzie grał figurą "+ players[0].getX());
        System.out.println(players[1].getUsername()+" będzie grał figurą "+ players[1].getX());
        PlayGame.checkBox(board,players[0]);

    }



}