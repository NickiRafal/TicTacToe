package com.kodilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        User[] players = DataUser.playersData();
        PlayGame.printBoards(DataUser.boardDimensions());

        System.out.println(players[0].getUsername()+" "+ players[0].getX());
        System.out.println(players[1].getUsername()+" "+ players[1].getX());
    }



}