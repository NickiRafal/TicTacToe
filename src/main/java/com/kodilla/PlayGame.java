package com.kodilla;

import java.util.Scanner;

public class PlayGame {


    public static int printBoards(char[][] board){
        //Funkcja Drukowanie planszy
        int dimension = board.length;
        System.out.print("\t");
        for (int i = 0;i <dimension;i++){
            //drukowanie indeksów nagłówka planszy
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int row = 0; row< board.length;row++){
            //Drukowanie indeksów wierszy planszy
            System.out.print(row+" |\t");
            for (int column = 0;column < board[row].length;column++){
                System.out.print(board[row][column]+"\t");

            }System.out.println();

        }
        return dimension;
    }
    public static void checkBox(char[][] board, User user) {
        //Pobieranie indeksów do ustawienia figury na planszy
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj index wiersza");
        int rows = scanner.nextInt();
        System.out.println("Podaj index kolumny");
        int column = scanner.nextInt();
        scanner.close();

        if (rows >= 0 && rows < board.length && column >= 0 && column < board[0].length) {
            board[rows][column] = user.getX(); // Ustawienie figury gracza w podanym indeksie
            System.out.println("Plansza po ustawieniu figury:");
            printBoards(board); // Wydrukowanie planszy z figurą gracza w podanym indeksie
        } else {
            System.out.println("Nieprawidłowy indeks wiersza lub kolumny.");
        }
    }


}
